package com.bytedance.android.a.a.h;

import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class f {
    static {
        Covode.recordClassIndex(3210);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt > 31) {
                    if (charAt < 127) {
                        sb.append(charAt);
                    }
                }
                sb.append(a.a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (char c2 : charArray) {
            if (c2 >= ' ' && c2 != 127) {
                sb.append(c2);
            }
        }
        return sb.toString();
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                int i2 = b2 & 255;
                if (i2 < 16) {
                    sb.append(0);
                }
                sb.append(Integer.toString(i2, 16));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
