package com.ss.android.ugc.aweme.utils.gecko;

import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f142987a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(93575);
    }

    public static String a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes(Charset.forName("UTF-8")));
                    byte[] digest = instance.digest();
                    if (digest != null) {
                        return a(digest, digest.length);
                    }
                    throw new NullPointerException("bytes is null");
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static String a(byte[] bArr, int i2) {
        Objects.requireNonNull(bArr, "bytes is null");
        if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = bArr[i5 + 0] & 255;
                int i7 = i4 + 1;
                char[] cArr2 = f142987a;
                cArr[i4] = cArr2[i6 >> 4];
                i4 = i7 + 1;
                cArr[i7] = cArr2[i6 & 15];
            }
            return new String(cArr, 0, i3);
        }
        throw new IndexOutOfBoundsException();
    }
}
