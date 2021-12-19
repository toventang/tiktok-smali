package com.bytedance.android.live.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.retrofit.a.a.a;
import com.bytedance.retrofit2.d.a.h;
import com.bytedance.retrofit2.q;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class e {

    /* renamed from: d  reason: collision with root package name */
    private static volatile e f12105d;

    /* renamed from: a  reason: collision with root package name */
    public final q f12106a;

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f12107b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<Class, Object> f12108c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(6628);
    }

    public static e a() {
        MethodCollector.i(9612);
        if (f12105d == null) {
            synchronized (e.class) {
                try {
                    if (f12105d == null) {
                        f12105d = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9612);
                    throw th;
                }
            }
        }
        e eVar = f12105d;
        MethodCollector.o(9612);
        return eVar;
    }

    private e() {
        q.a aVar = new q.a();
        StringBuilder sb = new StringBuilder("https://");
        h.a();
        q.a a2 = aVar.a(sb.append(h.c()).toString()).a(new o());
        h hVar = new h(true);
        l.d(hVar, "");
        this.f12106a = p.a(a2.a(new j(hVar)).a(new k()).a(new f(a.a(i.a()))).a(new ResponseInterceptor()).a(new com.bytedance.frameworks.baselib.network.http.retrofit.a()));
    }

    public final void a(d dVar) {
        if (dVar != null && !this.f12107b.contains(dVar)) {
            this.f12107b.add(dVar);
        }
    }

    public final <T> T a(Class<T> cls) {
        T t = (T) this.f12108c.get(cls);
        if (t == null) {
            ConcurrentHashMap<Class, Object> concurrentHashMap = this.f12108c;
            t = (T) this.f12106a.a(cls);
            concurrentHashMap.putIfAbsent(cls, t);
        }
        for (d dVar : this.f12107b) {
            if (dVar.a(cls)) {
                return (T) dVar.a(cls, t);
            }
        }
        return t;
    }
}
