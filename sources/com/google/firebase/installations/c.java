package com.google.firebase.installations;

import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.c.ac;
import com.google.android.gms.c.h;
import com.google.android.gms.c.i;
import com.google.android.gms.c.k;
import com.google.android.gms.common.internal.r;
import com.google.firebase.b;
import com.google.firebase.installations.a.c;
import com.google.firebase.installations.a.d;
import com.google.firebase.installations.b.e;
import com.google.firebase.installations.i;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class c implements h {

    /* renamed from: l  reason: collision with root package name */
    private static final Object f54562l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private static final ThreadFactory f54563m = new ThreadFactory() {
        /* class com.google.firebase.installations.c.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f54575a = new AtomicInteger(1);

        static {
            Covode.recordClassIndex(33853);
        }

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, a.a("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f54575a.getAndIncrement())}));
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final ExecutorService f54564a;

    /* renamed from: b  reason: collision with root package name */
    private final b f54565b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.installations.b.c f54566c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.firebase.installations.a.c f54567d;

    /* renamed from: e  reason: collision with root package name */
    private final o f54568e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.firebase.installations.a.b f54569f;

    /* renamed from: g  reason: collision with root package name */
    private final m f54570g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f54571h;

    /* renamed from: i  reason: collision with root package name */
    private final ExecutorService f54572i;

    /* renamed from: j  reason: collision with root package name */
    private String f54573j;

    /* renamed from: k  reason: collision with root package name */
    private final List<n> f54574k;

    private String g() {
        return this.f54565b.c().f54362g;
    }

    private String h() {
        return this.f54565b.c().f54357b;
    }

    private String i() {
        return this.f54565b.c().f54356a;
    }

    @Override // com.google.firebase.installations.h
    public final h<Void> c() {
        return k.a(this.f54572i, new e(this));
    }

    static {
        Covode.recordClassIndex(33852);
    }

    private String k() {
        String str = this.f54573j;
        if (str != null) {
            return str;
        }
        d d2 = d();
        this.f54564a.execute(f.a(this));
        return d2.a();
    }

    @Override // com.google.firebase.installations.h
    public final h<String> a() {
        f();
        i iVar = new i();
        iVar.b(k());
        return iVar.f49902a;
    }

    @Override // com.google.firebase.installations.h
    public final h<l> b() {
        f();
        h<l> j2 = j();
        this.f54572i.execute(new d(this));
        return j2;
    }

    private void f() {
        r.a(h());
        r.a(g());
        r.a(i());
        r.b(h().contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(o.f54591b.matcher(i()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private h<l> j() {
        MethodCollector.i(12246);
        i iVar = new i();
        k kVar = new k(this.f54568e, iVar);
        synchronized (this.f54571h) {
            try {
                this.f54574k.add(kVar);
            } catch (Throwable th) {
                MethodCollector.o(12246);
                throw th;
            }
        }
        ac<TResult> acVar = iVar.f49902a;
        MethodCollector.o(12246);
        return acVar;
    }

    private d l() {
        d a2;
        MethodCollector.i(12533);
        synchronized (f54562l) {
            try {
                b a3 = b.a(this.f54565b.a(), "generatefid.lock");
                try {
                    a2 = this.f54567d.a();
                    if (a3 != null) {
                        a3.a();
                    }
                } catch (Throwable th) {
                    if (a3 != null) {
                        a3.a();
                    }
                    MethodCollector.o(12533);
                    throw th;
                }
            } finally {
                MethodCollector.o(12533);
            }
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.c$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f54576a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f54577b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|7|8|9|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0023 */
        static {
            /*
                r0 = 33854(0x843e, float:4.744E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.firebase.installations.b.e$b[] r0 = com.google.firebase.installations.b.e.b.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.google.firebase.installations.c.AnonymousClass2.f54577b = r1
                r4 = 1
                com.google.firebase.installations.b.e$b r0 = com.google.firebase.installations.b.e.b.OK     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                r3 = 2
                int[] r1 = com.google.firebase.installations.c.AnonymousClass2.f54577b     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.google.firebase.installations.b.e$b r0 = com.google.firebase.installations.b.e.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.google.firebase.installations.c.AnonymousClass2.f54577b     // Catch:{ NoSuchFieldError -> 0x002e }
                com.google.firebase.installations.b.e$b r0 = com.google.firebase.installations.b.e.b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                com.google.firebase.installations.b.d$b[] r0 = com.google.firebase.installations.b.d.b.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.google.firebase.installations.c.AnonymousClass2.f54576a = r1
                com.google.firebase.installations.b.d$b r0 = com.google.firebase.installations.b.d.b.OK     // Catch:{ NoSuchFieldError -> 0x003f }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r1 = com.google.firebase.installations.c.AnonymousClass2.f54576a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.firebase.installations.b.d$b r0 = com.google.firebase.installations.b.d.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.AnonymousClass2.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public final d d() {
        d a2;
        String a3;
        MethodCollector.i(12531);
        synchronized (f54562l) {
            try {
                b a4 = b.a(this.f54565b.a(), "generatefid.lock");
                try {
                    a2 = this.f54567d.a();
                    if (a2.l()) {
                        if ((this.f54565b.b().equals("CHIME_ANDROID_SDK") || this.f54565b.f()) && a2.b() == c.a.ATTEMPT_MIGRATION) {
                            a3 = this.f54569f.b();
                            if (TextUtils.isEmpty(a3)) {
                                a3 = m.a();
                            }
                        } else {
                            a3 = m.a();
                        }
                        a2 = this.f54567d.a(a2.h().a(a3).a(c.a.UNREGISTERED).a());
                    }
                    if (a4 != null) {
                        a4.a();
                    }
                } catch (Throwable th) {
                    if (a4 != null) {
                        a4.a();
                    }
                    MethodCollector.o(12531);
                    throw th;
                }
            } finally {
                MethodCollector.o(12531);
            }
        }
        return a2;
    }

    public final Void e() {
        this.f54573j = null;
        d l2 = l();
        if (l2.i()) {
            try {
                com.google.firebase.installations.b.c cVar = this.f54566c;
                String i2 = i();
                String a2 = l2.a();
                String g2 = g();
                String d2 = l2.d();
                int i3 = 0;
                URL url = new URL(a.a("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", a.a("projects/%s/installations/%s", new Object[]{g2, a2})}));
                do {
                    HttpURLConnection a3 = cVar.a(url, i2);
                    try {
                        a3.setRequestMethod(com.bytedance.d.a.a.a.a.a.f28514d);
                        a3.addRequestProperty("Authorization", "FIS_v2 ".concat(String.valueOf(d2)));
                        int responseCode = a3.getResponseCode();
                        if (!(responseCode == 200 || responseCode == 401)) {
                            if (responseCode != 404) {
                                com.google.firebase.installations.b.c.a(a3, (String) null, i2, g2);
                                if (responseCode == 429 || (responseCode >= 500 && responseCode < 600)) {
                                    i3++;
                                } else {
                                    throw new i("Bad config while trying to delete FID", i.a.BAD_CONFIG);
                                }
                            }
                        }
                        a3.disconnect();
                    } finally {
                        a3.disconnect();
                    }
                } while (i3 <= 1);
                throw new IOException();
            } catch (com.google.firebase.d unused) {
                throw new i("Failed to delete a Firebase Installation.", i.a.BAD_CONFIG);
            }
        }
        b(l2.m());
        return null;
    }

    private void b(d dVar) {
        MethodCollector.i(12396);
        synchronized (f54562l) {
            try {
                b a2 = b.a(this.f54565b.a(), "generatefid.lock");
                try {
                    this.f54567d.a(dVar);
                    if (a2 != null) {
                        a2.a();
                    }
                } catch (Throwable th) {
                    if (a2 != null) {
                        a2.a();
                    }
                    MethodCollector.o(12396);
                    throw th;
                }
            } finally {
                MethodCollector.o(12396);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(d dVar) {
        MethodCollector.i(12247);
        synchronized (this.f54571h) {
            try {
                Iterator<n> it = this.f54574k.iterator();
                while (it.hasNext()) {
                    if (it.next().a(dVar)) {
                        it.remove();
                    }
                }
            } finally {
                MethodCollector.o(12247);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        d dVar;
        d l2 = l();
        try {
            if (l2.j() || l2.k()) {
                dVar = a(this, l2);
            } else if (z || o.a(l2)) {
                e a2 = this.f54566c.a(i(), l2.a(), g(), l2.d());
                int i2 = AnonymousClass2.f54577b[a2.c().ordinal()];
                if (i2 == 1) {
                    String a3 = a2.a();
                    long b2 = a2.b();
                    dVar = l2.h().b(a3).a(b2).b(o.a()).a();
                } else if (i2 == 2) {
                    dVar = l2.a("BAD CONFIG");
                } else if (i2 == 3) {
                    this.f54573j = null;
                    dVar = l2.m();
                } else {
                    throw new IOException();
                }
            } else {
                return;
            }
            b(dVar);
            if (dVar.i()) {
                this.f54573j = dVar.a();
            }
            if (dVar.j()) {
                a(dVar, new i(i.a.BAD_CONFIG));
            } else if (dVar.l()) {
                a(dVar, new IOException("cleared fid due to auth error"));
            } else {
                a(dVar);
            }
        } catch (IOException e2) {
            a(l2, e2);
        }
    }

    private void a(d dVar, Exception exc) {
        MethodCollector.i(12248);
        synchronized (this.f54571h) {
            try {
                Iterator<n> it = this.f54574k.iterator();
                while (it.hasNext()) {
                    if (it.next().a(dVar, exc)) {
                        it.remove();
                    }
                }
            } finally {
                MethodCollector.o(12248);
            }
        }
    }

    private static d a(c cVar, d dVar) {
        String str = null;
        try {
            if (dVar.a().length() == 11) {
                str = cVar.f54569f.a();
            }
            com.google.firebase.installations.b.d a2 = cVar.f54566c.a(cVar.i(), dVar.a(), cVar.g(), cVar.h(), str);
            int i2 = AnonymousClass2.f54576a[a2.e().ordinal()];
            if (i2 == 1) {
                String b2 = a2.b();
                String c2 = a2.c();
                long a3 = o.a();
                String a4 = a2.d().a();
                return dVar.h().a(b2).a(c.a.REGISTERED).b(a4).c(c2).a(a2.d().b()).b(a3).a();
            } else if (i2 == 2) {
                return dVar.a("BAD CONFIG");
            } else {
                throw new IOException();
            }
        } catch (NullPointerException e2) {
            e2.printStackTrace();
            return dVar.a("BAD CONFIG");
        }
    }

    c(b bVar, com.google.firebase.f.h hVar, com.google.firebase.c.c cVar) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f54563m), bVar, new com.google.firebase.installations.b.c(bVar.a(), hVar, cVar), new com.google.firebase.installations.a.c(bVar), new o(), new com.google.firebase.installations.a.b(bVar), new m());
    }

    private c(ExecutorService executorService, b bVar, com.google.firebase.installations.b.c cVar, com.google.firebase.installations.a.c cVar2, o oVar, com.google.firebase.installations.a.b bVar2, m mVar) {
        this.f54571h = new Object();
        this.f54573j = null;
        this.f54574k = new ArrayList();
        this.f54565b = bVar;
        this.f54566c = cVar;
        this.f54567d = cVar2;
        this.f54568e = oVar;
        this.f54569f = bVar2;
        this.f54570g = mVar;
        this.f54572i = executorService;
        this.f54564a = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f54563m);
    }
}
