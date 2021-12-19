package com.bytedance.ies.ugc.network.partner.b;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<com.bytedance.retrofit2.client.b>> f35258a;

    static {
        Covode.recordClassIndex(21128);
    }

    public /* synthetic */ b() {
        this(z.INSTANCE);
    }

    public final List<com.bytedance.retrofit2.client.b> a() {
        Map<String, List<com.bytedance.retrofit2.client.b>> map = this.f35258a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<com.bytedance.retrofit2.client.b>> entry : map.entrySet()) {
            n.a((Collection) arrayList, (Iterable) entry.getValue());
        }
        return arrayList;
    }

    private final List<com.bytedance.retrofit2.client.b> b(String str) {
        Map<String, List<com.bytedance.retrofit2.client.b>> map = this.f35258a;
        String c2 = c(str);
        List<com.bytedance.retrofit2.client.b> list = map.get(c2);
        if (list == null) {
            list = new ArrayList<>();
            map.put(c2, list);
        }
        return list;
    }

    private static String c(String str) {
        Locale locale = Locale.getDefault();
        l.b(locale, "");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        l.b(lowerCase, "");
        return lowerCase;
    }

    public b(List<com.bytedance.retrofit2.client.b> list) {
        l.d(list, "");
        this.f35258a = new LinkedHashMap();
        for (com.bytedance.retrofit2.client.b bVar : list) {
            String str = bVar.f42471a;
            l.b(str, "");
            a(bVar, str);
        }
    }

    public final String a(String str) {
        T t;
        l.d(str, "");
        l.d(str, "");
        List<com.bytedance.retrofit2.client.b> list = this.f35258a.get(c(str));
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.f42472b != null) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                return t2.f42472b;
            }
        }
        return null;
    }

    private final void a(com.bytedance.retrofit2.client.b bVar, String str) {
        b(str).add(bVar);
    }

    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        List<com.bytedance.retrofit2.client.b> b2 = b(str);
        b2.clear();
        b2.add(new com.bytedance.retrofit2.client.b(str, str2));
    }

    public final void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        a(new com.bytedance.retrofit2.client.b(str, str2), str);
    }
}
