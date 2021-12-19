package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.signin.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public final class ae implements at {

    /* renamed from: a  reason: collision with root package name */
    final aw f50023a;

    /* renamed from: b  reason: collision with root package name */
    final Lock f50024b;

    /* renamed from: c  reason: collision with root package name */
    final Context f50025c;

    /* renamed from: d  reason: collision with root package name */
    final c f50026d;

    /* renamed from: e  reason: collision with root package name */
    d f50027e;

    /* renamed from: f  reason: collision with root package name */
    boolean f50028f;

    /* renamed from: g  reason: collision with root package name */
    boolean f50029g;

    /* renamed from: h  reason: collision with root package name */
    l f50030h;

    /* renamed from: i  reason: collision with root package name */
    boolean f50031i;

    /* renamed from: j  reason: collision with root package name */
    boolean f50032j;

    /* renamed from: k  reason: collision with root package name */
    final com.google.android.gms.common.internal.d f50033k;

    /* renamed from: l  reason: collision with root package name */
    private ConnectionResult f50034l;

    /* renamed from: m  reason: collision with root package name */
    private int f50035m;
    private int n;
    private int o;
    private final Bundle p = new Bundle();
    private final Set<a.c> q = new HashSet();
    private boolean r;
    private final Map<a<?>, Boolean> s;
    private final a.AbstractC1206a<? extends d, com.google.android.gms.signin.a> t;
    private ArrayList<Future<?>> u = new ArrayList<>();

    static {
        Covode.recordClassIndex(31221);
    }

    private static String c(int i2) {
        return i2 != 0 ? i2 != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final void c() {
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final boolean b() {
        h();
        a(true);
        this.f50023a.a((ConnectionResult) null);
        return true;
    }

    private final void h() {
        ArrayList<Future<?>> arrayList = this.u;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Future<?> future = arrayList.get(i2);
            i2++;
            future.cancel(true);
        }
        this.u.clear();
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        int i2 = this.o - 1;
        this.o = i2;
        if (i2 > 0) {
            return false;
        }
        if (i2 < 0) {
            this.f50023a.f50080m.k();
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            b(new ConnectionResult(8, null));
            return false;
        } else if (this.f50034l == null) {
            return true;
        } else {
            this.f50023a.f50079l = this.f50035m;
            b(this.f50034l);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        this.f50028f = false;
        this.f50023a.f50080m.f50056e = Collections.emptySet();
        for (a.c<?> cVar : this.q) {
            if (!this.f50023a.f50074g.containsKey(cVar)) {
                this.f50023a.f50074g.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    private final void g() {
        Bundle bundle;
        this.f50023a.c();
        ax.f50081a.execute(new ad(this));
        d dVar = this.f50027e;
        if (dVar != null) {
            if (this.f50031i) {
                dVar.a(this.f50030h, this.f50032j);
            }
            a(false);
        }
        for (a.c<?> cVar : this.f50023a.f50074g.keySet()) {
            this.f50023a.f50073f.get(cVar).f();
        }
        if (this.p.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.p;
        }
        this.f50023a.n.a(bundle);
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (this.o == 0) {
            if (!this.f50028f || this.f50029g) {
                ArrayList arrayList = new ArrayList();
                this.n = 1;
                this.o = this.f50023a.f50073f.size();
                for (a.c<?> cVar : this.f50023a.f50073f.keySet()) {
                    if (!this.f50023a.f50074g.containsKey(cVar)) {
                        arrayList.add(this.f50023a.f50073f.get(cVar));
                    } else if (d()) {
                        g();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.u.add(ax.f50081a.submit(new ak(this, arrayList)));
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final void a() {
        this.f50023a.f50074g.clear();
        this.f50028f = false;
        this.f50034l = null;
        this.n = 0;
        this.r = true;
        this.f50029g = false;
        this.f50031i = false;
        HashMap hashMap = new HashMap();
        for (a<?> aVar : this.s.keySet()) {
            a.f fVar = this.f50023a.f50073f.get(aVar.b());
            boolean booleanValue = this.s.get(aVar).booleanValue();
            if (fVar.i()) {
                this.f50028f = true;
                if (booleanValue) {
                    this.q.add(aVar.b());
                } else {
                    this.r = false;
                }
            }
            hashMap.put(fVar, new ag(this, aVar, booleanValue));
        }
        if (this.f50028f) {
            this.f50033k.f50392k = Integer.valueOf(System.identityHashCode(this.f50023a.f50080m));
            al alVar = new al(this, (byte) 0);
            a.AbstractC1206a<? extends d, com.google.android.gms.signin.a> aVar2 = this.t;
            Context context = this.f50025c;
            Looper c2 = this.f50023a.f50080m.c();
            com.google.android.gms.common.internal.d dVar = this.f50033k;
            this.f50027e = (d) aVar2.a(context, c2, dVar, dVar.f50390i, (i.b) alVar, (i.c) alVar);
        }
        this.o = this.f50023a.f50073f.size();
        this.u.add(ax.f50081a.submit(new af(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final <A extends a.b, T extends d.a<? extends p, A>> T b(T t2) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final <A extends a.b, R extends p, T extends d.a<R, A>> T a(T t2) {
        this.f50023a.f50080m.f50054c.add(t2);
        return t2;
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final void a(int i2) {
        b(new ConnectionResult(8, null));
    }

    /* access modifiers changed from: package-private */
    public final void b(ConnectionResult connectionResult) {
        h();
        a(!connectionResult.a());
        this.f50023a.a(connectionResult);
        this.f50023a.n.a(connectionResult);
    }

    private final void a(boolean z) {
        com.google.android.gms.signin.d dVar = this.f50027e;
        if (dVar != null) {
            if (dVar.g() && z) {
                this.f50027e.u();
            }
            this.f50027e.f();
            if (this.f50033k.f50391j) {
                this.f50027e = null;
            }
            this.f50030h = null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final void a(Bundle bundle) {
        if (b(1)) {
            if (bundle != null) {
                this.p.putAll(bundle);
            }
            if (d()) {
                g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(int i2) {
        if (this.n == i2) {
            return true;
        }
        this.f50023a.f50080m.k();
        String.valueOf(String.valueOf(this)).length();
        String c2 = c(this.n);
        String c3 = c(i2);
        String.valueOf(c2).length();
        String.valueOf(c3).length();
        new Exception();
        b(new ConnectionResult(8, null));
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(ConnectionResult connectionResult) {
        if (!this.r || connectionResult.a()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void b(ConnectionResult connectionResult, a<?> aVar, boolean z) {
        if ((!z || connectionResult.a() || this.f50026d.getErrorResolutionIntent(connectionResult.f49942b) != null) && (this.f50034l == null || Integer.MAX_VALUE < this.f50035m)) {
            this.f50034l = connectionResult;
            this.f50035m = Integer.MAX_VALUE;
        }
        this.f50023a.f50074g.put(aVar.b(), connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final void a(ConnectionResult connectionResult, a<?> aVar, boolean z) {
        if (b(1)) {
            b(connectionResult, aVar, z);
            if (d()) {
                g();
            }
        }
    }

    public ae(aw awVar, com.google.android.gms.common.internal.d dVar, Map<a<?>, Boolean> map, c cVar, a.AbstractC1206a<? extends com.google.android.gms.signin.d, com.google.android.gms.signin.a> aVar, Lock lock, Context context) {
        this.f50023a = awVar;
        this.f50033k = dVar;
        this.s = map;
        this.f50026d = cVar;
        this.t = aVar;
        this.f50024b = lock;
        this.f50025c = context;
    }
}
