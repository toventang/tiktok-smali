package com.ss.android.ad.splash.core;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f58422a;

    /* renamed from: b  reason: collision with root package name */
    private final long f58423b;

    static {
        Covode.recordClassIndex(36274);
    }

    d(c cVar, long j2) {
        this.f58422a = cVar;
        this.f58423b = j2;
    }

    public final void run() {
        c cVar = this.f58422a;
        cVar.b(Math.min(cVar.y.c(), this.f58423b));
    }
}
