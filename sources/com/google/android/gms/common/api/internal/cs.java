package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class cs implements bj {

    /* renamed from: a  reason: collision with root package name */
    final Map<a.c<?>, ct<?>> f50186a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final Map<a.c<?>, ct<?>> f50187b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final aq f50188c;

    /* renamed from: d  reason: collision with root package name */
    final Lock f50189d;

    /* renamed from: e  reason: collision with root package name */
    final Condition f50190e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f50191f;

    /* renamed from: g  reason: collision with root package name */
    boolean f50192g;

    /* renamed from: h  reason: collision with root package name */
    Map<b<?>, ConnectionResult> f50193h;

    /* renamed from: i  reason: collision with root package name */
    Map<b<?>, ConnectionResult> f50194i;

    /* renamed from: j  reason: collision with root package name */
    ConnectionResult f50195j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<a<?>, Boolean> f50196k;

    /* renamed from: l  reason: collision with root package name */
    private final f f50197l;

    /* renamed from: m  reason: collision with root package name */
    private final Looper f50198m;
    private final c n;
    private final d o;
    private final boolean p;
    private final Queue<d.a<?, ?>> q = new LinkedList();
    private u r;

    static {
        Covode.recordClassIndex(31291);
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final void f() {
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final boolean d() {
        boolean z;
        this.f50189d.lock();
        try {
            if (this.f50193h == null || this.f50195j != null) {
                z = false;
            } else {
                z = true;
            }
            return z;
        } finally {
            this.f50189d.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        while (!this.q.isEmpty()) {
            b(this.q.remove());
        }
        this.f50188c.a((Bundle) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[Catch:{ all -> 0x0044 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean i() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f50189d
            r0.lock()
            boolean r0 = r3.f50192g     // Catch:{ all -> 0x0044 }
            r2 = 0
            if (r0 == 0) goto L_0x003e
            boolean r0 = r3.p     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x000f
            goto L_0x003e
        L_0x000f:
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.internal.ct<?>> r0 = r3.f50187b     // Catch:{ all -> 0x0044 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0044 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0044 }
        L_0x0019:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.common.api.a$c r0 = (com.google.android.gms.common.api.a.c) r0     // Catch:{ all -> 0x0044 }
            com.google.android.gms.common.ConnectionResult r0 = r3.a(r0)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0031
            boolean r0 = r0.b()     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0019
        L_0x0031:
            java.util.concurrent.locks.Lock r0 = r3.f50189d
            r0.unlock()
            return r2
        L_0x0037:
            java.util.concurrent.locks.Lock r0 = r3.f50189d
            r0.unlock()
            r0 = 1
            return r0
        L_0x003e:
            java.util.concurrent.locks.Lock r0 = r3.f50189d
            r0.unlock()
            return r2
        L_0x0044:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = r3.f50189d
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.cs.i():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final void b() {
        this.f50189d.lock();
        try {
            this.f50192g = false;
            this.f50193h = null;
            this.f50194i = null;
            u uVar = this.r;
            if (uVar != null) {
                uVar.a();
                this.r = null;
            }
            this.f50195j = null;
            while (!this.q.isEmpty()) {
                d.a<?, ?> remove = this.q.remove();
                remove.a((ca) null);
                remove.a();
            }
            this.f50190e.signalAll();
        } finally {
            this.f50189d.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (this.o == null) {
            this.f50188c.f50056e = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.o.f50383b);
        Map<a<?>, d.b> map = this.o.f50385d;
        for (a<?> aVar : map.keySet()) {
            ConnectionResult a2 = a(aVar.b());
            if (a2 != null && a2.b()) {
                hashSet.addAll(map.get(aVar).f50402a);
            }
        }
        this.f50188c.f50056e = hashSet;
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final void e() {
        this.f50189d.lock();
        try {
            f fVar = this.f50197l;
            fVar.f50232k.incrementAndGet();
            fVar.o.sendMessage(fVar.o.obtainMessage(10));
            u uVar = this.r;
            if (uVar != null) {
                uVar.a();
                this.r = null;
            }
            if (this.f50194i == null) {
                this.f50194i = new androidx.c.a(this.f50187b.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            for (ct<?> ctVar : this.f50187b.values()) {
                this.f50194i.put(ctVar.f49979d, connectionResult);
            }
            Map<b<?>, ConnectionResult> map = this.f50193h;
            if (map != null) {
                map.putAll(this.f50194i);
            }
        } finally {
            this.f50189d.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final ConnectionResult h() {
        char c2 = 0;
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        char c3 = 0;
        for (ct<?> ctVar : this.f50186a.values()) {
            a<O> aVar = ctVar.f49977b;
            ConnectionResult connectionResult3 = this.f50193h.get(ctVar.f49979d);
            if (!connectionResult3.b() && (!this.f50196k.get(aVar).booleanValue() || connectionResult3.a() || this.n.isUserResolvableError(connectionResult3.f49942b))) {
                if (connectionResult3.f49942b != 4 || !this.p) {
                    if (connectionResult == null || c2 > 65535) {
                        connectionResult = connectionResult3;
                        c2 = 65535;
                    }
                } else if (connectionResult2 == null || c3 > 65535) {
                    connectionResult2 = connectionResult3;
                    c3 = 65535;
                }
            }
        }
        if (connectionResult == null || connectionResult2 == null || c2 <= c3) {
            return connectionResult;
        }
        return connectionResult2;
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final void a() {
        this.f50189d.lock();
        try {
            if (!this.f50192g) {
                this.f50192g = true;
                this.f50193h = null;
                this.f50194i = null;
                this.r = null;
                this.f50195j = null;
                this.f50197l.c();
                this.f50197l.a(this.f50186a.values()).a(new com.google.android.gms.common.util.a.a(this.f50198m), new cu(this, (byte) 0));
                this.f50189d.unlock();
            }
        } finally {
            this.f50189d.unlock();
        }
    }

    private final ConnectionResult a(a.c<?> cVar) {
        this.f50189d.lock();
        try {
            ct<?> ctVar = this.f50186a.get(cVar);
            Map<b<?>, ConnectionResult> map = this.f50193h;
            if (map != null && ctVar != null) {
                return map.get(ctVar.f49979d);
            }
            this.f50189d.unlock();
            return null;
        } finally {
            this.f50189d.unlock();
        }
    }

    private final <T extends d.a<? extends p, ? extends a.b>> boolean c(T t) {
        a.c<A> cVar = t.f50220a;
        ConnectionResult a2 = a((a.c<?>) cVar);
        if (a2 == null || a2.f49942b != 4) {
            return false;
        }
        t.b(new Status(4, null, this.f50197l.a((b<?>) this.f50186a.get(cVar).f49979d, System.identityHashCode(this.f50188c))));
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final <A extends a.b, T extends d.a<? extends p, A>> T b(T t) {
        a.c<A> cVar = t.f50220a;
        if (this.p && c(t)) {
            return t;
        }
        this.f50188c.f50058g.a(t);
        return (T) this.f50186a.get(cVar).b(t);
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final <A extends a.b, R extends p, T extends d.a<R, A>> T a(T t) {
        if (this.p && c(t)) {
            return t;
        }
        if (!d()) {
            this.q.add(t);
            return t;
        }
        this.f50188c.f50058g.a(t);
        return (T) this.f50186a.get(t.f50220a).a(t);
    }

    /* JADX INFO: finally extract failed */
    @Override // com.google.android.gms.common.api.internal.bj
    public final boolean a(p pVar) {
        this.f50189d.lock();
        try {
            if (!this.f50192g || i()) {
                this.f50189d.unlock();
                return false;
            }
            this.f50197l.c();
            this.r = new u(this, pVar);
            this.f50197l.a(this.f50187b.values()).a(new com.google.android.gms.common.util.a.a(this.f50198m), this.r);
            this.f50189d.unlock();
            return true;
        } catch (Throwable th) {
            this.f50189d.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(ct<?> ctVar, ConnectionResult connectionResult) {
        if (connectionResult.b() || connectionResult.a() || !this.f50196k.get(ctVar.f49977b).booleanValue() || !this.n.isUserResolvableError(connectionResult.f49942b)) {
            return false;
        }
        return true;
    }

    public cs(Context context, Lock lock, Looper looper, c cVar, Map<a.c<?>, a.f> map, com.google.android.gms.common.internal.d dVar, Map<a<?>, Boolean> map2, a.AbstractC1206a<? extends com.google.android.gms.signin.d, com.google.android.gms.signin.a> aVar, ArrayList<cm> arrayList, aq aqVar, boolean z) {
        this.f50189d = lock;
        this.f50198m = looper;
        this.f50190e = lock.newCondition();
        this.n = cVar;
        this.f50188c = aqVar;
        this.f50196k = map2;
        this.o = dVar;
        this.p = z;
        HashMap hashMap = new HashMap();
        for (a<?> aVar2 : map2.keySet()) {
            hashMap.put(aVar2.b(), aVar2);
        }
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            cm cmVar = arrayList.get(i2);
            i2++;
            cm cmVar2 = cmVar;
            hashMap2.put(cmVar2.f50167a, cmVar2);
        }
        for (Map.Entry<a.c<?>, a.f> entry : map.entrySet()) {
            a aVar3 = (a) hashMap.get(entry.getKey());
            a.f value = entry.getValue();
            this.f50196k.get(aVar3).booleanValue();
            ct<?> ctVar = new ct<>(context, aVar3, looper, value, (cm) hashMap2.get(aVar3), dVar, aVar);
            this.f50186a.put(entry.getKey(), ctVar);
            if (value.i()) {
                this.f50187b.put(entry.getKey(), ctVar);
            }
        }
        this.f50191f = false;
        this.f50197l = f.a();
    }
}
