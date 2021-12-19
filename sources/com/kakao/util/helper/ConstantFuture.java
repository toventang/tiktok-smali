package com.kakao.util.helper;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class ConstantFuture<T> implements Future<T> {
    private final T v;

    static {
        Covode.recordClassIndex(34481);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.v;
    }

    public ConstantFuture(T t) {
        this.v = t;
    }

    @Override // java.util.concurrent.Future
    public final T get(long j2, TimeUnit timeUnit) {
        return this.v;
    }
}
