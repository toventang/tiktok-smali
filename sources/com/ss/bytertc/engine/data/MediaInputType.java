package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public enum MediaInputType {
    MEDIA_INPUT_TYPE_EXTERNAL(0),
    MEDIA_INPUT_TYPE_INTERNAL(1);
    
    private int value;

    public final int value() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(100857);
    }

    public static MediaInputType fromId(int i2) {
        MediaInputType[] values = values();
        for (MediaInputType mediaInputType : values) {
            if (mediaInputType.value() == i2) {
                return mediaInputType;
            }
        }
        return null;
    }

    private MediaInputType(int i2) {
        this.value = i2;
    }
}
