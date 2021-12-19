package com.bytedance.covode.a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, Long> f27394a = new HashMap();

    static {
        Covode.recordClassIndex(16114);
    }

    public static void a(String str) {
        Long l2 = f27394a.get(str);
        if (l2 != null) {
            System.currentTimeMillis();
            l2.longValue();
        }
    }
}
