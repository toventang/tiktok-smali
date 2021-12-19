package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.cc;

final /* synthetic */ class cr implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cc.AnonymousClass1 f94504a;

    /* renamed from: b  reason: collision with root package name */
    private final int f94505b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f94506c;

    static {
        Covode.recordClassIndex(60006);
    }

    cr(cc.AnonymousClass1 r1, int i2, Aweme aweme) {
        this.f94504a = r1;
        this.f94505b = i2;
        this.f94506c = aweme;
    }

    public final void run() {
        cc.AnonymousClass1 r2 = this.f94504a;
        int i2 = this.f94505b;
        Aweme aweme = this.f94506c;
        cc.this.p = cc.this.f94465d.getHeight();
        cc.this.n = (cc.this.p * i2) / cc.c(aweme);
        if (cc.f94462a && cc.this.L != null && cc.this.f94467f != null && cc.this.f94467f.getVisibility() == 0 && cc.this.f94467f.getStatus() == 0) {
            cc.this.L.setDescLines(i2);
            cc.this.L.setDescTruncatedTextHeight(cc.this.p);
            cc.this.L.setDescFullTextHeight(cc.this.n);
        }
        cc.this.a(true);
    }
}
