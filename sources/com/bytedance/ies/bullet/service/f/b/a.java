package com.bytedance.ies.bullet.service.f.b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;
import java.util.Set;

public final class a {
    static {
        Covode.recordClassIndex(19574);
    }

    public static final Set<String> a(Uri uri) {
        l.c(uri, "");
        if (uri.isHierarchical()) {
            return uri.getQueryParameterNames();
        }
        return null;
    }

    public static final String a(Uri uri, String str) {
        l.c(uri, "");
        l.c(str, "");
        if (uri.isHierarchical()) {
            return uri.getQueryParameter(str);
        }
        return null;
    }

    public static final Uri a(Uri uri, List<String> list) {
        l.c(uri, "");
        l.c(list, "");
        if (!uri.isHierarchical()) {
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        l.a((Object) clearQuery, "");
        for (String str : uri.getQueryParameterNames()) {
            if (!list.contains(str)) {
                for (String str2 : uri.getQueryParameters(str)) {
                    clearQuery.appendQueryParameter(str, str2);
                }
            }
        }
        Uri build = clearQuery.build();
        l.a((Object) build, "");
        return build;
    }
}
