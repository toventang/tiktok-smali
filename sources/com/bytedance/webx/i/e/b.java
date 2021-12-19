package com.bytedance.webx.i.e;

import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static char[] f46098a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(28171);
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            int length = digest.length;
            StringBuilder sb = new StringBuilder(length * 2);
            int i2 = length + 0;
            for (int i3 = 0; i3 < i2; i3++) {
                byte b2 = digest[i3];
                char[] cArr = f46098a;
                char c2 = cArr[(b2 & 240) >> 4];
                char c3 = cArr[b2 & 15];
                sb.append(c2);
                sb.append(c3);
            }
            return sb.toString();
        } catch (Exception unused) {
            a.d("MD5Util");
            return "";
        }
    }
}
