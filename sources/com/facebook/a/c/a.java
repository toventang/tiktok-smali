package com.facebook.a.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.a.c;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.q;
import com.facebook.internal.r;
import com.facebook.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f46687a;

    /* renamed from: b  reason: collision with root package name */
    private static final List<C1160a> f46688b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private static final Set<String> f46689c = new HashSet();

    static {
        Covode.recordClassIndex(28453);
    }

    public static synchronized void a() {
        synchronized (a.class) {
            MethodCollector.i(859);
            if (com.facebook.internal.a.b.a.a(a.class)) {
                MethodCollector.o(859);
                return;
            }
            try {
                ae.a();
                q a2 = r.a(m.f48915a, false);
                if (a2 == null) {
                    try {
                        MethodCollector.o(859);
                    } catch (Throwable th) {
                        com.facebook.internal.a.b.a.a(th, a.class);
                        MethodCollector.o(859);
                    }
                } else {
                    String str = a2.s;
                    if (!str.isEmpty()) {
                        JSONObject jSONObject = new JSONObject(str);
                        f46688b.clear();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (jSONObject2 != null) {
                                if (jSONObject2.optBoolean("is_deprecated_event")) {
                                    f46689c.add(next);
                                } else {
                                    JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                    C1160a aVar = new C1160a(next, new ArrayList());
                                    if (optJSONArray != null) {
                                        aVar.f46691b = ad.a(optJSONArray);
                                    }
                                    f46688b.add(aVar);
                                }
                            }
                        }
                    }
                    MethodCollector.o(859);
                }
            } catch (Exception unused) {
                MethodCollector.o(859);
            }
        }
    }

    public static void a(List<c> list) {
        if (!com.facebook.internal.a.b.a.a(a.class)) {
            try {
                if (f46687a) {
                    Iterator<c> it = list.iterator();
                    while (it.hasNext()) {
                        if (f46689c.contains(it.next().getName())) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, a.class);
            }
        }
    }

    /* renamed from: com.facebook.a.c.a$a  reason: collision with other inner class name */
    static class C1160a {

        /* renamed from: a  reason: collision with root package name */
        String f46690a;

        /* renamed from: b  reason: collision with root package name */
        List<String> f46691b;

        static {
            Covode.recordClassIndex(28454);
        }

        C1160a(String str, List<String> list) {
            this.f46690a = str;
            this.f46691b = list;
        }
    }

    public static void a(Map<String, String> map, String str) {
        if (!com.facebook.internal.a.b.a.a(a.class)) {
            try {
                if (f46687a) {
                    ArrayList<String> arrayList = new ArrayList(map.keySet());
                    for (C1160a aVar : new ArrayList(f46688b)) {
                        if (aVar.f46690a.equals(str)) {
                            for (String str2 : arrayList) {
                                if (aVar.f46691b.contains(str2)) {
                                    map.remove(str2);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, a.class);
            }
        }
    }
}
