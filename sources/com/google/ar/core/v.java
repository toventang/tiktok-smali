package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.google.ar.core.ArCoreApk;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
final class v extends ArCoreApk.Availability {
    static {
        Covode.recordClassIndex(33117);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isSupported() {
        return true;
    }

    v() {
        super("SUPPORTED_APK_TOO_OLD", 5, 202, null);
    }
}
