package com.bytedance.android.live.design.view;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f9486a;

    static {
        Covode.recordClassIndex(4822);
    }

    k(d dVar) {
        this.f9486a = dVar;
    }

    public final void run() {
        d dVar = this.f9486a;
        dVar.f9427a = 1;
        dVar.dismiss();
    }
}
