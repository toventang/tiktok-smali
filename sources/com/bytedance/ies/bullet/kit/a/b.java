package com.bytedance.ies.bullet.kit.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f32209a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f32210b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private b() {
    }

    static {
        Covode.recordClassIndex(18892);
    }

    public static String a(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        try {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return null;
            }
            MessageDigest instance = MessageDigest.getInstance("MD5");
            Charset forName = Charset.forName("UTF-8");
            l.a((Object) forName, "");
            byte[] bytes = str.getBytes(forName);
            l.a((Object) bytes, "");
            instance.update(bytes);
            byte[] digest = instance.digest();
            if (digest != null) {
                return a(digest, digest.length);
            }
            throw new NullPointerException("bytes is null");
        } catch (Exception unused) {
            return null;
        }
    }

    private static String a(byte[] bArr, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = bArr[i5 + 0] & 255;
                int i7 = i4 + 1;
                char[] cArr2 = f32210b;
                cArr[i4] = cArr2[i6 >> 4];
                i4 = i7 + 1;
                cArr[i7] = cArr2[i6 & 15];
            }
            return new String(cArr, 0, i3);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
