package com.ss.android.ugc.aweme.notice.repo.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f112784a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, a> f112785b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, a> f112786c = new LinkedHashMap();

    private b() {
    }

    static {
        Covode.recordClassIndex(72502);
    }

    public static a a(String str) {
        l.d(str, "");
        return f112785b.get(str);
    }

    public static a b(String str) {
        l.d(str, "");
        return f112786c.get(str);
    }

    public static void a(String str, a aVar) {
        l.d(str, "");
        f112785b.put(str, aVar);
    }

    public static void b(String str, a aVar) {
        l.d(str, "");
        f112786c.put(str, aVar);
    }
}
