package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.c.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.le;
import com.google.android.gms.internal.measurement.mq;
import com.google.android.gms.internal.measurement.zzae;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class ff implements gb {

    /* renamed from: l  reason: collision with root package name */
    private static volatile ff f51595l;
    private boolean A;
    private Boolean B;
    private long C;
    private volatile Boolean D;
    private Boolean E;
    private Boolean F;
    private AtomicInteger G = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public final String f51596a;

    /* renamed from: b  reason: collision with root package name */
    public final String f51597b;

    /* renamed from: c  reason: collision with root package name */
    public final String f51598c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f51599d;

    /* renamed from: e  reason: collision with root package name */
    public final km f51600e;

    /* renamed from: f  reason: collision with root package name */
    final eb f51601f;

    /* renamed from: g  reason: collision with root package name */
    public final ex f51602g;

    /* renamed from: h  reason: collision with root package name */
    final gk f51603h;

    /* renamed from: i  reason: collision with root package name */
    public er f51604i;

    /* renamed from: j  reason: collision with root package name */
    int f51605j;

    /* renamed from: k  reason: collision with root package name */
    final long f51606k;

    /* renamed from: m  reason: collision with root package name */
    private final Context f51607m;
    private final kl n;
    private final em o;
    private final iz p;
    private final jz q;
    private final dz r;
    private final e s;
    private final hq t;
    private final a u;
    private final hh v;
    private dx w;
    private hv x;
    private j y;
    private du z;

    static {
        Covode.recordClassIndex(32227);
    }

    @Override // com.google.android.gms.measurement.internal.gb
    public final e l() {
        return this.s;
    }

    @Override // com.google.android.gms.measurement.internal.gb
    public final Context m() {
        return this.f51607m;
    }

    @Override // com.google.android.gms.measurement.internal.gb
    public final kl t() {
        return this.n;
    }

    static void u() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private final hh y() {
        a((fy) this.v);
        return this.v;
    }

    public final em b() {
        a((fz) this.o);
        return this.o;
    }

    public final iz c() {
        a((fb) this.p);
        return this.p;
    }

    public final gk d() {
        a((fb) this.f51603h);
        return this.f51603h;
    }

    public final jz e() {
        a((fz) this.q);
        return this.q;
    }

    public final dz f() {
        a((fz) this.r);
        return this.r;
    }

    public final dx g() {
        a((fb) this.w);
        return this.w;
    }

    public final hq h() {
        a((fb) this.t);
        return this.t;
    }

    public final hv i() {
        a((fb) this.x);
        return this.x;
    }

    public final j j() {
        a((fy) this.y);
        return this.y;
    }

    public final du k() {
        a((fb) this.z);
        return this.z;
    }

    @Override // com.google.android.gms.measurement.internal.gb
    public final ex p() {
        a((fy) this.f51602g);
        return this.f51602g;
    }

    @Override // com.google.android.gms.measurement.internal.gb
    public final eb q() {
        a((fy) this.f51601f);
        return this.f51601f;
    }

    /* access modifiers changed from: package-private */
    public final void v() {
        this.G.incrementAndGet();
    }

    public final a n() {
        a aVar = this.u;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final boolean o() {
        if (this.D == null || !this.D.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean r() {
        if (s() == 0) {
            return true;
        }
        return false;
    }

    public final int s() {
        p().c();
        if (this.f51600e.f()) {
            return 1;
        }
        Boolean bool = this.F;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        Boolean u2 = b().u();
        if (u2 == null) {
            km kmVar = this.f51600e;
            kmVar.t();
            Boolean d2 = kmVar.d("firebase_analytics_collection_enabled");
            if (d2 == null) {
                Boolean bool2 = this.E;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (g.a()) {
                    return 6;
                } else {
                    if (!this.f51600e.d(null, p.T) || this.D == null || this.D.booleanValue()) {
                        return 0;
                    }
                    return 7;
                }
            } else if (d2.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (u2.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w() {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ff.w():boolean");
    }

    public final void x() {
        p().c();
        a((fy) y());
        String w2 = k().w();
        Pair<String, Boolean> a2 = b().a(w2);
        if (!this.f51600e.g().booleanValue() || ((Boolean) a2.second).booleanValue() || TextUtils.isEmpty((CharSequence) a2.first)) {
            q().f51475j.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!y().f()) {
            q().f51471f.a("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            jz e2 = e();
            k().s();
            URL a3 = e2.a(w2, (String) a2.first, b().u.a() - 1);
            hh y2 = y();
            fe feVar = new fe(this);
            y2.c();
            y2.x();
            r.a(a3);
            r.a(feVar);
            y2.p().b(new hj(y2, w2, a3, feVar));
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        p().c();
        if (b().f51522d.a() == 0) {
            b().f51522d.a(this.s.a());
        }
        if (Long.valueOf(b().f51527i.a()).longValue() == 0) {
            q().f51476k.a("Persisting first open", Long.valueOf(this.f51606k));
            b().f51527i.a(this.f51606k);
        }
        if (this.f51600e.d(null, p.aR)) {
            ke keVar = d().f51686b;
            if (keVar.b() && keVar.a()) {
                keVar.f51989a.b().w.a(null);
            }
        }
        if (w()) {
            if (!TextUtils.isEmpty(k().x()) || !TextUtils.isEmpty(k().y())) {
                e();
                if (jz.a(k().x(), b().g(), k().y(), b().h())) {
                    q().f51474i.a("Rechecking which service to use due to a GMP App Id change");
                    b().j();
                    g().w();
                    this.x.G();
                    this.x.B();
                    b().f51527i.a(this.f51606k);
                    b().f51529k.a(null);
                }
                b().c(k().x());
                b().d(k().y());
            }
            d().a(b().f51529k.a());
            le.b();
            if (this.f51600e.d(null, p.av) && !e().v() && !TextUtils.isEmpty(b().v.a())) {
                q().f51471f.a("Remote config removed with active feature rollouts");
                b().v.a(null);
            }
            if (!TextUtils.isEmpty(k().x()) || !TextUtils.isEmpty(k().y())) {
                boolean r2 = r();
                if (!b().f51520b.contains("deferred_analytics_collection") && !this.f51600e.f()) {
                    b().c(!r2);
                }
                if (r2) {
                    d().y();
                }
                c().f51903b.a();
                i().a(new AtomicReference<>());
                mq.b();
                if (this.f51600e.d(null, p.aN)) {
                    i().a(b().y.a());
                }
            }
        } else if (r()) {
            if (!e().d("android.permission.INTERNET")) {
                q().f51468c.a("App is missing INTERNET permission");
            }
            if (!e().d("android.permission.ACCESS_NETWORK_STATE")) {
                q().f51468c.a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!c.f50295a.a(this.f51607m).a() && !this.f51600e.v()) {
                if (!ew.a(this.f51607m)) {
                    q().f51468c.a("AppMeasurementReceiver not registered/enabled");
                }
                if (!jz.a(this.f51607m)) {
                    q().f51468c.a("AppMeasurementService not registered/enabled");
                }
            }
            q().f51468c.a("Uploading is not possible. App measurement disabled");
        }
        b().p.a(this.f51600e.d(null, p.aa));
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    private static void a(fz fzVar) {
        if (fzVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void a(fb fbVar) {
        if (fbVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!fbVar.C()) {
            String valueOf = String.valueOf(fbVar.getClass());
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Component not initialized: ").append(valueOf).toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073 A[Catch:{ all -> 0x0187 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ff(com.google.android.gms.measurement.internal.gh r11) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ff.<init>(com.google.android.gms.measurement.internal.gh):void");
    }

    private static void a(fy fyVar) {
        if (fyVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!fyVar.w()) {
            String valueOf = String.valueOf(fyVar.getClass());
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Component not initialized: ").append(valueOf).toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        this.D = Boolean.valueOf(z2);
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    static /* synthetic */ void a(ff ffVar, gh ghVar) {
        ee eeVar;
        String str;
        ffVar.p().c();
        j jVar = new j(ffVar);
        jVar.y();
        ffVar.y = jVar;
        du duVar = new du(ffVar, ghVar.f51679f);
        duVar.E();
        ffVar.z = duVar;
        dx dxVar = new dx(ffVar);
        dxVar.E();
        ffVar.w = dxVar;
        hv hvVar = new hv(ffVar);
        hvVar.E();
        ffVar.x = hvVar;
        ffVar.q.z();
        ffVar.o.z();
        ffVar.f51604i = new er(ffVar);
        ffVar.z.F();
        ffVar.q().f51474i.a("App measurement initialized, version", 31000L);
        ffVar.q().f51474i.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String w2 = duVar.w();
        if (TextUtils.isEmpty(ffVar.f51596a)) {
            if (ffVar.e().f(w2)) {
                eeVar = ffVar.q().f51474i;
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                eeVar = ffVar.q().f51474i;
                String valueOf = String.valueOf(w2);
                if (valueOf.length() != 0) {
                    str = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf);
                } else {
                    str = new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                }
            }
            eeVar.a(str);
        }
        ffVar.q().f51475j.a("Debug-level message logging enabled");
        if (ffVar.f51605j != ffVar.G.get()) {
            ffVar.q().f51468c.a("Not all components initialized", Integer.valueOf(ffVar.f51605j), Integer.valueOf(ffVar.G.get()));
        }
        ffVar.A = true;
    }

    public static ff a(Context context, zzae zzae, Long l2) {
        MethodCollector.i(8172);
        if (zzae != null && (zzae.f51302e == null || zzae.f51303f == null)) {
            zzae = new zzae(zzae.f51298a, zzae.f51299b, zzae.f51300c, zzae.f51301d, null, null, zzae.f51304g);
        }
        r.a(context);
        r.a(a(context));
        if (f51595l == null) {
            synchronized (ff.class) {
                try {
                    if (f51595l == null) {
                        f51595l = new ff(new gh(context, zzae, l2));
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8172);
                    throw th;
                }
            }
        } else if (!(zzae == null || zzae.f51304g == null || !zzae.f51304g.containsKey("dataCollectionDefaultEnabled"))) {
            f51595l.a(zzae.f51304g.getBoolean("dataCollectionDefaultEnabled"));
        }
        ff ffVar = f51595l;
        MethodCollector.o(8172);
        return ffVar;
    }
}
