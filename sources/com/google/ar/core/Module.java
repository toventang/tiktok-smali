package com.google.ar.core;

import com.bytedance.covode.number.Covode;

public enum Module {
    AUGMENTED_FACE_IMPROVED_LIP_EYE(0),
    NORMAL_NET(1),
    DEPTH_NET(2);
    
    final int nativeCode;

    static {
        Covode.recordClassIndex(33027);
    }

    static Module forNumber(int i2) {
        Module[] values = values();
        for (Module module : values) {
            if (module.nativeCode == i2) {
                return module;
            }
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Unexpected value for native Module, value=");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    private Module(int i2) {
        this.nativeCode = i2;
    }
}
