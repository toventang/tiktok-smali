package com.google.c.c;

import com.bytedance.covode.number.Covode;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public interface bm<T> extends Iterable<T> {
    static {
        Covode.recordClassIndex(33478);
    }

    Comparator<? super T> comparator();
}
