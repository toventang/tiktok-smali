package com.ss.android.ugc.aweme.commercialize.util.adrouter.a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.a;
import h.f.b.l;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONObject;

public final class b extends a {
    static {
        Covode.recordClassIndex(46536);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.e
    public final boolean a() {
        if (TextUtils.isEmpty(d().f75409c.f75440a)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.e
    public final boolean b() {
        String str;
        a.f75399a.a("ad_lynx_download_JumpMarketHandler_doHandle", (JSONObject) null, "begin", String.valueOf(d().f75407a.f75416c));
        String str2 = d().f75409c.f75440a;
        if (TextUtils.isEmpty(str2)) {
            a.f75399a.a("ad_lynx_download_JumpMarketHandler_doHandle", (JSONObject) null, "empty_url", String.valueOf(d().f75407a.f75416c));
            return false;
        }
        Uri parse = Uri.parse(str2);
        l.b(parse, "");
        String scheme = parse.getScheme();
        if (scheme != null) {
            Locale locale = Locale.getDefault();
            l.b(locale, "");
            Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
            str = scheme.toLowerCase(locale);
            l.b(str, "");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            a.f75399a.a("ad_lynx_download_JumpMarketHandler_doHandle", (JSONObject) null, "empty_schema", String.valueOf(d().f75407a.f75416c));
            return false;
        } else if (l.a((Object) "market", (Object) str)) {
            a.f75399a.a("ad_lynx_download_JumpMarketHandler_doHandle", (JSONObject) null, "jumpMarket", String.valueOf(d().f75407a.f75416c));
            return a.f75399a.a(c(), str2, parse, d());
        } else {
            a.f75399a.a("ad_lynx_download_JumpMarketHandler_doHandle", (JSONObject) null, "fail", String.valueOf(d().f75407a.f75416c));
            return false;
        }
    }
}
