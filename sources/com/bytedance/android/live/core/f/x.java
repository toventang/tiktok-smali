package com.bytedance.android.live.core.f;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, Class> f9118a = new HashMap();

    static {
        Covode.recordClassIndex(4671);
    }

    public static Class a(String str) {
        if (f9118a.containsKey(str)) {
            return f9118a.get(str);
        }
        Class<?> cls = null;
        try {
            cls = Class.forName(str);
            f9118a.put(str, cls);
            return cls;
        } catch (Throwable unused) {
            return cls;
        }
    }
}
