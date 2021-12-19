package com.facebook.common.d;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class e<E> extends ArrayList<E> {
    static {
        Covode.recordClassIndex(28633);
    }

    private e(int i2) {
        super(i2);
    }

    private e(List<E> list) {
        super(list);
    }

    public static <E> e<E> copyOf(List<E> list) {
        return new e<>(list);
    }

    public static <E> e<E> of(E... eArr) {
        e<E> eVar = new e<>(eArr.length);
        Collections.addAll(eVar, eArr);
        return eVar;
    }
}
