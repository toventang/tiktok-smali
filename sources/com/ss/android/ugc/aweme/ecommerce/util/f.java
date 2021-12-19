package com.ss.android.ugc.aweme.ecommerce.util;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Set;

public final class f {
    static {
        Covode.recordClassIndex(55044);
    }

    public static final Uri a(Uri uri, String str, String str2) {
        l.d(uri, "");
        l.d(str, "");
        l.d(str2, "");
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        l.b(queryParameterNames, "");
        for (T t : queryParameterNames) {
            if (!l.a((Object) t, (Object) str)) {
                buildUpon.appendQueryParameter(t, uri.getQueryParameter(t));
            } else {
                buildUpon.appendQueryParameter(str, str2);
            }
        }
        Uri build = buildUpon.build();
        l.b(build, "");
        return build;
    }
}
