package com.ss.android.push.window.oppo;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, V> f60061a;

    /* renamed from: b  reason: collision with root package name */
    private int f60062b;

    /* renamed from: c  reason: collision with root package name */
    private int f60063c;

    /* renamed from: d  reason: collision with root package name */
    private int f60064d;

    /* renamed from: e  reason: collision with root package name */
    private int f60065e;

    /* renamed from: f  reason: collision with root package name */
    private int f60066f;

    /* renamed from: g  reason: collision with root package name */
    private int f60067g;

    static {
        Covode.recordClassIndex(37120);
    }

    public final synchronized void a() {
        MethodCollector.i(8657);
        a(-1);
        MethodCollector.o(8657);
    }

    public final synchronized Map<K, V> b() {
        LinkedHashMap linkedHashMap;
        MethodCollector.i(8664);
        linkedHashMap = new LinkedHashMap(this.f60061a);
        MethodCollector.o(8664);
        return linkedHashMap;
    }

    public final synchronized String toString() {
        int i2;
        String a2;
        MethodCollector.i(8667);
        int i3 = this.f60066f;
        int i4 = this.f60067g + i3;
        if (i4 != 0) {
            i2 = (i3 * 100) / i4;
        } else {
            i2 = 0;
        }
        a2 = a.a("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f60063c), Integer.valueOf(this.f60066f), Integer.valueOf(this.f60067g), Integer.valueOf(i2)});
        MethodCollector.o(8667);
        return a2;
    }

    public b(int i2) {
        if (i2 > 0) {
            this.f60063c = i2;
            this.f60061a = new LinkedHashMap<>(0, 0.75f, false);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void a(int i2) {
        Map.Entry<K, V> next;
        while (this.f60062b > i2 && !this.f60061a.isEmpty() && (next = this.f60061a.entrySet().iterator().next()) != null) {
            K key = next.getKey();
            next.getValue();
            this.f60061a.remove(key);
            this.f60062b--;
            this.f60065e++;
        }
        if (this.f60062b < 0 || (this.f60061a.isEmpty() && this.f60062b != 0)) {
            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        }
    }

    public final synchronized V a(K k2, V v) {
        V put;
        MethodCollector.i(8651);
        if (k2 != null) {
            this.f60064d++;
            this.f60062b++;
            put = this.f60061a.put(k2, v);
            if (put != null) {
                this.f60062b--;
            }
            a(this.f60063c);
            MethodCollector.o(8651);
        } else {
            NullPointerException nullPointerException = new NullPointerException("key == null || value == null");
            MethodCollector.o(8651);
            throw nullPointerException;
        }
        return put;
    }
}
