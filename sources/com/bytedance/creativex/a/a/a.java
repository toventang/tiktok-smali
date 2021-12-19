package com.bytedance.creativex.a.a;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Class<?>> f28025a;

    /* renamed from: b  reason: collision with root package name */
    private final b<Class<?>, Boolean> f28026b;

    static {
        Covode.recordClassIndex(16410);
    }

    private /* synthetic */ a() {
        this(AnonymousClass1.f28027a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super java.lang.Class<?>, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(b<? super Class<?>, Boolean> bVar) {
        l.d(bVar, "");
        this.f28026b = bVar;
        this.f28025a = new LinkedHashMap();
    }

    @Override // com.bytedance.creativex.a.a.c
    public final Class<?> a(String str) {
        l.d(str, "");
        Class<?> cls = this.f28025a.get(str);
        if (cls != null) {
            return cls;
        }
        throw new IllegalArgumentException("unregistered key:".concat(String.valueOf(str)).toString());
    }

    @Override // com.bytedance.creativex.a.a.c
    public final void a(String str, Class<?> cls) {
        l.d(str, "");
        l.d(cls, "");
        if (this.f28026b.invoke(cls).booleanValue()) {
            this.f28025a.put(str, cls);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
