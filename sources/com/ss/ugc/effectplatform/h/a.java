package com.ss.ugc.effectplatform.h;

import com.bytedance.covode.number.Covode;
import d.a.a.b;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b<String, e<?>> f153600a = new b<>(true);

    static {
        Covode.recordClassIndex(102408);
    }

    public final void b(String str) {
        l.c(str, "");
        this.f153600a.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    public final <T> e<T> a(String str) {
        l.c(str, "");
        e<?> eVar = this.f153600a.get(str);
        if (!(eVar instanceof e)) {
            eVar = null;
        }
        e<T> eVar2 = (e) eVar;
        if (eVar2 == null) {
            return null;
        }
        return eVar2;
    }

    public final <T> void a(String str, e<T> eVar) {
        l.c(str, "");
        l.c(eVar, "");
        this.f153600a.put(str, eVar);
    }
}
