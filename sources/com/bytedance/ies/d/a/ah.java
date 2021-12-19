package com.bytedance.ies.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.a.m;
import h.f.b.l;
import h.f.b.z;
import h.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ah<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, V> f33202a;

    /* renamed from: b  reason: collision with root package name */
    private int f33203b;

    /* renamed from: c  reason: collision with root package name */
    private int f33204c;

    /* renamed from: d  reason: collision with root package name */
    private int f33205d;

    /* renamed from: e  reason: collision with root package name */
    private int f33206e;

    /* renamed from: f  reason: collision with root package name */
    private int f33207f;

    /* renamed from: g  reason: collision with root package name */
    private int f33208g;

    /* renamed from: h  reason: collision with root package name */
    private final m<K, V, Boolean> f33209h;

    /* renamed from: i  reason: collision with root package name */
    private final m<K, V, z> f33210i;

    static {
        Covode.recordClassIndex(19832);
    }

    public final synchronized Map<K, V> a() {
        LinkedHashMap linkedHashMap;
        MethodCollector.i(6974);
        linkedHashMap = new LinkedHashMap(this.f33202a);
        MethodCollector.o(6974);
        return linkedHashMap;
    }

    public final synchronized String toString() {
        int i2;
        String str;
        MethodCollector.i(7300);
        int i3 = this.f33206e;
        int i4 = this.f33207f + i3;
        if (i4 != 0) {
            i2 = (i3 * 100) / i4;
        } else {
            i2 = 0;
        }
        str = "LruCache[maxSize=" + this.f33208g + ",hits=" + this.f33206e + ",misses=" + this.f33207f + ",hitRate=" + i2 + "%%]";
        MethodCollector.o(7300);
        return str;
    }

    public final synchronized void b() {
        MethodCollector.i(7197);
        q.a("Start trimming, entry count: " + this.f33202a.size() + '.');
        Iterator<Map.Entry<K, V>> it = this.f33202a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (this.f33209h.invoke(next.getKey(), next.getValue()).booleanValue()) {
                it.remove();
                this.f33210i.invoke(next.getKey(), next.getValue());
                int i2 = this.f33203b;
                next.getKey();
                next.getValue();
                this.f33203b = i2 - 1;
                q.a("Entry removed: " + ((Object) next.getKey()) + '.');
            }
        }
        MethodCollector.o(7197);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, V] */
    public final V a(K k2) {
        MethodCollector.i(6874);
        z.e eVar = new z.e();
        synchronized (this) {
            try {
                eVar.element = this.f33202a.get(k2);
                if (eVar.element != null) {
                    this.f33206e++;
                    return eVar.element;
                }
                this.f33207f++;
                MethodCollector.o(6874);
                return null;
            } finally {
                MethodCollector.o(6874);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, V] */
    public final V b(K k2) {
        MethodCollector.i(6972);
        z.e eVar = new z.e();
        synchronized (this) {
            try {
                eVar.element = this.f33202a.remove(k2);
                if (eVar.element != null) {
                    int i2 = this.f33203b;
                    if (eVar.element == null) {
                        l.a();
                    }
                    this.f33203b = i2 - 1;
                }
            } catch (Throwable th) {
                MethodCollector.o(6972);
                throw th;
            }
        }
        if (eVar.element != null && eVar.element == null) {
            l.a();
        }
        T t = eVar.element;
        MethodCollector.o(6972);
        return t;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, V] */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ba, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V a(K r8, V r9) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.d.a.ah.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.m<? super K, ? super V, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.m<? super K, ? super V, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public ah(int i2, m<? super K, ? super V, Boolean> mVar, m<? super K, ? super V, h.z> mVar2) {
        l.c(mVar, "");
        l.c(mVar2, "");
        this.f33208g = i2;
        this.f33209h = mVar;
        this.f33210i = mVar2;
        if (i2 > 0) {
            this.f33202a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
