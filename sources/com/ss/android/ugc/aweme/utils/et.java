package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;

public final class et {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f142893a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(93498);
    }

    public static String a(String str) {
        try {
            return a(str.getBytes());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static String a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            char[] cArr = new char[32];
            int i2 = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                byte b2 = digest[i3];
                int i4 = i2 + 1;
                char[] cArr2 = f142893a;
                cArr[i2] = cArr2[(b2 >>> 4) & 15];
                i2 = i4 + 1;
                cArr[i4] = cArr2[b2 & 15];
            }
            return new String(cArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
