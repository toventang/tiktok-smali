package com.bytedance.common.wschannel.channel.a.a.b;

import com.bytedance.covode.number.Covode;
import k.f;

public final class d {
    static {
        Covode.recordClassIndex(16001);
    }

    static void b(int i2) {
        String a2 = a(i2);
        if (a2 != null) {
            throw new IllegalArgumentException(a2);
        }
    }

    static String a(int i2) {
        if (i2 < 1000 || i2 >= 5000) {
            return "Code must be in range [1000,5000): ".concat(String.valueOf(i2));
        }
        if ((i2 < 1004 || i2 > 1006) && (i2 < 1012 || i2 > 2999)) {
            return null;
        }
        return "Code " + i2 + " is reserved and may not be used.";
    }

    static void a(f.b bVar, byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        do {
            byte[] bArr2 = bVar.f158868d;
            int i3 = bVar.f158869e;
            int i4 = bVar.f158870f;
            while (i3 < i4) {
                int i5 = i2 % length;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i5]);
                i3++;
                i2 = i5 + 1;
            }
        } while (bVar.a() != -1);
    }
}
