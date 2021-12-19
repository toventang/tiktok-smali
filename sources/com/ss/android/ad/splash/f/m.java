package com.ss.android.ad.splash.f;

import com.bytedance.covode.number.Covode;
import java.util.Random;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f58983a = "0123456789ABCDEF".toCharArray();

    static {
        Covode.recordClassIndex(36487);
    }

    public static long a(Random random) {
        long nextLong;
        long j2;
        do {
            nextLong = (random.nextLong() << 1) >>> 1;
            j2 = nextLong % 8999999999L;
        } while ((nextLong - j2) + 8999999998L < 0);
        return j2;
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            char[] cArr2 = f58983a;
            cArr[i4] = cArr2[i3 >>> 4];
            cArr[i4 + 1] = cArr2[i3 & 15];
        }
        return new String(cArr);
    }

    public static byte[] a(long j2) {
        byte[] bArr = new byte[8];
        int i2 = 7;
        do {
            bArr[i2] = (byte) ((int) (255 & j2));
            j2 >>= 8;
            i2--;
        } while (i2 >= 0);
        return bArr;
    }

    public static int a(long j2, long j3) {
        int i2;
        if (j3 > 0) {
            double d2 = (double) j2;
            Double.isNaN(d2);
            double d3 = (double) j3;
            Double.isNaN(d3);
            i2 = (int) (((d2 * 1.0d) / d3) * 100.0d);
        } else {
            i2 = 0;
        }
        return Math.min(Math.max(0, i2), 100);
    }
}
