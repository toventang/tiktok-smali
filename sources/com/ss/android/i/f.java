package com.ss.android.i;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f59592a;

    /* renamed from: b  reason: collision with root package name */
    private final c f59593b;

    static {
        Covode.recordClassIndex(36783);
    }

    f(d dVar, c cVar) {
        this.f59592a = dVar;
        this.f59593b = cVar;
    }

    public final void run() {
        this.f59592a.a(this.f59593b);
    }
}
