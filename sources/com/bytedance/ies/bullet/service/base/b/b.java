package com.bytedance.ies.bullet.service.base.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.h;
import com.bytedance.ies.bullet.service.base.a.i;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;

public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<Class<?>, i<?>> f32575a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(19333);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.h
    public final <T> T a(Class<T> cls) {
        T t;
        l.c(cls, "");
        i<?> iVar = this.f32575a.get(cls);
        if (iVar == null || (t = (T) iVar.a()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.h
    public final <T> void a(Class<T> cls, T t) {
        l.c(cls, "");
        if (t != null) {
            this.f32575a.put(cls, new c(t));
        }
    }
}
