package com.ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f109564a;

    static {
        Covode.recordClassIndex(70128);
    }

    d(c cVar) {
        this.f109564a = cVar;
    }

    public final void run() {
        this.f109564a.g();
    }
}
