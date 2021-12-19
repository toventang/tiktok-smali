package com.bytedance.ies.xbridge;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a */
    public static final a f35725a = new a();

    /* renamed from: b */
    private static final Map<Class<d>, d> f35726b = new LinkedHashMap();

    /* renamed from: c */
    private static final Map<String, g> f35727c = new LinkedHashMap();

    private a() {
    }

    static {
        Covode.recordClassIndex(21325);
    }

    public static <T extends d> T a(Class<T> cls) {
        l.c(cls, "");
        Map<Class<d>, d> map = f35726b;
        T t = (T) map.get(cls);
        if (t != null) {
            return t;
        }
        try {
            T newInstance = cls.newInstance();
            l.a((Object) newInstance, "");
            map.put(cls, newInstance);
            return newInstance;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map<String, Class<? extends b>> a(e eVar, String str) {
        g gVar;
        l.c(eVar, "");
        l.c(str, "");
        Map<String, g> map = f35727c;
        if (map.get(str) == null || (gVar = map.get(str)) == null) {
            return null;
        }
        l.c(eVar, "");
        if (eVar == e.NONE) {
            return null;
        }
        return gVar.f35976b.get(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r0v9. Raw type applied. Possible types: java.util.Map<com.bytedance.ies.xbridge.e, java.util.Map<java.lang.String, java.lang.Class<? extends com.bytedance.ies.xbridge.b>>>, java.util.Map */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map, java.lang.Object] */
    private static void a(Class<? extends b> cls, e eVar, String str) {
        List a2;
        l.c(eVar, "");
        l.c(str, "");
        if (cls != null) {
            Map<String, g> map = f35727c;
            if (map.get(str) == null) {
                map.put(str, new g());
            }
            g gVar = map.get(str);
            if (gVar != null) {
                l.c(cls, "");
                l.c(eVar, "");
                if (eVar == e.ALL) {
                    a2 = n.b(e.ALL, e.WEB, e.LYNX, e.RN);
                } else {
                    a2 = n.a(eVar);
                }
                for (Object obj : a2) {
                    Map<String, Class<? extends b>> map2 = gVar.f35976b.get(obj);
                    if (map2 == null) {
                        map2 = new LinkedHashMap<>();
                    }
                    l.c(cls, "");
                    String str2 = h.f36005a.get(cls);
                    if (str2 == null) {
                        h.f36005a.put(cls, ((b) cls.newInstance()).b());
                        str2 = h.f36005a.get(cls);
                        if (str2 == null) {
                            l.a();
                        }
                    }
                    map2.put(str2, cls);
                    gVar.f35976b.put(obj, map2);
                }
            }
        }
    }

    public static /* synthetic */ void a(Class cls, e eVar, String str, int i2) {
        if ((i2 & 2) != 0) {
            eVar = e.ALL;
        }
        if ((i2 & 4) != 0) {
            str = "DEFAULT";
        }
        a(cls, eVar, str);
    }
}
