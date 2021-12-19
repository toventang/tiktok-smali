package com.ss.android.medialib.presenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedList;

public final class c<T> extends LinkedList<T> {
    private int mMaxSize = 10;
    private final Object synObj = new Object();

    static {
        Covode.recordClassIndex(36934);
    }

    public final int getMaxSize() {
        return this.mMaxSize;
    }

    public final T pollSafe() {
        T t;
        MethodCollector.i(4650);
        synchronized (this.synObj) {
            try {
                t = (T) poll();
            } finally {
                MethodCollector.o(4650);
            }
        }
        return t;
    }

    public c(int i2) {
        this.mMaxSize = i2;
    }

    public final T addLastSafe(T t) {
        T t2;
        MethodCollector.i(4649);
        synchronized (this.synObj) {
            t2 = null;
            while (size() >= this.mMaxSize) {
                try {
                    t2 = (T) poll();
                } finally {
                    MethodCollector.o(4649);
                }
            }
            addLast(t);
        }
        return t2;
    }
}
