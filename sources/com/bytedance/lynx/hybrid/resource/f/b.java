package com.bytedance.lynx.hybrid.resource.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.a.a;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.config.f;
import com.bytedance.lynx.hybrid.resource.config.j;
import com.bytedance.lynx.hybrid.resource.d.e;
import com.bytedance.lynx.hybrid.resource.g;
import h.a.n;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f41157a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final List<f> f41158b = n.c(f.GECKO, f.BUILTIN, f.CDN);

    private b() {
    }

    static {
        Covode.recordClassIndex(25220);
    }

    public static d a(g gVar, com.bytedance.lynx.hybrid.resource.d.g gVar2) {
        l.c(gVar, "");
        l.c(gVar2, "");
        j jVar = gVar2.f41136c;
        ArrayList arrayList = new ArrayList();
        if (a.f41035a != null) {
            Class<? extends IHybridResourceLoader> cls = a.f41035a;
            if (cls == null) {
                l.a();
            }
            arrayList.add(cls);
        }
        List<? extends Class<? extends IHybridResourceLoader>> list = jVar.f41106b.f41084b;
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.addAll(com.bytedance.lynx.hybrid.resource.l.f41226a);
        if (gVar2.f41135b instanceof com.bytedance.lynx.hybrid.resource.j) {
            e eVar = gVar2.f41135b;
            if (eVar == null) {
                throw new w("null cannot be cast to non-null type");
            } else if (((com.bytedance.lynx.hybrid.resource.j) eVar).f41220h) {
                arrayList.add(com.bytedance.lynx.hybrid.resource.b.g.class);
            }
        }
        if (jVar.f41106b.f41083a.isEmpty() && !jVar.f41106b.f41087e) {
            jVar.f41106b.a(f41158b);
        }
        for (f fVar : jVar.f41106b.f41083a) {
            int i2 = c.f41160a[fVar.ordinal()];
            if (i2 == 1) {
                arrayList.add(com.bytedance.lynx.hybrid.resource.b.e.class);
            } else if (i2 == 2) {
                arrayList.add(com.bytedance.lynx.hybrid.resource.b.a.class);
            } else if (i2 == 3) {
                arrayList.add(com.bytedance.lynx.hybrid.resource.b.b.class);
            }
        }
        arrayList.addAll(com.bytedance.lynx.hybrid.resource.l.f41227b);
        List<? extends Class<? extends IHybridResourceLoader>> list2 = jVar.f41106b.f41085c;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        List<? extends Class<? extends IHybridResourceLoader>> list3 = jVar.f41106b.f41086d;
        if (list3 != null) {
            arrayList.removeAll(list3);
        }
        return new d(arrayList, gVar);
    }
}
