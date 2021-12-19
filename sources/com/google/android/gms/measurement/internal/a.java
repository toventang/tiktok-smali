package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.e;
import java.util.Map;

public final class a extends cb {

    /* renamed from: a  reason: collision with root package name */
    final Map<String, Long> f51319a = new androidx.c.a();

    /* renamed from: b  reason: collision with root package name */
    final Map<String, Integer> f51320b = new androidx.c.a();

    /* renamed from: c  reason: collision with root package name */
    long f51321c;

    static {
        Covode.recordClassIndex(32086);
    }

    @Override // com.google.android.gms.measurement.internal.cb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.cb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.cb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ a d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ gk e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ du f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ hv g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ hq h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ dx i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ iz j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ j k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ e l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ dz n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ jz o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ ex p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ eb q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ em r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ km s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ kl t() {
        return super.t();
    }

    public a(ff ffVar) {
        super(ffVar);
    }

    /* access modifiers changed from: package-private */
    public final void b(long j2) {
        for (String str : this.f51319a.keySet()) {
            this.f51319a.put(str, Long.valueOf(j2));
        }
        if (!this.f51319a.isEmpty()) {
            this.f51321c = j2;
        }
    }

    public final void a(long j2) {
        hn a2 = h().a(false);
        for (String str : this.f51319a.keySet()) {
            a(str, j2 - this.f51319a.get(str).longValue(), a2);
        }
        if (!this.f51319a.isEmpty()) {
            a(j2 - this.f51321c, a2);
        }
        b(j2);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2, hn hnVar) {
        if (hnVar == null) {
            q().f51476k.a("Not logging ad exposure. No active activity");
        } else if (j2 < 1000) {
            q().f51476k.a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j2);
            hq.a(hnVar, bundle, true);
            e().a("am", "_xa", bundle);
        }
    }

    public final void b(String str, long j2) {
        if (str == null || str.length() == 0) {
            q().f51468c.a("Ad unit id must be a non-empty string");
        } else {
            p().a(new z(this, str, j2));
        }
    }

    public final void a(String str, long j2) {
        if (str == null || str.length() == 0) {
            q().f51468c.a("Ad unit id must be a non-empty string");
        } else {
            p().a(new ba(this, str, j2));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, long j2, hn hnVar) {
        if (hnVar == null) {
            q().f51476k.a("Not logging ad unit exposure. No active activity");
        } else if (j2 < 1000) {
            q().f51476k.a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j2);
            hq.a(hnVar, bundle, true);
            e().a("am", "_xu", bundle);
        }
    }
}
