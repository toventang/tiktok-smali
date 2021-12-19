package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

enum gi {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);
    
    private final boolean zze;

    static {
        Covode.recordClassIndex(31816);
    }

    private gi(boolean z) {
        this.zze = z;
    }
}
