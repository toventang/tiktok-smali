package com.facebook.common.k;

import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f47128a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f47129b = new char[256];

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f47130c = new char[256];

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f47131d = new byte[103];

    static {
        Covode.recordClassIndex(28677);
        byte b2 = 0;
        int i2 = 0;
        do {
            char[] cArr = f47129b;
            char[] cArr2 = f47128a;
            cArr[i2] = cArr2[(i2 >> 4) & 15];
            f47130c[i2] = cArr2[i2 & 15];
            i2++;
        } while (i2 < 256);
        int i3 = 0;
        do {
            f47131d[i3] = -1;
            i3++;
        } while (i3 <= 70);
        byte b3 = 0;
        do {
            f47131d[b3 + 48] = b3;
            b3 = (byte) (b3 + 1);
        } while (b3 < 10);
        do {
            byte[] bArr = f47131d;
            byte b4 = (byte) (b2 + 10);
            bArr[b2 + 65] = b4;
            bArr[b2 + 97] = b4;
            b2 = (byte) (b2 + 1);
        } while (b2 < 6);
    }

    public static byte[] a(String str) {
        byte[] bArr;
        byte b2;
        byte b3;
        int length = str.length();
        if ((length & 1) == 0) {
            byte[] bArr2 = new byte[(length >> 1)];
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i2 + 1;
                char charAt = str.charAt(i2);
                if (charAt <= 'f' && (b2 = (bArr = f47131d)[charAt]) != -1) {
                    i2 = i4 + 1;
                    char charAt2 = str.charAt(i4);
                    if (charAt2 <= 'f' && (b3 = bArr[charAt2]) != -1) {
                        bArr2[i3] = (byte) ((b2 << 4) | b3);
                        i3++;
                    }
                }
                throw new IllegalArgumentException("Invalid hexadecimal digit: ".concat(String.valueOf(str)));
            }
            return bArr2;
        }
        throw new IllegalArgumentException("Odd number of characters.");
    }
}
