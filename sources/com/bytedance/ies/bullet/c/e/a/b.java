package com.bytedance.ies.bullet.c.e.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, c<?>> f32079a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(18812);
    }

    public final void a() {
        this.f32079a.clear();
    }

    public final b b() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    public final void a(b bVar) {
        l.c(bVar, "");
        this.f32079a.putAll(bVar.f32079a);
    }

    public final <T> void a(Class<T> cls) {
        l.c(cls, "");
        c<?> cVar = this.f32079a.get(cls);
        if (cVar != null) {
            cVar.a();
        }
        this.f32079a.remove(cls);
    }

    public final <T> c<T> b(Class<T> cls) {
        l.c(cls, "");
        c<T> cVar = (c<T>) this.f32079a.get(cls);
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    public final <T> T c(Class<T> cls) {
        T t;
        l.c(cls, "");
        c<?> cVar = this.f32079a.get(cls);
        if (cVar == null || (t = (T) cVar.b()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    public final <T> void a(Class<T> cls, c<? extends T> cVar) {
        l.c(cls, "");
        l.c(cVar, "");
        c<?> cVar2 = this.f32079a.get(cls);
        if (!(cVar2 == null || cVar2 == cVar)) {
            cVar2.a();
        }
        this.f32079a.put(cls, cVar);
    }

    public final <T> void b(Class<T> cls, T t) {
        l.c(cls, "");
        a((Class) cls, (c) new a(t));
    }

    public final <T> void a(Class<T> cls, T t) {
        l.c(cls, "");
        a((Class) cls, (c) new d(t));
    }
}
