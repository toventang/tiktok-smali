package com.bytedance.assem.arch.core;

import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class g {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f25569a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f25570b;

    static {
        Covode.recordClassIndex(14887);
        int[] iArr = new int[i.b.values().length];
        f25569a = iArr;
        iArr[i.b.CREATED.ordinal()] = 1;
        iArr[i.b.STARTED.ordinal()] = 2;
        iArr[i.b.RESUMED.ordinal()] = 3;
        iArr[i.b.DESTROYED.ordinal()] = 4;
        int[] iArr2 = new int[i.a.values().length];
        f25570b = iArr2;
        iArr2[i.a.ON_CREATE.ordinal()] = 1;
        iArr2[i.a.ON_START.ordinal()] = 2;
        iArr2[i.a.ON_RESUME.ordinal()] = 3;
        iArr2[i.a.ON_PAUSE.ordinal()] = 4;
        iArr2[i.a.ON_STOP.ordinal()] = 5;
        iArr2[i.a.ON_DESTROY.ordinal()] = 6;
    }
}
