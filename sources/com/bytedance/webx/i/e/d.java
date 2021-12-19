package com.bytedance.webx.i.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.i.a;
import java.net.URLEncoder;

public final class d {
    static {
        Covode.recordClassIndex(28174);
    }

    public static boolean a(String str) {
        return str.startsWith(a.f46036b.f46060c);
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str) || ((!str.startsWith("http") && !str.startsWith("https")) || a(str))) {
            return false;
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (!str2.equals(str) && !str2.equals(str + "/"))) {
            return false;
        }
        return true;
    }

    public static String a(String str, String str2, int i2) {
        com.bytedance.webx.i.c.a aVar = a.f46036b;
        if (aVar == null || TextUtils.isEmpty(str) || a(str) || !b(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a.f46036b.f46060c);
        if (i2 > 0) {
            sb.append("/middle-page");
        }
        sb.append("?aid=").append(aVar.f46058a).append("&lang=").append(aVar.f46059b).append("&scene=").append(str2).append("&jumper_version=1&target=").append(URLEncoder.encode(str));
        if (i2 > 0) {
            sb.append("&type=").append(i2);
        }
        return sb.toString();
    }
}
