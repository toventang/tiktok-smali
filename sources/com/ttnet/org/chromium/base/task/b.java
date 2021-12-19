package com.ttnet.org.chromium.base.task;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f155313a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f155314b;

    static {
        Covode.recordClassIndex(103341);
    }

    b(a aVar, Object obj) {
        this.f155313a = aVar;
        this.f155314b = obj;
    }

    public final void run() {
        a aVar = this.f155313a;
        aVar.f155307d.get();
        aVar.f155306c = 2;
    }
}
