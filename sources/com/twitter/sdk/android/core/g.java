package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.i;
import com.twitter.sdk.android.core.internal.b.b;
import com.twitter.sdk.android.core.internal.b.d;
import com.twitter.sdk.android.core.internal.b.e;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class g<T extends i> implements j<T> {

    /* renamed from: a  reason: collision with root package name */
    private final b f155903a;

    /* renamed from: b  reason: collision with root package name */
    private final e<T> f155904b;

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<Long, T> f155905c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentHashMap<Long, d<T>> f155906d;

    /* renamed from: e  reason: collision with root package name */
    private final d<T> f155907e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<T> f155908f;

    /* renamed from: g  reason: collision with root package name */
    private final String f155909g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f155910h;

    static {
        Covode.recordClassIndex(103592);
    }

    private void d() {
        if (this.f155910h) {
            e();
        }
    }

    @Override // com.twitter.sdk.android.core.j
    public final T a() {
        d();
        return this.f155908f.get();
    }

    @Override // com.twitter.sdk.android.core.j
    public final Map<Long, T> b() {
        d();
        return Collections.unmodifiableMap(this.f155905c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.twitter.sdk.android.core.g<T extends com.twitter.sdk.android.core.i> */
    /* JADX WARN: Multi-variable type inference failed */
    private synchronized void e() {
        T a2;
        MethodCollector.i(11810);
        if (this.f155910h) {
            d<T> dVar = this.f155907e;
            T a3 = dVar.f155958b.a(dVar.f155957a.a().getString(dVar.f155959c, null));
            if (a3 != null) {
                a(a3.f155914b, a3, false);
            }
            for (Map.Entry<String, ?> entry : this.f155903a.a().getAll().entrySet()) {
                if (entry.getKey().startsWith(this.f155909g) && (a2 = this.f155904b.a((String) entry.getValue())) != null) {
                    a(a2.f155914b, a2, false);
                }
            }
            this.f155910h = false;
        }
        MethodCollector.o(11810);
    }

    @Override // com.twitter.sdk.android.core.j
    public final void c() {
        MethodCollector.i(12106);
        d();
        if (this.f155908f.get() != null && this.f155908f.get().f155914b == 0) {
            synchronized (this) {
                try {
                    this.f155908f.set(null);
                    this.f155907e.a();
                } catch (Throwable th) {
                    MethodCollector.o(12106);
                    throw th;
                }
            }
        }
        this.f155905c.remove(0L);
        d<T> remove = this.f155906d.remove(0L);
        if (remove != null) {
            remove.a();
        }
        MethodCollector.o(12106);
    }

    private String b(long j2) {
        return this.f155909g + "_" + j2;
    }

    @Override // com.twitter.sdk.android.core.j
    public final T a(long j2) {
        d();
        return this.f155905c.get(Long.valueOf(j2));
    }

    @Override // com.twitter.sdk.android.core.j
    public final void a(T t) {
        if (t != null) {
            d();
            a(t.f155914b, t, true);
            return;
        }
        throw new IllegalArgumentException("Session must not be null!");
    }

    private void a(long j2, T t, boolean z) {
        MethodCollector.i(11971);
        this.f155905c.put(Long.valueOf(j2), t);
        d<T> dVar = this.f155906d.get(Long.valueOf(j2));
        if (dVar == null) {
            dVar = new d<>(this.f155903a, this.f155904b, b(j2));
            this.f155906d.putIfAbsent(Long.valueOf(j2), dVar);
        }
        dVar.a(t);
        T t2 = this.f155908f.get();
        if (t2 == null || t2.f155914b == j2 || z) {
            synchronized (this) {
                try {
                    this.f155908f.compareAndSet(t2, t);
                    this.f155907e.a(t);
                } finally {
                    MethodCollector.o(11971);
                }
            }
            return;
        }
        MethodCollector.o(11971);
    }

    public g(b bVar, e<T> eVar, String str, String str2) {
        this(bVar, eVar, new ConcurrentHashMap(1), new ConcurrentHashMap(1), new d(bVar, eVar, str), str2);
    }

    private g(b bVar, e<T> eVar, ConcurrentHashMap<Long, T> concurrentHashMap, ConcurrentHashMap<Long, d<T>> concurrentHashMap2, d<T> dVar, String str) {
        this.f155910h = true;
        this.f155903a = bVar;
        this.f155904b = eVar;
        this.f155905c = concurrentHashMap;
        this.f155906d = concurrentHashMap2;
        this.f155907e = dVar;
        this.f155908f = new AtomicReference<>();
        this.f155909g = str;
    }
}
