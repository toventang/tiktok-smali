package com.ss.android.ugc.aweme.qrcode.e;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.qrcode.api.a;
import java.util.Set;
import java.util.regex.Pattern;

public final class c {
    static {
        Covode.recordClassIndex(77795);
    }

    public static boolean a(String str) {
        if (b(str)) {
            return a(Uri.parse(str));
        }
        return false;
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        return Pattern.compile("(https?|http)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str).find();
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("ttschema://view_grade_resource")) {
            return false;
        }
        return true;
    }

    private static boolean a(Uri uri) {
        Set<String> c2 = s.a.f66880a.f().c();
        if (c2.isEmpty()) {
            return a.f119707a.contains(uri.getHost());
        }
        return c2.contains(uri.getHost());
    }
}
