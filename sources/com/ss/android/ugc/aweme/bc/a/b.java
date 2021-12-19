package com.ss.android.ugc.aweme.bc.a;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.fu;
import com.ss.android.ugc.aweme.experiment.j;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.InitAVModule;
import com.ss.android.ugc.aweme.legoImp.task.InitPushTask;
import com.ss.android.ugc.aweme.legoImp.task.ae;
import com.ss.android.ugc.aweme.logger.a;
import h.f.b.l;
import java.util.Objects;

public final class b implements Runnable {
    static {
        Covode.recordClassIndex(42194);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InitAVModule f68524a;

        static {
            Covode.recordClassIndex(42195);
        }

        a(InitAVModule initAVModule) {
            this.f68524a = initAVModule;
        }

        public final void run() {
            InitAVModule.c();
        }
    }

    public final void run() {
        a.b.f109011a.a("method_ensure_duration", false);
        if (!com.ss.android.ugc.aweme.lego.b.g()) {
            a.b.f109011a.a("method_fresco_ensure_duration", false);
            w c2 = ae.c();
            l.b(c2, "");
            f.a(c2);
            a.b.f109011a.b("method_fresco_ensure_duration", false);
        }
        a.b.f109011a.a("method_business_tools_ensure_duration", false);
        w g2 = ae.g();
        l.b(g2, "");
        f.a(g2);
        a.b.f109011a.b("method_business_tools_ensure_duration", false);
        a.b.f109011a.a("method_absdk_ensure_duration", false);
        w d2 = ae.d();
        l.b(d2, "");
        f.a(d2);
        a.b.f109011a.b("method_absdk_ensure_duration", false);
        a.b.f109011a.a("method_init_module_ensure_duration", false);
        w b2 = ae.b();
        l.b(b2, "");
        f.a(b2);
        a.b.f109011a.b("method_init_module_ensure_duration", false);
        if (!d.d()) {
            a.b.f109011a.a("method_cancel_notification_ensure_duration", false);
            w h2 = ae.h();
            l.b(h2, "");
            f.a(h2);
            a.b.f109011a.b("method_cancel_notification_ensure_duration", false);
        }
        if (com.ss.android.ugc.aweme.s.a.c()) {
            a.b.f109011a.a("method_router_ensure_duration", false);
            w j2 = ae.j();
            l.b(j2, "");
            f.a(j2);
            a.b.f109011a.b("method_router_ensure_duration", false);
        }
        if (!fu.c() && com.ss.android.ugc.aweme.s.a.d()) {
            a.b.f109011a.a("method_init_push_early_ensure_duration", false);
            w e2 = ae.e();
            l.b(e2, "");
            f.a(e2);
            a.b.f109011a.b("method_init_push_early_ensure_duration", false);
        }
        if (com.ss.android.ugc.aweme.s.a.e()) {
            a.b.f109011a.a("method_init_avmodule_ensure_duration", false);
            w m2 = ae.m();
            Objects.requireNonNull(m2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.legoImp.task.InitAVModule");
            InitAVModule initAVModule = (InitAVModule) m2;
            f.a((w) initAVModule);
            if (l.a(Looper.getMainLooper(), Looper.myLooper())) {
                InitAVModule.c();
            } else {
                p.a().post(new a(initAVModule));
            }
            a.b.f109011a.b("method_init_avmodule_ensure_duration", false);
        }
        if (!fu.c() && InitPushTask.c()) {
            a.b.f109011a.a("method_init_push_async_ensure_duration", false);
            w e3 = ae.e();
            l.b(e3, "");
            f.a(e3);
            a.b.f109011a.b("method_init_push_async_ensure_duration", false);
        }
        a.b.f109011a.a("method_power_page_ensure_duration", false);
        w i2 = ae.i();
        l.b(i2, "");
        f.a(i2);
        a.b.f109011a.b("method_power_page_ensure_duration", false);
        a.b.f109011a.a("method_init_foundation_ensure_duration", false);
        w k2 = ae.k();
        l.b(k2, "");
        f.a(k2);
        a.b.f109011a.b("method_init_foundation_ensure_duration", false);
        a.b.f109011a.a("method_init_ui_ensure_duration", false);
        w l2 = ae.l();
        l.b(l2, "");
        f.a(l2);
        a.b.f109011a.b("method_init_ui_ensure_duration", false);
        if (!com.ss.android.ugc.aweme.s.a.h()) {
            a.b.f109011a.a("method_int_player_kit_ensure_duration", false);
            w a2 = ae.a();
            l.b(a2, "");
            f.a(a2);
            a.b.f109011a.b("method_int_player_kit_ensure_duration", false);
        }
        if (j.b()) {
            a.b.f109011a.a("method_int_appflyer_ensure_duration", false);
            w p = ae.p();
            l.b(p, "");
            f.a(p);
            a.b.f109011a.b("method_int_appflyer_ensure_duration", false);
        }
        a.b.f109011a.b("method_ensure_duration", false);
    }
}
