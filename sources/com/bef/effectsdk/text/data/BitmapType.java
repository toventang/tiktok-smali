package com.bef.effectsdk.text.data;

import com.bytedance.covode.number.Covode;

public enum BitmapType {
    TEXT_BITMAP_NONE(-1),
    TEXT_BITMAP_TYPE_ALPHA(0),
    TEXT_BITMAP_TYPE_RGBA8888(1),
    TEXT_BITMAP_NEON_ALPHA(2),
    TEXT_BITMAP_SINGLE_CHAR_ALPHA(3),
    TEXT_BITMAP_SHAKE_ALPHA(4);
    
    public int value;

    static {
        Covode.recordClassIndex(2898);
    }

    public static BitmapType valueOf(int i2) {
        BitmapType[] values = values();
        for (BitmapType bitmapType : values) {
            if (bitmapType.value == i2) {
                return bitmapType;
            }
        }
        return TEXT_BITMAP_NONE;
    }

    private BitmapType(int i2) {
        this.value = i2;
    }
}
