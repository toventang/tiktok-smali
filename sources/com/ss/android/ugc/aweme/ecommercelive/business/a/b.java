package com.ss.android.ugc.aweme.ecommercelive.business.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(55187);
    }

    private static String a(String str, a aVar) {
        l.d(str, "");
        l.d(aVar, "");
        try {
            Uri parse = Uri.parse(str);
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("trackParams", b(parse.getQueryParameter("trackParams"), aVar));
            return buildUpon.build().toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r1 != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String b(java.lang.String r2, com.ss.android.ugc.aweme.ecommercelive.business.a.a r3) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.business.a.b.b(java.lang.String, com.ss.android.ugc.aweme.ecommercelive.business.a.a):java.lang.String");
    }

    public static final String a(int i2, String str, a aVar) {
        l.d(str, "");
        l.d(aVar, "");
        if (i2 == 5 || i2 == 6) {
            try {
                Uri parse = Uri.parse(str);
                Uri.Builder builder = new Uri.Builder();
                l.b(parse, "");
                builder.scheme(parse.getScheme());
                builder.authority(parse.getHost());
                builder.path(parse.getPath());
                for (String str2 : parse.getQueryParameterNames()) {
                    if (!l.a((Object) str2, (Object) "trackParams")) {
                        builder.appendQueryParameter(str2, parse.getQueryParameter(str2));
                    }
                }
                builder.appendQueryParameter("trackParams", b(parse.getQueryParameter("trackParams"), aVar));
                builder.appendQueryParameter("fullScreen", "false");
                return builder.build().toString();
            } catch (Exception unused) {
                return str;
            }
        } else if (i2 == 100) {
            return a(str, aVar);
        } else {
            return str;
        }
    }
}
