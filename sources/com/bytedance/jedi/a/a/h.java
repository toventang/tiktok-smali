package com.bytedance.jedi.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.l.a;
import com.bytedance.jedi.a.l.b;
import h.f.b.ad;
import h.f.b.l;
import h.p;
import h.w;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<a<?>, Map<?, b<?>>> f39083a;

    static {
        Covode.recordClassIndex(23935);
        Map<a<?>, Map<?, b<?>>> synchronizedMap = Collections.synchronizedMap(new WeakHashMap());
        l.a((Object) synchronizedMap, "");
        f39083a = synchronizedMap;
    }

    public static final <K, V> Map<K, b<p<K, V>>> a(Map<?, ?> map) {
        if (map != null) {
            return ad.h(map);
        }
        throw new w("null cannot be cast to non-null type");
    }
}
