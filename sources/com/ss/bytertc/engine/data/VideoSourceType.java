package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public enum VideoSourceType {
    VIDEO_SOURCE_TYPE_EXTERNAL(0),
    VIDEO_SOURCE_TYPE_INTERNAL(1);
    
    private int value;

    public final int value() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(100877);
    }

    public static VideoSourceType fromId(int i2) {
        VideoSourceType[] values = values();
        for (VideoSourceType videoSourceType : values) {
            if (videoSourceType.value() == i2) {
                return videoSourceType;
            }
        }
        return null;
    }

    private VideoSourceType(int i2) {
        this.value = i2;
    }
}
