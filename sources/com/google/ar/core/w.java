package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.google.ar.core.ArCoreApk;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
final class w extends ArCoreApk.Availability {
    static {
        Covode.recordClassIndex(33118);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isSupported() {
        return true;
    }

    w() {
        super("SUPPORTED_INSTALLED", 6, 203, null);
    }
}
