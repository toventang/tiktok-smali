package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class eq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final eg f94734a;

    /* renamed from: b  reason: collision with root package name */
    private final float f94735b;

    /* renamed from: c  reason: collision with root package name */
    private final float f94736c;

    static {
        Covode.recordClassIndex(60110);
    }

    eq(eg egVar, float f2, float f3) {
        this.f94734a = egVar;
        this.f94735b = f2;
        this.f94736c = f3;
    }

    public final void run() {
        eg egVar = this.f94734a;
        egVar.f94690c.animate().scaleX(1.08f).scaleY(1.08f).setDuration(150).withEndAction(new ej(egVar, this.f94735b, this.f94736c)).start();
    }
}
