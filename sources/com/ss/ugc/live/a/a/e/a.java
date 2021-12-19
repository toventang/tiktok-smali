package com.ss.ugc.live.a.a.e;

import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f154032a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(102719);
    }

    private static String a(byte[] bArr) {
        Objects.requireNonNull(bArr, "bytes is null");
        return a(bArr, bArr.length);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.File r7) {
        /*
            r6 = 6271(0x187f, float:8.788E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r0)
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x0032 }
            r4.<init>(r7)     // Catch:{ all -> 0x0032 }
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r3]     // Catch:{ all -> 0x002f }
        L_0x0015:
            r1 = 0
            int r0 = r4.read(r2, r1, r3)     // Catch:{ all -> 0x002f }
            if (r0 <= 0) goto L_0x0020
            r5.update(r2, r1, r0)     // Catch:{ all -> 0x002f }
            goto L_0x0015
        L_0x0020:
            byte[] r0 = r5.digest()     // Catch:{ all -> 0x002f }
            java.lang.String r0 = a(r0)     // Catch:{ all -> 0x002f }
            r4.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r0
        L_0x002f:
            r0 = move-exception
            r1 = r4
            goto L_0x0033
        L_0x0032:
            r0 = move-exception
        L_0x0033:
            if (r1 == 0) goto L_0x0038
            r1.close()
        L_0x0038:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.live.a.a.e.a.a(java.io.File):java.lang.String");
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("str is null");
        }
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(str.getBytes("UTF-8"));
        return a(instance.digest());
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
                char[] cArr2 = f154032a;
                cArr[i4] = cArr2[i6 >> 4];
                i4 = i7 + 1;
                cArr[i7] = cArr2[i6 & 15];
            }
            return new String(cArr, 0, i3);
        }
        throw new IndexOutOfBoundsException();
    }
}
