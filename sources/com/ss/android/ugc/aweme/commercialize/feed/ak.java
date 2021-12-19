package com.ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.model.am;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

final /* synthetic */ class ak implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f74070a;

    /* renamed from: b  reason: collision with root package name */
    private final am f74071b;

    static {
        Covode.recordClassIndex(45623);
    }

    ak(h hVar, am amVar) {
        this.f74070a = hVar;
        this.f74071b = amVar;
    }

    public final void run() {
        h hVar = this.f74070a;
        am amVar = this.f74071b;
        AwemeRawAd awemeRawAd = hVar.o.getAwemeRawAd();
        if (awemeRawAd != null) {
            aj.a("cpv_" + amVar.f74866a + "s", amVar.f74867b, awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), null, new ao(hVar));
        }
    }
}
