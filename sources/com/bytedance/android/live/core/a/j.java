package com.bytedance.android.live.core.a;

import android.util.Pair;
import com.bytedance.android.live.core.a.b;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.d.c;
import f.a.d.g;
import f.a.d.i;
import f.a.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class j<K, V> implements b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final g<K, Integer> f8913a;

    /* renamed from: b  reason: collision with root package name */
    private final c<K, List<V>, List<V>> f8914b;

    /* renamed from: c  reason: collision with root package name */
    private final i<K, List<V>, Integer, List<V>, List<V>> f8915c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Integer, List<V>> f8916d;

    /* renamed from: e  reason: collision with root package name */
    private final ConcurrentMap<Integer, f.a.l.c<b.a>> f8917e;

    /* renamed from: f  reason: collision with root package name */
    private final f.a.l.c<Pair<K, b.a>> f8918f;

    static {
        Covode.recordClassIndex(4553);
    }

    @Override // com.bytedance.android.live.core.a.b
    public final t<Pair<K, b.a>> a() {
        return this.f8918f;
    }

    public j() {
        this(k.f8919a);
    }

    private j(g<K, Integer> gVar) {
        this(gVar, l.f8920a, m.f8921a);
    }

    @Override // com.bytedance.android.live.core.a.b
    public final List<V> b(K k2) {
        int intValue = ((Integer) com.bytedance.android.livesdk.util.rxutils.i.a(this.f8913a, k2)).intValue();
        if (!this.f8916d.containsKey(Integer.valueOf(intValue))) {
            this.f8916d.put(Integer.valueOf(intValue), new ArrayList());
        }
        return this.f8916d.get(Integer.valueOf(intValue));
    }

    @Override // com.bytedance.android.live.core.a.b
    public final int c(K k2) {
        int intValue = ((Integer) com.bytedance.android.livesdk.util.rxutils.i.a(this.f8913a, k2)).intValue();
        if (!this.f8916d.containsKey(Integer.valueOf(intValue))) {
            this.f8916d.put(Integer.valueOf(intValue), new ArrayList());
        }
        return this.f8916d.get(Integer.valueOf(intValue)).size();
    }

    @Override // com.bytedance.android.live.core.a.b
    public final void d(K k2) {
        int intValue = ((Integer) com.bytedance.android.livesdk.util.rxutils.i.a(this.f8913a, k2)).intValue();
        if (!this.f8916d.containsKey(Integer.valueOf(intValue))) {
            this.f8916d.put(Integer.valueOf(intValue), new ArrayList());
        }
        this.f8916d.get(Integer.valueOf(intValue)).clear();
    }

    @Override // com.bytedance.android.live.core.a.b
    public final void a(K k2) {
        int intValue = ((Integer) com.bytedance.android.livesdk.util.rxutils.i.a(this.f8913a, k2)).intValue();
        if (!this.f8916d.containsKey(Integer.valueOf(intValue))) {
            this.f8916d.put(Integer.valueOf(intValue), new ArrayList());
        }
        List<V> list = this.f8916d.get(Integer.valueOf(intValue));
        if (list.size() >= 0) {
            V remove = list.remove(0);
            if (this.f8917e.containsKey(Integer.valueOf(intValue))) {
                this.f8917e.get(Integer.valueOf(intValue)).onNext(new b.a(2, 0, Collections.singletonList(remove)));
            }
        }
    }

    @Override // com.bytedance.android.live.core.a.b
    public final List<V> a(K k2, List<V> list) {
        int intValue = ((Integer) com.bytedance.android.livesdk.util.rxutils.i.a(this.f8913a, k2)).intValue();
        if (!this.f8916d.containsKey(Integer.valueOf(intValue))) {
            this.f8916d.put(Integer.valueOf(intValue), new ArrayList());
        }
        return a(k2, this.f8916d.get(Integer.valueOf(intValue)).size(), list);
    }

    @Override // com.bytedance.android.live.core.a.b
    public final V a(K k2, n<V> nVar) {
        int intValue = ((Integer) com.bytedance.android.livesdk.util.rxutils.i.a(this.f8913a, k2)).intValue();
        if (!this.f8916d.containsKey(Integer.valueOf(intValue))) {
            this.f8916d.put(Integer.valueOf(intValue), new ArrayList());
        }
        for (V v : this.f8916d.get(Integer.valueOf(intValue))) {
            try {
                if (nVar.a(v)) {
                    return v;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.core.a.b
    public final void a(K k2, V v) {
        int intValue = ((Integer) com.bytedance.android.livesdk.util.rxutils.i.a(this.f8913a, k2)).intValue();
        if (!this.f8916d.containsKey(Integer.valueOf(intValue))) {
            this.f8916d.put(Integer.valueOf(intValue), new ArrayList());
        }
        List<V> list = this.f8916d.get(Integer.valueOf(intValue));
        int indexOf = list.indexOf(v);
        if (list.remove(v)) {
            b.a aVar = new b.a(2, indexOf, Collections.singletonList(v));
            if (this.f8917e.containsKey(Integer.valueOf(intValue))) {
                this.f8917e.get(Integer.valueOf(intValue)).onNext(aVar);
            }
            this.f8918f.onNext(Pair.create(k2, aVar));
        }
    }

    private j(g<K, Integer> gVar, i<K, List<V>, Integer, List<V>, List<V>> iVar, c<K, List<V>, List<V>> cVar) {
        this.f8916d = new ConcurrentHashMap();
        this.f8917e = new ConcurrentHashMap(20, 0.75f, 4);
        this.f8918f = new f.a.l.c<>();
        this.f8913a = gVar;
        this.f8915c = iVar;
        this.f8914b = cVar;
    }

    private synchronized List<V> a(K k2, int i2, List<V> list) {
        MethodCollector.i(9762);
        int intValue = ((Integer) com.bytedance.android.livesdk.util.rxutils.i.a(this.f8913a, k2)).intValue();
        if (!this.f8916d.containsKey(Integer.valueOf(intValue))) {
            this.f8916d.put(Integer.valueOf(intValue), new ArrayList());
        }
        List<V> list2 = this.f8916d.get(Integer.valueOf(intValue));
        i<K, List<V>, Integer, List<V>, List<V>> iVar = this.f8915c;
        Integer.valueOf(i2);
        List<V> list3 = (List) com.bytedance.android.livesdk.util.rxutils.i.a(iVar, (List) com.bytedance.android.livesdk.util.rxutils.i.a(this.f8914b, k2, list));
        if (h.a(list3)) {
            MethodCollector.o(9762);
            return list3;
        }
        int min = Math.min(i2, list2.size());
        list2.addAll(min, list3);
        this.f8916d.put(Integer.valueOf(intValue), list2);
        b.a aVar = new b.a(1, min, list3);
        if (this.f8917e.containsKey(Integer.valueOf(intValue))) {
            this.f8917e.get(Integer.valueOf(intValue)).onNext(aVar);
        }
        this.f8918f.onNext(Pair.create(k2, aVar));
        this.f8918f.onNext(Pair.create(k2, new b.a(5, min, list2)));
        MethodCollector.o(9762);
        return list3;
    }
}
