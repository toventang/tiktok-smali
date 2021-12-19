package com.bytedance.helios.sdk.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.d;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static a<Map<String, Object>> f30945a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f30946b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final Type f30947c;

    public static final class b extends com.google.gson.b.a<List<? extends HashMap<String, Object>>> {
        static {
            Covode.recordClassIndex(17955);
        }

        b() {
        }
    }

    /* renamed from: com.bytedance.helios.sdk.e.c$c  reason: collision with other inner class name */
    public static final class C0649c implements b<Map<String, ? extends Object>> {
        static {
            Covode.recordClassIndex(17956);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.helios.sdk.e.a<java.util.Map<java.lang.String, java.lang.Object>>] */
        @Override // com.bytedance.helios.sdk.e.b
        public final void a(a<Map<String, ? extends Object>> aVar) {
            l.c(aVar, "");
        }

        C0649c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.helios.sdk.e.a, java.lang.Object, boolean] */
        @Override // com.bytedance.helios.sdk.e.b
        public final /* synthetic */ void a(a<Map<String, ? extends Object>> aVar, Map<String, ? extends Object> map, boolean z) {
            l.c(aVar, "");
            l.c(map, "");
            if (z) {
                d.b("region", com.bytedance.helios.sdk.utils.c.a(c.f30945a));
            }
        }
    }

    private c() {
    }

    public static String a() {
        Object obj;
        List k2;
        try {
            a<Map<String, Object>> aVar = f30945a;
            if (aVar == null || (k2 = n.k(aVar)) == null) {
                obj = null;
            } else {
                obj = n.a((Iterable) k2, (Comparator) new a());
            }
        } catch (Exception unused) {
            obj = f30945a;
        }
        return com.bytedance.helios.sdk.utils.c.a(obj);
    }

    static {
        a<Map<String, Object>> aVar;
        Covode.recordClassIndex(17953);
        Type type = new b().type;
        l.a((Object) type, "");
        f30947c = type;
        String a2 = d.a("region");
        C0649c cVar = new C0649c();
        if (a2.length() == 0) {
            aVar = new a<>(20, cVar, null, 4, null);
        } else {
            Collection collection = (List) com.bytedance.helios.sdk.utils.c.a(a2, type);
            if (collection == null) {
                collection = z.INSTANCE;
            }
            aVar = new a<>(20, cVar, collection);
        }
        f30945a = aVar;
    }

    public static final class a<T> implements Comparator<T> {
        static {
            Covode.recordClassIndex(17954);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Object obj = t.get("event_time_stamp");
            String str = null;
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str2 = (String) obj;
            Object obj2 = t2.get("event_time_stamp");
            if (obj2 instanceof String) {
                str = obj2;
            }
            return h.b.a.a(str2, str);
        }
    }
}
