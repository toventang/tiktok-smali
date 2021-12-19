package com.bytedance.sdk.xbridge.registry.core;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f44045a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<? extends b>, String> f44046b = new LinkedHashMap();

    private d() {
    }

    static {
        Covode.recordClassIndex(26906);
    }

    public static final String a(Class<? extends b> cls) {
        l.c(cls, "");
        try {
            Map<Class<? extends b>, String> map = f44046b;
            String str = map.get(cls);
            if (str == null) {
                map.put(cls, ((b) cls.newInstance()).b());
                str = map.get(cls);
            }
            if (str == null) {
                return "";
            }
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }
}
