package com.ss.android.ugc.aweme.application;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.e;
import com.bytedance.ies.abmock.j;
import com.bytedance.ies.abmock.l;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.librarian.Librarian;
import com.bytedance.librarian.LibrarianMonitor;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.ss.android.ugc.aweme.application.m;
import com.ss.android.ugc.aweme.application.o;
import com.ss.android.ugc.aweme.bc.a.b;
import com.ss.android.ugc.aweme.bc.a.c;
import com.ss.android.ugc.aweme.bc.a.h;
import com.ss.android.ugc.aweme.ca.b;
import com.ss.android.ugc.aweme.experiment.bg;
import com.ss.android.ugc.aweme.experiment.ex;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.legoImp.task.ColdBootInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadWireFieldNoEnumClassTask;
import com.ss.android.ugc.aweme.legoImp.task.TrimMemoryTask;
import com.ss.android.ugc.aweme.legoImp.task.af;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.setting.TiktokSkinHelper;
import com.ss.android.ugc.aweme.utils.DeadSystemExceptionTask;
import com.ss.android.ugc.aweme.utils.aw;
import java.util.HashMap;
import java.util.List;

public class AwemeApplicationImpl extends f {

    /* renamed from: a  reason: collision with root package name */
    public static long f66920a;

    /* renamed from: b  reason: collision with root package name */
    public final a f66921b = new AwemeAppTaskProvider();

    /* renamed from: c  reason: collision with root package name */
    protected Application f66922c;

    /* renamed from: d  reason: collision with root package name */
    protected AppBuildConfig f66923d;

    /* renamed from: e  reason: collision with root package name */
    public w f66924e;

    /* renamed from: f  reason: collision with root package name */
    public w f66925f;

    /* renamed from: g  reason: collision with root package name */
    public f.d f66926g;

    /* renamed from: h  reason: collision with root package name */
    public f.d f66927h;

    /* renamed from: i  reason: collision with root package name */
    private final h f66928i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f66929j;

    static {
        Covode.recordClassIndex(41243);
    }

    /* access modifiers changed from: package-private */
    public class BeforeSuperOnCreateLegoTasks implements a, w {
        static {
            Covode.recordClassIndex(41246);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.a
        public final String[] c() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.a
        public final int d() {
            return 1;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BACKGROUND;
        }

        @Override // com.ss.android.ugc.aweme.lego.a
        public final ac e() {
            return ac.CPU;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        BeforeSuperOnCreateLegoTasks() {
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            AwemeApplicationImpl awemeApplicationImpl = AwemeApplicationImpl.this;
            awemeApplicationImpl.f66927h = AwemeApplicationImpl.b(awemeApplicationImpl.f66921b.c());
        }
    }

    /* access modifiers changed from: package-private */
    public class OnCreateLegoTasks implements a, w {
        static {
            Covode.recordClassIndex(41247);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.a
        public final String[] c() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.a
        public final int d() {
            return 1;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BACKGROUND;
        }

        @Override // com.ss.android.ugc.aweme.lego.a
        public final ac e() {
            return ac.CPU;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        OnCreateLegoTasks() {
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            AwemeApplicationImpl awemeApplicationImpl = AwemeApplicationImpl.this;
            awemeApplicationImpl.f66926g = AwemeApplicationImpl.b(awemeApplicationImpl.f66921b.d());
        }
    }

    @Override // com.ss.android.ugc.aweme.application.f, com.ss.android.ugc.aweme.application.i
    public final boolean c() {
        return this.f66929j;
    }

    @Override // com.ss.android.ugc.aweme.application.f, com.ss.android.ugc.aweme.application.i
    public final boolean d() {
        return this.f66929j;
    }

    /* access modifiers changed from: protected */
    public void handleAttachBaseContext() {
        d.handleAttachBaseContext(this);
    }

    /* access modifiers changed from: protected */
    public List<n> attachBaseContextAfterMultiDex() {
        return e.attachBaseContextAfterMultiDex(this);
    }

    @Override // com.ss.android.ugc.aweme.application.f, com.ss.android.ugc.aweme.application.i
    public final void b() {
        if (!this.f66929j) {
            if (f.b()) {
                f.a(this.f66924e);
                this.f66926g.a(new MainLooperOptService());
                this.f66926g.a();
            } else {
                a(this.f66921b.d());
            }
            a(this.f66921b.e());
            new b().run();
            if (com.ss.android.common.util.f.a(this.f66922c)) {
                a.b.f109011a.b("cold_boot_application_create_duration", true);
                aw.b("cold_boot_application_create_duration");
                a.b.f109011a.a("cold_boot_application_to_main", true);
                aw.a("cold_boot_application_to_main");
                a.b.f109011a.a("cold_boot_application_to_stubmain", false);
                a.b.f109011a.f109008i = System.currentTimeMillis();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.application.f, com.ss.android.ugc.aweme.application.i
    public final void a() {
        if (!this.f66929j) {
            if (com.ss.android.common.util.f.a(this.f66922c)) {
                a.b.f109011a.b("cold_boot_application_attach_to_create", true);
                aw.b("cold_boot_application_attach_to_create");
                a.b.f109011a.a("cold_boot_application_create_duration", true);
                aw.a("cold_boot_application_create_duration");
            }
            if (com.ss.android.ugc.aweme.s.a.j()) {
                f.a(DeadSystemExceptionTask.f142563a);
            }
            f.d e2 = f.e();
            if (com.ss.android.ugc.aweme.s.a.d()) {
                com.ss.android.message.a.a(g.a());
                e2.a(com.ss.android.ugc.aweme.legoImp.task.ae.q()).a(com.ss.android.ugc.aweme.legoImp.task.ae.e());
            }
            e2.a(com.ss.android.ugc.aweme.legoImp.task.ae.q());
            if (!SettingsRequestServiceImpl.i().h()) {
                e2.a(com.ss.android.ugc.aweme.legoImp.task.ae.a());
            }
            e2.a();
            if (!com.ss.android.ugc.aweme.s.a.b()) {
                Application application = this.f66922c;
                com.ss.android.ugc.aweme.storagemanager.a.a(application, com.ss.android.common.util.f.a(application));
            }
            if (f.b()) {
                f.a(this.f66925f);
                this.f66927h.a();
                return;
            }
            a(this.f66921b.c());
        }
    }

    @Override // com.ss.android.ugc.aweme.application.f, com.ss.android.ugc.aweme.application.i
    public final Resources a(Resources resources) {
        TiktokSkinHelper.a(resources);
        return resources;
    }

    static void a(List<n> list) {
        f.d b2 = b(list);
        if (b2 != null) {
            b2.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.application.f, com.ss.android.ugc.aweme.application.i
    public final void a(int i2) {
        new f.c().b((w) new TrimMemoryTask(i2)).a();
    }

    public static f.d b(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        f.d a2 = p.a("application", f.a());
        for (n nVar : list) {
            a2.a(nVar);
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.application.f, com.ss.android.ugc.aweme.application.i
    public final String a(String str) {
        Logger.debug();
        String b2 = com.ss.android.common.util.f.b(this.f66922c);
        if (!m.a(b2) && !m.a(str) && b2.endsWith(":ad")) {
            int i2 = Build.VERSION.SDK_INT;
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.application.f, com.ss.android.ugc.aweme.application.i
    public final void a(final Context context) {
        Librarian.a(context, this.f66923d.a(), new LibrarianMonitor() {
            /* class com.ss.android.ugc.aweme.application.AwemeApplicationImpl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(41244);
            }

            @Override // com.bytedance.librarian.LibrarianMonitor
            public final void a(String str) {
                n.a(context, str, true, true);
                super.a(str);
                n.a(context, str, true, false);
            }
        });
        if (Build.VERSION.SDK_INT >= 30 || (Build.VERSION.SDK_INT == 29 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            com.bytedance.mira.plugin.hook.flipped.a.a();
        }
        com.ss.android.ugc.aweme.lancet.a.a.a(this.f66922c, context);
        com.ss.android.ugc.aweme.app.k.a.a(this.f66923d.b());
        d.a("api-va.tiktokv.com", "ichannel-va.tiktokv.com", "api-va.tiktokv.com");
        com.ss.android.ugc.aweme.launcher.service.account.a.f107290a.a(d.f34604k.f34586a, d.f34604k.f34587b, d.f34604k.f34588c);
        com.ss.android.ugc.aweme.launcher.service.account.a.f107290a.b("musical_ly");
        com.ss.android.ugc.aweme.net.b.a.a();
    }

    @Override // com.ss.android.ugc.aweme.application.f, com.ss.android.ugc.aweme.application.i
    public final void a(Configuration configuration) {
        super.a(configuration);
        InitAllServiceImpl.q().n();
    }

    @Override // com.ss.android.ugc.aweme.application.f, com.ss.android.ugc.aweme.application.i
    public final void b(Context context) {
        if (com.ss.android.common.util.f.a(this.f66922c)) {
            a.b.f109011a.a("app_start_to_main_focus_v2", true);
            a.b.f109011a.a("app_start_v2_to_v1", true);
            a.b.f109011a.a("cold_boot_application_attach_before_base_duration", false);
        }
        com.ss.android.ugc.trill.i.a.a(com.ss.android.common.util.f.a(this.f66922c), this.f66922c);
        com.ss.android.ugc.aweme.app.launch.a.a(this.f66922c, this.f66923d);
        com.ss.android.ugc.aweme.bf.a.a(context);
        j a2 = j.a();
        l lVar = b.f66934a;
        a2.f31866c = lVar;
        e.a().f31828d = lVar.a();
        if (Build.VERSION.SDK_INT < 23 || !Process.is64Bit()) {
            com.ss.android.ugc.aweme.cw.g.a().execute(m.a.f66948a);
        }
        Application application = this.f66922c;
        if (application != null && com.ss.android.common.util.f.a(application)) {
            Application application2 = this.f66922c;
            h.f.b.l.d(application2, "");
            if (bg.a() != 0 && Build.VERSION.SDK_INT < 26) {
                com.ss.android.ugc.aweme.cw.g.c().execute(new b.a(application2));
            }
        }
        if (((Boolean) com.ss.android.ugc.aweme.lego.e.n.getValue()).booleanValue() && Build.VERSION.SDK_INT > 21) {
            com.ss.android.ugc.aweme.cw.g.a().execute(m.b.f66949a);
        }
        com.ss.android.ugc.aweme.app.launch.a.a(this.f66922c);
        this.f66928i.a(this.f66922c);
        if (((Boolean) com.ss.android.ugc.aweme.s.a.f120732f.getValue()).booleanValue()) {
            f.e().a(com.ss.android.legoapi.abtest.a.f59609a.c()).a();
        }
        if (Build.VERSION.SDK_INT > 19 && com.ss.android.common.util.f.a(context) && ((Boolean) com.ss.android.ugc.aweme.lego.b.f107386c.getValue()).booleanValue()) {
            com.ss.android.ugc.aweme.cw.g.a().execute(o.a.f66959a);
        }
        if (com.ss.android.ugc.aweme.lego.d.d()) {
            new h().run();
            new PreloadWireFieldNoEnumClassTask().a(this.f66922c);
            new c().run();
            new com.ss.android.ugc.aweme.bc.a.a().run();
        }
        if (ex.c() || ex.d()) {
            com.ss.android.ugc.aweme.cw.g.b().execute(c.f66935a);
        }
        if (com.ss.android.common.util.f.a(this.f66922c)) {
            a.b.f109011a.b("cold_boot_application_attach_before_base_duration", false);
        }
        if (com.bytedance.ies.ugc.statisticlogger.b.a.b()) {
            com.ss.android.i.d.f59580d.putAll(new HashMap<String, Boolean>() {
                /* class com.ss.android.ugc.aweme.application.AwemeApplicationImpl.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(41245);
                }

                {
                    put("activity", true);
                    put("show", true);
                    put("launch_time", true);
                    put("feed_request", true);
                    put("feed_request_response", true);
                    put("launch_app", true);
                    put("launch_log", true);
                    put("firebase_to_server", true);
                }
            });
        }
        if (((Boolean) com.ss.android.ugc.aweme.experiment.aw.f89568b.getValue()).booleanValue()) {
            com.ss.android.ugc.aweme.cw.g.b().execute(af.a.f107959a);
        }
        if (com.ss.android.ugc.aweme.s.a.i()) {
            f.e().a(com.ss.android.ugc.aweme.legoImp.task.ae.n()).a();
        }
        if (com.ss.android.common.util.f.a(this.f66922c)) {
            aw.a("cold_boot_application_attach_duration");
        }
        if (ex.d() || ex.c()) {
            f.e().a(com.ss.android.legoapi.a.f59607a.f()).a();
        }
        f.e().a(new ColdBootInitTask()).a();
        if (com.ss.android.ugc.aweme.s.a.p()) {
            f.e().a(com.ss.android.ugc.aweme.legoImp.task.ae.t()).a();
        }
        a(this.f66921b.a());
        boolean a3 = com.ss.android.ugc.aweme.app.services.b.a(this.f66922c);
        this.f66929j = a3;
        if (!a3) {
            f66920a = System.currentTimeMillis() - a.b.f109011a.f109007h;
            handleAttachBaseContext();
        }
    }

    public final /* synthetic */ void a(f.d dVar) {
        if (com.ss.android.ugc.aweme.s.a.b()) {
            Application application = this.f66922c;
            com.ss.android.ugc.aweme.storagemanager.a.a(application, com.ss.android.common.util.f.a(application));
            dVar.a(com.ss.android.ugc.aweme.legoImp.task.ae.q()).a(com.ss.android.ugc.aweme.legoImp.task.ae.o());
            w d2 = SplashAdServiceImpl.h().d();
            if (d2 != null) {
                dVar.a(d2);
            }
        }
    }

    public AwemeApplicationImpl(Application application, AppBuildConfig appBuildConfig, h hVar) {
        this.f66922c = application;
        this.f66923d = appBuildConfig;
        this.f66928i = hVar;
    }
}
