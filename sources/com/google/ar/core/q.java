package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.google.ar.core.ArCoreApk;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
final class q extends ArCoreApk.Availability {
    static {
        Covode.recordClassIndex(33112);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isUnknown() {
        return true;
    }

    q() {
        super("UNKNOWN_ERROR", 0, 0, null);
    }
}
