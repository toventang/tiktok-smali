package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;

public enum gg {
    DOUBLE(0, gi.SCALAR, gw.DOUBLE),
    FLOAT(1, gi.SCALAR, gw.FLOAT),
    INT64(2, gi.SCALAR, gw.LONG),
    UINT64(3, gi.SCALAR, gw.LONG),
    INT32(4, gi.SCALAR, gw.INT),
    FIXED64(5, gi.SCALAR, gw.LONG),
    FIXED32(6, gi.SCALAR, gw.INT),
    BOOL(7, gi.SCALAR, gw.BOOLEAN),
    STRING(8, gi.SCALAR, gw.STRING),
    MESSAGE(9, gi.SCALAR, gw.MESSAGE),
    BYTES(10, gi.SCALAR, gw.BYTE_STRING),
    UINT32(11, gi.SCALAR, gw.INT),
    ENUM(12, gi.SCALAR, gw.ENUM),
    SFIXED32(13, gi.SCALAR, gw.INT),
    SFIXED64(14, gi.SCALAR, gw.LONG),
    SINT32(15, gi.SCALAR, gw.INT),
    SINT64(16, gi.SCALAR, gw.LONG),
    GROUP(17, gi.SCALAR, gw.MESSAGE),
    DOUBLE_LIST(18, gi.VECTOR, gw.DOUBLE),
    FLOAT_LIST(19, gi.VECTOR, gw.FLOAT),
    INT64_LIST(20, gi.VECTOR, gw.LONG),
    UINT64_LIST(21, gi.VECTOR, gw.LONG),
    INT32_LIST(22, gi.VECTOR, gw.INT),
    FIXED64_LIST(23, gi.VECTOR, gw.LONG),
    FIXED32_LIST(24, gi.VECTOR, gw.INT),
    BOOL_LIST(25, gi.VECTOR, gw.BOOLEAN),
    STRING_LIST(26, gi.VECTOR, gw.STRING),
    MESSAGE_LIST(27, gi.VECTOR, gw.MESSAGE),
    BYTES_LIST(28, gi.VECTOR, gw.BYTE_STRING),
    UINT32_LIST(29, gi.VECTOR, gw.INT),
    ENUM_LIST(30, gi.VECTOR, gw.ENUM),
    SFIXED32_LIST(31, gi.VECTOR, gw.INT),
    SFIXED64_LIST(32, gi.VECTOR, gw.LONG),
    SINT32_LIST(33, gi.VECTOR, gw.INT),
    SINT64_LIST(34, gi.VECTOR, gw.LONG),
    DOUBLE_LIST_PACKED(35, gi.PACKED_VECTOR, gw.DOUBLE),
    FLOAT_LIST_PACKED(36, gi.PACKED_VECTOR, gw.FLOAT),
    INT64_LIST_PACKED(37, gi.PACKED_VECTOR, gw.LONG),
    UINT64_LIST_PACKED(38, gi.PACKED_VECTOR, gw.LONG),
    INT32_LIST_PACKED(39, gi.PACKED_VECTOR, gw.INT),
    FIXED64_LIST_PACKED(40, gi.PACKED_VECTOR, gw.LONG),
    FIXED32_LIST_PACKED(41, gi.PACKED_VECTOR, gw.INT),
    BOOL_LIST_PACKED(42, gi.PACKED_VECTOR, gw.BOOLEAN),
    UINT32_LIST_PACKED(43, gi.PACKED_VECTOR, gw.INT),
    ENUM_LIST_PACKED(44, gi.PACKED_VECTOR, gw.ENUM),
    SFIXED32_LIST_PACKED(45, gi.PACKED_VECTOR, gw.INT),
    SFIXED64_LIST_PACKED(46, gi.PACKED_VECTOR, gw.LONG),
    SINT32_LIST_PACKED(47, gi.PACKED_VECTOR, gw.INT),
    SINT64_LIST_PACKED(48, gi.PACKED_VECTOR, gw.LONG),
    GROUP_LIST(49, gi.VECTOR, gw.MESSAGE),
    MAP(50, gi.MAP, gw.VOID);
    
    private static final gg[] X;
    private static final Type[] Y = new Type[0];
    private final gw zzaz;
    private final int zzba;
    private final gi zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    public final int zza() {
        return this.zzba;
    }

    static {
        Covode.recordClassIndex(31814);
        gg[] values = values();
        X = new gg[values.length];
        for (gg ggVar : values) {
            X[ggVar.zzba] = ggVar;
        }
    }

    private gg(int i2, gi giVar, gw gwVar) {
        int i3;
        this.zzba = i2;
        this.zzbb = giVar;
        this.zzaz = gwVar;
        int i4 = gf.f50909a[giVar.ordinal()];
        boolean z = true;
        if (i4 == 1) {
            this.zzbc = gwVar.zza();
        } else if (i4 != 2) {
            this.zzbc = null;
        } else {
            this.zzbc = gwVar.zza();
        }
        this.zzbd = (giVar != gi.SCALAR || (i3 = gf.f50910b[gwVar.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : z;
    }
}
