package com.google.android.play.core.e;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class ao implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f53243a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f53244b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f53245c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ap f53246d;

    static {
        Covode.recordClassIndex(32909);
    }

    ao(ap apVar, f fVar, int i2, int i3) {
        this.f53246d = apVar;
        this.f53243a = fVar;
        this.f53244b = i2;
        this.f53245c = i3;
    }

    public final void run() {
        ap apVar = this.f53246d;
        f fVar = this.f53243a;
        apVar.a(new h(fVar.a(), this.f53244b, this.f53245c, fVar.d(), fVar.e(), fVar.i(), fVar.j(), fVar.h(), fVar.k()));
    }
}
