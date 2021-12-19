package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e;

final /* synthetic */ class el implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final eg f94727a;

    static {
        Covode.recordClassIndex(60105);
    }

    el(eg egVar) {
        this.f94727a = egVar;
    }

    public final void run() {
        eg egVar = this.f94727a;
        e.a(egVar.f94688a, 2131233113);
        egVar.f94690c.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150).withEndAction(new em(egVar));
    }
}
