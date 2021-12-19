package com.ss.android.ugc.aweme.commercialize.live.c;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74655a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(46029);
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
        Uri.Builder buildUpon2 = b.a(parse, "fallback_url").buildUpon();
        for (String str2 : keySet) {
            String valueOf = String.valueOf(a(bundle, str2));
            buildUpon2.appendQueryParameter(str2, valueOf);
            buildUpon.appendQueryParameter(str2, valueOf);
        }
        buildUpon2.appendQueryParameter("fallback_url", Uri.decode(buildUpon.build().toString()));
        String uri = buildUpon2.build().toString();
        l.b(uri, "");
        return uri;
    }
}
