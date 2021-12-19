package com.bytedance.bpea.core;

import com.bytedance.bpea.core.a.d;
import com.bytedance.bpea.core.c.b;
import com.bytedance.bpea.core.c.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f26615a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(15673);
    }

    public static final void a(e eVar) {
        l.c(eVar, "");
        l.c(eVar, "");
        if (!b.f26638a.contains(eVar)) {
            b.f26638a.add(eVar);
        }
    }

    public static final void a(d dVar, com.bytedance.bpea.core.a.a aVar) {
        l.c(dVar, "");
        l.c(aVar, "");
        l.c(aVar, "");
        l.c(dVar, "");
        List<com.bytedance.bpea.core.a.a> list = com.bytedance.bpea.core.a.b.f26616a.get(dVar);
        if (list == null || list.isEmpty()) {
            list = new ArrayList<>();
            com.bytedance.bpea.core.a.b.f26616a.put(dVar, list);
        }
        if (!list.contains(aVar)) {
            list.add(aVar);
        }
    }
}
