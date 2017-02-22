package com.zyz.books2017;

import org.apache.http.annotation.GuardedBy;
import org.apache.http.annotation.ThreadSafe;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZhangYuanzhuo on 2017/2/22.
 * 程序清单4-4
 * 视图线程会读取车辆的名字和位置
 * 执行更新操作的线程会从GPS获取数据或从调度员在界面输入的数据修改车辆的位置
 * 视图线程和执行更新操作的线程将并发地访问数据模型，因此必须是线程安全的
 */
@ThreadSafe
public class MonitorVehicleTracker {
    @GuardedBy("this")
    private final Map<String, MutablePoint> locations;

    /* 车辆追踪 */
    public MonitorVehicleTracker(
            Map<String, MutablePoint> locations) {
        this.locations = deepCopy(locations);
    }

    /*
    * @Param m, 位置的集合locations
    *       key, 车辆的名字; value, 位置坐标
    * 本方法的作用: 复制一份locations，并且该集合为只读
    * */
    private static Map<String, MutablePoint> deepCopy(
            Map<String, MutablePoint> m) {
        Map<String, MutablePoint> result = new HashMap<>();
        for (String id : m.keySet()) {
            result.put(id, new MutablePoint(m.get(id)));
        }
        return Collections.unmodifiableMap(result);
    }

    public synchronized Map<String, MutablePoint> getLocations() {
        return deepCopy(locations);
    }

    public synchronized MutablePoint getLocation(String id) {
        MutablePoint loc = locations.get(id);
        return loc == null ? null : new MutablePoint(loc);
    }

    public synchronized void setLocation(String id, int x, int y) {
        MutablePoint loc = locations.get(id);
        if (loc == null) {
            throw new IllegalArgumentException("No such ID: " + id);
        }
        loc.x = x;
        loc.y = y;
    }
}
