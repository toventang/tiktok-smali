package com.facebook.h;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import java.io.UnsupportedEncodingException;

public final class e {
    static {
        Covode.recordClassIndex(28878);
    }

    public static byte[] a(String str) {
        i.a(str);
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        i.a(bArr);
        i.a(bArr2);
        if (bArr2.length > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
