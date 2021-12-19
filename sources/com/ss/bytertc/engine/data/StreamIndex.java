package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public enum StreamIndex {
    STREAM_INDEX_MAIN(0),
    STREAM_INDEX_SCREEN(1);
    
    private int value;

    public final int value() {
        return this.value;
    }

    public final String toString() {
        if (this == STREAM_INDEX_MAIN) {
            return "kStreamIndexMain";
        }
        return "kStreamIndexScreen";
    }

    static {
        Covode.recordClassIndex(100872);
    }

    public static StreamIndex fromId(int i2) {
        StreamIndex[] values = values();
        for (StreamIndex streamIndex : values) {
            if (streamIndex.value() == i2) {
                return streamIndex;
            }
        }
        return null;
    }

    private StreamIndex(int i2) {
        this.value = i2;
    }
}
