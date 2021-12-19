package com.bytedance.android.live.t;

import com.bytedance.android.livesdk.u;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<Class<? extends com.bytedance.android.live.base.a>, com.bytedance.android.live.base.a> f12794a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(7123);
    }

    public static <T extends com.bytedance.android.live.base.a> T a(Class<T> cls) {
        ConcurrentHashMap<Class<? extends com.bytedance.android.live.base.a>, com.bytedance.android.live.base.a> concurrentHashMap = f12794a;
        com.bytedance.android.live.base.a aVar = concurrentHashMap.get(cls);
        T t = (T) aVar;
        if (t != null) {
            return t;
        }
        try {
            u.f21749b.a();
            return (T) concurrentHashMap.get(cls);
        } catch (Exception unused) {
            return t;
        }
    }

    public static <T extends com.bytedance.android.live.base.a> void a(Class<T> cls, T t) {
        if (cls != null && t != null) {
            f12794a.put(cls, t);
        }
    }
}
