package com.ss.android.ugc.aweme.feed.ui;

import android.view.animation.ScaleAnimation;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.eg;

final /* synthetic */ class eu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final eg.AnonymousClass5 f94742a;

    static {
        Covode.recordClassIndex(60114);
    }

    eu(eg.AnonymousClass5 r1) {
        this.f94742a = r1;
    }

    public final void run() {
        eg.AnonymousClass5 r2 = this.f94742a;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.16f, 0.8f, 1.16f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(600);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        eg.this.f94690c.startAnimation(scaleAnimation);
    }
}
