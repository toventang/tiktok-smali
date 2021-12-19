package com.ss.videoarch.a.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    static int f154278a = -1;

    /* renamed from: b  reason: collision with root package name */
    static String f154279b;

    /* renamed from: c  reason: collision with root package name */
    private static b f154280c;

    /* renamed from: d  reason: collision with root package name */
    private ConcurrentHashMap<String, a> f154281d = new ConcurrentHashMap<>();

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f154282a;

        /* renamed from: b  reason: collision with root package name */
        public long f154283b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f154284c;

        static {
            Covode.recordClassIndex(102861);
        }

        a() {
        }
    }

    public final void b() {
        ConcurrentHashMap<String, a> concurrentHashMap = this.f154281d;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    static {
        Covode.recordClassIndex(102860);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(1914);
        if (f154280c == null) {
            synchronized (b.class) {
                try {
                    if (f154280c == null) {
                        f154280c = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1914);
                    throw th;
                }
            }
        }
        b bVar = f154280c;
        MethodCollector.o(1914);
        return bVar;
    }

    public final a a(String str) {
        ConcurrentHashMap<String, a> concurrentHashMap = this.f154281d;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    public final void b(String str) {
        ConcurrentHashMap<String, a> concurrentHashMap;
        a aVar;
        if (str != null && (concurrentHashMap = this.f154281d) != null && (aVar = concurrentHashMap.get(str)) != null) {
            aVar.f154284c = true;
        }
    }

    public final void a(String str, a aVar) {
        ConcurrentHashMap<String, a> concurrentHashMap = this.f154281d;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, aVar);
        }
    }
}
