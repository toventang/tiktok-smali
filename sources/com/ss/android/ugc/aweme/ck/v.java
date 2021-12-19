package com.ss.android.ugc.aweme.ck;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class v {
    static {
        Covode.recordClassIndex(43807);
    }

    public static List<String> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Uri.parse(str).getPathSegments();
    }

    public static String b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Uri.parse(str).getQueryParameter(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ck.v.a(java.lang.String, java.lang.String):boolean");
    }
}
