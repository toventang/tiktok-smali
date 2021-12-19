package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.LinkedBlockingDeque;

/* access modifiers changed from: package-private */
public final class i<E> extends LinkedBlockingDeque<E> {
    private int mFixedSize = 10;

    static {
        Covode.recordClassIndex(24648);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.LinkedBlockingDeque, java.util.concurrent.BlockingQueue, java.util.Queue, java.util.Deque
    public final boolean offer(E e2) {
        MethodCollector.i(10992);
        synchronized (this) {
            try {
                if (size() == this.mFixedSize) {
                    removeLast();
                }
            } catch (Throwable th) {
                MethodCollector.o(10992);
                throw th;
            }
        }
        boolean offerFirst = super.offerFirst(e2);
        MethodCollector.o(10992);
        return offerFirst;
    }
}
