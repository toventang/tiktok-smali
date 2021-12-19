package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.google.ar.core.exceptions.FatalException;

public enum Coordinates2d {
    TEXTURE_TEXELS(0),
    TEXTURE_NORMALIZED(1),
    IMAGE_PIXELS(2),
    IMAGE_NORMALIZED(3),
    OPENGL_NORMALIZED_DEVICE_COORDINATES(6),
    VIEW(7),
    VIEW_NORMALIZED(8);
    
    final int nativeCode;

    static {
        Covode.recordClassIndex(33015);
    }

    static Coordinates2d forNumber(int i2) {
        Coordinates2d[] values = values();
        for (Coordinates2d coordinates2d : values) {
            if (coordinates2d.nativeCode == i2) {
                return coordinates2d;
            }
        }
        StringBuilder sb = new StringBuilder(60);
        sb.append("Unexpected value for native Coordinates2d, value=");
        sb.append(i2);
        throw new FatalException(sb.toString());
    }

    private Coordinates2d(int i2) {
        this.nativeCode = i2;
    }
}
