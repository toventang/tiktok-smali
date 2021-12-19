package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.firebase.iid.x;

final /* synthetic */ class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final x.a f54388a;

    /* renamed from: b  reason: collision with root package name */
    private final x.d f54389b;

    static {
        Covode.recordClassIndex(33771);
    }

    ad(x.a aVar, x.d dVar) {
        this.f54388a = aVar;
        this.f54389b = dVar;
    }

    public final void run() {
        this.f54388a.a(this.f54389b.f54504a);
    }
}
