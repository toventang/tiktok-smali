package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.signin.c;
import com.google.android.gms.signin.internal.d;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

public final class br extends d implements i.b, i.c {

    /* renamed from: d  reason: collision with root package name */
    private static a.AbstractC1206a<? extends com.google.android.gms.signin.d, com.google.android.gms.signin.a> f50107d = c.f52109a;

    /* renamed from: a  reason: collision with root package name */
    Set<Scope> f50108a;

    /* renamed from: b  reason: collision with root package name */
    public com.google.android.gms.signin.d f50109b;

    /* renamed from: c  reason: collision with root package name */
    bs f50110c;

    /* renamed from: e  reason: collision with root package name */
    private final Context f50111e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f50112f;

    /* renamed from: g  reason: collision with root package name */
    private final a.AbstractC1206a<? extends com.google.android.gms.signin.d, com.google.android.gms.signin.a> f50113g;

    /* renamed from: h  reason: collision with root package name */
    private com.google.android.gms.common.internal.d f50114h;

    public final void a() {
        com.google.android.gms.signin.d dVar = this.f50109b;
        if (dVar != null) {
            dVar.f();
        }
    }

    static {
        Covode.recordClassIndex(31261);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void b(int i2) {
        this.f50109b.f();
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void a(Bundle bundle) {
        this.f50109b.a(this);
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(ConnectionResult connectionResult) {
        this.f50110c.b(connectionResult);
    }

    @Override // com.google.android.gms.signin.internal.d, com.google.android.gms.signin.internal.c
    public final void a(zak zak) {
        this.f50112f.post(new bt(this, zak));
    }

    public final void a(bs bsVar) {
        com.google.android.gms.signin.d dVar = this.f50109b;
        if (dVar != null) {
            dVar.f();
        }
        this.f50114h.f50392k = Integer.valueOf(System.identityHashCode(this));
        a.AbstractC1206a<? extends com.google.android.gms.signin.d, com.google.android.gms.signin.a> aVar = this.f50113g;
        Context context = this.f50111e;
        Looper looper = this.f50112f.getLooper();
        com.google.android.gms.common.internal.d dVar2 = this.f50114h;
        this.f50109b = (com.google.android.gms.signin.d) aVar.a(context, looper, dVar2, dVar2.f50390i, (i.b) this, (i.c) this);
        this.f50110c = bsVar;
        Set<Scope> set = this.f50108a;
        if (set == null || set.isEmpty()) {
            this.f50112f.post(new bq(this));
        } else {
            this.f50109b.v();
        }
    }

    public br(Context context, Handler handler, com.google.android.gms.common.internal.d dVar) {
        this(context, handler, dVar, f50107d);
    }

    public br(Context context, Handler handler, com.google.android.gms.common.internal.d dVar, a.AbstractC1206a<? extends com.google.android.gms.signin.d, com.google.android.gms.signin.a> aVar) {
        this.f50111e = context;
        this.f50112f = handler;
        this.f50114h = (com.google.android.gms.common.internal.d) r.a(dVar, "ClientSettings must not be null");
        this.f50108a = dVar.f50383b;
        this.f50113g = aVar;
    }
}
