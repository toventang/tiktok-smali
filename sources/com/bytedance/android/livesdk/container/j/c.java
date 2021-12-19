package com.bytedance.android.livesdk.container.j;

import android.net.Uri;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f16808a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap<Class<?>, b<?>> f16809b;

    private c() {
    }

    static {
        Covode.recordClassIndex(9326);
        ConcurrentHashMap<Class<?>, b<?>> concurrentHashMap = new ConcurrentHashMap<>();
        f16809b = concurrentHashMap;
        concurrentHashMap.put(Integer.TYPE, AnonymousClass1.f16810a);
        concurrentHashMap.put(String.class, AnonymousClass2.f16811a);
        concurrentHashMap.put(Boolean.TYPE, AnonymousClass3.f16812a);
        concurrentHashMap.put(HColor.class, AnonymousClass4.f16813a);
        concurrentHashMap.put(JSONArray.class, AnonymousClass5.f16814a);
    }

    public static Object a(Uri uri, String str, String str2, Class<?> cls) {
        l.d(uri, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(cls, "");
        b<?> bVar = f16809b.get(cls);
        if (bVar != null) {
            Object a2 = bVar.a(uri, str, str2);
            l.b(a2, "");
            return a2;
        }
        throw new IllegalStateException("unsupported type parse");
    }
}
