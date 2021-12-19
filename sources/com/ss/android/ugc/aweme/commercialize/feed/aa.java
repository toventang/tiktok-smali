package com.ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f74060a;

    static {
        Covode.recordClassIndex(45613);
    }

    aa(h hVar) {
        this.f74060a = hVar;
    }

    public final void run() {
        h hVar = this.f74060a;
        if (hVar.an != null) {
            hVar.an.b();
        }
    }
}
