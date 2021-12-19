package com.bytedance.ies.bullet.service.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.a.b;
import h.f.b.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public final class c extends b.a {

    /* renamed from: a  reason: collision with root package name */
    public Context f32492a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32493b;

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<Class<?>, a<?>> f32494c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private e<String, Object> f32495d;

    /* renamed from: e  reason: collision with root package name */
    private e<String, Object> f32496e;

    public static final class a<R> {

        /* renamed from: a  reason: collision with root package name */
        public R f32497a;

        static {
            Covode.recordClassIndex(19268);
        }
    }

    static {
        Covode.recordClassIndex(19267);
    }

    @Override // com.bytedance.ies.bullet.service.a.b.a, com.bytedance.ies.bullet.service.a.b
    public final void a() {
        super.a();
        Collection<a<?>> values = this.f32494c.values();
        l.a((Object) values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            it.next().f32497a = null;
        }
        this.f32494c.clear();
    }

    @Override // com.bytedance.ies.bullet.service.a.b.a
    public final e<String, Object> b() {
        MethodCollector.i(245);
        if (this.f32495d == null) {
            synchronized (this) {
                try {
                    if (this.f32495d == null) {
                        this.f32495d = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(245);
                    throw th;
                }
            }
        }
        e<String, Object> eVar = this.f32495d;
        MethodCollector.o(245);
        return eVar;
    }

    @Override // com.bytedance.ies.bullet.service.a.b.a
    public final e<String, Object> c() {
        MethodCollector.i(246);
        if (this.f32496e == null) {
            synchronized (this) {
                try {
                    if (this.f32496e == null) {
                        this.f32496e = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(246);
                    throw th;
                }
            }
        }
        e<String, Object> eVar = this.f32496e;
        MethodCollector.o(246);
        return eVar;
    }

    public c(String str) {
        l.c(str, "");
        this.f32493b = str;
    }
}
