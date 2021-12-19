package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class hm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final hj f51767a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51768b;

    /* renamed from: c  reason: collision with root package name */
    private final Exception f51769c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f51770d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f51771e;

    static {
        Covode.recordClassIndex(32288);
    }

    hm(hj hjVar, int i2, Exception exc, byte[] bArr, Map map) {
        this.f51767a = hjVar;
        this.f51768b = i2;
        this.f51769c = exc;
        this.f51770d = bArr;
        this.f51771e = map;
    }

    public final void run() {
        hj hjVar = this.f51767a;
        hjVar.f51761a.a(this.f51768b, this.f51769c, this.f51770d);
    }
}
