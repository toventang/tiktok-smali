package com.bytedance.android.monitorV2.k;

import android.view.View;
import com.bytedance.android.monitorV2.d.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Map<String, Object>> f24005a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, Map<String, Object>> f24006b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    static final Map<String, e> f24007c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final a f24008d = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(14150);
    }

    public static Map<String, Object> a(String str) {
        l.c(str, "");
        return d(str);
    }

    public static e b(String str) {
        l.c(str, "");
        return f24007c.get(str);
    }

    private static Map<String, Object> c(String str) {
        l.c(str, "");
        return e(str);
    }

    private static Map<String, Object> d(String str) {
        Map<String, Map<String, Object>> map = f24005a;
        if (map.get(str) == null) {
            map.put(str, new LinkedHashMap());
        }
        Map<String, Object> map2 = map.get(str);
        if (map2 == null) {
            l.a();
        }
        return map2;
    }

    private static Map<String, Object> e(String str) {
        Map<String, Map<String, Object>> map = f24006b;
        if (map.get(str) == null) {
            map.put(str, new LinkedHashMap());
        }
        Map<String, Object> map2 = map.get(str);
        if (map2 == null) {
            l.a();
        }
        return map2;
    }

    public static com.bytedance.android.monitorV2.d.a a(View view) {
        l.c(view, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c(view).iterator();
        while (it.hasNext()) {
            arrayList.add(a((String) it.next()));
        }
        return new com.bytedance.android.monitorV2.d.a(arrayList);
    }

    public static b b(View view) {
        l.c(view, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c(view).iterator();
        while (it.hasNext()) {
            arrayList.add(c((String) it.next()));
        }
        return new b(arrayList);
    }

    private static List<String> c(View view) {
        l.c(view, "");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, e> entry : f24007c.entrySet()) {
            View a2 = entry.getValue().a();
            if (a2 != null && a2.equals(view)) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    public static void a(String str, String str2, Object obj) {
        l.c(str, "");
        l.c(str2, "");
        l.c(obj, "");
        d(str).put(str2, obj);
    }

    public static void b(String str, String str2, Object obj) {
        l.c(str, "");
        l.c(str2, "");
        l.c(obj, "");
        e(str).put(str2, obj);
    }
}
