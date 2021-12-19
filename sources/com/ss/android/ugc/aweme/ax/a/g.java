package com.ss.android.ugc.aweme.ax.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, l<?>> f67728a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(41688);
    }

    public final <T> T a(Class<T> cls) {
        T t;
        l.d(cls, "");
        l<?> lVar = this.f67728a.get(cls);
        if (lVar == null || (t = (T) lVar.a()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    public final <T> void a(Class<T> cls, l<? extends T> lVar) {
        l.d(cls, "");
        l.d(lVar, "");
        l<?> lVar2 = this.f67728a.get(cls);
        if (lVar2 != null) {
            lVar2.b();
        }
        this.f67728a.put(cls, lVar);
    }
}
