package com.bytedance.ies.xbridge.model.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, a<?>> f36293a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(21718);
    }

    public final <T> T a(Class<T> cls) {
        T t;
        l.c(cls, "");
        a<?> aVar = this.f36293a.get(cls);
        if (aVar == null || (t = (T) aVar.b()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    public final <T> void a(Class<T> cls, T t) {
        l.c(cls, "");
        a((Class) cls, (a) new d(t));
    }

    public final <T> void b(Class<T> cls, T t) {
        l.c(cls, "");
        a((Class) cls, (a) new b(t));
    }

    private <T> void a(Class<T> cls, a<? extends T> aVar) {
        l.c(cls, "");
        l.c(aVar, "");
        a<?> aVar2 = this.f36293a.get(cls);
        if (!(aVar2 == null || aVar2 == aVar)) {
            aVar2.a();
        }
        this.f36293a.put(cls, aVar);
    }
}
