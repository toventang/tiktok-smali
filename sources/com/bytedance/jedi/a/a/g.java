package com.bytedance.jedi.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.l.a;
import h.f.b.l;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f39081a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<a<?>, AtomicBoolean> f39082b = Collections.synchronizedMap(new WeakHashMap());

    private g() {
    }

    static {
        Covode.recordClassIndex(23934);
    }

    public static void b(a<?> aVar) {
        l.c(aVar, "");
        c(aVar).set(false);
    }

    public static void a(a<?> aVar) {
        l.c(aVar, "");
        do {
        } while (!c(aVar).compareAndSet(false, true));
    }

    private static AtomicBoolean c(a<?> aVar) {
        Map<a<?>, AtomicBoolean> map = f39082b;
        AtomicBoolean atomicBoolean = map.get(aVar);
        if (atomicBoolean != null) {
            return atomicBoolean;
        }
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        l.a((Object) map, "");
        map.put(aVar, atomicBoolean2);
        return atomicBoolean2;
    }
}
