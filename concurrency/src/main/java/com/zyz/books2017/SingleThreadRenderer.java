package com.zyz.books2017;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/3/8.
 */
public class SingleThreadRenderer {
    void renderPage(CharSequence source) {
        renderText(source);
        List<ImageData> imageData = new ArrayList<>();
        for (ImageInfo imageInfo : scanForImageInfo(source)) {
            imageData.add(imageInfo.downloadImage());
        }
        for (ImageData data : imageData) {
            renderImage(data);
        }
    }

    private void renderImage(ImageData data) {

    }

    private ImageInfo[] scanForImageInfo(CharSequence source) {
        return new ImageInfo[0];
    }

    private void renderText(CharSequence source) {

    }
}
