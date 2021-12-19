package com.bytedance.android.live.core.d;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Long> f8963a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f8964b = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(4573);
    }

    public static void b(String str) {
        a(a(str, false), System.currentTimeMillis());
    }

    public static void a(String str) {
        a(a(str, true), System.currentTimeMillis());
        f8964b.add(str);
    }

    public static long a(Map<String, Long> map, String str) {
        Long l2 = map.get(str);
        if (l2 == null) {
            return 0;
        }
        return l2.longValue();
    }

    public static String a(String str, boolean z) {
        if (z) {
            return str + "_start";
        }
        return str + "_end";
    }

    private static void a(String str, long j2) {
        f8963a.put(str, Long.valueOf(j2));
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (Exception unused) {
        }
    }
}
