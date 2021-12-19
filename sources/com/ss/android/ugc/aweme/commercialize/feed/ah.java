package com.ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;

final /* synthetic */ class ah implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f74067a;

    static {
        Covode.recordClassIndex(45620);
    }

    ah(h hVar) {
        this.f74067a = hVar;
    }

    public final void run() {
        h hVar = this.f74067a;
        a.C0791a a2 = a.a("draw_ad", "play_2s", hVar.o.getAwemeRawAd());
        if (hVar.o.getAwemeRawAd() != null && hVar.o.getAwemeRawAd().isReshowAd()) {
            a2.a("is_reshow", 1);
        }
        a2.b();
    }
}
