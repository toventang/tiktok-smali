package com.google.android.gms.common.util;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.p;
import java.util.Arrays;

public final class b {
    static {
        Covode.recordClassIndex(31464);
    }

    public static <T> T[] a(T[]... tArr) {
        int i2 = 0;
        int i3 = 0;
        do {
            i3 += tArr[i2].length;
            i2++;
        } while (i2 < 2);
        T[] tArr2 = (T[]) Arrays.copyOf(tArr[0], i3);
        int length = tArr[0].length;
        int i4 = 1;
        do {
            T[] tArr3 = tArr[1];
            System.arraycopy(tArr3, 0, tArr2, length, tArr3.length);
            i4++;
        } while (i4 < 2);
        return tArr2;
    }

    public static <T> boolean a(T[] tArr, T t) {
        if (tArr != null) {
            int length = tArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (!p.a(tArr[i2], t)) {
                    i2++;
                } else if (i2 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
