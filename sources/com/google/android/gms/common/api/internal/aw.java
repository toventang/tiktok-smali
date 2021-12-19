package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class aw implements bj, co {

    /* renamed from: a  reason: collision with root package name */
    final Lock f50068a;

    /* renamed from: b  reason: collision with root package name */
    final Condition f50069b;

    /* renamed from: c  reason: collision with root package name */
    final Context f50070c;

    /* renamed from: d  reason: collision with root package name */
    final c f50071d;

    /* renamed from: e  reason: collision with root package name */
    final ay f50072e;

    /* renamed from: f  reason: collision with root package name */
    final Map<a.c<?>, a.f> f50073f;

    /* renamed from: g  reason: collision with root package name */
    final Map<a.c<?>, ConnectionResult> f50074g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    final d f50075h;

    /* renamed from: i  reason: collision with root package name */
    final Map<a<?>, Boolean> f50076i;

    /* renamed from: j  reason: collision with root package name */
    final a.AbstractC1206a<? extends com.google.android.gms.signin.d, com.google.android.gms.signin.a> f50077j;

    /* renamed from: k  reason: collision with root package name */
    volatile at f50078k;

    /* renamed from: l  reason: collision with root package name */
    int f50079l;

    /* renamed from: m  reason: collision with root package name */
    final aq f50080m;
    final bk n;
    private ConnectionResult o = null;

    static {
        Covode.recordClassIndex(31239);
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final boolean a(p pVar) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final void e() {
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final void a() {
        this.f50078k.c();
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final boolean d() {
        return this.f50078k instanceof z;
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final void b() {
        if (this.f50078k.b()) {
            this.f50074g.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final void f() {
        if (d()) {
            z zVar = (z) this.f50078k;
            if (zVar.f50286b) {
                zVar.f50286b = false;
                zVar.f50285a.f50080m.f50058g.a();
                zVar.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f50068a.lock();
        try {
            this.f50080m.i();
            this.f50078k = new z(this);
            this.f50078k.a();
            this.f50069b.signalAll();
        } finally {
            this.f50068a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final <A extends a.b, R extends p, T extends d.a<R, A>> T a(T t) {
        t.e();
        return (T) this.f50078k.a(t);
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final <A extends a.b, T extends d.a<? extends p, A>> T b(T t) {
        t.e();
        return (T) this.f50078k.b(t);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void a(Bundle bundle) {
        this.f50068a.lock();
        try {
            this.f50078k.a(bundle);
        } finally {
            this.f50068a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ConnectionResult connectionResult) {
        this.f50068a.lock();
        try {
            this.o = connectionResult;
            this.f50078k = new an(this);
            this.f50078k.a();
            this.f50069b.signalAll();
        } finally {
            this.f50068a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void b(int i2) {
        this.f50068a.lock();
        try {
            this.f50078k.a(i2);
        } finally {
            this.f50068a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(av avVar) {
        this.f50072e.sendMessage(this.f50072e.obtainMessage(1, avVar));
    }

    @Override // com.google.android.gms.common.api.internal.co
    public final void a(ConnectionResult connectionResult, a<?> aVar, boolean z) {
        this.f50068a.lock();
        try {
            this.f50078k.a(connectionResult, aVar, z);
        } finally {
            this.f50068a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.bj
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f50078k);
        for (a<?> aVar : this.f50076i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) aVar.f49972b).println(":");
            this.f50073f.get(aVar.b()).a(concat, printWriter);
        }
    }

    public aw(Context context, aq aqVar, Lock lock, Looper looper, c cVar, Map<a.c<?>, a.f> map, com.google.android.gms.common.internal.d dVar, Map<a<?>, Boolean> map2, a.AbstractC1206a<? extends com.google.android.gms.signin.d, com.google.android.gms.signin.a> aVar, ArrayList<cm> arrayList, bk bkVar) {
        this.f50070c = context;
        this.f50068a = lock;
        this.f50071d = cVar;
        this.f50073f = map;
        this.f50075h = dVar;
        this.f50076i = map2;
        this.f50077j = aVar;
        this.f50080m = aqVar;
        this.n = bkVar;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            cm cmVar = arrayList.get(i2);
            i2++;
            cmVar.f50168b = this;
        }
        this.f50072e = new ay(this, looper);
        this.f50069b = lock.newCondition();
        this.f50078k = new an(this);
    }
}
