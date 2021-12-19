package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import com.kakao.usermgmt.StringSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class hq extends fb {

    /* renamed from: a  reason: collision with root package name */
    volatile hn f51783a;

    /* renamed from: b  reason: collision with root package name */
    hn f51784b;

    /* renamed from: c  reason: collision with root package name */
    protected hn f51785c;

    /* renamed from: d  reason: collision with root package name */
    final Map<Activity, hn> f51786d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    Activity f51787e;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f51788f;

    /* renamed from: g  reason: collision with root package name */
    volatile hn f51789g;

    /* renamed from: h  reason: collision with root package name */
    hn f51790h;

    /* renamed from: i  reason: collision with root package name */
    boolean f51791i;

    /* renamed from: j  reason: collision with root package name */
    final Object f51792j = new Object();

    /* renamed from: k  reason: collision with root package name */
    private hn f51793k;

    /* renamed from: l  reason: collision with root package name */
    private String f51794l;

    static {
        Covode.recordClassIndex(32292);
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

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.measurement.internal.hn r14, com.google.android.gms.measurement.internal.hn r15, long r16, boolean r18, android.os.Bundle r19) {
        /*
        // Method dump skipped, instructions count: 343
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.hq.a(com.google.android.gms.measurement.internal.hn, com.google.android.gms.measurement.internal.hn, long, boolean, android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(hn hnVar, boolean z, long j2) {
        d().a(l().b());
        if (j().a(hnVar != null && hnVar.f51775d, z, j2) && hnVar != null) {
            hnVar.f51775d = false;
        }
    }

    public final void a(String str, hn hnVar) {
        MethodCollector.i(8014);
        c();
        synchronized (this) {
            try {
                String str2 = this.f51794l;
                if (str2 == null || str2.equals(str) || hnVar != null) {
                    this.f51794l = str;
                    this.f51793k = hnVar;
                }
            } finally {
                MethodCollector.o(8014);
            }
        }
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

    public hq(ff ffVar) {
        super(ffVar);
    }

    static String a(String str) {
        String str2;
        String[] split = str.split("\\.");
        if (split.length > 0) {
            str2 = split[split.length - 1];
        } else {
            str2 = "";
        }
        if (str2.length() > 100) {
            return str2.substring(0, 100);
        }
        return str2;
    }

    /* access modifiers changed from: package-private */
    public final hn a(Activity activity) {
        r.a(activity);
        hn hnVar = this.f51786d.get(activity);
        if (hnVar == null) {
            hnVar = new hn(null, a(activity.getClass().getCanonicalName()), o().f());
            this.f51786d.put(activity, hnVar);
        }
        if (s().d(null, p.aD) && this.f51789g != null) {
            return this.f51789g;
        }
        return hnVar;
    }

    public final hn a(boolean z) {
        D();
        c();
        if (!s().d(null, p.aD) || !z) {
            return this.f51785c;
        }
        hn hnVar = this.f51785c;
        if (hnVar != null) {
            return hnVar;
        }
        return this.f51790h;
    }

    public final void a(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (s().h().booleanValue() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f51786d.put(activity, new hn(bundle2.getString(StringSet.name), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        if (r8 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00de, code lost:
        r3 = q().f51476k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        if (r7 != null) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e8, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ea, code lost:
        if (r8 != null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ec, code lost:
        r0 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ee, code lost:
        r3.a("Logging screen view with name, class", r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f3, code lost:
        if (r19.f51783a != null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f5, code lost:
        r1 = r19.f51784b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f7, code lost:
        r6 = new com.google.android.gms.measurement.internal.hn(r7, r8, o().f(), true, r21);
        r19.f51783a = r6;
        r19.f51784b = r1;
        r19.f51789g = r6;
        p().a(new com.google.android.gms.measurement.internal.hp(r19, r20, r6, r1, l().b()));
        com.bytedance.frameworks.apm.trace.MethodCollector.o(7923);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0129, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012a, code lost:
        r1 = r19.f51783a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012d, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x012f, code lost:
        r1 = r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Bundle r20, long r21) {
        /*
        // Method dump skipped, instructions count: 311
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.hq.a(android.os.Bundle, long):void");
    }

    public static void a(hn hnVar, Bundle bundle, boolean z) {
        if (bundle == null) {
            return;
        }
        if (hnVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                if (hnVar.f51772a != null) {
                    bundle.putString("_sn", hnVar.f51772a);
                } else {
                    bundle.remove("_sn");
                }
                if (hnVar.f51773b != null) {
                    bundle.putString("_sc", hnVar.f51773b);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", hnVar.f51774c);
            }
        } else if (z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Activity activity, hn hnVar, boolean z) {
        hn hnVar2;
        hn hnVar3;
        String str;
        if (this.f51783a == null) {
            hnVar2 = this.f51784b;
        } else {
            hnVar2 = this.f51783a;
        }
        if (hnVar.f51773b == null) {
            if (activity != null) {
                str = a(activity.getClass().getCanonicalName());
            } else {
                str = null;
            }
            hnVar3 = new hn(hnVar.f51772a, str, hnVar.f51774c, hnVar.f51776e, hnVar.f51777f);
        } else {
            hnVar3 = hnVar;
        }
        this.f51784b = this.f51783a;
        this.f51783a = hnVar3;
        p().a(new hs(this, hnVar3, hnVar2, l().b(), z));
    }
}
