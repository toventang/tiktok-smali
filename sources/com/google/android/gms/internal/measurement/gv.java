package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.RandomAccess;

public interface gv<E> extends List<E>, RandomAccess {
    static {
        Covode.recordClassIndex(31834);
    }

    gv<E> a(int i2);

    boolean a();

    void b();
}
