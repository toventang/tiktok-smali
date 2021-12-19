package com.ss.android.i;

import com.bytedance.covode.number.Covode;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f59590a;

    /* renamed from: b  reason: collision with root package name */
    private final c f59591b;

    static {
        Covode.recordClassIndex(36782);
    }

    public e(d dVar, c cVar) {
        this.f59590a = dVar;
        this.f59591b = cVar;
    }

    public final void run() {
        this.f59590a.a(this.f59591b);
    }
}
