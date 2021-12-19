package com.bytedance.ies.ugc.aweme.commercialize.splash.show;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.j;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity;
import com.ss.android.ad.splash.core.h;
import com.ss.android.ad.splash.u;
import com.ss.android.ad.splash.v;
import com.ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import h.f.b.l;
import h.f.b.m;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static boolean f34860a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f34861b = new d();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f34862c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f34863d;

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34866a = new c();

        static {
            Covode.recordClassIndex(20911);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f34868a = new e();

        static {
            Covode.recordClassIndex(20913);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final g f34870a = new g();

        static {
            Covode.recordClassIndex(20915);
        }

        g() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private d() {
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34864a = new a();

        static {
            Covode.recordClassIndex(20909);
        }

        a() {
            super(0);
        }

        public static boolean a() {
            if (!com.ss.android.ugc.aweme.compliance.api.a.k().f()) {
                return true;
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }
    }

    static {
        Covode.recordClassIndex(20908);
    }

    public static void a() {
        b();
        c();
        d();
    }

    private static void b() {
        com.bytedance.ies.ugc.appcontext.f.g().a(C0787d.f34867a, e.f34868a);
    }

    private static void c() {
        com.bytedance.ies.ugc.appcontext.f.i().a(f.f34869a, g.f34870a);
    }

    private static void d() {
        com.bytedance.ies.ugc.appcontext.f.c().a(b.f34865a, c.f34866a);
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f34869a = new f();

        static {
            Covode.recordClassIndex(20914);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (SettingsManager.a().a("splash_quit_enable", true)) {
                com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.b(com.bytedance.ies.ugc.appcontext.d.a()).c();
            }
        }
    }

    private final boolean c(Context context) {
        if (!com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.a() || !a(context)) {
            return false;
        }
        return d(context);
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34865a = new b();

        static {
            Covode.recordClassIndex(20910);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Intent intent;
            Activity activity = (Activity) obj;
            if (activity != null) {
                if (SettingsManager.a().a("prevent_push_topview", true) && (intent = activity.getIntent()) != null) {
                    com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34767b = intent.getBooleanExtra("from_notification", false);
                }
                d.f34861b.a(activity, 2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.show.d$d  reason: collision with other inner class name */
    public static final class C0787d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final C0787d f34867a = new C0787d();

        static {
            Covode.recordClassIndex(20912);
        }

        C0787d() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
            l.b(bool, "");
            if (bool.booleanValue()) {
                com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.b(a2).b();
                d.f34860a = true;
            } else if (com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.a()) {
                if (h.f58574c == null) {
                    com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.a(a2);
                }
                com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.b(a2).a();
            }
        }
    }

    private static boolean b(Context context) {
        boolean z;
        if (!f34860a) {
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34767b = false;
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34769d = false;
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34768c = false;
            return false;
        }
        f34860a = false;
        if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34768c || !(context instanceof Activity)) {
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34767b = false;
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34769d = false;
            z = false;
        } else if (context instanceof NormalSplashAdActivity) {
            return false;
        } else {
            com.bytedance.ies.ugc.aweme.commercialize.splash.a.b a2 = com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a();
            if ((a2 != null && a2.a((Activity) context)) || !a(context, false)) {
                return false;
            }
            z = d(context);
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34769d = z;
        }
        com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34768c = false;
        return z;
    }

    private static boolean d(Context context) {
        com.bytedance.ies.ugc.aweme.commercialize.splash.a.b a2 = com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a();
        if (a2 != null && a2.h()) {
            TroubleshootingLogDelegate.ordinarySplashLog$default(TroubleshootingLogDelegate.INSTANCE, "Don't show the normal open screen Reason: the trace function is turned on", null, 0, 6, null);
            return false;
        } else if (context == null) {
            TroubleshootingLogDelegate.ordinarySplashLog$default(TroubleshootingLogDelegate.INSTANCE, "Don't show the normal open screen Reason: context == null", null, 0, 6, null);
            return false;
        } else if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34767b) {
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34767b = false;
            TroubleshootingLogDelegate.ordinarySplashLog$default(TroubleshootingLogDelegate.INSTANCE, "Don’t show the normal open screen Reason: Come in from the notification point, don’t show the ad", null, 0, 6, null);
            return false;
        } else {
            u a3 = com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.a(context);
            if (a3 == null) {
                TroubleshootingLogDelegate.ordinarySplashLog$default(TroubleshootingLogDelegate.INSTANCE, "Don’t show the normal open screen Reason: splashAdManager is empty", null, 0, 6, null);
                return false;
            }
            v f2 = a3.f();
            l.b(f2, "");
            NormalSplashAdActivity.a aVar = new NormalSplashAdActivity.a();
            f2.a(aVar);
            i.f34792h = null;
            i.f34793i = false;
            return NormalSplashAdActivity.f34850a.a(context, f2, f2.a(context), aVar);
        }
    }

    public final boolean a(Context context) {
        MethodCollector.i(9475);
        l.d(context, "");
        if (f34862c) {
            boolean z = f34863d;
            MethodCollector.o(9475);
            return z;
        }
        synchronized (this) {
            try {
                if (!f34862c) {
                    if (j.d()) {
                        com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.a();
                        com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.b();
                    }
                    com.bytedance.ies.ugc.aweme.commercialize.splash.d.a.a("get_splash_manager");
                    com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.a(context);
                    com.bytedance.ies.ugc.aweme.commercialize.splash.d.a.b("get_splash_manager");
                    com.bytedance.ies.ugc.aweme.commercialize.splash.d.a.a("has_splash_ad");
                    f34863d = a(context, true);
                    com.bytedance.ies.ugc.aweme.commercialize.splash.d.a.b("has_splash_ad");
                    f34862c = true;
                }
            } catch (Throwable th) {
                MethodCollector.o(9475);
                throw th;
            }
        }
        boolean z2 = f34863d;
        MethodCollector.o(9475);
        return z2;
    }

    private static boolean a(Context context, boolean z) {
        if (a.a()) {
            return false;
        }
        com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.a(context).a(z ? 1 : 0);
        return com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.a(context).g();
    }

    public final boolean a(Context context, int i2) {
        l.d(context, "");
        if (i2 == 1) {
            return c(context);
        }
        if (i2 == 2) {
            return b(context);
        }
        return false;
    }
}
