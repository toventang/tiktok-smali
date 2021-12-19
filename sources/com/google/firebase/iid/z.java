package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.firebase.iid.x;

/* access modifiers changed from: package-private */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final x.a f54509a;

    static {
        Covode.recordClassIndex(33829);
    }

    z(x.a aVar) {
        this.f54509a = aVar;
    }

    public final void run() {
        this.f54509a.c();
    }
}
