package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.d.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* access modifiers changed from: package-private */
public final class cn implements bj {

    /* renamed from: a  reason: collision with root package name */
    final aw f50170a;

    /* renamed from: b  reason: collision with root package name */
    final aw f50171b;

    /* renamed from: c  reason: collision with root package name */
    Bundle f50172c;

    /* renamed from: d  reason: collision with root package name */
    ConnectionResult f50173d = null;

    /* renamed from: e  reason: collision with root package name */
    ConnectionResult f50174e = null;

    /* renamed from: f  reason: collision with root package name */
    boolean f50175f = false;

    /* renamed from: g  reason: collision with root package name */
    final Lock f50176g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f50177h;

    /* renamed from: i  reason: collision with root package name */
    private final aq f50178i;

    /* renamed from: j  reason: collision with root package name */
    private final Looper f50179j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<a.c<?>, aw> f50180k;

    /* renamed from: l  reason: collision with root package name */
    private final Set<p> f50181l = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: m  reason: collision with root package name */
    private final a.f f50182m;
    private int n = 0;

    static {
        Covode.recordClassIndex(31286);
    }

    private final boolean h() {
        ConnectionResult connectionResult = this.f50174e;
        if (connectionResult == null || connectionResult.f49942b != 4) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final void f() {
        this.f50170a.f();
        this.f50171b.f();
    }

    private boolean c() {
        boolean z;
        this.f50176g.lock();
        try {
            if (this.n == 2) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.f50176g.unlock();
        }
    }

    private final void g() {
        for (p pVar : this.f50181l) {
            pVar.f();
        }
        this.f50181l.clear();
    }

    private final PendingIntent i() {
        if (this.f50182m == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f50177h, System.identityHashCode(this.f50178i), this.f50182m.d(), 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final void a() {
        this.n = 2;
        this.f50175f = false;
        this.f50174e = null;
        this.f50173d = null;
        this.f50170a.a();
        this.f50171b.a();
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final void b() {
        this.f50174e = null;
        this.f50173d = null;
        this.n = 0;
        this.f50170a.b();
        this.f50171b.b();
        g();
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final boolean d() {
        this.f50176g.lock();
        try {
            boolean z = true;
            if (this.f50170a.d()) {
                if (!this.f50171b.d() && !h()) {
                    if (this.n == 1) {
                    }
                }
                return z;
            }
            z = false;
            return z;
        } finally {
            this.f50176g.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final void e() {
        this.f50176g.lock();
        try {
            boolean c2 = c();
            this.f50171b.b();
            this.f50174e = new ConnectionResult(4);
            if (c2) {
                new g(this.f50179j).post(new cq(this));
            } else {
                g();
            }
        } finally {
            this.f50176g.unlock();
        }
    }

    private static boolean b(ConnectionResult connectionResult) {
        if (connectionResult == null || !connectionResult.b()) {
            return false;
        }
        return true;
    }

    private final void a(ConnectionResult connectionResult) {
        int i2 = this.n;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.n = 0;
            }
            this.f50178i.a(connectionResult);
        }
        g();
        this.n = 0;
    }

    private final boolean c(d.a<? extends p, ? extends a.b> aVar) {
        a.c<A> cVar = aVar.f50220a;
        r.b(this.f50180k.containsKey(cVar), "GoogleApiClient is not configured to use the API required for this call.");
        return this.f50180k.get(cVar).equals(this.f50171b);
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final <A extends a.b, T extends d.a<? extends p, A>> T b(T t) {
        if (!c(t)) {
            return (T) this.f50170a.b(t);
        }
        if (!h()) {
            return (T) this.f50171b.b(t);
        }
        t.b(new Status(4, null, i()));
        return t;
    }

    static /* synthetic */ void a(cn cnVar) {
        if (b(cnVar.f50173d)) {
            if (b(cnVar.f50174e) || cnVar.h()) {
                int i2 = cnVar.n;
                if (i2 != 1) {
                    if (i2 != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        cnVar.n = 0;
                        return;
                    }
                    cnVar.f50178i.a(cnVar.f50172c);
                }
                cnVar.g();
                cnVar.n = 0;
                return;
            }
            ConnectionResult connectionResult = cnVar.f50174e;
            if (connectionResult == null) {
                return;
            }
            if (cnVar.n == 1) {
                cnVar.g();
                return;
            }
            cnVar.a(connectionResult);
            cnVar.f50170a.b();
        } else if (cnVar.f50173d == null || !b(cnVar.f50174e)) {
            ConnectionResult connectionResult2 = cnVar.f50173d;
            if (connectionResult2 != null && cnVar.f50174e != null) {
                if (cnVar.f50171b.f50079l < cnVar.f50170a.f50079l) {
                    connectionResult2 = cnVar.f50174e;
                }
                cnVar.a(connectionResult2);
            }
        } else {
            cnVar.f50171b.b();
            cnVar.a(cnVar.f50173d);
        }
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final <A extends a.b, R extends p, T extends d.a<R, A>> T a(T t) {
        if (!c(t)) {
            return (T) this.f50170a.a(t);
        }
        if (!h()) {
            return (T) this.f50171b.a(t);
        }
        t.b(new Status(4, null, i()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final boolean a(p pVar) {
        this.f50176g.lock();
        try {
            if ((c() || d()) && !this.f50171b.d()) {
                this.f50181l.add(pVar);
                if (this.n == 0) {
                    this.n = 1;
                }
                this.f50174e = null;
                this.f50171b.a();
                return true;
            }
            this.f50176g.unlock();
            return false;
        } finally {
            this.f50176g.unlock();
        }
    }

    static /* synthetic */ void a(cn cnVar, int i2, boolean z) {
        cnVar.f50178i.a(i2, z);
        cnVar.f50174e = null;
        cnVar.f50173d = null;
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f50171b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f50170a.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public static cn a(Context context, aq aqVar, Lock lock, Looper looper, c cVar, Map<a.c<?>, a.f> map, com.google.android.gms.common.internal.d dVar, Map<a<?>, Boolean> map2, a.AbstractC1206a<? extends com.google.android.gms.signin.d, com.google.android.gms.signin.a> aVar, ArrayList<cm> arrayList) {
        androidx.c.a aVar2 = new androidx.c.a();
        androidx.c.a aVar3 = new androidx.c.a();
        a.f fVar = null;
        for (Map.Entry<a.c<?>, a.f> entry : map.entrySet()) {
            a.f value = entry.getValue();
            if (value.c()) {
                fVar = value;
            }
            if (value.i()) {
                aVar2.put(entry.getKey(), value);
            } else {
                aVar3.put(entry.getKey(), value);
            }
        }
        r.a(!aVar2.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        androidx.c.a aVar4 = new androidx.c.a();
        androidx.c.a aVar5 = new androidx.c.a();
        for (a<?> aVar6 : map2.keySet()) {
            a.c<?> b2 = aVar6.b();
            if (aVar2.containsKey(b2)) {
                aVar4.put(aVar6, map2.get(aVar6));
            } else if (aVar3.containsKey(b2)) {
                aVar5.put(aVar6, map2.get(aVar6));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            cm cmVar = arrayList.get(i2);
            i2++;
            cm cmVar2 = cmVar;
            if (aVar4.containsKey(cmVar2.f50167a)) {
                arrayList2.add(cmVar2);
            } else if (aVar5.containsKey(cmVar2.f50167a)) {
                arrayList3.add(cmVar2);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new cn(context, aqVar, lock, looper, cVar, aVar2, aVar3, dVar, aVar, fVar, arrayList2, arrayList3, aVar4, aVar5);
    }

    private cn(Context context, aq aqVar, Lock lock, Looper looper, c cVar, Map<a.c<?>, a.f> map, Map<a.c<?>, a.f> map2, com.google.android.gms.common.internal.d dVar, a.AbstractC1206a<? extends com.google.android.gms.signin.d, com.google.android.gms.signin.a> aVar, a.f fVar, ArrayList<cm> arrayList, ArrayList<cm> arrayList2, Map<a<?>, Boolean> map3, Map<a<?>, Boolean> map4) {
        this.f50177h = context;
        this.f50178i = aqVar;
        this.f50176g = lock;
        this.f50179j = looper;
        this.f50182m = fVar;
        this.f50170a = new aw(context, aqVar, lock, looper, cVar, map2, null, map4, null, arrayList2, new cp(this, (byte) 0));
        this.f50171b = new aw(context, aqVar, lock, looper, cVar, map, dVar, map3, aVar, arrayList, new cr(this, (byte) 0));
        androidx.c.a aVar2 = new androidx.c.a();
        for (a.c<?> cVar2 : map2.keySet()) {
            aVar2.put(cVar2, this.f50170a);
        }
        for (a.c<?> cVar3 : map.keySet()) {
            aVar2.put(cVar3, this.f50171b);
        }
        this.f50180k = Collections.unmodifiableMap(aVar2);
    }
}
