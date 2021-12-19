package com.bytedance.android.live.core.f;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.net.URLDecoder;
import java.util.Set;

public final class af {
    static {
        Covode.recordClassIndex(4612);
    }

    private static String c(Uri uri, String str) {
        String decode;
        try {
            try {
                decode = URLDecoder.decode(uri.getQueryParameter(str), "UTF-8");
                return decode;
            } catch (Exception unused) {
                return decode;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static boolean a(Uri uri, String str) {
        String c2 = c(uri, str);
        if (TextUtils.isEmpty(c2)) {
            return false;
        }
        if ("1".equals(c2) || "true".equals(c2)) {
            return true;
        }
        return false;
    }

    public static Uri b(Uri uri, String str) {
        if (uri == null) {
            return null;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames == null) {
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str2 : queryParameterNames) {
            if (!str2.equals(str)) {
                clearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        return clearQuery.build();
    }
}
