package com.ss.android.ugc.aweme.tools.beauty.impl.view;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<Class<?>, Object> f139074a = new HashMap<>();

    static {
        Covode.recordClassIndex(90963);
    }

    public final <T> T a(Class<T> cls) {
        l.d(cls, "");
        T t = (T) this.f139074a.get(cls);
        if (t != null) {
            return t;
        }
        return null;
    }

    public final void a(Class<?> cls, Object obj) {
        l.d(cls, "");
        l.d(obj, "");
        this.f139074a.put(cls, obj);
    }
}
