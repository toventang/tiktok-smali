package com.ss.android.ugc.aweme.commercialize.live.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Set;

public final class b {
    static {
        Covode.recordClassIndex(46030);
    }

    public static final Uri a(Uri uri, String str) {
        l.d(uri, "");
        l.d(str, "");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        l.b(queryParameterNames, "");
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        l.b(clearQuery, "");
        for (String str2 : queryParameterNames) {
            if (!l.a((Object) str2, (Object) str)) {
                clearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        Uri build = clearQuery.build();
        l.b(build, "");
        return build;
    }
}
