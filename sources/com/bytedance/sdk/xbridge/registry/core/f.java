package com.bytedance.sdk.xbridge.registry.core;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.protocol.c;
import com.bytedance.sdk.xbridge.registry.core_api.b;
import com.bytedance.sdk.xbridge.registry.core_api.b.a;
import com.bytedance.sdk.xbridge.registry.core_api.d;
import com.bytedance.sdk.xbridge.registry.core_api.i;
import h.a.n;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, c> f44047a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final f f44048b = new f();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<Object>, Object> f44049c = new LinkedHashMap();

    private f() {
    }

    static {
        Covode.recordClassIndex(26908);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: java.util.Map<com.bytedance.sdk.xbridge.registry.core.g, java.util.Map<java.lang.String, java.lang.Class<? extends com.bytedance.sdk.xbridge.registry.core.b>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Class<? extends b> cls, g gVar) {
        List a2;
        l.c(gVar, "");
        if (cls != null) {
            Map<String, c> map = f44047a;
            if (map.get("DEFAULT") == null) {
                map.put("DEFAULT", new c());
            }
            c cVar = map.get("DEFAULT");
            if (cVar != null) {
                l.c(cls, "");
                l.c(gVar, "");
                if (gVar == g.ALL) {
                    a2 = n.b(g.ALL, g.WEB, g.LYNX, g.RN);
                } else {
                    a2 = n.a(gVar);
                }
                for (Object obj : a2) {
                    Map<String, Class<? extends b>> map2 = cVar.f44043b.get(obj);
                    if (map2 == null) {
                        map2 = new LinkedHashMap<>();
                    }
                    String a3 = d.a(cls);
                    if (!(a3 == null || a3.length() == 0)) {
                        map2.put(a3, cls);
                        cVar.f44043b.put(obj, map2);
                    }
                }
            }
        }
    }

    public static final void a(View view, a aVar) {
        c cVar;
        Map<String, Class<? extends b>> map;
        c cVar2;
        l.c(view, "");
        l.c(aVar, "");
        d dVar = new d();
        g gVar = g.ALL;
        l.c(gVar, "");
        Map<String, c> map2 = f44047a;
        if (!(map2.get("DEFAULT") == null || (cVar = map2.get("DEFAULT")) == null)) {
            l.c(gVar, "");
            if (!(gVar == g.NONE || (map = cVar.f44043b.get(gVar)) == null)) {
                for (Map.Entry<String, Class<? extends b>> entry : map.entrySet()) {
                    b bVar = (b) entry.getValue().newInstance();
                    ConcurrentHashMap<String, b> concurrentHashMap = dVar.f44075a;
                    String b2 = bVar.b();
                    l.a((Object) bVar, "");
                    concurrentHashMap.put(b2, bVar);
                    com.bytedance.sdk.xbridge.registry.core_api.a.d dVar2 = a.f44061a;
                    if (dVar2 != null) {
                        dVar2.a(bVar.b(), "DEFAULT", bVar.a());
                    }
                }
            }
        }
        l.c(view, "");
        com.bytedance.sdk.xbridge.registry.core_api.a aVar2 = b.f44059a.get(Integer.valueOf(view.hashCode()));
        if (!(aVar2 == null || (cVar2 = aVar2.f44056a) == null)) {
            i iVar = new i(dVar, aVar, aVar2.f44057b);
            l.c(iVar, "");
            com.bytedance.sdk.xbridge.protocol.b.a aVar3 = cVar2.f43954a.f43919a;
            if (aVar3 != null) {
                l.c(iVar, "");
                aVar3.f43945a = iVar;
            }
        }
    }
}
