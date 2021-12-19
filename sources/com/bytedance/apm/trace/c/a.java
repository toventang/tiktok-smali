package com.bytedance.apm.trace.c;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, Integer> f25361a;

    static {
        Covode.recordClassIndex(14752);
        HashMap<String, Integer> hashMap = new HashMap<>();
        f25361a = hashMap;
        hashMap.put("xx", 12334);
    }

    public static Integer a(String str) {
        return f25361a.get(str);
    }
}
