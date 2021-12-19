package com.bytedance.bdlocation.traceroute.c;

import com.bytedance.bdlocation.traceroute.a;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f26360a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, Object> f26361b;

    public static void a() {
        c();
    }

    public static void b() {
        c();
    }

    public static void d() {
        e();
    }

    public static void f() {
        h();
    }

    public static void g() {
        h();
    }

    public static void c() {
        for (Map.Entry<Class<?>, Object> entry : f26361b.entrySet()) {
            entry.getValue();
        }
    }

    public static void e() {
        for (Map.Entry<Class<?>, Object> entry : f26361b.entrySet()) {
            entry.getValue();
        }
    }

    public static void h() {
        for (Map.Entry<Class<?>, Object> entry : f26361b.entrySet()) {
            entry.getValue();
        }
    }

    static {
        Covode.recordClassIndex(15495);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f26361b = concurrentHashMap;
        a aVar = new a();
        f26360a = aVar;
        aVar.f26359a = a.f26350b;
        if (!concurrentHashMap.containsKey(aVar.getClass())) {
            concurrentHashMap.put(aVar.getClass(), aVar);
        }
    }
}
