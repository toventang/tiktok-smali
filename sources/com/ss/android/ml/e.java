package com.ss.android.ml;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class e {
    static {
        Covode.recordClassIndex(36991);
    }

    public static Object a(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj != null) {
            return obj;
        }
        if (d.f59853a != null) {
            return d.f59853a.a(str);
        }
        return null;
    }
}
