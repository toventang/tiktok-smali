package com.bytedance.ies.bullet.service.f.a.b;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.ad;
import h.f.b.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private boolean f32725a;
    public final Map<Class<?>, b<?, g<?>>> as = new LinkedHashMap();

    static {
        Covode.recordClassIndex(19458);
    }

    public abstract List<d<?>> a();

    private final void a(f fVar) {
        if (!this.f32725a) {
            Iterator<T> it = a().iterator();
            while (it.hasNext()) {
                it.next().a(fVar);
            }
            this.f32725a = true;
        }
    }

    public static /* synthetic */ Object a(q qVar, String str) {
        l.c(str, "");
        for (T t : qVar.a()) {
            if (l.a((Object) t.a(), (Object) str)) {
                return t.b();
            }
        }
        return null;
    }

    public final <R> void a(Class<R> cls, R r, f fVar) {
        g<?> invoke;
        l.c(cls, "");
        if (fVar != null) {
            fVar.a(cls, r);
            a(fVar);
            return;
        }
        b<?, g<?>> bVar = this.as.get(cls);
        if (bVar == null || !ad.a(bVar, 1) || (invoke = bVar.invoke(r)) == null) {
            Iterator<T> it = a().iterator();
            while (it.hasNext()) {
                it.next().a(cls, r);
            }
            return;
        }
        Iterator<T> it2 = a().iterator();
        while (it2.hasNext()) {
            it2.next().a(invoke.f32699a, invoke.f32700b);
        }
    }
}
