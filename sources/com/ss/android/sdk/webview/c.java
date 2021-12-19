package com.ss.android.sdk.webview;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, g<?>> f60180a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(37173);
    }

    public final <T> T a(Class<T> cls) {
        T t;
        l.d(cls, "");
        g<?> gVar = this.f60180a.get(cls);
        if (gVar == null || (t = (T) gVar.a()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    public final <T> void a(Class<T> cls, g<T> gVar) {
        l.d(cls, "");
        l.d(gVar, "");
        this.f60180a.get(cls);
        this.f60180a.put(cls, gVar);
    }
}
