package com.ss.android.ugc.aweme.lancet;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.b;
import java.util.List;

public final class q {
    static {
        Covode.recordClassIndex(68591);
    }

    public static void a(String str) {
        Uri parse;
        List<String> pathSegments;
        if (!TextUtils.isEmpty(str) && str.startsWith("aweme://user/profile/") && (pathSegments = (parse = Uri.parse(str)).getPathSegments()) != null && pathSegments.size() >= 2) {
            b.h.a(pathSegments.get(1), parse, false);
        }
    }
}
