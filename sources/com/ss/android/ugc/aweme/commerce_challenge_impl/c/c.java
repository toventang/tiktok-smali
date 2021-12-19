package com.ss.android.ugc.aweme.commerce_challenge_impl.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.f;
import com.google.gson.internal.g;
import com.ss.android.ugc.aweme.commerce_challenge_api.b.b;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<String, b> f73544a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final c f73545b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static ConcurrentHashMap<String, b> f73546c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private static f f73547d = new f();

    public static final class a extends com.google.gson.b.a<b> {
        static {
            Covode.recordClassIndex(45265);
        }

        a() {
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(45264);
    }

    public static final ConcurrentHashMap<String, b> a() {
        ConcurrentHashMap concurrentHashMap;
        try {
            if (f73546c.isEmpty() && (concurrentHashMap = (ConcurrentHashMap) SettingsManager.a().a("hashtag2emoji_map", ConcurrentHashMap.class)) != null) {
                for (String str : concurrentHashMap.keySet()) {
                    g gVar = (g) concurrentHashMap.get(str);
                    if (gVar != null) {
                        l.b(gVar, "");
                        b bVar = (b) f73547d.a(f73547d.b(gVar), new a().type);
                        ConcurrentHashMap<String, b> concurrentHashMap2 = f73546c;
                        l.b(str, "");
                        l.b(bVar, "");
                        concurrentHashMap2.put(str, bVar);
                    }
                }
            }
            return f73546c;
        } catch (Throwable unused) {
            return f73546c;
        }
    }
}
