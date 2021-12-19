package com.github.a.a;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(30823);
    }

    public static String a(char c2) {
        if (19968 > c2 || c2 > 40869 || b(c2) <= 0) {
            if (12295 == c2) {
                return "LING";
            }
            return String.valueOf(c2);
        } else if (c2 == 12295) {
            return "LING";
        } else {
            return e.f49263b[b(c2)];
        }
    }

    private static int b(char c2) {
        int i2 = c2 - 19968;
        if (i2 >= 0 && i2 < 7000) {
            return a(b.f49256a, b.f49257b, i2);
        }
        if (7000 > i2 || i2 >= 14000) {
            return a(d.f49260a, d.f49261b, i2 - 14000);
        }
        return a(c.f49258a, c.f49259b, i2 - 7000);
    }

    private static short a(byte[] bArr, byte[] bArr2, int i2) {
        short s = (short) (bArr2[i2] & 255);
        if ((bArr[i2 / 8] & e.f49262a[i2 % 8]) != 0) {
            return (short) (s | 256);
        }
        return s;
    }
}
