package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class ej implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final eg f94721a;

    /* renamed from: b  reason: collision with root package name */
    private final float f94722b;

    /* renamed from: c  reason: collision with root package name */
    private final float f94723c;

    static {
        Covode.recordClassIndex(60103);
    }

    ej(eg egVar, float f2, float f3) {
        this.f94721a = egVar;
        this.f94722b = f2;
        this.f94723c = f3;
    }

    public final void run() {
        eg egVar = this.f94721a;
        float f2 = this.f94722b;
        egVar.f94690c.animate().scaleX(f2).scaleY(f2).setDuration(150).withEndAction(new ek(egVar, f2, this.f94723c)).start();
    }
}
