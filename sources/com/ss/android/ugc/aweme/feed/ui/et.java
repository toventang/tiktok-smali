package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.eg;

final /* synthetic */ class et implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final eg.AnonymousClass5 f94741a;

    static {
        Covode.recordClassIndex(60113);
    }

    et(eg.AnonymousClass5 r1) {
        this.f94741a = r1;
    }

    public final void run() {
        eg.AnonymousClass5 r3 = this.f94741a;
        eg.this.f94690c.animate().scaleX(0.8f).scaleY(0.8f).setDuration(150).withEndAction(new eu(r3)).start();
    }
}
