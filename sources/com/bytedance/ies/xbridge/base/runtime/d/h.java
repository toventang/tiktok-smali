package com.bytedance.ies.xbridge.base.runtime.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.b.f;

public final /* synthetic */ class h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f35861a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f35862b;

    static {
        Covode.recordClassIndex(21407);
        int[] iArr = new int[f.values().length];
        f35861a = iArr;
        iArr[f.GET.ordinal()] = 1;
        iArr[f.POST.ordinal()] = 2;
        iArr[f.PUT.ordinal()] = 3;
        iArr[f.DELETE.ordinal()] = 4;
        int[] iArr2 = new int[f.values().length];
        f35862b = iArr2;
        iArr2[f.POST.ordinal()] = 1;
        iArr2[f.DOWNLOAD.ordinal()] = 2;
    }
}
