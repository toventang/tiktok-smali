package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAHideLoading;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dp implements CheckBAHideLoading {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131693a;

    static {
        Covode.recordClassIndex(86245);
    }

    dp(cj cjVar) {
        this.f131693a = cjVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.model.CheckBAHideLoading
    public final void hideLoading() {
        cj cjVar = this.f131693a;
        cjVar.o.setVisibility(0);
        cjVar.p.setVisibility(8);
        if (cjVar.q != null && cjVar.q.isRunning()) {
            cjVar.q.cancel();
        }
    }
}
