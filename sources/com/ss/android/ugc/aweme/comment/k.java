package com.ss.android.ugc.aweme.comment;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f72073a;

    static {
        Covode.recordClassIndex(44267);
    }

    k(b bVar) {
        this.f72073a = bVar;
    }

    public final void run() {
        b bVar = this.f72073a;
        if (bVar.f71468b instanceof com.ss.android.ugc.aweme.comment.ui.k) {
            ((com.ss.android.ugc.aweme.comment.ui.k) bVar.f71468b).A();
        }
    }
}
