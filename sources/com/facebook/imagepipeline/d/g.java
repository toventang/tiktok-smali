package com.facebook.imagepipeline.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final w<V> f47788a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<K, V> f47789b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private int f47790c = 0;

    static {
        Covode.recordClassIndex(28944);
    }

    public final synchronized int b() {
        int i2;
        MethodCollector.i(2309);
        i2 = this.f47790c;
        MethodCollector.o(2309);
        return i2;
    }

    public final synchronized int a() {
        int size;
        MethodCollector.i(2307);
        size = this.f47789b.size();
        MethodCollector.o(2307);
        return size;
    }

    public final synchronized K c() {
        MethodCollector.i(2316);
        if (this.f47789b.isEmpty()) {
            MethodCollector.o(2316);
            return null;
        }
        K next = this.f47789b.keySet().iterator().next();
        MethodCollector.o(2316);
        return next;
    }

    public final synchronized ArrayList<V> d() {
        ArrayList<V> arrayList;
        MethodCollector.i(2370);
        arrayList = new ArrayList<>(this.f47789b.values());
        this.f47789b.clear();
        this.f47790c = 0;
        MethodCollector.o(2370);
        return arrayList;
    }

    public g(w<V> wVar) {
        this.f47788a = wVar;
    }

    private int d(V v) {
        if (v == null) {
            return 0;
        }
        return this.f47788a.a(v);
    }

    public final synchronized V b(K k2) {
        V v;
        MethodCollector.i(2331);
        v = this.f47789b.get(k2);
        MethodCollector.o(2331);
        return v;
    }

    public final synchronized V c(K k2) {
        V remove;
        MethodCollector.i(2342);
        remove = this.f47789b.remove(k2);
        this.f47790c -= d(remove);
        MethodCollector.o(2342);
        return remove;
    }

    public final synchronized ArrayList<V> a(j<K> jVar) {
        ArrayList<V> arrayList;
        MethodCollector.i(2362);
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it = this.f47789b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (jVar == null || jVar.a(next.getKey())) {
                arrayList.add(next.getValue());
                this.f47790c -= d(next.getValue());
                it.remove();
            }
        }
        MethodCollector.o(2362);
        return arrayList;
    }

    public final synchronized boolean a(K k2) {
        boolean containsKey;
        MethodCollector.i(2330);
        containsKey = this.f47789b.containsKey(k2);
        MethodCollector.o(2330);
        return containsKey;
    }

    public final synchronized V a(K k2, V v) {
        V remove;
        MethodCollector.i(2338);
        remove = this.f47789b.remove(k2);
        this.f47790c -= d(remove);
        this.f47789b.put(k2, v);
        this.f47790c += d(v);
        MethodCollector.o(2338);
        return remove;
    }
}
