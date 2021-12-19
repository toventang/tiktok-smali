package com.bytedance.ies.abmock.datacenter.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SaveConfigType;

public final /* synthetic */ class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f31806a;

    static {
        Covode.recordClassIndex(18597);
        int[] iArr = new int[SaveConfigType.ConfigType.values().length];
        f31806a = iArr;
        iArr[SaveConfigType.ConfigType.BOOLEAN.ordinal()] = 1;
        iArr[SaveConfigType.ConfigType.INT.ordinal()] = 2;
        iArr[SaveConfigType.ConfigType.LONG.ordinal()] = 3;
        iArr[SaveConfigType.ConfigType.DOUBLE.ordinal()] = 4;
        iArr[SaveConfigType.ConfigType.FLOAT.ordinal()] = 5;
        iArr[SaveConfigType.ConfigType.STRING.ordinal()] = 6;
        iArr[SaveConfigType.ConfigType.STRING_ARRAY.ordinal()] = 7;
        iArr[SaveConfigType.ConfigType.OBJECT.ordinal()] = 8;
    }
}
