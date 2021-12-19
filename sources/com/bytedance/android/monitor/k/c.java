package com.bytedance.android.monitor.k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f23537a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final a f23538b = a.f23533a;

    /* renamed from: c  reason: collision with root package name */
    private static Map<String, b> f23539c = new LinkedHashMap();

    private c() {
    }

    static {
        Covode.recordClassIndex(13974);
    }

    public static void a(String str, b bVar) {
        l.c(str, "");
        l.c(bVar, "");
        f23539c.put(str, bVar);
    }
}
