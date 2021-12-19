package com.bytedance.b.k;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    static int f26340a = 1;

    static {
        Covode.recordClassIndex(15300);
    }

    private static String a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String a(String str, Map<String, String> map) {
        if (!TextUtils.isDigitsOnly(str) && map != null && !map.isEmpty()) {
            if (str.indexOf("?") < 0) {
                str = str + "?";
            }
            str = str.endsWith("?") ? str + a("sdk_version", "UTF-8") + "=" + a(String.valueOf(f26340a), "UTF-8") : str + "&" + a("sdk_version", "UTF-8") + "=" + a(String.valueOf(f26340a), "UTF-8");
            if (map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (map.get(entry.getKey()) != null) {
                        str = str.endsWith("?") ? str + a(entry.getKey().toString(), "UTF-8") + "=" + a(map.get(entry.getKey()).toString(), "UTF-8") : str + "&" + a(entry.getKey().toString(), "UTF-8") + "=" + a(map.get(entry.getKey()).toString(), "UTF-8");
                    }
                }
            }
        }
        return str;
    }
}
