package com.ss.android.ugc.aweme.feed.ui;

import android.view.animation.ScaleAnimation;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ek implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final eg f94724a;

    /* renamed from: b  reason: collision with root package name */
    private final float f94725b;

    /* renamed from: c  reason: collision with root package name */
    private final float f94726c;

    static {
        Covode.recordClassIndex(60104);
    }

    ek(eg egVar, float f2, float f3) {
        this.f94724a = egVar;
        this.f94725b = f2;
        this.f94726c = f3;
    }

    public final void run() {
        eg egVar = this.f94724a;
        float f2 = this.f94725b;
        float f3 = this.f94726c;
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(600);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        egVar.f94690c.startAnimation(scaleAnimation);
    }
}
