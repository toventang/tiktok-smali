package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public enum gw {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(fe.class, fe.class, fe.zza),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzk;
    private final Class<?> zzl;
    private final Object zzm;

    public final Class<?> zza() {
        return this.zzl;
    }

    static {
        Covode.recordClassIndex(31835);
    }

    private gw(Class cls, Class cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }
}
