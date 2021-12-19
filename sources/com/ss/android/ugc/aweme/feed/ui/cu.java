package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.cc;

final /* synthetic */ class cu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cc.AnonymousClass2 f94510a;

    static {
        Covode.recordClassIndex(60009);
    }

    cu(cc.AnonymousClass2 r1) {
        this.f94510a = r1;
    }

    public final void run() {
        cc.AnonymousClass2 r3 = this.f94510a;
        cc.this.f94465d.setLines(cc.f94462a ? Math.min(cc.f94464c, cc.this.f94465d.getLineCount()) : cc.this.f94465d.getLineCount());
    }
}
