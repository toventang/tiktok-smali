package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f53434a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f53435b;

    static {
        Covode.recordClassIndex(33071);
    }

    d(e eVar, AtomicBoolean atomicBoolean) {
        this.f53435b = eVar;
        this.f53434a = atomicBoolean;
    }

    public final void run() {
        if (!this.f53434a.getAndSet(true)) {
            e eVar = this.f53435b;
            ak.a(eVar.f53436a, eVar.f53437b);
        }
    }
}
