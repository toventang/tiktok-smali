package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.firebase.iid.x;

final /* synthetic */ class ac implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final x.a f54387a;

    static {
        Covode.recordClassIndex(33770);
    }

    ac(x.a aVar) {
        this.f54387a = aVar;
    }

    public final void run() {
        this.f54387a.a(2, "Service disconnected");
    }
}
