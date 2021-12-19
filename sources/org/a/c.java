package org.a;

import com.bytedance.covode.number.Covode;

public interface c<T> {
    static {
        Covode.recordClassIndex(106343);
    }

    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(d dVar);
}
