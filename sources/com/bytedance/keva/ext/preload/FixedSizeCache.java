package com.bytedance.keva.ext.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FixedSizeCache<K, V> {
    private final ConcurrentHashMap<K, V> map;
    private final int maxSize;
    private int size;

    static {
        Covode.recordClassIndex(24533);
    }

    public final int maxSize() {
        return this.maxSize;
    }

    public final synchronized int size() {
        int i2;
        MethodCollector.i(7152);
        i2 = this.size;
        MethodCollector.o(7152);
        return i2;
    }

    public final synchronized Map<K, V> snapshot() {
        ConcurrentHashMap concurrentHashMap;
        MethodCollector.i(7215);
        concurrentHashMap = new ConcurrentHashMap(this.map);
        MethodCollector.o(7215);
        return concurrentHashMap;
    }

    public final V get(K k2) {
        return this.map.get(k2);
    }

    public final V remove(K k2) {
        return this.map.remove(k2);
    }

    public FixedSizeCache(int i2) {
        if (i2 > 0) {
            this.maxSize = i2;
            this.map = new ConcurrentHashMap<>();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void put(K k2, V v) {
        MethodCollector.i(7133);
        synchronized (this) {
            try {
                int i2 = this.size;
                if (i2 + 1 <= this.maxSize) {
                    this.size = i2 + 1;
                    this.map.put(k2, v);
                    MethodCollector.o(7133);
                }
            } finally {
                MethodCollector.o(7133);
            }
        }
    }
}
