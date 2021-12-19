package com.bytedance.ies.xbridge.i.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.security.MessageDigest;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f36134a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f36135b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private d() {
    }

    static {
        Covode.recordClassIndex(21604);
    }

    public static String a(String str) {
        l.c(str, "");
        try {
            byte[] bytes = str.getBytes(h.m.d.f158808a);
            l.a((Object) bytes, "");
            return a(bytes);
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
            l.a((Object) digest, "");
            char[] cArr = new char[32];
            int i2 = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                byte b2 = digest[i3];
                int i4 = i2 + 1;
                char[] cArr2 = f36135b;
                cArr[i2] = cArr2[(b2 >>> 4) & 15];
                i2 = i4 + 1;
                cArr[i4] = cArr2[b2 & 15];
            }
            return cArr.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
