package com.bytedance.j.a.c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, l> f38984a = new ConcurrentHashMap(3);

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, Integer> f38985b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final c f38986c = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(23866);
    }

    private static void a(String str) {
        Map<String, Integer> map = f38985b;
        int i2 = map.get(str);
        if (i2 == null) {
            i2 = 0;
            map.put(str, 0);
        }
        map.put(str, Integer.valueOf(i2.intValue() + 1));
    }

    public static l a(String str, String[] strArr, boolean z) {
        h.f.b.l.c(str, "");
        Map<String, l> map = f38984a;
        l lVar = map.get(str);
        a(str);
        if (lVar != null) {
            return lVar;
        }
        l a2 = l.a(str, strArr, z);
        h.f.b.l.a((Object) a2, "");
        map.put(str, a2);
        return a2;
    }
}
