package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f54581a;

    static {
        Covode.recordClassIndex(33857);
    }

    private f(c cVar) {
        this.f54581a = cVar;
    }

    public static Runnable a(c cVar) {
        return new f(cVar);
    }

    public final void run() {
        this.f54581a.a(false);
    }
}
