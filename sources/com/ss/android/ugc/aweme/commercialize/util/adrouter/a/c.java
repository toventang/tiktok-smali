package com.ss.android.ugc.aweme.commercialize.util.adrouter.a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.miniapp_api.d;
import h.f.b.l;
import java.util.Objects;
import org.json.JSONObject;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75403a = new a((byte) 0);

    static {
        Covode.recordClassIndex(46537);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46538);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final String e() {
        return d().f75409c.f75440a;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.e
    public final boolean a() {
        String str;
        if (TextUtils.isEmpty(e()) || d.c(e())) {
            return false;
        }
        Uri parse = Uri.parse(e());
        l.b(parse, "");
        String scheme = parse.getScheme();
        if (scheme != null) {
            Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
            str = scheme.toLowerCase();
            l.b(str, "");
        } else {
            str = null;
        }
        if (a(str) || l.a((Object) str, (Object) "aweme")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.e
    public final boolean b() {
        String str;
        com.ss.android.ugc.aweme.commercialize.util.adrouter.a.f75399a.a("ad_lynx_download_LocalOpenUrlHandler_doHandle", (JSONObject) null, "begin", String.valueOf(d().f75407a.f75416c));
        Uri parse = Uri.parse(e());
        l.b(parse, "");
        String scheme = parse.getScheme();
        if (scheme != null) {
            Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
            str = scheme.toLowerCase();
            l.b(str, "");
        } else {
            str = null;
        }
        if (a(str)) {
            com.ss.android.ugc.aweme.commercialize.util.adrouter.a.f75399a.a(e());
            com.ss.android.ugc.aweme.commercialize.util.adrouter.a.f75399a.a("ad_lynx_download_LocalOpenUrlHandler_doHandle", (JSONObject) null, "startAdsAppActivity", String.valueOf(d().f75407a.f75416c));
            return com.ss.android.ugc.aweme.commercialize.util.adrouter.a.f75399a.a(c(), e(), null);
        } else if (l.a((Object) str, (Object) "aweme")) {
            com.ss.android.ugc.aweme.commercialize.util.adrouter.a.f75399a.a("ad_lynx_download_LocalOpenUrlHandler_doHandle", (JSONObject) null, "open", String.valueOf(d().f75407a.f75416c));
            return com.ss.android.ugc.aweme.commercialize.util.adrouter.a.f75399a.b(e());
        } else {
            com.ss.android.ugc.aweme.commercialize.util.adrouter.a.f75399a.a("ad_lynx_download_LocalOpenUrlHandler_doHandle", (JSONObject) null, "fail", String.valueOf(d().f75407a.f75416c));
            return false;
        }
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals("sslocal", str) || TextUtils.equals("localsdk", str)) {
            return true;
        }
        return false;
    }
}
