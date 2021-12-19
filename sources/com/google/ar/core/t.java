package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.google.ar.core.ArCoreApk;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
final class t extends ArCoreApk.Availability {
    static {
        Covode.recordClassIndex(33115);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isUnsupported() {
        return true;
    }

    t() {
        super("UNSUPPORTED_DEVICE_NOT_CAPABLE", 3, 100, null);
    }
}
