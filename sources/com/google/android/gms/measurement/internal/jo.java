package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.c.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.aw;
import com.google.android.gms.internal.measurement.ay;
import com.google.android.gms.internal.measurement.gm;
import com.google.android.gms.internal.measurement.km;
import com.google.android.gms.internal.measurement.kx;
import com.google.android.gms.internal.measurement.lx;
import com.google.android.gms.internal.measurement.mp;
import com.google.android.gms.internal.measurement.mq;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class jo implements gb {

    /* renamed from: f  reason: collision with root package name */
    private static volatile jo f51938f;

    /* renamed from: a  reason: collision with root package name */
    hl f51939a;

    /* renamed from: b  reason: collision with root package name */
    public final ff f51940b;

    /* renamed from: c  reason: collision with root package name */
    List<Runnable> f51941c;

    /* renamed from: d  reason: collision with root package name */
    int f51942d;

    /* renamed from: e  reason: collision with root package name */
    int f51943e;

    /* renamed from: g  reason: collision with root package name */
    private ey f51944g;

    /* renamed from: h  reason: collision with root package name */
    private ef f51945h;

    /* renamed from: i  reason: collision with root package name */
    private e f51946i;

    /* renamed from: j  reason: collision with root package name */
    private el f51947j;

    /* renamed from: k  reason: collision with root package name */
    private jk f51948k;

    /* renamed from: l  reason: collision with root package name */
    private kd f51949l;

    /* renamed from: m  reason: collision with root package name */
    private final jv f51950m;
    private boolean n;
    private boolean o;
    private long p;
    private boolean q;
    private boolean r;
    private boolean s;
    private FileLock t;
    private FileChannel u;
    private List<Long> v;
    private List<Long> w;
    private long x;

    static {
        Covode.recordClassIndex(32344);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f51940b.p().c();
        d().u();
        if (this.f51940b.b().f51522d.a() == 0) {
            this.f51940b.b().f51522d.a(this.f51940b.l().a());
        }
        j();
    }

    static void a(jp jpVar) {
        if (jpVar == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!jpVar.A()) {
            String valueOf = String.valueOf(jpVar.getClass());
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Component not initialized: ").append(valueOf).toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(zzao zzao, String str) {
        ec b2 = d().b(str);
        if (b2 == null || TextUtils.isEmpty(b2.k())) {
            this.f51940b.q().f51475j.a("No app data available; dropping event", str);
            return;
        }
        Boolean b3 = b(b2);
        if (b3 == null) {
            if (!"_ui".equals(zzao.f52061a)) {
                this.f51940b.q().f51471f.a("Could not find package. appId", eb.a(str));
            }
        } else if (!b3.booleanValue()) {
            this.f51940b.q().f51468c.a("App version does not match; dropping event. appId", eb.a(str));
            return;
        }
        String d2 = b2.d();
        String k2 = b2.k();
        long l2 = b2.l();
        String m2 = b2.m();
        long n2 = b2.n();
        long o2 = b2.o();
        boolean q2 = b2.q();
        String h2 = b2.h();
        long w2 = b2.w();
        boolean x2 = b2.x();
        boolean y = b2.y();
        String e2 = b2.e();
        Boolean z = b2.z();
        long p2 = b2.p();
        List<String> A = b2.A();
        mp.b();
        b(zzao, new zzn(str, d2, k2, l2, m2, n2, o2, (String) null, q2, false, h2, w2, 0L, 0, x2, y, false, e2, z, p2, A, this.f51940b.f51600e.d(b2.b(), p.ao) ? b2.f() : null));
    }

    /* access modifiers changed from: package-private */
    public final void a(zzao zzao, zzn zzn) {
        List<zzw> list;
        List<zzw> list2;
        List<zzw> list3;
        zzao zzao2 = zzao;
        r.a(zzn);
        r.a(zzn.f52073a);
        g();
        h();
        String str = zzn.f52073a;
        long j2 = zzao2.f52064d;
        f();
        if (jv.a(zzao2, zzn)) {
            if (!zzn.f52080h) {
                c(zzn);
                return;
            }
            if (this.f51940b.f51600e.d(str, p.ac) && zzn.u != null) {
                if (zzn.u.contains(zzao2.f52061a)) {
                    Bundle a2 = zzao2.f52062b.a();
                    a2.putLong("ga_safelisted", 1);
                    zzao2 = new zzao(zzao2.f52061a, new zzan(a2), zzao2.f52063c, zzao2.f52064d);
                } else {
                    this.f51940b.q().f51475j.a("Dropping non-safelisted event. appId, event name, origin", str, zzao2.f52061a, zzao2.f52063c);
                    return;
                }
            }
            d().e();
            try {
                e d2 = d();
                r.a(str);
                d2.c();
                d2.B();
                if (j2 < 0) {
                    d2.q().f51471f.a("Invalid time querying timed out conditional properties", eb.a(str), Long.valueOf(j2));
                    list = Collections.emptyList();
                } else {
                    list = d2.a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j2)});
                }
                for (zzw zzw : list) {
                    if (zzw != null) {
                        this.f51940b.q().f51476k.a("User property timed out", zzw.f52086a, this.f51940b.f().c(zzw.f52088c.f52065a), zzw.f52088c.a());
                        if (zzw.f52092g != null) {
                            c(new zzao(zzw.f52092g, j2), zzn);
                        }
                        d().e(str, zzw.f52088c.f52065a);
                    }
                }
                e d3 = d();
                r.a(str);
                d3.c();
                d3.B();
                if (j2 < 0) {
                    d3.q().f51471f.a("Invalid time querying expired conditional properties", eb.a(str), Long.valueOf(j2));
                    list2 = Collections.emptyList();
                } else {
                    list2 = d3.a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzw zzw2 : list2) {
                    if (zzw2 != null) {
                        this.f51940b.q().f51476k.a("User property expired", zzw2.f52086a, this.f51940b.f().c(zzw2.f52088c.f52065a), zzw2.f52088c.a());
                        d().b(str, zzw2.f52088c.f52065a);
                        if (zzw2.f52096k != null) {
                            arrayList.add(zzw2.f52096k);
                        }
                        d().e(str, zzw2.f52088c.f52065a);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    c(new zzao((zzao) obj, j2), zzn);
                }
                e d4 = d();
                String str2 = zzao2.f52061a;
                r.a(str);
                r.a(str2);
                d4.c();
                d4.B();
                if (j2 < 0) {
                    d4.q().f51471f.a("Invalid time querying triggered conditional properties", eb.a(str), d4.n().a(str2), Long.valueOf(j2));
                    list3 = Collections.emptyList();
                } else {
                    list3 = d4.a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (zzw zzw3 : list3) {
                    if (zzw3 != null) {
                        zzkr zzkr = zzw3.f52088c;
                        jw jwVar = new jw(zzw3.f52086a, zzw3.f52087b, zzkr.f52065a, j2, zzkr.a());
                        if (d().a(jwVar)) {
                            this.f51940b.q().f51476k.a("User property triggered", zzw3.f52086a, this.f51940b.f().c(jwVar.f51967c), jwVar.f51969e);
                        } else {
                            this.f51940b.q().f51468c.a("Too many active user properties, ignoring", eb.a(zzw3.f52086a), this.f51940b.f().c(jwVar.f51967c), jwVar.f51969e);
                        }
                        if (zzw3.f52094i != null) {
                            arrayList2.add(zzw3.f52094i);
                        }
                        zzw3.f52088c = new zzkr(jwVar);
                        zzw3.f52090e = true;
                        d().a(zzw3);
                    }
                }
                c(zzao2, zzn);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    c(new zzao((zzao) obj2, j2), zzn);
                }
                d().f();
            } finally {
                d().g();
            }
        }
    }

    private final void c(zzao zzao, zzn zzn) {
        long j2;
        boolean z;
        l lVar;
        List<Integer> e2;
        jw c2;
        long j3;
        String str;
        jw jwVar;
        int i2;
        zzao zzao2 = zzao;
        MethodCollector.i(2985);
        r.a(zzn);
        r.a(zzn.f52073a);
        long nanoTime = System.nanoTime();
        g();
        h();
        String str2 = zzn.f52073a;
        f();
        if (!jv.a(zzao2, zzn)) {
            MethodCollector.o(2985);
        } else if (!zzn.f52080h) {
            c(zzn);
            MethodCollector.o(2985);
        } else if (b().b(str2, zzao2.f52061a)) {
            this.f51940b.q().f51471f.a("Dropping blacklisted event. appId", eb.a(str2), this.f51940b.f().a(zzao2.f52061a));
            if (b().g(str2) || b().h(str2)) {
                ec b2 = d().b(str2);
                if (b2 != null) {
                    if (Math.abs(this.f51940b.l().a() - Math.max(b2.t(), b2.s())) > p.z.a(null).longValue()) {
                        this.f51940b.q().f51475j.a("Fetching config for blacklisted app");
                        a(b2);
                    }
                }
            } else if (!"_err".equals(zzao2.f52061a)) {
                this.f51940b.e().b(11, "_ev", zzao2.f52061a, 0);
            }
            MethodCollector.o(2985);
        } else {
            km.b();
            if (this.f51940b.f51600e.d(null, p.aK)) {
                eg a2 = eg.a(zzao2);
                this.f51940b.e().a(a2, this.f51940b.f51600e.a(str2));
                zzao2 = a2.a();
            }
            if (this.f51940b.q().a(2)) {
                this.f51940b.q().f51476k.a("Logging event", this.f51940b.f().a(zzao2));
            }
            d().e();
            try {
                c(zzn);
                kx.b();
                boolean z2 = "ecommerce_purchase".equals(zzao2.f52061a) || ((this.f51940b.f51600e.d(null, p.aJ)) && ("purchase".equals(zzao2.f52061a) || "refund".equals(zzao2.f52061a)));
                if ("_iap".equals(zzao2.f52061a) || z2) {
                    String d2 = zzao2.f52062b.d("currency");
                    if (z2) {
                        double doubleValue = zzao2.f52062b.c("value").doubleValue() * 1000000.0d;
                        if (doubleValue == 0.0d) {
                            double longValue = (double) zzao2.f52062b.b("value").longValue();
                            Double.isNaN(longValue);
                            doubleValue = longValue * 1000000.0d;
                        }
                        if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                            this.f51940b.q().f51471f.a("Data lost. Currency value is too big. appId", eb.a(str2), Double.valueOf(doubleValue));
                            d().f();
                            d().g();
                            MethodCollector.o(2985);
                            return;
                        }
                        j3 = Math.round(doubleValue);
                        kx.b();
                        if (this.f51940b.f51600e.d(null, p.aJ) && "refund".equals(zzao2.f52061a)) {
                            j3 = -j3;
                        }
                    } else {
                        j3 = zzao2.f52062b.b("value").longValue();
                    }
                    if (!TextUtils.isEmpty(d2)) {
                        String upperCase = d2.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            String valueOf = String.valueOf(upperCase);
                            if (valueOf.length() != 0) {
                                str = "_ltv_".concat(valueOf);
                            } else {
                                str = new String("_ltv_");
                            }
                            jw c3 = d().c(str2, str);
                            if (c3 == null || !(c3.f51969e instanceof Long)) {
                                e d3 = d();
                                int b3 = this.f51940b.f51600e.b(str2, p.E) - 1;
                                r.a(str2);
                                d3.c();
                                d3.B();
                                try {
                                    d3.h().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str2, str2, String.valueOf(b3)});
                                } catch (SQLiteException e3) {
                                    d3.q().f51468c.a("Error pruning currencies. appId", eb.a(str2), e3);
                                }
                                String str3 = zzao2.f52063c;
                                long a3 = this.f51940b.l().a();
                                Long valueOf2 = Long.valueOf(j3);
                                i2 = 0;
                                jwVar = new jw(str2, str3, str, a3, valueOf2);
                            } else {
                                i2 = 0;
                                jwVar = new jw(str2, zzao2.f52063c, str, this.f51940b.l().a(), Long.valueOf(((Long) c3.f51969e).longValue() + j3));
                            }
                            if (!d().a(jwVar)) {
                                this.f51940b.q().f51468c.a("Too many unique user properties are set. Ignoring user property. appId", eb.a(str2), this.f51940b.f().c(jwVar.f51967c), jwVar.f51969e);
                                this.f51940b.e().b(9, (String) null, (String) null, i2);
                            }
                        }
                    }
                }
                boolean a4 = jz.a(zzao2.f52061a);
                boolean equals = "_err".equals(zzao2.f52061a);
                kx.b();
                if (this.f51940b.f51600e.d(zzn.f52073a, p.aF)) {
                    this.f51940b.e();
                    j2 = jz.a(zzao2.f52062b) + 1;
                } else {
                    j2 = 1;
                }
                d a5 = d().a(r(), str2, j2, true, a4, false, equals, false);
                long intValue = a5.f51403b - ((long) p.f52046k.a(null).intValue());
                if (intValue > 0) {
                    if (intValue % 1000 == 1) {
                        this.f51940b.q().f51468c.a("Data loss. Too many events logged. appId, count", eb.a(str2), Long.valueOf(a5.f51403b));
                    }
                    d().f();
                    return;
                }
                if (a4) {
                    long intValue2 = a5.f51402a - ((long) p.f52048m.a(null).intValue());
                    if (intValue2 > 0) {
                        if (intValue2 % 1000 == 1) {
                            this.f51940b.q().f51468c.a("Data loss. Too many public events logged. appId, count", eb.a(str2), Long.valueOf(a5.f51402a));
                        }
                        this.f51940b.e().b(16, "_ev", zzao2.f52061a, 0);
                        d().f();
                        d().g();
                        MethodCollector.o(2985);
                        return;
                    }
                }
                if (equals) {
                    long max = a5.f51405d - ((long) Math.max(0, Math.min(1000000, this.f51940b.f51600e.b(zzn.f52073a, p.f52047l))));
                    if (max > 0) {
                        if (max == 1) {
                            this.f51940b.q().f51468c.a("Too many error events logged. appId, count", eb.a(str2), Long.valueOf(a5.f51405d));
                        }
                        d().f();
                        d().g();
                        MethodCollector.o(2985);
                        return;
                    }
                }
                Bundle a6 = zzao2.f52062b.a();
                this.f51940b.e().a(a6, "_o", zzao2.f52063c);
                if (this.f51940b.e().f(str2)) {
                    this.f51940b.e().a(a6, "_dbg", (Object) 1L);
                    this.f51940b.e().a(a6, "_r", (Object) 1L);
                }
                if ("_s".equals(zzao2.f52061a) && (c2 = d().c(zzn.f52073a, "_sno")) != null && (c2.f51969e instanceof Long)) {
                    this.f51940b.e().a(a6, "_sno", c2.f51969e);
                }
                long c4 = d().c(str2);
                if (c4 > 0) {
                    this.f51940b.q().f51471f.a("Data lost. Too many events stored on disk, deleted. appId", eb.a(str2), Long.valueOf(c4));
                }
                m mVar = new m(this.f51940b, zzao2.f52063c, str2, zzao2.f52061a, zzao2.f52064d, 0, a6);
                l a7 = d().a(str2, mVar.f52029b);
                if (a7 != null) {
                    z = false;
                    mVar = mVar.a(this.f51940b, a7.f52022f);
                    lVar = a7.a(mVar.f52030c);
                } else if (d().h(str2) < ((long) this.f51940b.f51600e.b(str2)) || !a4) {
                    z = false;
                    lVar = new l(str2, mVar.f52029b, mVar.f52030c);
                } else {
                    this.f51940b.q().f51468c.a("Too many event names used, ignoring event. appId, name, supported count", eb.a(str2), this.f51940b.f().a(mVar.f52029b), Integer.valueOf(this.f51940b.f51600e.b(str2)));
                    this.f51940b.e().b(8, (String) null, (String) null, 0);
                    d().g();
                    MethodCollector.o(2985);
                    return;
                }
                d().a(lVar);
                g();
                h();
                r.a(mVar);
                r.a(zzn);
                r.a(mVar.f52028a);
                r.b(mVar.f52028a.equals(zzn.f52073a));
                ay.g.a a8 = ay.g.c().a().a("android");
                if (!TextUtils.isEmpty(zzn.f52073a)) {
                    a8.f(zzn.f52073a);
                }
                if (!TextUtils.isEmpty(zzn.f52076d)) {
                    a8.e(zzn.f52076d);
                }
                if (!TextUtils.isEmpty(zzn.f52075c)) {
                    a8.g(zzn.f52075c);
                }
                if (zzn.f52082j != -2147483648L) {
                    a8.g((int) zzn.f52082j);
                }
                a8.f(zzn.f52077e);
                if (!TextUtils.isEmpty(zzn.f52074b)) {
                    a8.k(zzn.f52074b);
                }
                mp.b();
                if (this.f51940b.f51600e.d(zzn.f52073a, p.ao)) {
                    if (TextUtils.isEmpty(a8.n()) && !TextUtils.isEmpty(zzn.v)) {
                        a8.o(zzn.v);
                    }
                    if (TextUtils.isEmpty(a8.n()) && TextUtils.isEmpty(a8.r()) && !TextUtils.isEmpty(zzn.r)) {
                        a8.n(zzn.r);
                    }
                } else if (TextUtils.isEmpty(a8.n()) && !TextUtils.isEmpty(zzn.r)) {
                    a8.n(zzn.r);
                }
                if (zzn.f52078f != 0) {
                    a8.g(zzn.f52078f);
                }
                a8.j(zzn.t);
                if (this.f51940b.f51600e.d(zzn.f52073a, p.X) && (e2 = f().e()) != null) {
                    a8.d(e2);
                }
                Pair<String, Boolean> a9 = this.f51940b.b().a(zzn.f52073a);
                if (!TextUtils.isEmpty((CharSequence) a9.first)) {
                    if (zzn.o) {
                        a8.h((String) a9.first);
                        if (a9.second != null) {
                            a8.a(((Boolean) a9.second).booleanValue());
                        }
                    }
                } else if (!this.f51940b.j().a(this.f51940b.m()) && zzn.p) {
                    String string = Settings.Secure.getString(this.f51940b.m().getContentResolver(), "android_id");
                    if (string == null) {
                        this.f51940b.q().f51471f.a("null secure ID. appId", eb.a(a8.k()));
                        string = "null";
                    } else if (string.isEmpty()) {
                        this.f51940b.q().f51471f.a("empty secure ID. appId", eb.a(a8.k()));
                    }
                    a8.m(string);
                }
                this.f51940b.j().x();
                ay.g.a c5 = a8.c(Build.MODEL);
                this.f51940b.j().x();
                c5.b(Build.VERSION.RELEASE).e((int) this.f51940b.j().e()).d(this.f51940b.j().f());
                if (!this.f51940b.f51600e.d(null, p.aM)) {
                    a8.i(zzn.f52084l);
                }
                if (this.f51940b.r()) {
                    a8.k();
                    if (!TextUtils.isEmpty(null)) {
                        a8.p();
                    }
                }
                ec b4 = d().b(zzn.f52073a);
                if (b4 == null) {
                    b4 = new ec(this.f51940b, zzn.f52073a);
                    b4.a(this.f51940b.e().u());
                    b4.f(zzn.f52083k);
                    b4.b(zzn.f52074b);
                    b4.e(this.f51940b.b().b(zzn.f52073a));
                    b4.g(0);
                    b4.a(0);
                    b4.b(0);
                    b4.g(zzn.f52075c);
                    b4.c(zzn.f52082j);
                    b4.h(zzn.f52076d);
                    b4.d(zzn.f52077e);
                    b4.e(zzn.f52078f);
                    b4.a(zzn.f52080h);
                    if (!this.f51940b.f51600e.d(null, p.aM)) {
                        b4.j(zzn.f52084l);
                    }
                    b4.f(zzn.t);
                    d().a(b4);
                }
                if (!TextUtils.isEmpty(b4.c())) {
                    a8.i(b4.c());
                }
                if (!TextUtils.isEmpty(b4.h())) {
                    a8.l(b4.h());
                }
                List<jw> a10 = d().a(zzn.f52073a);
                for (int i3 = 0; i3 < a10.size(); i3++) {
                    ay.k.a a11 = ay.k.d().a(a10.get(i3).f51967c).a(a10.get(i3).f51968d);
                    f().a(a11, a10.get(i3).f51969e);
                    a8.a(a11);
                }
                try {
                    long a12 = d().a((ay.g) ((gm) a8.w()));
                    e d4 = d();
                    if (mVar.f52032e != null) {
                        Iterator<String> it = mVar.f52032e.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if ("_r".equals(it.next())) {
                                    break;
                                }
                            } else {
                                boolean c6 = b().c(mVar.f52028a, mVar.f52029b);
                                d a13 = d().a(r(), mVar.f52028a, false, false);
                                if (c6 && a13.f51406e < ((long) this.f51940b.f51600e.c(mVar.f52028a))) {
                                    z = true;
                                }
                            }
                        }
                        z = true;
                    }
                    if (d4.a(mVar, a12, z)) {
                        this.p = 0;
                    }
                } catch (IOException e4) {
                    this.f51940b.q().f51468c.a("Data loss. Failed to insert raw event metadata. appId", eb.a(a8.k()), e4);
                }
                d().f();
                d().g();
                j();
                this.f51940b.q().f51476k.a("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                MethodCollector.o(2985);
            } finally {
                d().g();
                MethodCollector.o(2985);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0508, code lost:
        if (r27 != false) goto L_0x050e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x075a  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0784  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0ae8  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0aea  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0af2  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0b22  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0e03  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0248  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(long r38) {
        /*
        // Method dump skipped, instructions count: 3610
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.jo.a(long):boolean");
    }

    private final void a(ay.g.a aVar, long j2, boolean z) {
        String str;
        jw jwVar;
        if (z) {
            str = "_se";
        } else {
            str = "_lte";
        }
        jw c2 = d().c(aVar.k(), str);
        if (c2 == null || c2.f51969e == null) {
            jwVar = new jw(aVar.k(), "auto", str, this.f51940b.l().a(), Long.valueOf(j2));
        } else {
            jwVar = new jw(aVar.k(), "auto", str, this.f51940b.l().a(), Long.valueOf(((Long) c2.f51969e).longValue() + j2));
        }
        ay.k kVar = (ay.k) ((gm) ay.k.d().a(str).a(this.f51940b.l().a()).b(((Long) jwVar.f51969e).longValue()).w());
        int a2 = jv.a(aVar, str);
        if (a2 >= 0) {
            aVar.a(a2, kVar);
        } else {
            aVar.a(kVar);
        }
        if (j2 > 0) {
            d().a(jwVar);
            this.f51940b.q().f51476k.a("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", jwVar.f51969e);
        }
    }

    private final boolean a(ay.c.a aVar, ay.c.a aVar2) {
        String str;
        r.b("_e".equals(aVar.d()));
        f();
        ay.e a2 = jv.a((ay.c) ((gm) aVar.w()), "_sc");
        String str2 = null;
        if (a2 != null) {
            str2 = a2.zze;
        }
        f();
        ay.e a3 = jv.a((ay.c) ((gm) aVar2.w()), "_pc");
        if (a3 == null || (str = a3.zze) == null || !str.equals(str2)) {
            return false;
        }
        b(aVar, aVar2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, Throwable th, byte[] bArr) {
        byte[] bArr2 = bArr;
        MethodCollector.i(4045);
        g();
        h();
        if (bArr2 == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                this.r = false;
                u();
                MethodCollector.o(4045);
                throw th2;
            }
        }
        List<Long> list = this.v;
        this.v = null;
        if ((i2 == 200 || i2 == 204) && th == null) {
            try {
                this.f51940b.b().f51522d.a(this.f51940b.l().a());
                this.f51940b.b().f51523e.a(0);
                j();
                this.f51940b.q().f51476k.a("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr2.length));
                d().e();
                try {
                    for (Long l2 : list) {
                        try {
                            e d2 = d();
                            long longValue = l2.longValue();
                            d2.c();
                            d2.B();
                            try {
                                if (d2.h().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                    SQLiteException sQLiteException = new SQLiteException("Deleted fewer rows from queue than expected");
                                    MethodCollector.o(4045);
                                    throw sQLiteException;
                                }
                            } catch (SQLiteException e2) {
                                d2.q().f51468c.a("Failed to delete a bundle in a queue table", e2);
                                MethodCollector.o(4045);
                                throw e2;
                            }
                        } catch (SQLiteException e3) {
                            List<Long> list2 = this.w;
                            if (list2 == null || !list2.contains(l2)) {
                                MethodCollector.o(4045);
                                throw e3;
                            }
                        }
                    }
                    d().f();
                    d().g();
                    this.w = null;
                    if (!c().e() || !s()) {
                        this.x = -1;
                        j();
                    } else {
                        i();
                    }
                    this.p = 0;
                } catch (Throwable th3) {
                    d().g();
                    MethodCollector.o(4045);
                    throw th3;
                }
            } catch (SQLiteException e4) {
                this.f51940b.q().f51468c.a("Database error while trying to delete uploaded bundles", e4);
                this.p = this.f51940b.l().b();
                this.f51940b.q().f51476k.a("Disable upload, time", Long.valueOf(this.p));
            }
        } else {
            this.f51940b.q().f51476k.a("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            this.f51940b.b().f51523e.a(this.f51940b.l().a());
            if (i2 == 503 || i2 == 429) {
                this.f51940b.b().f51524f.a(this.f51940b.l().a());
            }
            d().a(list);
            j();
        }
        this.r = false;
        u();
        MethodCollector.o(4045);
    }

    private final void a(ec ecVar) {
        g();
        mp.b();
        if (this.f51940b.f51600e.d(ecVar.b(), p.ao)) {
            if (TextUtils.isEmpty(ecVar.d()) && TextUtils.isEmpty(ecVar.f()) && TextUtils.isEmpty(ecVar.e())) {
                a(ecVar.b(), 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(ecVar.d()) && TextUtils.isEmpty(ecVar.e())) {
            a(ecVar.b(), 204, null, null, null);
            return;
        }
        String a2 = this.f51940b.f51600e.a(ecVar);
        try {
            URL url = new URL(a2);
            this.f51940b.q().f51476k.a("Fetching remote configuration", ecVar.b());
            aw.b a3 = b().a(ecVar.b());
            androidx.c.a aVar = null;
            String b2 = b().b(ecVar.b());
            if (a3 != null && !TextUtils.isEmpty(b2)) {
                aVar = new androidx.c.a();
                aVar.put("If-Modified-Since", b2);
            }
            this.q = true;
            ef c2 = c();
            String b3 = ecVar.b();
            jt jtVar = new jt(this);
            c2.c();
            c2.B();
            r.a(url);
            r.a(jtVar);
            c2.p().b(new ei(c2, b3, url, null, aVar, jtVar));
        } catch (MalformedURLException unused) {
            this.f51940b.q().f51468c.a("Failed to parse config URL. Not fetching. appId", eb.a(ecVar.b()), a2);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.jo.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    private final boolean a(int i2, FileChannel fileChannel) {
        g();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f51940b.q().f51468c.a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i2);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            if (this.f51940b.f51600e.d(null, p.az) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0L);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f51940b.q().f51468c.a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e2) {
            this.f51940b.q().f51468c.a("Failed to write to channel", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(zzn zzn) {
        MethodCollector.i(4691);
        if (this.v != null) {
            ArrayList arrayList = new ArrayList();
            this.w = arrayList;
            arrayList.addAll(this.v);
        }
        e d2 = d();
        String str = zzn.f52073a;
        r.a(str);
        d2.c();
        d2.B();
        try {
            SQLiteDatabase h2 = d2.h();
            String[] strArr = {str};
            int delete = h2.delete("apps", "app_id=?", strArr) + 0 + h2.delete("events", "app_id=?", strArr) + h2.delete("user_attributes", "app_id=?", strArr) + h2.delete("conditional_properties", "app_id=?", strArr) + h2.delete("raw_events", "app_id=?", strArr) + h2.delete("raw_events_metadata", "app_id=?", strArr) + h2.delete("queue", "app_id=?", strArr) + h2.delete("audience_filter_values", "app_id=?", strArr) + h2.delete("main_event_params", "app_id=?", strArr) + h2.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                d2.q().f51476k.a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            d2.q().f51468c.a("Error resetting analytics data. appId, error", eb.a(str), e2);
        }
        if (zzn.f52080h) {
            b(zzn);
        }
        MethodCollector.o(4691);
    }

    /* access modifiers changed from: package-private */
    public final void a(zzkr zzkr, zzn zzn) {
        g();
        h();
        if (e(zzn)) {
            if (!zzn.f52080h) {
                c(zzn);
                return;
            }
            int c2 = this.f51940b.e().c(zzkr.f52065a);
            int i2 = 0;
            if (c2 != 0) {
                this.f51940b.e();
                String a2 = jz.a(zzkr.f52065a, 24, true);
                if (zzkr.f52065a != null) {
                    i2 = zzkr.f52065a.length();
                }
                this.f51940b.e().b(c2, "_ev", a2, i2);
                return;
            }
            int b2 = this.f51940b.e().b(zzkr.f52065a, zzkr.a());
            if (b2 != 0) {
                this.f51940b.e();
                String a3 = jz.a(zzkr.f52065a, 24, true);
                Object a4 = zzkr.a();
                if (a4 != null && ((a4 instanceof String) || (a4 instanceof CharSequence))) {
                    i2 = String.valueOf(a4).length();
                }
                this.f51940b.e().b(b2, "_ev", a3, i2);
                return;
            }
            Object c3 = this.f51940b.e().c(zzkr.f52065a, zzkr.a());
            if (c3 != null) {
                if ("_sid".equals(zzkr.f52065a)) {
                    long j2 = zzkr.f52066b;
                    String str = zzkr.f52069e;
                    long j3 = 0;
                    jw c4 = d().c(zzn.f52073a, "_sno");
                    if (c4 != null) {
                        if (c4.f51969e instanceof Long) {
                            j3 = ((Long) c4.f51969e).longValue();
                            a(new zzkr("_sno", j2, Long.valueOf(j3 + 1), str), zzn);
                        } else {
                            this.f51940b.q().f51471f.a("Retrieved last session number from database does not contain a valid (long) value", c4.f51969e);
                        }
                    }
                    l a5 = d().a(zzn.f52073a, "_s");
                    if (a5 != null) {
                        j3 = a5.f52019c;
                        this.f51940b.q().f51476k.a("Backfill the session number. Last used session number", Long.valueOf(j3));
                    }
                    a(new zzkr("_sno", j2, Long.valueOf(j3 + 1), str), zzn);
                }
                jw jwVar = new jw(zzn.f52073a, zzkr.f52069e, zzkr.f52065a, zzkr.f52066b, c3);
                this.f51940b.q().f51476k.a("Setting user property", this.f51940b.f().c(jwVar.f51967c), c3);
                d().e();
                try {
                    c(zzn);
                    boolean a6 = d().a(jwVar);
                    d().f();
                    if (!a6) {
                        this.f51940b.q().f51468c.a("Too many unique user properties are set. Ignoring user property", this.f51940b.f().c(jwVar.f51967c), jwVar.f51969e);
                        this.f51940b.e().b(9, (String) null, (String) null, 0);
                    }
                } finally {
                    d().g();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzn a(String str) {
        ec b2 = d().b(str);
        if (b2 == null || TextUtils.isEmpty(b2.k())) {
            this.f51940b.q().f51475j.a("No app data available; dropping", str);
            return null;
        }
        Boolean b3 = b(b2);
        if (b3 == null || b3.booleanValue()) {
            String d2 = b2.d();
            String k2 = b2.k();
            long l2 = b2.l();
            String m2 = b2.m();
            long n2 = b2.n();
            long o2 = b2.o();
            boolean q2 = b2.q();
            String h2 = b2.h();
            long w2 = b2.w();
            boolean x2 = b2.x();
            boolean y = b2.y();
            String e2 = b2.e();
            Boolean z = b2.z();
            long p2 = b2.p();
            List<String> A = b2.A();
            mp.b();
            return new zzn(str, d2, k2, l2, m2, n2, o2, (String) null, q2, false, h2, w2, 0L, 0, x2, y, false, e2, z, p2, A, this.f51940b.f51600e.d(str, p.ao) ? b2.f() : null);
        }
        this.f51940b.q().f51468c.a("App version does not match; dropping. appId", eb.a(str));
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(zzw zzw, zzn zzn) {
        r.a(zzw);
        r.a(zzw.f52086a);
        r.a((Object) zzw.f52087b);
        r.a(zzw.f52088c);
        r.a(zzw.f52088c.f52065a);
        g();
        h();
        if (e(zzn)) {
            if (!zzn.f52080h) {
                c(zzn);
                return;
            }
            zzw zzw2 = new zzw(zzw);
            boolean z = false;
            zzw2.f52090e = false;
            d().e();
            try {
                zzw d2 = d().d(zzw2.f52086a, zzw2.f52088c.f52065a);
                if (d2 != null && !d2.f52087b.equals(zzw2.f52087b)) {
                    this.f51940b.q().f51471f.a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f51940b.f().c(zzw2.f52088c.f52065a), zzw2.f52087b, d2.f52087b);
                }
                if (d2 != null && d2.f52090e) {
                    zzw2.f52087b = d2.f52087b;
                    zzw2.f52089d = d2.f52089d;
                    zzw2.f52093h = d2.f52093h;
                    zzw2.f52091f = d2.f52091f;
                    zzw2.f52094i = d2.f52094i;
                    zzw2.f52090e = d2.f52090e;
                    zzw2.f52088c = new zzkr(zzw2.f52088c.f52065a, d2.f52088c.f52066b, zzw2.f52088c.a(), d2.f52088c.f52069e);
                } else if (TextUtils.isEmpty(zzw2.f52091f)) {
                    zzw2.f52088c = new zzkr(zzw2.f52088c.f52065a, zzw2.f52089d, zzw2.f52088c.a(), zzw2.f52088c.f52069e);
                    zzw2.f52090e = true;
                    z = true;
                }
                if (zzw2.f52090e) {
                    zzkr zzkr = zzw2.f52088c;
                    jw jwVar = new jw(zzw2.f52086a, zzw2.f52087b, zzkr.f52065a, zzkr.f52066b, zzkr.a());
                    if (d().a(jwVar)) {
                        this.f51940b.q().f51475j.a("User property updated immediately", zzw2.f52086a, this.f51940b.f().c(jwVar.f51967c), jwVar.f51969e);
                    } else {
                        this.f51940b.q().f51468c.a("(2)Too many active user properties, ignoring", eb.a(zzw2.f52086a), this.f51940b.f().c(jwVar.f51967c), jwVar.f51969e);
                    }
                    if (z && zzw2.f52094i != null) {
                        c(new zzao(zzw2.f52094i, zzw2.f52089d), zzn);
                    }
                }
                if (d().a(zzw2)) {
                    this.f51940b.q().f51475j.a("Conditional property added", zzw2.f52086a, this.f51940b.f().c(zzw2.f52088c.f52065a), zzw2.f52088c.a());
                } else {
                    this.f51940b.q().f51468c.a("Too many conditional properties, ignoring", eb.a(zzw2.f52086a), this.f51940b.f().c(zzw2.f52088c.f52065a), zzw2.f52088c.a());
                }
                d().f();
            } finally {
                d().g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(zzw zzw, zzn zzn) {
        r.a(zzw);
        r.a(zzw.f52086a);
        r.a(zzw.f52088c);
        r.a(zzw.f52088c.f52065a);
        g();
        h();
        if (e(zzn)) {
            if (!zzn.f52080h) {
                c(zzn);
                return;
            }
            d().e();
            try {
                c(zzn);
                zzw d2 = d().d(zzw.f52086a, zzw.f52088c.f52065a);
                if (d2 != null) {
                    this.f51940b.q().f51475j.a("Removing conditional user property", zzw.f52086a, this.f51940b.f().c(zzw.f52088c.f52065a));
                    d().e(zzw.f52086a, zzw.f52088c.f52065a);
                    if (d2.f52090e) {
                        d().b(zzw.f52086a, zzw.f52088c.f52065a);
                    }
                    if (zzw.f52096k != null) {
                        Bundle bundle = null;
                        if (zzw.f52096k.f52062b != null) {
                            bundle = zzw.f52096k.f52062b.a();
                        }
                        c(this.f51940b.e().a(zzw.f52086a, zzw.f52096k.f52061a, bundle, d2.f52087b, zzw.f52096k.f52064d), zzn);
                    }
                } else {
                    this.f51940b.q().f51471f.a("Conditional user property doesn't exist", eb.a(zzw.f52086a), this.f51940b.f().c(zzw.f52088c.f52065a));
                }
                d().f();
            } finally {
                d().g();
            }
        }
    }

    static /* synthetic */ void a(jo joVar) {
        joVar.f51940b.p().c();
        e eVar = new e(joVar);
        eVar.C();
        joVar.f51946i = eVar;
        joVar.f51940b.f51600e.f52014a = joVar.f51944g;
        kd kdVar = new kd(joVar);
        kdVar.C();
        joVar.f51949l = kdVar;
        hl hlVar = new hl(joVar);
        hlVar.C();
        joVar.f51939a = hlVar;
        jk jkVar = new jk(joVar);
        jkVar.C();
        joVar.f51948k = jkVar;
        joVar.f51947j = new el(joVar);
        if (joVar.f51942d != joVar.f51943e) {
            joVar.f51940b.q().f51468c.a("Not all upload components initialized", Integer.valueOf(joVar.f51942d), Integer.valueOf(joVar.f51943e));
        }
        joVar.n = true;
    }

    private final jk o() {
        a(this.f51948k);
        return this.f51948k;
    }

    public final ey b() {
        a(this.f51944g);
        return this.f51944g;
    }

    public final ef c() {
        a(this.f51945h);
        return this.f51945h;
    }

    public final e d() {
        a(this.f51946i);
        return this.f51946i;
    }

    public final kd e() {
        a(this.f51949l);
        return this.f51949l;
    }

    public final jv f() {
        a(this.f51950m);
        return this.f51950m;
    }

    @Override // com.google.android.gms.measurement.internal.gb
    public final e l() {
        return this.f51940b.l();
    }

    @Override // com.google.android.gms.measurement.internal.gb
    public final Context m() {
        return this.f51940b.m();
    }

    @Override // com.google.android.gms.measurement.internal.gb
    public final ex p() {
        return this.f51940b.p();
    }

    @Override // com.google.android.gms.measurement.internal.gb
    public final eb q() {
        return this.f51940b.q();
    }

    @Override // com.google.android.gms.measurement.internal.gb
    public final kl t() {
        return this.f51940b.t();
    }

    private final el n() {
        el elVar = this.f51947j;
        if (elVar != null) {
            return elVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        this.f51940b.p().c();
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        if (!this.n) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    private final boolean s() {
        g();
        h();
        if (d().x() || !TextUtils.isEmpty(d().i())) {
            return true;
        }
        return false;
    }

    private final long r() {
        long a2 = this.f51940b.l().a();
        em b2 = this.f51940b.b();
        b2.x();
        b2.c();
        long a3 = b2.f51526h.a();
        if (a3 == 0) {
            a3 = 1 + ((long) b2.o().g().nextInt(86400000));
            b2.f51526h.a(a3);
        }
        return ((((a2 + a3) / 1000) / 60) / 60) / 24;
    }

    private final void u() {
        g();
        if (this.q || this.r || this.s) {
            this.f51940b.q().f51476k.a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s));
            return;
        }
        this.f51940b.q().f51476k.a("Stopping uploading service(s)");
        List<Runnable> list = this.f51941c;
        if (list != null) {
            for (Runnable runnable : list) {
                runnable.run();
            }
            this.f51941c.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        g();
        h();
        if (!this.o) {
            this.o = true;
            if (v()) {
                int a2 = a(this.u);
                int A = this.f51940b.k().A();
                g();
                if (a2 > A) {
                    this.f51940b.q().f51468c.a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(a2), Integer.valueOf(A));
                } else if (a2 >= A) {
                } else {
                    if (a(A, this.u)) {
                        this.f51940b.q().f51476k.a("Storage version upgraded. Previous, current version", Integer.valueOf(a2), Integer.valueOf(A));
                    } else {
                        this.f51940b.q().f51468c.a("Storage version upgrade failed. Previous, current version", Integer.valueOf(a2), Integer.valueOf(A));
                    }
                }
            }
        }
    }

    private final boolean v() {
        FileLock fileLock;
        g();
        if (!this.f51940b.f51600e.d(null, p.am) || (fileLock = this.t) == null || !fileLock.isValid()) {
            Context m2 = this.f51940b.m();
            if (d.f107195c == null || !d.f107197e) {
                d.f107195c = m2.getFilesDir();
            }
            try {
                FileChannel channel = new RandomAccessFile(new File(d.f107195c, "google_app_measurement.db"), "rw").getChannel();
                this.u = channel;
                FileLock tryLock = channel.tryLock();
                this.t = tryLock;
                if (tryLock != null) {
                    this.f51940b.q().f51476k.a("Storage concurrent access okay");
                    return true;
                }
                this.f51940b.q().f51468c.a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e2) {
                this.f51940b.q().f51468c.a("Failed to acquire storage lock", e2);
                return false;
            } catch (IOException e3) {
                this.f51940b.q().f51468c.a("Failed to access storage lock file", e3);
                return false;
            } catch (OverlappingFileLockException e4) {
                this.f51940b.q().f51471f.a("Storage lock already acquired", e4);
                return false;
            }
        } else {
            this.f51940b.q().f51476k.a("Storage concurrent access okay");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        ec b2;
        boolean z;
        g();
        h();
        this.s = true;
        try {
            this.f51940b.t();
            Boolean bool = this.f51940b.i().f51808c;
            if (bool == null) {
                this.f51940b.q().f51471f.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                this.f51940b.q().f51468c.a("Upload called in the client side when service should be used");
                this.s = false;
                u();
            } else if (this.p > 0) {
                j();
                this.s = false;
                u();
            } else {
                g();
                if (this.v != null) {
                    this.f51940b.q().f51476k.a("Uploading requested multiple times");
                    this.s = false;
                    u();
                } else if (!c().e()) {
                    this.f51940b.q().f51476k.a("Network not connected, ignoring upload request");
                    j();
                    this.s = false;
                    u();
                } else {
                    long a2 = this.f51940b.l().a();
                    int b3 = this.f51940b.f51600e.b(null, p.Q);
                    long j2 = a2 - km.j();
                    for (int i2 = 0; i2 < b3 && a(j2); i2++) {
                    }
                    long a3 = this.f51940b.b().f51522d.a();
                    if (a3 != 0) {
                        this.f51940b.q().f51475j.a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(a2 - a3)));
                    }
                    String i3 = d().i();
                    if (!TextUtils.isEmpty(i3)) {
                        if (this.x == -1) {
                            this.x = d().z();
                        }
                        List<Pair<ay.g, Long>> a4 = d().a(i3, this.f51940b.f51600e.b(i3, p.f52042g), Math.max(0, this.f51940b.f51600e.b(i3, p.f52043h)));
                        if (!a4.isEmpty()) {
                            Iterator<Pair<ay.g, Long>> it = a4.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ay.g gVar = (ay.g) it.next().first;
                                if (!TextUtils.isEmpty(gVar.zzw)) {
                                    String str = gVar.zzw;
                                    if (str != null) {
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= a4.size()) {
                                                break;
                                            }
                                            ay.g gVar2 = (ay.g) a4.get(i4).first;
                                            if (!(TextUtils.isEmpty(gVar2.zzw) || gVar2.zzw.equals(str))) {
                                                a4 = a4.subList(0, i4);
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                }
                            }
                            ay.f.a a5 = ay.f.a();
                            int size = a4.size();
                            ArrayList arrayList = new ArrayList(a4.size());
                            boolean f2 = this.f51940b.f51600e.f(i3);
                            for (int i5 = 0; i5 < size; i5++) {
                                ay.g.a aVar = (ay.g.a) ((ay.g) a4.get(i5).first).l();
                                arrayList.add((Long) a4.get(i5).second);
                                ay.g.a a6 = aVar.l().a(a2);
                                this.f51940b.t();
                                a6.b(false);
                                if (!f2) {
                                    aVar.q();
                                }
                                if (this.f51940b.f51600e.d(i3, p.Z)) {
                                    aVar.k(f().a(((ay.g) ((gm) aVar.w())).h()));
                                }
                                a5.a(aVar);
                            }
                            String a7 = this.f51940b.q().a(2) ? f().a((ay.f) ((gm) a5.w())) : null;
                            f();
                            byte[] h2 = ((ay.f) ((gm) a5.w())).h();
                            String a8 = p.q.a(null);
                            try {
                                URL url = new URL(a8);
                                if (!arrayList.isEmpty()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                r.b(z);
                                if (this.v != null) {
                                    this.f51940b.q().f51468c.a("Set uploading progress before finishing the previous upload");
                                } else {
                                    this.v = new ArrayList(arrayList);
                                }
                                this.f51940b.b().f51523e.a(a2);
                                String str2 = "?";
                                if (size > 0) {
                                    str2 = a5.a().zzs;
                                }
                                this.f51940b.q().f51476k.a("Uploading data. app, uncompressed size, data", str2, Integer.valueOf(h2.length), a7);
                                this.r = true;
                                ef c2 = c();
                                jq jqVar = new jq(this, i3);
                                c2.c();
                                c2.B();
                                r.a(url);
                                r.a(h2);
                                r.a(jqVar);
                                c2.p().b(new ei(c2, i3, url, h2, null, jqVar));
                            } catch (MalformedURLException unused) {
                                this.f51940b.q().f51468c.a("Failed to parse upload URL. Not uploading. appId", eb.a(i3), a8);
                            }
                        }
                    } else {
                        this.x = -1;
                        String a9 = d().a(a2 - km.j());
                        if (!TextUtils.isEmpty(a9) && (b2 = d().b(a9)) != null) {
                            a(b2);
                        }
                    }
                    this.s = false;
                    u();
                }
            }
        } finally {
            this.s = false;
            u();
        }
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        boolean z;
        long j2;
        g();
        h();
        if (this.p > 0) {
            long abs = 3600000 - Math.abs(this.f51940b.l().b() - this.p);
            if (abs > 0) {
                this.f51940b.q().f51476k.a("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                n().b();
                o().e();
                return;
            }
            this.p = 0;
        }
        if (!this.f51940b.w() || !s()) {
            this.f51940b.q().f51476k.a("Nothing to upload or uploading impossible");
            n().b();
            o().e();
            return;
        }
        long a2 = this.f51940b.l().a();
        long max = Math.max(0L, p.A.a(null).longValue());
        if (d().y() || d().j()) {
            z = true;
            String u2 = this.f51940b.f51600e.u();
            if (TextUtils.isEmpty(u2) || ".none.".equals(u2)) {
                j2 = Math.max(0L, p.u.a(null).longValue());
            } else {
                j2 = Math.max(0L, p.v.a(null).longValue());
            }
        } else {
            z = false;
            j2 = Math.max(0L, p.t.a(null).longValue());
        }
        long a3 = this.f51940b.b().f51522d.a();
        long a4 = this.f51940b.b().f51523e.a();
        long max2 = Math.max(d().v(), d().w());
        if (max2 != 0) {
            long abs2 = a2 - Math.abs(max2 - a2);
            long abs3 = a2 - Math.abs(a3 - a2);
            long abs4 = a2 - Math.abs(a4 - a2);
            long max3 = Math.max(abs3, abs4);
            long j3 = abs2 + max;
            if (z && max3 > 0) {
                j3 = Math.min(abs2, max3) + j2;
            }
            if (!f().a(max3, j2)) {
                j3 = max3 + j2;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i2 = 0;
                while (true) {
                    if (i2 >= Math.min(20, Math.max(0, p.C.a(null).intValue()))) {
                        break;
                    }
                    j3 += Math.max(0L, p.B.a(null).longValue()) * (1 << i2);
                    if (j3 > abs4) {
                        break;
                    }
                    i2++;
                }
            }
            if (j3 != 0) {
                if (!c().e()) {
                    this.f51940b.q().f51476k.a("No network");
                    n().a();
                    o().e();
                    return;
                }
                long a5 = this.f51940b.b().f51524f.a();
                long max4 = Math.max(0L, p.r.a(null).longValue());
                if (!f().a(a5, max4)) {
                    j3 = Math.max(j3, a5 + max4);
                }
                n().b();
                long a6 = j3 - this.f51940b.l().a();
                if (a6 <= 0) {
                    a6 = Math.max(0L, p.w.a(null).longValue());
                    this.f51940b.b().f51522d.a(this.f51940b.l().a());
                }
                this.f51940b.q().f51476k.a("Upload scheduled in approximately ms", Long.valueOf(a6));
                o().a(a6);
                return;
            }
        }
        this.f51940b.q().f51476k.a("Next upload time is 0");
        n().b();
        o().e();
    }

    /* access modifiers changed from: package-private */
    public class a implements g {

        /* renamed from: a  reason: collision with root package name */
        ay.g f51951a;

        /* renamed from: b  reason: collision with root package name */
        List<Long> f51952b;

        /* renamed from: c  reason: collision with root package name */
        List<ay.c> f51953c;

        /* renamed from: d  reason: collision with root package name */
        private long f51954d;

        static {
            Covode.recordClassIndex(32345);
        }

        private a() {
        }

        @Override // com.google.android.gms.measurement.internal.g
        public final void a(ay.g gVar) {
            r.a(gVar);
            this.f51951a = gVar;
        }

        private static long a(ay.c cVar) {
            return ((cVar.zzf / 1000) / 60) / 60;
        }

        /* synthetic */ a(jo joVar, byte b2) {
            this();
        }

        @Override // com.google.android.gms.measurement.internal.g
        public final boolean a(long j2, ay.c cVar) {
            r.a(cVar);
            if (this.f51953c == null) {
                this.f51953c = new ArrayList();
            }
            if (this.f51952b == null) {
                this.f51952b = new ArrayList();
            }
            if (this.f51953c.size() > 0 && a(this.f51953c.get(0)) != a(cVar)) {
                return false;
            }
            long m2 = this.f51954d + ((long) cVar.m());
            if (m2 >= ((long) Math.max(0, p.f52044i.a(null).intValue()))) {
                return false;
            }
            this.f51954d = m2;
            this.f51953c.add(cVar);
            this.f51952b.add(Long.valueOf(j2));
            if (this.f51953c.size() >= Math.max(1, p.f52045j.a(null).intValue())) {
                return false;
            }
            return true;
        }
    }

    private jo(ju juVar) {
        this(juVar, (byte) 0);
    }

    public static jo a(Context context) {
        MethodCollector.i(2782);
        r.a(context);
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        r.a(applicationContext);
        if (f51938f == null) {
            synchronized (jo.class) {
                try {
                    if (f51938f == null) {
                        f51938f = new jo(new ju(context));
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2782);
                    throw th;
                }
            }
        }
        jo joVar = f51938f;
        MethodCollector.o(2782);
        return joVar;
    }

    private final boolean e(zzn zzn) {
        mp.b();
        if (this.f51940b.f51600e.d(zzn.f52073a, p.ao)) {
            if (!TextUtils.isEmpty(zzn.f52074b) || !TextUtils.isEmpty(zzn.v) || !TextUtils.isEmpty(zzn.r)) {
                return true;
            }
            return false;
        } else if (!TextUtils.isEmpty(zzn.f52074b) || !TextUtils.isEmpty(zzn.r)) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final String d(zzn zzn) {
        try {
            return (String) this.f51940b.p().a(new js(this, zzn)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.f51940b.q().f51468c.a("Failed to get app instance id. appId", eb.a(zzn.f52073a), e2);
            return null;
        }
    }

    private final int a(FileChannel fileChannel) {
        g();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f51940b.q().f51468c.a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.f51940b.q().f51471f.a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e2) {
            this.f51940b.q().f51468c.a("Failed to read from channel", e2);
            return 0;
        }
    }

    private final Boolean b(ec ecVar) {
        try {
            if (ecVar.l() != -2147483648L) {
                if (ecVar.l() == ((long) c.f50295a.a(this.f51940b.m()).b(ecVar.b(), 0).versionCode)) {
                    return true;
                }
            } else {
                String str = c.f50295a.a(this.f51940b.m()).b(ecVar.b(), 0).versionName;
                if (ecVar.k() != null && ecVar.k().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final ec c(zzn zzn) {
        g();
        h();
        r.a(zzn);
        r.a(zzn.f52073a);
        ec b2 = d().b(zzn.f52073a);
        String b3 = this.f51940b.b().b(zzn.f52073a);
        lx.b();
        if (!this.f51940b.f51600e.d(null, p.au)) {
            return a(zzn, b2, b3);
        }
        if (b2 == null) {
            b2 = new ec(this.f51940b, zzn.f52073a);
            b2.a(this.f51940b.e().u());
            b2.e(b3);
        } else if (!b3.equals(b2.g())) {
            b2.e(b3);
            b2.a(this.f51940b.e().u());
        }
        b2.b(zzn.f52074b);
        b2.c(zzn.r);
        mp.b();
        if (this.f51940b.f51600e.d(b2.b(), p.ao)) {
            b2.d(zzn.v);
        }
        if (!TextUtils.isEmpty(zzn.f52083k)) {
            b2.f(zzn.f52083k);
        }
        if (zzn.f52077e != 0) {
            b2.d(zzn.f52077e);
        }
        if (!TextUtils.isEmpty(zzn.f52075c)) {
            b2.g(zzn.f52075c);
        }
        b2.c(zzn.f52082j);
        if (zzn.f52076d != null) {
            b2.h(zzn.f52076d);
        }
        b2.e(zzn.f52078f);
        b2.a(zzn.f52080h);
        if (!TextUtils.isEmpty(zzn.f52079g)) {
            b2.i(zzn.f52079g);
        }
        if (!this.f51940b.f51600e.d(null, p.aM)) {
            b2.j(zzn.f52084l);
        }
        b2.b(zzn.o);
        b2.c(zzn.p);
        b2.a(zzn.s);
        b2.f(zzn.t);
        if (b2.a()) {
            d().a(b2);
        }
        return b2;
    }

    private static void a(ay.g.a aVar) {
        aVar.b(Long.MAX_VALUE).c(Long.MIN_VALUE);
        for (int i2 = 0; i2 < aVar.c(); i2++) {
            ay.c a2 = aVar.a(i2);
            if (a2.zzf < aVar.g()) {
                aVar.b(a2.zzf);
            }
            if (a2.zzf > aVar.h()) {
                aVar.c(a2.zzf);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0259  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.google.android.gms.measurement.internal.zzn r26) {
        /*
        // Method dump skipped, instructions count: 1203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.jo.b(com.google.android.gms.measurement.internal.zzn):void");
    }

    private jo(ju juVar, byte b2) {
        r.a(juVar);
        ff a2 = ff.a(juVar.f51964a, null, null);
        this.f51940b = a2;
        this.x = -1;
        jv jvVar = new jv(this);
        jvVar.C();
        this.f51950m = jvVar;
        ef efVar = new ef(this);
        efVar.C();
        this.f51945h = efVar;
        ey eyVar = new ey(this);
        eyVar.C();
        this.f51944g = eyVar;
        a2.p().a(new jr(this, juVar));
    }

    private final void b(ay.c.a aVar, ay.c.a aVar2) {
        r.b("_e".equals(aVar.d()));
        f();
        ay.e a2 = jv.a((ay.c) ((gm) aVar.w()), "_et");
        if (a2.b() && a2.zzf > 0) {
            long j2 = a2.zzf;
            f();
            ay.e a3 = jv.a((ay.c) ((gm) aVar2.w()), "_et");
            if (a3 != null && a3.zzf > 0) {
                j2 += a3.zzf;
            }
            f().a(aVar2, "_et", Long.valueOf(j2));
            f().a(aVar, "_fr", (Object) 1L);
        }
    }

    private final void b(zzao zzao, zzn zzn) {
        mq.b();
        if (this.f51940b.f51600e.d(null, p.aO)) {
            eg a2 = eg.a(zzao);
            this.f51940b.e().a(a2.f51498b, d().i(zzn.f52073a));
            this.f51940b.e().a(a2, this.f51940b.f51600e.a(zzn.f52073a));
            zzao = a2.a();
        }
        a(zzao, zzn);
    }

    private static void a(ay.c.a aVar, String str) {
        List a2 = aVar.a();
        for (int i2 = 0; i2 < a2.size(); i2++) {
            if (str.equals(((ay.e) a2.get(i2)).zzd)) {
                aVar.b(i2);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(zzkr zzkr, zzn zzn) {
        long j2;
        g();
        h();
        if (e(zzn)) {
            if (!zzn.f52080h) {
                c(zzn);
            } else if (!"_npa".equals(zzkr.f52065a) || zzn.s == null) {
                this.f51940b.q().f51475j.a("Removing user property", this.f51940b.f().c(zzkr.f52065a));
                d().e();
                try {
                    c(zzn);
                    d().b(zzn.f52073a, zzkr.f52065a);
                    d().f();
                    this.f51940b.q().f51475j.a("User property removed", this.f51940b.f().c(zzkr.f52065a));
                } finally {
                    d().g();
                }
            } else {
                this.f51940b.q().f51475j.a("Falling back to manifest metadata value for ad personalization");
                long a2 = this.f51940b.l().a();
                if (zzn.s.booleanValue()) {
                    j2 = 1;
                } else {
                    j2 = 0;
                }
                a(new zzkr("_npa", a2, Long.valueOf(j2), "auto"), zzn);
            }
        }
    }

    private static void a(ay.c.a aVar, int i2, String str) {
        List a2 = aVar.a();
        for (int i3 = 0; i3 < a2.size(); i3++) {
            if ("_err".equals(((ay.e) a2.get(i3)).zzd)) {
                return;
            }
        }
        aVar.a((ay.e) ((gm) ay.e.e().a("_err").a(Long.valueOf((long) i2).longValue()).w())).a((ay.e) ((gm) ay.e.e().a("_ev").b(str).w()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0174, code lost:
        if (r7 == false) goto L_0x0173;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.measurement.internal.ec a(com.google.android.gms.measurement.internal.zzn r9, com.google.android.gms.measurement.internal.ec r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 406
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.jo.a(com.google.android.gms.measurement.internal.zzn, com.google.android.gms.measurement.internal.ec, java.lang.String):com.google.android.gms.measurement.internal.ec");
    }
}
