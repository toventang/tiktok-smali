package com.ss.android.ugc.aweme.ad.utils;

import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.ad.b.e;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import h.f.b.l;
import h.m.p;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66164a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(40674);
    }

    public static final com.ss.android.ugc.aweme.ad.e.a a() {
        String m2;
        l.b(b.a.f65586a, "");
        e b2 = b.b();
        if (b2 == null || (m2 = b2.m()) == null) {
            return null;
        }
        return (com.ss.android.ugc.aweme.ad.e.a) new f().a(m2, com.ss.android.ugc.aweme.ad.e.a.class);
    }

    public static final void a(h.f.a.b<? super com.ss.android.ugc.aweme.ad.e.a, z> bVar) {
        l.d(bVar, "");
        com.ss.android.ugc.aweme.ad.e.a a2 = a();
        if (a2 != null) {
            bVar.invoke(a2);
        }
    }

    public static int a(AwemeRawAd awemeRawAd) {
        NativeAuthorInfo nativeAuthorInfo;
        if (awemeRawAd == null || awemeRawAd.getNativeAuthorInfo() == null || awemeRawAd == null || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || Integer.valueOf(nativeAuthorInfo.getAutoPullStyle()) == null) {
            return 0;
        }
        return awemeRawAd.getNativeAuthorInfo().getAutoPullStyle();
    }

    public static final String a(String str, long j2) {
        if (str == null || m.a(str) || j2 <= 0 || !p.a((CharSequence) str, (CharSequence) "{{ad_id}}", false)) {
            return null;
        }
        return "javascript:(function () {    var JS_ACTLOG_URL = '" + p.a(str, "{{ad_id}}", String.valueOf(j2), false) + "';    var head = document.getElementsByTagName('head')[0];    var script = document.createElement('script');    script.type = 'text/javascript';    script.src = JS_ACTLOG_URL;    head.appendChild(script);})();";
    }
}
