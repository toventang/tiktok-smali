package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.cc;

final /* synthetic */ class cs implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cc.AnonymousClass1 f94507a;

    static {
        Covode.recordClassIndex(60007);
    }

    cs(cc.AnonymousClass1 r1) {
        this.f94507a = r1;
    }

    public final void run() {
        cc.AnonymousClass1 r2 = this.f94507a;
        if (cc.this.f94465d.getLineCount() != 0) {
            cc.this.f94465d.setLines(cc.this.f94465d.getLineCount());
            cc.this.a(false);
        }
    }
}
