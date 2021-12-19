package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.lq;
import com.google.android.gms.internal.measurement.mc;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

public final class gk extends fb {

    /* renamed from: a  reason: collision with root package name */
    protected hg f51685a;

    /* renamed from: b  reason: collision with root package name */
    final ke f51686b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f51687c = true;

    /* renamed from: d  reason: collision with root package name */
    private gf f51688d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<gi> f51689e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    private boolean f51690f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<String> f51691g = new AtomicReference<>();

    static {
        Covode.recordClassIndex(32259);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.fb
    public final boolean u() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.cb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.cb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final void a(boolean z) {
        D();
        p().a(new hb(this, z));
    }

    public final void a(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, true, l().a());
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2, long j2, Bundle bundle) {
        c();
        a(str, str2, j2, bundle, true, this.f51688d == null || jz.e(str2), false, null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0159, code lost:
        if (r11.a("event", 40, r34) == false) goto L_0x011e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r33, java.lang.String r34, long r35, android.os.Bundle r37, boolean r38, boolean r39, boolean r40, java.lang.String r41) {
        /*
        // Method dump skipped, instructions count: 1275
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.gk.a(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        String str3 = str;
        Bundle bundle2 = bundle;
        if (str3 == null) {
            str3 = "app";
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!s().d(null, p.aD) || !jz.c(str2, "screen_view")) {
            a(str3, str2, j2, bundle2, z2, !z2 || this.f51688d == null || jz.e(str2), !z);
        } else {
            h().a(bundle2, j2);
        }
    }

    public final void a(String str, String str2, Object obj) {
        a(str, str2, obj, true, l().a());
    }

    public final void a(String str, String str2, Object obj, boolean z, long j2) {
        String str3 = str;
        if (str3 == null) {
            str3 = "app";
        }
        int i2 = 6;
        int i3 = 0;
        if (z) {
            i2 = o().c(str2);
        } else {
            jz o = o();
            if (o.a("user property", str2)) {
                if (!o.a("user property", gg.f51672a, str2)) {
                    i2 = 15;
                } else if (o.a("user property", 24, str2)) {
                    i2 = 0;
                }
            }
        }
        if (i2 != 0) {
            o();
            String a2 = jz.a(str2, 24, true);
            if (str2 != null) {
                i3 = str2.length();
            }
            this.z.e().a(i2, "_ev", a2, i3);
        } else if (obj != null) {
            int b2 = o().b(str2, obj);
            if (b2 != 0) {
                o();
                String a3 = jz.a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i3 = String.valueOf(obj).length();
                }
                this.z.e().a(b2, "_ev", a3, i3);
                return;
            }
            Object c2 = o().c(str2, obj);
            if (c2 != null) {
                a(str3, str2, j2, c2);
            }
        } else {
            a(str3, str2, j2, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r13, java.lang.String r14, java.lang.Object r15, long r16) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.gk.a(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        this.f51691g.set(str);
    }

    public final void a(gf gfVar) {
        gf gfVar2;
        c();
        D();
        if (!(gfVar == null || gfVar == (gfVar2 = this.f51688d))) {
            r.a(gfVar2 == null, "EventInterceptor already set.");
        }
        this.f51688d = gfVar;
    }

    public final void a(gi giVar) {
        D();
        r.a(giVar);
        if (!this.f51689e.add(giVar)) {
            q().f51471f.a("OnEventListener already registered");
        }
    }

    public final void a(Bundle bundle, long j2) {
        r.a(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            q().f51471f.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        b(bundle2, j2);
    }

    public final void a(String str, String str2, String str3, Bundle bundle) {
        long a2 = l().a();
        r.a(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString(StringSet.name, str2);
        bundle2.putLong("creation_timestamp", a2);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        p().a(new gs(this, bundle2));
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

    public final String A() {
        hn hnVar = this.z.h().f51783a;
        if (hnVar != null) {
            return hnVar.f51773b;
        }
        return null;
    }

    public final String x() {
        return this.f51691g.get();
    }

    public final String z() {
        hn hnVar = this.z.h().f51783a;
        if (hnVar != null) {
            return hnVar.f51772a;
        }
        return null;
    }

    public final void w() {
        if (a(m()) instanceof Application) {
            ((Application) a(m())).unregisterActivityLifecycleCallbacks(this.f51685a);
        }
    }

    public final String B() {
        if (this.z.f51596a != null) {
            return this.z.f51596a;
        }
        try {
            return ho.a(m(), "google_app_id");
        } catch (IllegalStateException e2) {
            this.z.q().f51468c.a("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final void G() {
        long j2;
        c();
        String a2 = r().o.a();
        if (a2 != null) {
            if ("unset".equals(a2)) {
                a("app", "_npa", (Object) null, l().a());
            } else {
                if ("true".equals(a2)) {
                    j2 = 1;
                } else {
                    j2 = 0;
                }
                a("app", "_npa", Long.valueOf(j2), l().a());
            }
        }
        if (!this.z.r() || !this.f51687c) {
            q().f51475j.a("Updating Scion state (FE)");
            g().x();
            return;
        }
        q().f51475j.a("Recording app launch after enabling measurement for the first time (FE)");
        y();
        mc.b();
        if (s().d(null, p.aw)) {
            j().f51903b.a();
        }
        lq.b();
        if (s().d(null, p.aB) && this.z.f51604i.f51552a.b().f51528j.a() <= 0) {
            er erVar = this.z.f51604i;
            erVar.a(erVar.f51552a.m().getPackageName());
        }
        if (s().d(null, p.aR)) {
            p().a(new he(this));
        }
    }

    public final void y() {
        c();
        D();
        if (this.z.w()) {
            if (s().d(null, p.ah)) {
                km s = s();
                s.t();
                Boolean d2 = s.d("google_analytics_deferred_deep_link_enabled");
                if (d2 != null && d2.booleanValue()) {
                    q().f51475j.a("Deferred Deep Link feature enabled.");
                    p().a(new gm(this));
                }
            }
            g().z();
            this.f51687c = false;
            String v = r().v();
            if (!TextUtils.isEmpty(v)) {
                k().x();
                if (!v.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", v);
                    a("auto", "_ou", bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.cb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    protected gk(ff ffVar) {
        super(ffVar);
        this.f51686b = new ke(ffVar);
    }

    public final void b(gi giVar) {
        D();
        r.a(giVar);
        if (!this.f51689e.remove(giVar)) {
            q().f51471f.a("OnEventListener had not been registered");
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    static /* synthetic */ void a(gk gkVar, boolean z) {
        gkVar.c();
        gkVar.D();
        gkVar.q().f51475j.a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        gkVar.r().b(z);
        gkVar.G();
    }

    static /* synthetic */ void a(gk gkVar, Bundle bundle) {
        gkVar.c();
        gkVar.D();
        r.a(bundle);
        r.a(bundle.getString(StringSet.name));
        r.a(bundle.getString("origin"));
        r.a(a(bundle, "value"));
        if (!gkVar.z.r()) {
            gkVar.q().f51476k.a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkr zzkr = new zzkr(bundle.getString(StringSet.name), bundle.getLong("triggered_timestamp"), a(bundle, "value"), bundle.getString("origin"));
        try {
            zzao a2 = gkVar.o().a(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), bundle.getString("origin"), 0);
            gkVar.g().a(new zzw(bundle.getString("app_id"), bundle.getString("origin"), zzkr, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), gkVar.o().a(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), bundle.getString("origin"), 0), bundle.getLong("trigger_timeout"), a2, bundle.getLong("time_to_live"), gkVar.o().a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), 0)));
        } catch (IllegalArgumentException unused) {
        }
    }

    static /* synthetic */ void b(gk gkVar, Bundle bundle) {
        gkVar.c();
        gkVar.D();
        r.a(bundle);
        r.a(bundle.getString(StringSet.name));
        if (!gkVar.z.r()) {
            gkVar.q().f51476k.a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            gkVar.g().a(new zzw(bundle.getString("app_id"), bundle.getString("origin"), new zzkr(bundle.getString(StringSet.name), 0, null, null), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), gkVar.o().a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"))));
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void b(Bundle bundle, long j2) {
        r.a(bundle);
        ga.a(bundle, "app_id", String.class, null);
        ga.a(bundle, "origin", String.class, null);
        ga.a(bundle, StringSet.name, String.class, null);
        ga.a(bundle, "value", Object.class, null);
        ga.a(bundle, "trigger_event_name", String.class, null);
        ga.a(bundle, "trigger_timeout", Long.class, 0L);
        ga.a(bundle, "timed_out_event_name", String.class, null);
        ga.a(bundle, "timed_out_event_params", Bundle.class, null);
        ga.a(bundle, "triggered_event_name", String.class, null);
        ga.a(bundle, "triggered_event_params", Bundle.class, null);
        ga.a(bundle, "time_to_live", Long.class, 0L);
        ga.a(bundle, "expired_event_name", String.class, null);
        ga.a(bundle, "expired_event_params", Bundle.class, null);
        r.a(bundle.getString(StringSet.name));
        r.a(bundle.getString("origin"));
        r.a(a(bundle, "value"));
        bundle.putLong("creation_timestamp", j2);
        String string = bundle.getString(StringSet.name);
        Object a2 = a(bundle, "value");
        if (o().c(string) != 0) {
            q().f51468c.a("Invalid conditional user property name", n().c(string));
        } else if (o().b(string, a2) != 0) {
            q().f51468c.a("Invalid conditional user property value", n().c(string), a2);
        } else {
            Object c2 = o().c(string, a2);
            if (c2 == null) {
                q().f51468c.a("Unable to normalize conditional user property value", n().c(string), a2);
                return;
            }
            ga.a(bundle, c2);
            long j3 = bundle.getLong("trigger_timeout");
            if (TextUtils.isEmpty(bundle.getString("trigger_event_name")) || (j3 <= 15552000000L && j3 >= 1)) {
                long j4 = bundle.getLong("time_to_live");
                if (j4 > 15552000000L || j4 < 1) {
                    q().f51468c.a("Invalid conditional user property time to live", n().c(string), Long.valueOf(j4));
                } else {
                    p().a(new gt(this, bundle));
                }
            } else {
                q().f51468c.a("Invalid conditional user property timeout", n().c(string), Long.valueOf(j3));
            }
        }
    }

    public final void c(String str, String str2, Bundle bundle) {
        a((String) null, str, str2, bundle);
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, String str2, Bundle bundle) {
        c();
        a(str, str2, l().a(), bundle);
    }

    public final ArrayList<Bundle> a(String str, String str2, String str3) {
        if (p().f()) {
            q().f51468c.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (kl.a()) {
            q().f51468c.a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.z.p().a(atomicReference, 5000, "get conditional user properties", new gu(this, atomicReference, str, str2, str3));
            List list = (List) atomicReference.get();
            if (list != null) {
                return jz.b((List<zzw>) list);
            }
            q().f51468c.a("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    private final void a(String str, String str2, long j2, Object obj) {
        p().a(new gp(this, str, str2, obj, j2));
    }

    public final Map<String, Object> a(String str, String str2, String str3, boolean z) {
        if (p().f()) {
            q().f51468c.a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (kl.a()) {
            q().f51468c.a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.z.p().a(atomicReference, 5000, "get user properties", new gx(this, atomicReference, str, str2, str3, z));
            List<zzkr> list = (List) atomicReference.get();
            if (list == null) {
                q().f51468c.a("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            androidx.c.a aVar = new androidx.c.a(list.size());
            for (zzkr zzkr : list) {
                aVar.put(zzkr.f52065a, zzkr.a());
            }
            return aVar;
        }
    }

    private final void a(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        p().a(new gn(this, str, str2, j2, jz.b(bundle), z, z2, z3));
    }
}
