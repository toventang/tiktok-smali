package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.om;

public final class iz extends fb {

    /* renamed from: a  reason: collision with root package name */
    Handler f51902a;

    /* renamed from: b  reason: collision with root package name */
    protected final ji f51903b = new ji(this);

    /* renamed from: c  reason: collision with root package name */
    protected final jg f51904c = new jg(this);

    /* renamed from: d  reason: collision with root package name */
    private final jf f51905d = new jf(this);

    static {
        Covode.recordClassIndex(32328);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.fb
    public final boolean u() {
        return false;
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

    /* access modifiers changed from: package-private */
    public final void w() {
        c();
        if (this.f51902a == null) {
            this.f51902a = new om(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: package-private */
    public final long a(long j2) {
        return this.f51904c.b(j2);
    }

    iz(ff ffVar) {
        super(ffVar);
    }

    static /* synthetic */ void b(iz izVar, long j2) {
        izVar.c();
        izVar.w();
        izVar.q().f51476k.a("Activity paused, time", Long.valueOf(j2));
        jf jfVar = izVar.f51905d;
        if (jfVar.f51922b.s().d(null, p.ap)) {
            jfVar.f51921a = new je(jfVar, jfVar.f51922b.l().a(), j2);
            jfVar.f51922b.f51902a.postDelayed(jfVar.f51921a, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
        if (izVar.s().h().booleanValue()) {
            izVar.f51904c.f51925c.c();
        }
        ji jiVar = izVar.f51903b;
        if (!jiVar.f51928a.s().d(null, p.aD)) {
            jiVar.f51928a.r().s.a(true);
        }
    }

    static /* synthetic */ void a(iz izVar, long j2) {
        izVar.c();
        izVar.w();
        izVar.q().f51476k.a("Activity resumed, time", Long.valueOf(j2));
        if (izVar.s().d(null, p.aD)) {
            if (izVar.s().h().booleanValue() || izVar.r().s.a()) {
                izVar.f51904c.a(j2);
            }
            izVar.f51905d.a();
        } else {
            izVar.f51905d.a();
            if (izVar.s().h().booleanValue()) {
                izVar.f51904c.a(j2);
            }
        }
        ji jiVar = izVar.f51903b;
        jiVar.f51928a.c();
        if (jiVar.f51928a.z.r()) {
            if (!jiVar.f51928a.s().d(null, p.aD)) {
                jiVar.f51928a.r().s.a(false);
            }
            jiVar.a(jiVar.f51928a.l().a(), false);
        }
    }

    public final boolean a(boolean z, boolean z2, long j2) {
        return this.f51904c.a(z, z2, j2);
    }
}
