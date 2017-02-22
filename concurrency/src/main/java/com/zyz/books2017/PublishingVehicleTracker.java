package com.zyz.books2017;

import org.apache.http.annotation.ThreadSafe;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by ZhangYuanzhuo on 2017/2/22.
 */
@ThreadSafe
public class PublishingVehicleTracker {
    private final Map<String, SafePoint> locations;
    private final Map<String, SafePoint> unmodifiableMap;

    public PublishingVehicleTracker(
            Map<String, SafePoint> locations) {
        this.locations
                = new ConcurrentHashMap<>(locations);
        this.unmodifiableMap
                = Collections.unmodifiableMap(this.locations);
    }

    public Map<String, SafePoint> getLocations() {
        return unmodifiableMap;
    }

    public SafePoint getLocation(String id) {
        return locations.get(id);
    }

    public void setLocations(String id, int x, int y) {
        if (!locations.containsKey(id)) {
            throw new IllegalArgumentException(
                    "invalid vehicle name: " + id);
        }
        locations.get(id).set(x, y);
    }
}
