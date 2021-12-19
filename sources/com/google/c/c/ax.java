package com.google.c.c;

import com.bytedance.covode.number.Covode;

public final class ax {
    static {
        Covode.recordClassIndex(33451);
    }

    static Object[] a(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            a(objArr[i3], i3);
        }
        return objArr;
    }

    static Object a(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index ".concat(String.valueOf(i2)));
    }
}
