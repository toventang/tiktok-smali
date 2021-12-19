package com.bytedance.assem.arch.core;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final d f25559a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<j, c> f25560b;

    static {
        Covode.recordClassIndex(14882);
    }

    private /* synthetic */ d() {
        this(null);
    }

    public final void a() {
        this.f25560b.clear();
    }

    public d(d dVar) {
        this.f25559a = dVar;
        this.f25560b = new LinkedHashMap();
    }

    public final void a(c cVar, String str) {
        if (cVar != null) {
            this.f25560b.put(new j(cVar.getClass(), str), cVar);
        }
    }

    public final <T> T a(Class<T> cls, String str) {
        l.c(cls, "");
        j jVar = new j(cls, str);
        for (d dVar = this; dVar != null; dVar = dVar.f25559a) {
            if (dVar.f25560b.containsKey(jVar)) {
                return (T) dVar.f25560b.get(jVar);
            }
        }
        throw new IllegalArgumentException("No such data hierarchy by parent.");
    }

    public final <T> T b(Class<T> cls, String str) {
        l.c(cls, "");
        j jVar = new j(cls, str);
        for (d dVar = this; dVar != null; dVar = dVar.f25559a) {
            if (dVar.f25560b.containsKey(jVar)) {
                return (T) dVar.f25560b.get(jVar);
            }
        }
        return null;
    }
}
