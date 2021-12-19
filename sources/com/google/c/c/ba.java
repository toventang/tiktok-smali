package com.google.c.c;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;

final class ba {
    static {
        Covode.recordClassIndex(33458);
    }

    static <T> T[] a(T[] tArr, int i2) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2));
    }
}
