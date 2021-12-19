package com.bytedance.android.live.core.a;

import android.util.Pair;
import com.bytedance.android.livesdk.util.rxutils.i;
import com.bytedance.covode.number.Covode;
import f.a.d.c;
import f.a.d.g;
import f.a.d.h;
import f.a.t;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class e<K, V> implements a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final g<K, Integer> f8903a;

    /* renamed from: b  reason: collision with root package name */
    private final c<K, V, Boolean> f8904b;

    /* renamed from: c  reason: collision with root package name */
    private final h<K, V, Long, Boolean> f8905c;

    /* renamed from: d  reason: collision with root package name */
    private final c<V, V, V> f8906d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Integer, Pair<V, Long>> f8907e;

    /* renamed from: f  reason: collision with root package name */
    private final ConcurrentMap<Integer, f.a.l.g<V>> f8908f;

    static {
        Covode.recordClassIndex(4548);
    }

    public e() {
        this((byte) 0);
    }

    private e(byte b2) {
        this(f.f8909a);
    }

    @Override // com.bytedance.android.live.core.a.a
    public final void b(K k2) {
        this.f8907e.remove(i.a(this.f8903a, k2));
    }

    private e(c<K, V, Boolean> cVar) {
        this(g.f8910a, cVar, new h(Long.MAX_VALUE), i.f8912a);
    }

    @Override // com.bytedance.android.live.core.a.a
    public final t<V> a(K k2) {
        int intValue = ((Integer) i.a(this.f8903a, k2)).intValue();
        this.f8908f.putIfAbsent(Integer.valueOf(intValue), new f.a.l.c());
        return this.f8908f.get(Integer.valueOf(intValue));
    }

    @Override // com.bytedance.android.live.core.a.a
    public final V c(K k2) {
        Pair<V, Long> pair = this.f8907e.get(i.a(this.f8903a, k2));
        if (pair == null || ((Boolean) i.a(this.f8905c, k2, pair.first, pair.second)).booleanValue()) {
            return null;
        }
        return (V) pair.first;
    }

    @Override // com.bytedance.android.live.core.a.a
    public final void a(K k2, V v) {
        if (!((Boolean) i.a(this.f8904b, k2, v)).booleanValue()) {
            int intValue = ((Integer) i.a(this.f8903a, k2)).intValue();
            Pair<V, Long> pair = this.f8907e.get(Integer.valueOf(intValue));
            if (pair != null && !((Boolean) i.a(this.f8905c, k2, pair.first, pair.second)).booleanValue()) {
                Object obj = this.f8907e.get(Integer.valueOf(intValue)).first;
                if (!v.equals(obj)) {
                    v = (V) i.a(this.f8906d, obj, v);
                    if (v.equals(obj)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f8907e.put(Integer.valueOf(intValue), new Pair<>(v, Long.valueOf(System.currentTimeMillis())));
            if (this.f8908f.containsKey(Integer.valueOf(intValue))) {
                this.f8908f.get(Integer.valueOf(intValue)).onNext(v);
            }
        }
    }

    private e(g<K, Integer> gVar, c<K, V, Boolean> cVar, h<K, V, Long, Boolean> hVar, c<V, V, V> cVar2) {
        this.f8907e = new ConcurrentHashMap();
        this.f8908f = new ConcurrentHashMap(20, 0.75f, 4);
        this.f8903a = gVar;
        this.f8904b = cVar;
        this.f8905c = hVar;
        this.f8906d = cVar2;
    }
}
