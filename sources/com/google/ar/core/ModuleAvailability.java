package com.google.ar.core;

import com.bytedance.covode.number.Covode;

public enum ModuleAvailability {
    SUPPORTED_INSTALLED(0),
    SUPPORTED_PENDING_IMMEDIATE_INSTALL(10),
    SUPPORTED_NOT_INSTALLED(11),
    SUPPORTED_PENDING_DEFERRED_INSTALL(20),
    UNKNOWN_ERROR(50);
    
    final int nativeCode;

    static {
        Covode.recordClassIndex(33028);
    }

    static ModuleAvailability forNumber(int i2) {
        ModuleAvailability[] values = values();
        for (ModuleAvailability moduleAvailability : values) {
            if (moduleAvailability.nativeCode == i2) {
                return moduleAvailability;
            }
        }
        StringBuilder sb = new StringBuilder(65);
        sb.append("Unexpected value for native ModuleAvailability, value=");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    private ModuleAvailability(int i2) {
        this.nativeCode = i2;
    }
}
