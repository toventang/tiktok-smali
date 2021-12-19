package com.ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class ac implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f74062a;

    static {
        Covode.recordClassIndex(45615);
    }

    ac(h hVar) {
        this.f74062a = hVar;
    }

    public final void run() {
        h hVar = this.f74062a;
        if (hVar.an != null) {
            hVar.an.c();
        }
    }
}
