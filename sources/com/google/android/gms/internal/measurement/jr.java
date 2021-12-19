package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public enum jr {
    DOUBLE(jx.DOUBLE, 1),
    FLOAT(jx.FLOAT, 5),
    INT64(jx.LONG, 0),
    UINT64(jx.LONG, 0),
    INT32(jx.INT, 0),
    FIXED64(jx.LONG, 1),
    FIXED32(jx.INT, 5),
    BOOL(jx.BOOLEAN, 0),
    STRING {
    },
    GROUP {
    },
    MESSAGE {
    },
    BYTES {
    },
    UINT32(jx.INT, 0),
    ENUM(jx.ENUM, 0),
    SFIXED32(jx.INT, 5),
    SFIXED64(jx.LONG, 1),
    SINT32(jx.INT, 0),
    SINT64(jx.LONG, 0);
    
    private final jx zzs;
    private final int zzt;

    public final jx zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }

    static {
        Covode.recordClassIndex(31915);
    }

    private jr(jx jxVar, int i2) {
        this.zzs = jxVar;
        this.zzt = i2;
    }

    /* synthetic */ jr(jx jxVar, int i2, byte b2) {
        this(jxVar, i2);
    }
}
