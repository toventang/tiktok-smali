package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

final class dc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f51409a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a f51410b;

    static {
        Covode.recordClassIndex(32170);
    }

    public final void run() {
        this.f51410b.b(this.f51409a);
    }

    dc(a aVar, long j2) {
        this.f51410b = aVar;
        this.f51409a = j2;
    }
}
