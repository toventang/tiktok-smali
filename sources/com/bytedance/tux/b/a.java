package com.bytedance.tux.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.a.b;
import h.f.b.l;
import h.p;
import h.v;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, b> f44659a;

    /* renamed from: b  reason: collision with root package name */
    private Map<Integer, ? extends b<? super h, z>> f44660b;

    /* renamed from: c  reason: collision with root package name */
    private Map<Integer, b> f44661c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map<Integer, i> f44662d;

    /* renamed from: e  reason: collision with root package name */
    private final b<j, z> f44663e;

    static {
        Covode.recordClassIndex(27309);
    }

    private synchronized void b() {
        MethodCollector.i(8711);
        if (this.f44660b == null) {
            j jVar = new j();
            this.f44663e.invoke(jVar);
            p a2 = v.a(jVar.f44697b, jVar.f44698c);
            this.f44660b = (Map) a2.getFirst();
            this.f44662d = (Map) a2.getSecond();
        }
        MethodCollector.o(8711);
    }

    public final synchronized Map<Integer, b> a() {
        MethodCollector.i(8715);
        Map<Integer, b> map = this.f44659a;
        if (map != null) {
            MethodCollector.o(8715);
            return map;
        }
        j jVar = new j();
        this.f44663e.invoke(jVar);
        Map<Integer, b> map2 = jVar.f44696a;
        this.f44659a = map2;
        MethodCollector.o(8715);
        return map2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.bytedance.tux.b.j, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(b<? super j, z> bVar) {
        l.c(bVar, "");
        this.f44663e = bVar;
    }

    public final synchronized b a(int i2) {
        i iVar;
        b bVar;
        b bVar2;
        MethodCollector.i(8713);
        b();
        Map<Integer, b> map = this.f44661c;
        b bVar3 = null;
        if (map == null || (bVar2 = map.get(Integer.valueOf(i2))) == null) {
            Map<Integer, ? extends b<? super h, z>> map2 = this.f44660b;
            if (map2 == null || (bVar = (b) map2.get(Integer.valueOf(i2))) == null) {
                Map<Integer, i> map3 = this.f44662d;
                if (!(map3 == null || (iVar = map3.get(Integer.valueOf(i2))) == null)) {
                    new h();
                    b a2 = h.a(iVar);
                    this.f44661c.put(Integer.valueOf(i2), a2);
                    MethodCollector.o(8713);
                    return a2;
                }
            } else {
                h hVar = new h();
                bVar.invoke(hVar);
                b a3 = hVar.a();
                this.f44661c.put(Integer.valueOf(i2), a3);
                MethodCollector.o(8713);
                return a3;
            }
        } else {
            bVar3 = bVar2;
        }
        MethodCollector.o(8713);
        return bVar3;
    }
}
