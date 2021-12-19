package com.bytedance.frameworks.baselib.network.http.d.a.a;

import android.content.Context;
import android.os.Handler;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.d.a.a.a;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class d {

    /* renamed from: k  reason: collision with root package name */
    private static final String f29118k = d.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    com.bytedance.frameworks.baselib.network.http.g.d<String, a> f29119a = new com.bytedance.frameworks.baselib.network.http.g.d<>(100);

    /* renamed from: b  reason: collision with root package name */
    ConcurrentMap<String, a> f29120b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    ConcurrentMap<String, Future<Void>> f29121c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    ConcurrentMap<String, Future<Void>> f29122d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    ConcurrentMap<String, ConcurrentSkipListSet<c>> f29123e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    ConcurrentMap<String, ConcurrentSkipListSet<c>> f29124f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    ConcurrentSkipListSet<String> f29125g = new ConcurrentSkipListSet<>();

    /* renamed from: h  reason: collision with root package name */
    public AtomicInteger f29126h = new AtomicInteger(0);

    /* renamed from: i  reason: collision with root package name */
    public AtomicInteger f29127i = new AtomicInteger(0);

    /* renamed from: j  reason: collision with root package name */
    final Handler f29128j;

    /* renamed from: l  reason: collision with root package name */
    private l.a f29129l = l.a.NONE;

    /* renamed from: m  reason: collision with root package name */
    private final long f29130m = 180000;
    private final int n = 10;

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f29126h.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f29127i.set(0);
    }

    static {
        Covode.recordClassIndex(17049);
    }

    public final boolean d(String str) {
        return this.f29121c.containsKey(str);
    }

    public final void e(String str) {
        this.f29121c.remove(str);
    }

    public final boolean g(String str) {
        return this.f29122d.containsKey(str);
    }

    public final a b(String str) {
        a a2;
        MethodCollector.i(1603);
        synchronized (this.f29119a.c()) {
            try {
                a2 = this.f29119a.a(str);
            } finally {
                MethodCollector.o(1603);
            }
        }
        return a2;
    }

    public final a c(String str) {
        if (this.f29120b.containsKey(str)) {
            return this.f29120b.get(str);
        }
        return null;
    }

    public final Future<Void> f(String str) {
        if (this.f29121c.containsKey(str)) {
            return this.f29121c.get(str);
        }
        return null;
    }

    public final Future<Void> h(String str) {
        if (this.f29122d.containsKey(str)) {
            return this.f29122d.get(str);
        }
        return null;
    }

    public final void a(String str) {
        MethodCollector.i(1600);
        a b2 = b(str);
        if (b2 != null) {
            if (e.a().f29134b.get()) {
                b2.a();
            } else {
                b2.b();
            }
            synchronized (this.f29119a.c()) {
                try {
                    this.f29119a.b(str);
                } finally {
                    MethodCollector.o(1600);
                }
            }
            return;
        }
        MethodCollector.o(1600);
    }

    public final void b(c cVar) {
        String host = cVar.getHost();
        if (this.f29123e.containsKey(host)) {
            this.f29123e.get(host).remove(cVar);
            if (this.f29123e.get(host).isEmpty()) {
                this.f29123e.remove(host);
            }
        }
    }

    public final void c(c cVar) {
        String host = cVar.getHost();
        if (this.f29124f.containsKey(host)) {
            this.f29124f.get(host).remove(cVar);
            if (this.f29124f.get(host).isEmpty()) {
                this.f29124f.remove(host);
            }
        }
    }

    public d(Handler handler) {
        this.f29128j = handler;
    }

    public final void a(Context context) {
        MethodCollector.i(1599);
        if (j.f107224c == l.a.UNKNOWN || !j.b() || j.c()) {
            j.f107224c = l.d(context);
        }
        l.a aVar = j.f107224c;
        if (aVar != this.f29129l) {
            synchronized (this.f29119a.c()) {
                try {
                    for (Map.Entry<String, a> entry : this.f29119a.c().entrySet()) {
                        if (entry != null) {
                            if (e.a().f29134b.get()) {
                                entry.getValue().a();
                            } else {
                                entry.getValue().b();
                            }
                        }
                    }
                    this.f29119a.a();
                } catch (Throwable th) {
                    MethodCollector.o(1599);
                    throw th;
                }
            }
            for (Map.Entry<String, a> entry2 : this.f29120b.entrySet()) {
                if (entry2 != null) {
                    entry2.getValue().c();
                }
            }
            this.f29120b.clear();
            if (aVar != l.a.NONE) {
                e.a().a(a.EnumC0624a.CACHE_STALE_NETCHANGED);
                e.a();
                e.b();
            }
        }
        this.f29129l = aVar;
        MethodCollector.o(1599);
    }

    public final boolean a(c cVar) {
        if (!this.f29123e.containsKey(cVar.getHost()) || !this.f29123e.get(cVar.getHost()).contains(cVar)) {
            return false;
        }
        return true;
    }

    public final synchronized void a(String str, c cVar) {
        MethodCollector.i(1612);
        if (this.f29123e.containsKey(str)) {
            this.f29123e.get(str).add(cVar);
            MethodCollector.o(1612);
            return;
        }
        ConcurrentSkipListSet<c> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        concurrentSkipListSet.add(cVar);
        this.f29123e.put(str, concurrentSkipListSet);
        MethodCollector.o(1612);
    }
}
