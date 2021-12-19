package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class cm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cc f94496a;

    static {
        Covode.recordClassIndex(60001);
    }

    cm(cc ccVar) {
        this.f94496a = ccVar;
    }

    public final void run() {
        cc ccVar = this.f94496a;
        if (ccVar.f94468g != null) {
            ccVar.f94468g.invalidate();
        }
    }
}
