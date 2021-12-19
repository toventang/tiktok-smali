package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.google.ar.core.ArCoreApk;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
final class u extends ArCoreApk.Availability {
    static {
        Covode.recordClassIndex(33116);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isSupported() {
        return true;
    }

    u() {
        super("SUPPORTED_NOT_INSTALLED", 4, 201, null);
    }
}
