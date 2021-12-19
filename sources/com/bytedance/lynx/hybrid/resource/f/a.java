package com.bytedance.lynx.hybrid.resource.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.b.b;
import com.bytedance.lynx.hybrid.resource.b.e;
import com.bytedance.lynx.hybrid.resource.b.g;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.d.c;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41153a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<? extends IHybridResourceLoader>, c> f41154b;

    private a() {
    }

    static {
        Covode.recordClassIndex(25219);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f41154b = linkedHashMap;
        linkedHashMap.put(e.class, c.DEFAULT);
        linkedHashMap.put(g.class, c.DEFAULT);
        linkedHashMap.put(com.bytedance.lynx.hybrid.resource.b.a.class, c.DEFAULT);
        linkedHashMap.put(b.class, c.DEFAULT);
    }

    public static c a(Class<? extends IHybridResourceLoader> cls) {
        l.c(cls, "");
        Map<Class<? extends IHybridResourceLoader>, c> map = f41154b;
        if (map.containsKey(cls)) {
            return map.get(cls);
        }
        return c.DEFAULT;
    }

    public static void a(Class<? extends IHybridResourceLoader> cls, c cVar) {
        l.c(cls, "");
        l.c(cVar, "");
        f41154b.put(cls, cVar);
    }
}
