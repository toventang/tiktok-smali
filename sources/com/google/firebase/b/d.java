package com.google.firebase.b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public interface d {
    static {
        Covode.recordClassIndex(33708);
    }

    <T> void a(Class<T> cls, b<? super T> bVar);

    <T> void a(Class<T> cls, Executor executor, b<? super T> bVar);

    <T> void b(Class<T> cls, b<? super T> bVar);
}
