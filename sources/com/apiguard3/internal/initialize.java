package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class initialize<V> implements Future<V> {
    private static int getBody;
    private static int getUrl = 1;
    private volatile boolean AGRequest = false;
    private final CountDownLatch getHeaders = new CountDownLatch(1);
    private volatile V getMethod;

    static {
        Covode.recordClassIndex(2555);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        V v;
        MethodCollector.i(2084);
        this.getHeaders.await();
        synchronized (this) {
            try {
                v = this.getMethod;
            } finally {
                MethodCollector.o(2084);
            }
        }
        return v;
    }

    public final boolean isCancelled() {
        int i2 = getUrl;
        int i3 = i2 + 105;
        getBody = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 35;
        getBody = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final synchronized boolean isDone() {
        MethodCollector.i(2082);
        int i2 = getBody + 69;
        getUrl = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.AGRequest;
        int i4 = getUrl + 39;
        getBody = i4 % 128;
        if (i4 % 2 == 0) {
            MethodCollector.o(2082);
            return z;
        }
        MethodCollector.o(2082);
        return z;
    }

    public final boolean cancel(boolean z) {
        int i2 = getUrl + 59;
        getBody = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    public final synchronized void getHeaders(V v) {
        MethodCollector.i(2087);
        int i2 = getBody + 45;
        getUrl = i2 % 128;
        if (i2 % 2 != 0) {
            this.getMethod = v;
            this.AGRequest = true;
            this.getHeaders.countDown();
            MethodCollector.o(2087);
            return;
        }
        this.getMethod = v;
        this.AGRequest = false;
        this.getHeaders.countDown();
        MethodCollector.o(2087);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) {
        V v;
        MethodCollector.i(2085);
        if (!(!this.getHeaders.await(j2, timeUnit))) {
            synchronized (this) {
                try {
                    v = this.getMethod;
                } finally {
                    MethodCollector.o(2085);
                }
            }
            return v;
        }
        TimeoutException timeoutException = new TimeoutException();
        MethodCollector.o(2085);
        throw timeoutException;
    }
}
