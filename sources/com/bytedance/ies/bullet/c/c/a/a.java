package com.bytedance.ies.bullet.c.c.a;

import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f31993a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, Map<Class<?>, m<Object, Class<?>, Object>>> f31994b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, h.f.a.b<Object, JSONObject>> f31995c;

    /* renamed from: com.bytedance.ies.bullet.c.c.a.a$a  reason: collision with other inner class name */
    public enum EnumC0672a {
        REPLACE,
        IGNORE;

        static {
            Covode.recordClassIndex(18723);
        }
    }

    public static final class b implements h.f.a.b<Object, JSONObject> {
        static {
            Covode.recordClassIndex(18724);
        }

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ JSONObject invoke(Object obj) {
            l.c(obj, "");
            if (obj instanceof JSONObject) {
                return obj;
            }
            return null;
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(18722);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("WEB", new b());
        f31995c = linkedHashMap;
    }

    public static final m<Object, Class<?>, Object> a(Class<?> cls, Class<?> cls2) {
        l.c(cls, "");
        l.c(cls2, "");
        Map<Class<?>, m<Object, Class<?>, Object>> map = f31994b.get(cls);
        if (map != null) {
            return map.get(cls2);
        }
        return null;
    }

    public static /* synthetic */ void a(String str, h.f.a.b bVar) {
        EnumC0672a aVar = EnumC0672a.IGNORE;
        l.c(str, "");
        l.c(bVar, "");
        l.c(aVar, "");
        int i2 = b.f31998b[aVar.ordinal()];
        if (i2 == 1) {
            Map<String, h.f.a.b<Object, JSONObject>> map = f31995c;
            if (!map.containsKey(str)) {
                map.put(str, bVar);
            }
        } else if (i2 == 2) {
            f31995c.put(str, bVar);
        }
    }
}
