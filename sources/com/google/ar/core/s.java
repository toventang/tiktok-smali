package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.google.ar.core.ArCoreApk;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
final class s extends ArCoreApk.Availability {
    static {
        Covode.recordClassIndex(33114);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isUnknown() {
        return true;
    }

    s() {
        super("UNKNOWN_TIMED_OUT", 2, 2, null);
    }
}
