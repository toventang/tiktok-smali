package com.bytedance.helios.sdk.d;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f30856a;

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f30857b;

    /* renamed from: c  reason: collision with root package name */
    private final e f30858c;

    /* renamed from: d  reason: collision with root package name */
    private final d f30859d;

    static {
        Covode.recordClassIndex(17919);
    }

    c(b bVar, Throwable th, e eVar, d dVar) {
        this.f30856a = bVar;
        this.f30857b = th;
        this.f30858c = eVar;
        this.f30859d = dVar;
    }

    public final void run() {
        this.f30856a.a(this.f30857b, this.f30858c, this.f30859d);
    }
}
