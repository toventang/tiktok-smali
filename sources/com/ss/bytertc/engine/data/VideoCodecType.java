package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public enum VideoCodecType {
    VIDEO_CODEC_TYPE_UNKNOWN(0),
    VIDEO_CODEC_TYPE_H264(1),
    VIDEO_CODEC_TYPE_BYTEVC1(2);
    
    int value = -1;

    public final int value() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(100873);
    }

    public static VideoCodecType fromId(int i2) {
        VideoCodecType[] values = values();
        for (VideoCodecType videoCodecType : values) {
            if (videoCodecType.value() == i2) {
                return videoCodecType;
            }
        }
        return null;
    }

    private VideoCodecType(int i2) {
        this.value = i2;
    }
}
