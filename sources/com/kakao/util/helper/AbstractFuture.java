package com.kakao.util.helper;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class AbstractFuture<T> implements Future<T> {
    static {
        Covode.recordClassIndex(34479);
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get(long j2, TimeUnit timeUnit) {
        return (T) get();
    }
}
