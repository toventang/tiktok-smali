package com.bytedance.ies.xbridge.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f35917a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static long f35918b = 300000;

    /* renamed from: c  reason: collision with root package name */
    private static final h f35919c = i.a((h.f.a.a) a.f35922a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f35920d = i.a((h.f.a.a) C0822b.f35923a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f35921e = i.a((h.f.a.a) c.f35924a);

    public static ConcurrentHashMap<String, CopyOnWriteArrayList<e>> a() {
        return (ConcurrentHashMap) f35920d.getValue();
    }

    private static CopyOnWriteArrayList<a> b() {
        return (CopyOnWriteArrayList) f35919c.getValue();
    }

    private static ConcurrentHashMap<d, ConcurrentHashMap<String, e>> c() {
        return (ConcurrentHashMap) f35921e.getValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<CopyOnWriteArrayList<a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35922a = new a();

        static {
            Covode.recordClassIndex(21471);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyOnWriteArrayList<a> invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.e.b$b  reason: collision with other inner class name */
    static final class C0822b extends m implements h.f.a.a<ConcurrentHashMap<String, CopyOnWriteArrayList<e>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0822b f35923a = new C0822b();

        static {
            Covode.recordClassIndex(21472);
        }

        C0822b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConcurrentHashMap<String, CopyOnWriteArrayList<e>> invoke() {
            return new ConcurrentHashMap();
        }
    }

    static final class c extends m implements h.f.a.a<ConcurrentHashMap<d, ConcurrentHashMap<String, e>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f35924a = new c();

        static {
            Covode.recordClassIndex(21473);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConcurrentHashMap<d, ConcurrentHashMap<String, e>> invoke() {
            return new ConcurrentHashMap();
        }
    }

    static {
        Covode.recordClassIndex(21470);
    }

    public static final class d implements b.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f35925a;

        static {
            Covode.recordClassIndex(21474);
        }

        d(d dVar) {
            this.f35925a = dVar;
        }

        @Override // com.bytedance.ies.xbridge.b.d
        public final void a(String str, n nVar) {
            l.c(str, "");
            this.f35925a.a(new c(str, nVar));
        }
    }

    public static final void a(a aVar) {
        if (aVar.f35902b != null) {
            long currentTimeMillis = System.currentTimeMillis();
            ConcurrentSkipListSet<Object> concurrentSkipListSet = new ConcurrentSkipListSet();
            Iterator<a> it = b().iterator();
            l.a((Object) it, "");
            while (it.hasNext()) {
                a next = it.next();
                if (Math.abs(currentTimeMillis - next.f35903c) > f35918b) {
                    concurrentSkipListSet.add(next);
                }
            }
            for (Object obj : concurrentSkipListSet) {
                b().remove(obj);
            }
            b().add(aVar);
            CopyOnWriteArrayList<e> copyOnWriteArrayList = a().get(aVar.f35902b);
            if (copyOnWriteArrayList != null) {
                Iterator<T> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    b.d dVar = it2.next().f35941c;
                    if (dVar != null) {
                        dVar.a(aVar.f35902b, aVar.f35904d);
                    }
                }
            }
        }
    }

    public static final void a(String str, d dVar) {
        l.c(str, "");
        l.c(dVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        String uuid = UUID.randomUUID().toString();
        l.a((Object) uuid, "");
        a(str, dVar, currentTimeMillis, uuid);
    }

    public static final void b(e eVar, String str) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        if (eVar != null && str != null && (copyOnWriteArrayList = a().get(str)) != null) {
            copyOnWriteArrayList.remove(eVar);
        }
    }

    public static final void b(String str, d dVar) {
        l.c(str, "");
        l.c(dVar, "");
        ConcurrentHashMap<String, e> concurrentHashMap = c().get(dVar);
        if (concurrentHashMap != null) {
            e eVar = concurrentHashMap.get(str);
            if (eVar != null) {
                b(eVar, str);
                concurrentHashMap.remove(str);
            }
            if (concurrentHashMap.isEmpty()) {
                c().remove(dVar);
            }
        }
    }

    public static final void a(e eVar, String str) {
        b.d dVar;
        if (str != null) {
            CopyOnWriteArrayList<e> copyOnWriteArrayList = a().get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                a().put(str, copyOnWriteArrayList);
            } else if (copyOnWriteArrayList.contains(eVar)) {
                return;
            }
            copyOnWriteArrayList.add(eVar);
            a().put(str, copyOnWriteArrayList);
            for (T t : b()) {
                if (l.a((Object) t.f35902b, (Object) str) && eVar.f35940b <= t.f35903c && (dVar = eVar.f35941c) != null) {
                    dVar.a(str, t.f35904d);
                }
            }
        }
    }

    public static final void a(String str, d dVar, String str2) {
        l.c(str, "");
        l.c(dVar, "");
        l.c(str2, "");
        a(str, dVar, System.currentTimeMillis(), str2);
    }

    private static void a(String str, d dVar, long j2, String str2) {
        l.c(str, "");
        l.c(dVar, "");
        l.c(str2, "");
        e eVar = new e(str2, j2, new d(dVar), null);
        if (c().get(dVar) == null) {
            c().put(dVar, new ConcurrentHashMap<>());
        }
        ConcurrentHashMap<String, e> concurrentHashMap = c().get(dVar);
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, eVar);
        }
        a(eVar, str);
    }
}
