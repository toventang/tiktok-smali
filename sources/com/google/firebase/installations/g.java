package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f54582a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f54583b;

    static {
        Covode.recordClassIndex(33858);
    }

    g(c cVar, boolean z) {
        this.f54582a = cVar;
        this.f54583b = z;
    }

    public final void run() {
        this.f54582a.a(this.f54583b);
    }
}
