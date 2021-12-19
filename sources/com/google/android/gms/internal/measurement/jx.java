package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public enum jx {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(fe.zza),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzj;

    static {
        Covode.recordClassIndex(31921);
    }

    private jx(Object obj) {
        this.zzj = obj;
    }
}
