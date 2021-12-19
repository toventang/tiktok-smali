package com.toutiao.proxyserver.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final MessageDigest f154857a = a();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f154858b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private a() {
    }

    private static MessageDigest a() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(103139);
    }

    public static String a(String str) {
        byte[] digest;
        MethodCollector.i(9567);
        MessageDigest messageDigest = f154857a;
        if (messageDigest == null) {
            MethodCollector.o(9567);
            return "";
        }
        byte[] bytes = str.getBytes(b.f154859a);
        synchronized (a.class) {
            try {
                digest = messageDigest.digest(bytes);
            } catch (Throwable th) {
                MethodCollector.o(9567);
                throw th;
            }
        }
        if (digest == null || digest.length == 0) {
            MethodCollector.o(9567);
            return null;
        }
        char[] cArr = new char[(digest.length << 1)];
        int i2 = 0;
        for (byte b2 : digest) {
            int i3 = i2 + 1;
            char[] cArr2 = f154858b;
            cArr[i2] = cArr2[(b2 & 240) >> 4];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b2 & 15];
        }
        String str2 = new String(cArr);
        MethodCollector.o(9567);
        return str2;
    }
}
