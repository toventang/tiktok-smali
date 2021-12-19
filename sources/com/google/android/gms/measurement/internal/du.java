package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.mp;
import com.google.android.gms.internal.measurement.on;
import java.util.List;

public final class du extends fb {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f51432a;

    /* renamed from: b  reason: collision with root package name */
    private String f51433b;

    /* renamed from: c  reason: collision with root package name */
    private String f51434c;

    /* renamed from: d  reason: collision with root package name */
    private int f51435d;

    /* renamed from: e  reason: collision with root package name */
    private String f51436e;

    /* renamed from: f  reason: collision with root package name */
    private String f51437f;

    /* renamed from: g  reason: collision with root package name */
    private long f51438g;

    /* renamed from: h  reason: collision with root package name */
    private long f51439h;

    /* renamed from: i  reason: collision with root package name */
    private int f51440i;

    /* renamed from: j  reason: collision with root package name */
    private String f51441j;

    /* renamed from: k  reason: collision with root package name */
    private String f51442k;

    /* renamed from: l  reason: collision with root package name */
    private String f51443l;

    static {
        Covode.recordClassIndex(32188);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.fb
    public final boolean u() {
        return true;
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

    /* access modifiers changed from: package-private */
    public final int A() {
        D();
        return this.f51435d;
    }

    /* access modifiers changed from: package-private */
    public final int B() {
        D();
        return this.f51440i;
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
    public final String w() {
        D();
        return this.f51433b;
    }

    /* access modifiers changed from: package-private */
    public final String x() {
        D();
        return this.f51441j;
    }

    /* access modifiers changed from: package-private */
    public final String y() {
        D();
        return this.f51442k;
    }

    /* access modifiers changed from: package-private */
    public final String z() {
        D();
        return this.f51443l;
    }

    private final String G() {
        on.f51264a.a();
        if (s().d(null, p.ar)) {
            q().f51476k.a("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> loadClass = m().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, m());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    q().f51473h.a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                q().f51472g.a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
        if (r2 == 0) goto L_0x00bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x015a A[Catch:{ NameNotFoundException -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x019a A[Catch:{ IllegalStateException -> 0x0228 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01aa A[Catch:{ IllegalStateException -> 0x0228 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ab A[Catch:{ IllegalStateException -> 0x0228 }] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b6 A[Catch:{ IllegalStateException -> 0x0228 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0246  */
    @Override // com.google.android.gms.measurement.internal.fb
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
        // Method dump skipped, instructions count: 686
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.du.v():void");
    }

    /* access modifiers changed from: package-private */
    public final zzn a(String str) {
        String G;
        long min;
        boolean z;
        Boolean valueOf;
        List<String> list;
        c();
        String w = w();
        String x = x();
        D();
        String str2 = this.f51434c;
        long A = (long) A();
        D();
        String str3 = this.f51436e;
        s();
        D();
        c();
        if (this.f51438g == 0) {
            this.f51438g = this.z.e().a(m(), m().getPackageName());
        }
        long j2 = this.f51438g;
        boolean r = this.z.r();
        boolean z2 = !r().r;
        c();
        if (!this.z.r()) {
            G = null;
        } else {
            G = G();
        }
        ff ffVar = this.z;
        Long valueOf2 = Long.valueOf(ffVar.b().f51527i.a());
        if (valueOf2.longValue() == 0) {
            min = ffVar.f51606k;
        } else {
            min = Math.min(ffVar.f51606k, valueOf2.longValue());
        }
        int B = B();
        boolean booleanValue = s().g().booleanValue();
        Boolean d2 = s().d("google_analytics_ssaid_collection_enabled");
        if (d2 == null || d2.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        boolean booleanValue2 = Boolean.valueOf(z).booleanValue();
        em r2 = r();
        r2.c();
        boolean z3 = r2.f().getBoolean("deferred_analytics_collection", false);
        String y = y();
        Boolean d3 = s().d("google_analytics_default_allow_ad_personalization_signals");
        if (d3 == null) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(true ^ d3.booleanValue());
        }
        long j3 = this.f51439h;
        String str4 = null;
        if (s().d(null, p.ac)) {
            list = this.f51432a;
        } else {
            list = null;
        }
        mp.b();
        if (s().d(null, p.ao)) {
            str4 = z();
        }
        return new zzn(w, x, str2, A, str3, 31000, j2, str, r, z2, G, 0, min, B, booleanValue, booleanValue2, z3, y, valueOf, j3, list, str4);
    }

    du(ff ffVar, long j2) {
        super(ffVar);
        this.f51439h = j2;
    }
}
