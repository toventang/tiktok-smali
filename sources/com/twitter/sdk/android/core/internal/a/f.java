package com.twitter.sdk.android.core.internal.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.TreeMap;

public final class f {
    static {
        Covode.recordClassIndex(103622);
    }

    public static String a(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    private static String c(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public static String b(String str) {
        int i2;
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String a2 = a(str);
        int length = a2.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt = a2.charAt(i3);
            if (charAt == '*') {
                sb.append("%2A");
            } else if (charAt == '+') {
                sb.append("%20");
            } else if (charAt == '%' && (i2 = i3 + 2) < length && a2.charAt(i3 + 1) == '7' && a2.charAt(i2) == 'E') {
                sb.append('~');
                i3 = i2;
            } else {
                sb.append(charAt);
            }
            i3++;
        }
        return sb.toString();
    }

    public static TreeMap<String, String> a(URI uri, boolean z) {
        return a(uri.getRawQuery(), z);
    }

    public static TreeMap<String, String> a(String str, boolean z) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        if (str == null) {
            return treeMap;
        }
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=");
            if (split.length == 2) {
                if (z) {
                    treeMap.put(c(split[0]), c(split[1]));
                } else {
                    treeMap.put(split[0], split[1]);
                }
            } else if (!TextUtils.isEmpty(split[0])) {
                if (z) {
                    treeMap.put(c(split[0]), "");
                } else {
                    treeMap.put(split[0], "");
                }
            }
        }
        return treeMap;
    }
}
