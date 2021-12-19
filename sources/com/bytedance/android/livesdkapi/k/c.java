package com.bytedance.android.livesdkapi.k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Class<?>, b<?>> f23250a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final c f23251b = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(13825);
    }

    public static <T extends b<?>> void a(Class<T> cls, T t) {
        l.d(cls, "");
        l.d(t, "");
        f23250a.put(cls, t);
    }
}
