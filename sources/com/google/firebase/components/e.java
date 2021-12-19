package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import com.google.firebase.d.a;
import java.util.Set;

public interface e {
    static {
        Covode.recordClassIndex(33721);
    }

    <T> T a(Class<T> cls);

    <T> Set<T> b(Class<T> cls);

    <T> a<T> c(Class<T> cls);

    <T> a<Set<T>> d(Class<T> cls);
}
