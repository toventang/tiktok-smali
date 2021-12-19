package com.bytedance.android.monitor.k;

import android.view.View;
import com.bytedance.android.monitor.d.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23533a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, Map<String, Object>> f23534b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, Map<String, Object>> f23535c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, d> f23536d = new LinkedHashMap();

    private a() {
    }

    static {
        Covode.recordClassIndex(13972);
    }

    public static com.bytedance.android.monitor.d.a a(View view) {
        l.c(view, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c(view).iterator();
        while (it.hasNext()) {
            arrayList.add(a((String) it.next()));
        }
        return new com.bytedance.android.monitor.d.a(arrayList);
    }

    public static b b(View view) {
        l.c(view, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c(view).iterator();
        while (it.hasNext()) {
            arrayList.add(b((String) it.next()));
        }
        return new b(arrayList);
    }

    private static List<String> c(View view) {
        l.c(view, "");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, d> entry : f23536d.entrySet()) {
            View view2 = entry.getValue().f23540a.get();
            if (view2 != null && view2.equals(view)) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    private static Map<String, Object> a(String str) {
        l.c(str, "");
        Map<String, Map<String, Object>> map = f23534b;
        if (map.get(str) == null) {
            map.put(str, new LinkedHashMap());
        }
        Map<String, Object> map2 = map.get(str);
        if (map2 == null) {
            l.a();
        }
        return map2;
    }

    private static Map<String, Object> b(String str) {
        l.c(str, "");
        Map<String, Map<String, Object>> map = f23535c;
        if (map.get(str) == null) {
            map.put(str, new LinkedHashMap());
        }
        Map<String, Object> map2 = map.get(str);
        if (map2 == null) {
            l.a();
        }
        return map2;
    }
}
