package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.bv;

final /* synthetic */ class cb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bv.AnonymousClass3.AnonymousClass1 f94461a;

    static {
        Covode.recordClassIndex(59987);
    }

    cb(bv.AnonymousClass3.AnonymousClass1 r1) {
        this.f94461a = r1;
    }

    public final void run() {
        bv.AnonymousClass3.AnonymousClass1 r3 = this.f94461a;
        bv.this.f94427c.setLines(bv.f94424a ? Math.min(bv.f94425l, bv.this.f94427c.getLineCount()) : bv.this.f94427c.getLineCount());
    }
}
