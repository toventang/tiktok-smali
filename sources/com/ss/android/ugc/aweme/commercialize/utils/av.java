package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.commercialize.log.i;
import com.ss.android.ugc.aweme.commercialize.util.e;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

public final class av {

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(46645);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(46644);
    }

    public static void a() {
        AwemeRawAd awemeRawAd = ay.f75622a;
        if (awemeRawAd != null) {
            a(d.a(), "landing_open_url_app", awemeRawAd);
        }
    }

    public static void b() {
        AwemeRawAd awemeRawAd = ay.f75622a;
        if (awemeRawAd != null) {
            a(new aw(awemeRawAd));
        }
    }

    private static void a(a aVar) {
        i.a(5000).a(new ax(aVar));
    }

    static void a(Context context, String str, AwemeRawAd awemeRawAd) {
        if (context != null && awemeRawAd != null) {
            i.a aVar = new i.a();
            aVar.f74815a = awemeRawAd;
            aVar.f74817c = false;
            e.a("landing_ad", str, aVar.a(), awemeRawAd);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", str, awemeRawAd).c();
        }
    }
}
