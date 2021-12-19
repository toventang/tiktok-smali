package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.feed.ui.eg;

final /* synthetic */ class es implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final eg.AnonymousClass5 f94740a;

    static {
        Covode.recordClassIndex(60112);
    }

    es(eg.AnonymousClass5 r1) {
        this.f94740a = r1;
    }

    public final void run() {
        eg.AnonymousClass5 r3 = this.f94740a;
        e.a(eg.this.f94688a, 2131231780);
        eg.this.f94690c.animate().scaleX(1.16f).scaleY(1.16f).setDuration(150).withEndAction(new et(r3)).start();
    }
}
