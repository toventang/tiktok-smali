package com.ss.android.ugc.aweme.net.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class e<T> extends ConcurrentLinkedQueue<T> {
    private final int capacity;

    static {
        Covode.recordClassIndex(72277);
    }

    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    public e(int i2) {
        this.capacity = i2;
    }

    @Override // java.util.Queue, java.util.concurrent.ConcurrentLinkedQueue
    public final synchronized boolean offer(T t) {
        boolean offer;
        MethodCollector.i(3587);
        if (size() + 1 > this.capacity) {
            super.poll();
        }
        offer = super.offer(t);
        MethodCollector.o(3587);
        return offer;
    }
}
