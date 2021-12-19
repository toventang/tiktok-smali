package com.airbnb.lottie;

import com.bytedance.covode.number.Covode;

public interface i<T> {
    static {
        Covode.recordClassIndex(2381);
    }

    void a(T t);
}
