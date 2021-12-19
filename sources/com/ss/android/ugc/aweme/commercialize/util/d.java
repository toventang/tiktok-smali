package com.ss.android.ugc.aweme.commercialize.util;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f75478a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(46564);
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static String a(String str, Bundle bundle) {
        l.d(str, "");
        l.d(bundle, "");
        Set<String> keySet = bundle.keySet();
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = Uri.parse(parse.getQueryParameter("fallback_url")).buildUpon();
        l.b(parse, "");
        l.d(parse, "");
        l.d("fallback_url", "");
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        l.b(queryParameterNames, "");
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        l.b(clearQuery, "");
        for (String str2 : queryParameterNames) {
            if (!l.a((Object) str2, (Object) "fallback_url")) {
                clearQuery.appendQueryParameter(str2, parse.getQueryParameter(str2));
            }
        }
        Uri build = clearQuery.build();
        l.b(build, "");
        Uri.Builder buildUpon2 = build.buildUpon();
        for (String str3 : keySet) {
            String valueOf = String.valueOf(a(bundle, str3));
            buildUpon2.appendQueryParameter(str3, valueOf);
            buildUpon.appendQueryParameter(str3, valueOf);
        }
        buildUpon2.appendQueryParameter("fallback_url", Uri.decode(buildUpon.build().toString()));
        String uri = buildUpon2.build().toString();
        l.b(uri, "");
        return uri;
    }
}
