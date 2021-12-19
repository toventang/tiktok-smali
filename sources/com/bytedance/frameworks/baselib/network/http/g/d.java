package com.bytedance.frameworks.baselib.network.http.g;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private Map<K, V> f29367a;

    /* renamed from: b  reason: collision with root package name */
    private int f29368b;

    /* renamed from: c  reason: collision with root package name */
    private int f29369c;

    /* renamed from: d  reason: collision with root package name */
    private int f29370d;

    /* renamed from: e  reason: collision with root package name */
    private int f29371e;

    /* renamed from: f  reason: collision with root package name */
    private int f29372f;

    /* renamed from: g  reason: collision with root package name */
    private int f29373g;

    static {
        Covode.recordClassIndex(17122);
    }

    public final synchronized int b() {
        int i2;
        MethodCollector.i(1824);
        i2 = this.f29368b;
        MethodCollector.o(1824);
        return i2;
    }

    public final synchronized Map<K, V> c() {
        Map<K, V> map;
        MethodCollector.i(1826);
        map = this.f29367a;
        MethodCollector.o(1826);
        return map;
    }

    public final synchronized void a() {
        MethodCollector.i(1823);
        a(-1);
        MethodCollector.o(1823);
    }

    public final synchronized String toString() {
        int i2;
        String a2;
        MethodCollector.i(1829);
        int i3 = this.f29372f;
        int i4 = this.f29373g + i3;
        if (i4 != 0) {
            i2 = (i3 * 100) / i4;
        } else {
            i2 = 0;
        }
        a2 = a.a("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f29369c), Integer.valueOf(this.f29372f), Integer.valueOf(this.f29373g), Integer.valueOf(i2)});
        MethodCollector.o(1829);
        return a2;
    }

    public d(int i2) {
        if (i2 > 0) {
            this.f29369c = i2;
            this.f29367a = Collections.synchronizedMap(new LinkedHashMap(0, 0.75f, true));
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized V a(K k2) {
        MethodCollector.i(1806);
        if (k2 != null) {
            V v = this.f29367a.get(k2);
            if (v != null) {
                this.f29372f++;
                MethodCollector.o(1806);
                return v;
            }
            this.f29373g++;
            MethodCollector.o(1806);
            return null;
        }
        NullPointerException nullPointerException = new NullPointerException("key == null");
        MethodCollector.o(1806);
        throw nullPointerException;
    }

    public final synchronized V b(K k2) {
        V remove;
        MethodCollector.i(1821);
        if (k2 != null) {
            remove = this.f29367a.remove(k2);
            if (remove != null) {
                this.f29368b--;
            }
            MethodCollector.o(1821);
        } else {
            NullPointerException nullPointerException = new NullPointerException("key == null");
            MethodCollector.o(1821);
            throw nullPointerException;
        }
        return remove;
    }

    private void a(int i2) {
        Map.Entry<K, V> next;
        while (this.f29368b > i2 && !this.f29367a.isEmpty() && (next = this.f29367a.entrySet().iterator().next()) != null) {
            K key = next.getKey();
            next.getValue();
            this.f29367a.remove(key);
            this.f29368b--;
            this.f29371e++;
        }
        if (this.f29368b < 0 || (this.f29367a.isEmpty() && this.f29368b != 0)) {
            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        }
    }

    public final synchronized V a(K k2, V v) {
        V put;
        MethodCollector.i(1809);
        if (k2 == null || v == null) {
            NullPointerException nullPointerException = new NullPointerException("key == null || value == null");
            MethodCollector.o(1809);
            throw nullPointerException;
        }
        this.f29370d++;
        this.f29368b++;
        put = this.f29367a.put(k2, v);
        if (put != null) {
            this.f29368b--;
        }
        a(this.f29369c);
        MethodCollector.o(1809);
        return put;
    }
}
