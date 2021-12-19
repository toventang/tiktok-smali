package com.bytedance.globalpayment.payment.common.lib.j;

import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f30613a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    static {
        Covode.recordClassIndex(17752);
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return a(a(str.getBytes(), "MD5"));
    }

    private static String a(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return "";
        }
        char[] cArr = new char[(length << 1)];
        int i2 = 0;
        int i3 = 0;
        do {
            int i4 = i3 + 1;
            char[] cArr2 = f30613a;
            cArr[i3] = cArr2[(bArr[i2] >> 4) & 15];
            i3 = i4 + 1;
            cArr[i4] = cArr2[bArr[i2] & 15];
            i2++;
        } while (i2 < length);
        return new String(cArr);
    }

    private static byte[] a(byte[] bArr, String str) {
        if (bArr != null && bArr.length > 0) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                instance.update(bArr);
                return instance.digest();
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}
