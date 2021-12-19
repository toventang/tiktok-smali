package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* access modifiers changed from: package-private */
public final class ii {

    /* renamed from: a  reason: collision with root package name */
    static final ii f51018a = new ii();

    /* renamed from: b  reason: collision with root package name */
    private final im f51019b = new hk();

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, in<?>> f51020c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(31875);
    }

    private ii() {
    }

    public final <T> in<T> a(T t) {
        return a((Class) t.getClass());
    }

    public final <T> in<T> a(Class<T> cls) {
        gp.a((Object) cls, "messageType");
        in<T> inVar = (in<T>) this.f51020c.get(cls);
        if (inVar != null) {
            return inVar;
        }
        in<T> a2 = this.f51019b.a(cls);
        gp.a((Object) cls, "messageType");
        gp.a((Object) a2, "schema");
        in<T> inVar2 = (in<T>) this.f51020c.putIfAbsent(cls, a2);
        return inVar2 != null ? inVar2 : a2;
    }
}
