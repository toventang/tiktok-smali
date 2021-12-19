package com.ss.android.ugc.aweme.miniapp_api;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.miniapp_api.model.b;

public final class d {
    static {
        Covode.recordClassIndex(70213);
    }

    public static String a(b bVar) {
        if (bVar == null) {
            return "";
        }
        return bVar.getSchema();
    }

    private static boolean e(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(str).getQueryParameter("app_id");
    }

    public static boolean b(String str) {
        if (!e(str)) {
            return false;
        }
        return TextUtils.equals(Uri.parse(str).getHost(), "microapp");
    }

    public static boolean d(String str) {
        if (!e(str)) {
            return false;
        }
        return TextUtils.equals(Uri.parse(str).getHost(), "microgame");
    }

    public static boolean c(String str) {
        if (!e(str)) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.equals(host, "microapp") || TextUtils.equals(host, "microgame")) {
            return true;
        }
        return false;
    }
}
