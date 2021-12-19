package com.ss.android.ugc.aweme.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class il {
    static {
        Covode.recordClassIndex(93673);
    }

    public static Uri a(Uri uri) {
        if (uri == null || !TextUtils.equals(uri.getHost(), "webview") || uri.getQueryParameter("url") == null) {
            return null;
        }
        return Uri.parse(uri.getQueryParameter("url"));
    }

    public static String a(Uri uri, String str) {
        if (uri == null || uri.isOpaque()) {
            return null;
        }
        return uri.getQueryParameter(str);
    }
}
