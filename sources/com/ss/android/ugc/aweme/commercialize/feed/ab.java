package com.ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class ab implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f74061a;

    static {
        Covode.recordClassIndex(45614);
    }

    ab(h hVar) {
        this.f74061a = hVar;
    }

    public final void run() {
        h hVar = this.f74061a;
        if (hVar.an != null) {
            hVar.an.c();
        }
    }
}
