package com.bytedance.lynx.hybrid.service.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.e;
import com.bytedance.lynx.hybrid.a.g;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<Class<?>, g<?>> f41240a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(25263);
    }

    @Override // com.bytedance.lynx.hybrid.a.e
    public final <T> T a(Class<T> cls) {
        T t;
        l.c(cls, "");
        g<?> gVar = this.f41240a.get(cls);
        if (gVar == null || (t = (T) gVar.a()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    @Override // com.bytedance.lynx.hybrid.a.e
    public final <T> void a(Class<T> cls, T t) {
        l.c(cls, "");
        if (t != null) {
            this.f41240a.put(cls, new b(t));
        }
    }
}
