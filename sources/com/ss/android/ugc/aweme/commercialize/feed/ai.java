package com.ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

final /* synthetic */ class ai implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f74068a;

    static {
        Covode.recordClassIndex(45621);
    }

    ai(h hVar) {
        this.f74068a = hVar;
    }

    public final void run() {
        h hVar = this.f74068a;
        Context context = hVar.ae;
        Aweme aweme = hVar.o;
        j.b(context, "play_6s", aweme, j.a(context, aweme, false, (Map<String, String>) null));
        a.a("draw_ad", "play_6s", hVar.o.getAwemeRawAd()).c();
    }
}
