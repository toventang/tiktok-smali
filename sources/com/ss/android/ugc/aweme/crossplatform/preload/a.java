package com.ss.android.ugc.aweme.crossplatform.preload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.view.c;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f78924a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, c> f78925b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static Map<String, Integer> f78926c = new LinkedHashMap();

    private a() {
    }

    static {
        Covode.recordClassIndex(48979);
    }

    public static c a(String str) {
        l.d(str, "");
        return f78925b.get(str);
    }

    public static void b(String str) {
        l.d(str, "");
        f78925b.put(str, null);
        f78926c.remove(str);
    }
}
