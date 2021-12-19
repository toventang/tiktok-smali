package com.facebook.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AccessToken;
import com.facebook.a.g;
import com.facebook.b;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.r;
import com.facebook.internal.t;
import com.facebook.internal.w;
import com.facebook.m;
import com.facebook.u;
import com.ss.android.ugc.aweme.bf.d;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f46814a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f46815b = h.class.getCanonicalName();

    /* renamed from: e  reason: collision with root package name */
    private static g.a f46816e = g.a.AUTO;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f46817f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static String f46818g;

    /* renamed from: h  reason: collision with root package name */
    private static String f46819h;

    /* renamed from: c  reason: collision with root package name */
    private final String f46820c;

    /* renamed from: d  reason: collision with root package name */
    private final a f46821d;

    public final void b() {
        a.a(this);
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        a.a(this);
    }

    static {
        Covode.recordClassIndex(28514);
    }

    public static Executor g() {
        if (a.a(h.class)) {
            return null;
        }
        try {
            if (f46814a == null) {
                h();
            }
            return f46814a;
        } catch (Throwable th) {
            a.a(th, h.class);
            return null;
        }
    }

    public final void c() {
        if (!a.a(this)) {
            try {
                e.a(j.EXPLICIT);
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    public static g.a a() {
        g.a aVar;
        MethodCollector.i(960);
        if (a.a(h.class)) {
            MethodCollector.o(960);
            return null;
        }
        try {
            synchronized (f46817f) {
                try {
                    aVar = f46816e;
                } finally {
                    MethodCollector.o(960);
                }
            }
            return aVar;
        } catch (Throwable th) {
            a.a(th, h.class);
            MethodCollector.o(960);
            return null;
        }
    }

    static String d() {
        String str;
        MethodCollector.i(1792);
        if (a.a(h.class)) {
            MethodCollector.o(1792);
            return null;
        }
        try {
            synchronized (f46817f) {
                try {
                    str = f46819h;
                } finally {
                    MethodCollector.o(1792);
                }
            }
            return str;
        } catch (Throwable th) {
            a.a(th, h.class);
            MethodCollector.o(1792);
            return null;
        }
    }

    static String e() {
        if (a.a(h.class)) {
            return null;
        }
        try {
            AnonymousClass2 r2 = new t.a() {
                /* class com.facebook.a.h.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(28516);
                }

                @Override // com.facebook.internal.t.a
                public final void a(String str) {
                    if (!a.a(h.class)) {
                        try {
                            ae.a();
                            SharedPreferences a2 = d.a(m.f48921g, "com.facebook.sdk.appEventPreferences", 0);
                            if (str != null) {
                                a2.edit().putString("install_referrer", str).apply();
                            }
                        } catch (Throwable th) {
                            a.a(th, h.class);
                        }
                    }
                }
            };
            if (!a.a(t.class)) {
                try {
                    if (!t.a() && !a.a(t.class)) {
                        try {
                            ae.a();
                            InstallReferrerClient a2 = InstallReferrerClient.a(m.f48921g).a();
                            try {
                                a2.a(new InstallReferrerStateListener(a2, r2) {
                                    /* class com.facebook.internal.t.AnonymousClass1 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ InstallReferrerClient f48678a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ a f48679b;

                                    static {
                                        Covode.recordClassIndex(29351);
                                    }

                                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                                    public final void onInstallReferrerServiceDisconnected() {
                                    }

                                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                                    public final void onInstallReferrerSetupFinished(int i2) {
                                        if (!com.facebook.internal.a.b.a.a(this)) {
                                            if (i2 == 0) {
                                                try {
                                                    String a2 = this.f48678a.c().a();
                                                    if (a2 != null && (a2.contains("fb") || a2.contains("facebook"))) {
                                                        this.f48679b.a(a2);
                                                    }
                                                    t.b();
                                                } catch (RemoteException unused) {
                                                }
                                            } else if (i2 == 2) {
                                                try {
                                                    t.b();
                                                } catch (Throwable th) {
                                                    com.facebook.internal.a.b.a.a(th, this);
                                                }
                                            }
                                        }
                                    }

                                    {
                                        this.f48678a = r1;
                                        this.f48679b = r2;
                                    }
                                });
                            } catch (Exception unused) {
                            }
                        } catch (Throwable th) {
                            a.a(th, t.class);
                        }
                    }
                } catch (Throwable th2) {
                    a.a(th2, t.class);
                }
            }
            ae.a();
            return d.a(m.f48921g, "com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        } catch (Throwable th3) {
            a.a(th3, h.class);
            return null;
        }
    }

    private static void h() {
        MethodCollector.i(1846);
        if (a.a(h.class)) {
            MethodCollector.o(1846);
            return;
        }
        try {
            synchronized (f46817f) {
                try {
                    if (f46814a == null) {
                        f46814a = new ScheduledThreadPoolExecutor(1);
                        f46814a.scheduleAtFixedRate(new Runnable() {
                            /* class com.facebook.a.h.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(28517);
                            }

                            public final void run() {
                                if (!a.a(this)) {
                                    try {
                                        HashSet<String> hashSet = new HashSet();
                                        for (a aVar : e.a()) {
                                            hashSet.add(aVar.getApplicationId());
                                        }
                                        for (String str : hashSet) {
                                            r.a(str, true);
                                        }
                                    } catch (Throwable th) {
                                        a.a(th, this);
                                    }
                                }
                            }
                        }, 0, 86400, TimeUnit.SECONDS);
                        MethodCollector.o(1846);
                    }
                } finally {
                    MethodCollector.o(1846);
                }
            }
        } catch (Throwable th) {
            a.a(th, h.class);
            MethodCollector.o(1846);
        }
    }

    public static void a(String str) {
        if (!a.a(h.class)) {
            try {
                w.a(u.DEVELOPER_ERRORS, "AppEvents", str);
            } catch (Throwable th) {
                a.a(th, h.class);
            }
        }
    }

    public static String a(Context context) {
        MethodCollector.i(3745);
        if (a.a(h.class)) {
            MethodCollector.o(3745);
            return null;
        }
        try {
            if (f46818g == null) {
                synchronized (f46817f) {
                    try {
                        if (f46818g == null) {
                            String string = d.a(context, "com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                            f46818g = string;
                            if (string == null) {
                                f46818g = "XZ" + UUID.randomUUID().toString();
                                d.a(context, "com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", f46818g).apply();
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(3745);
                        throw th;
                    }
                }
            }
            String str = f46818g;
            MethodCollector.o(3745);
            return str;
        } catch (Throwable th2) {
            a.a(th2, h.class);
            MethodCollector.o(3745);
            return null;
        }
    }

    public h(Context context, String str) {
        this(ad.c(context), str, null);
    }

    h(String str, String str2, AccessToken accessToken) {
        ae.a();
        this.f46820c = str;
        AccessToken accessToken2 = b.a().f46926b;
        if (accessToken2 == null || accessToken2.b()) {
            if (str2 == null) {
                ae.a();
                str2 = ad.a(m.f48921g);
            }
            this.f46821d = new a(null, str2);
        } else {
            if (str2 == null || str2.equals(accessToken2.f46501h)) {
                this.f46821d = new a(accessToken2);
            }
            this.f46821d = new a(null, str2);
        }
        h();
    }
}
