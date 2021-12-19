package com.bytedance.android.livesdk.service.c.f;

import com.bytedance.android.livesdk.util.a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f21425a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(12610);
    }

    public static Map<String, String> a(String str) {
        if (str == null) {
            return new HashMap();
        }
        Map map = (Map) a.a(str, (Type) Map.class);
        if (map == null) {
            map = new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof Double) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Long l2 = null;
                if (!(value instanceof Double)) {
                    value = null;
                }
                Double d2 = (Double) value;
                if (d2 != null) {
                    l2 = Long.valueOf((long) d2.doubleValue());
                }
                hashMap.put(key, String.valueOf(l2));
            } else {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return hashMap;
    }
}
