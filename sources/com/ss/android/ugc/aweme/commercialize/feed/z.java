package com.ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f74437a;

    static {
        Covode.recordClassIndex(45909);
    }

    z(h hVar) {
        this.f74437a = hVar;
    }

    public final void run() {
        h hVar = this.f74437a;
        if (hVar.an != null) {
            hVar.an.b();
        }
    }
}
