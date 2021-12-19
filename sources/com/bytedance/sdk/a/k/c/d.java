package com.bytedance.sdk.a.k.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static Context f43392a;

    /* renamed from: b  reason: collision with root package name */
    private static Map<Class, com.bytedance.sdk.a.k.a.d> f43393b = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(26587);
    }

    public static <T extends com.bytedance.sdk.a.k.a.d> T a(Class<T> cls) {
        return (T) f43393b.get(cls);
    }

    public static <T extends com.bytedance.sdk.a.k.a.d> void a(Class<T> cls, com.bytedance.sdk.a.k.a.d dVar) {
        if (dVar != null) {
            f43393b.put(cls, dVar);
        }
    }
}
