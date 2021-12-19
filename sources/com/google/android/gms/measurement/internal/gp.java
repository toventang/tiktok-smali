package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class gp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f51706a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51707b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f51708c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f51709d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ gk f51710e;

    static {
        Covode.recordClassIndex(32264);
    }

    public final void run() {
        this.f51710e.a(this.f51706a, this.f51707b, this.f51708c, this.f51709d);
    }

    gp(gk gkVar, String str, String str2, Object obj, long j2) {
        this.f51710e = gkVar;
        this.f51706a = str;
        this.f51707b = str2;
        this.f51708c = obj;
        this.f51709d = j2;
    }
}
