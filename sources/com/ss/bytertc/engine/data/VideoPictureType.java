package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public enum VideoPictureType {
    VIDEO_PICTURE_TYPE_UNKNOWN(0),
    VIDEO_PICTURE_TYPE_I(1),
    VIDEO_PICTURE_TYPE_P(2),
    VIDEO_PICTURE_TYPE_B(3);
    
    int value = -1;

    public final int value() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(100875);
    }

    public static VideoPictureType fromId(int i2) {
        VideoPictureType[] values = values();
        for (VideoPictureType videoPictureType : values) {
            if (videoPictureType.value() == i2) {
                return videoPictureType;
            }
        }
        return null;
    }

    private VideoPictureType(int i2) {
        this.value = i2;
    }
}
