package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;

public interface b<T> extends Cloneable {
    static {
        Covode.recordClassIndex(25966);
    }

    void cancel();

    @Override // java.lang.Object
    b<T> clone();

    void enqueue(d<T> dVar);

    u<T> execute();

    boolean isCanceled();

    Request request();
}
