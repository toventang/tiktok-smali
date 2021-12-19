package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class ep implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final eg f94733a;

    static {
        Covode.recordClassIndex(60109);
    }

    ep(eg egVar) {
        this.f94733a = egVar;
    }

    public final void run() {
        eg egVar = this.f94733a;
        if (egVar.f94690c != null && egVar.f94690c.getAnimation() != null) {
            egVar.f94690c.animate().scaleX(0.0f).scaleY(0.0f).setDuration(300).withEndAction(new el(egVar));
        }
    }
}
