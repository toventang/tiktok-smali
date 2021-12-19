package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.ugc.statisticlogger.a;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.CommandDispatcher;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.ss.android.ugc.aweme.app.application.task.CommonParamsInitTask;
import com.ss.android.ugc.aweme.app.launch.b;
import com.ss.android.ugc.aweme.app.launch.c;
import com.ss.android.ugc.aweme.app.launch.d;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.kids.intergration.common.KidsCommonServiceImpl;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.legoImpl.AccountInitializerTaskImpl;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.sec.h;
import com.ss.android.ugc.aweme.sec.i;
import com.ss.android.ugc.aweme.utils.in;
import java.util.List;

public class KidsModeLegacyTask implements w {

    /* renamed from: a  reason: collision with root package name */
    String f107818a = a.a();

    /* renamed from: b  reason: collision with root package name */
    private Application f107819b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f107820c;

    static {
        Covode.recordClassIndex(69046);
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

    class DeviceIdChangeTask implements w {
        static {
            Covode.recordClassIndex(69048);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
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
            return ae.BOOT_FINISH;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        private DeviceIdChangeTask() {
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            new f.c().b(InitAllServiceImpl.q().c()).b(InitAllServiceImpl.q().d()).a();
        }

        /* synthetic */ DeviceIdChangeTask(KidsModeLegacyTask kidsModeLegacyTask, byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return q.f107989a;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        String b2;
        boolean d2;
        this.f107819b = (Application) context;
        this.f107820c = com.ss.android.common.util.f.a(context);
        h.f121820a = new i();
        com.ss.android.ugc.aweme.framework.d.a.f96678a = this.f107819b;
        f.e().a(AccountInitializerTaskImpl.f().c()).a();
        List<String> list = null;
        if (this.f107820c) {
            NetworkUtils.setCommandListener(CommandDispatcher.a.f66490a);
            KidsCommonServiceImpl.g().d();
            b.a(this.f107819b);
            d.a();
            a.c().d(new m(this));
            c.a(this.f107819b);
            if (!com.ss.android.ugc.aweme.lego.d.f()) {
                InitAllServiceImpl.q().a();
            }
            b2 = null;
        } else {
            b2 = com.ss.android.common.util.f.b(this.f107819b);
        }
        try {
            AppLog.setUseGoogleAdId(true);
        } catch (IllegalStateException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("initApplog startLaunch:" + (System.currentTimeMillis() - a.b.f109011a.f109007h));
            com.ss.android.ugc.aweme.framework.a.a.a((Exception) e2);
        }
        AppLog.registerLogRequestCallback(new AppLog.j() {
            /* class com.ss.android.ugc.aweme.legoImp.task.KidsModeLegacyTask.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69047);
            }

            @Override // com.ss.android.common.applog.AppLog.j
            public final void a(List<Long> list) {
            }

            @Override // com.ss.android.common.applog.AppLog.j
            public final void onEventExpired(List<Long> list) {
            }

            @Override // com.ss.android.common.applog.AppLog.j
            public final void a(String str, String str2, String str3) {
                if ("terminate".equals(str)) {
                    n.a("type_app_log_state_change", new com.ss.android.ugc.aweme.app.f.c().a("data_source", str).a("session_id", str2).a("is_success", (Integer) 1).a("eventIndex", (String) null).a("error_message", str3).a());
                }
            }
        });
        new f.c().b((w) new CommonParamsInitTask()).a();
        if (com.ss.android.ugc.aweme.compliance.api.a.q().d()) {
            d2 = com.ss.android.ugc.aweme.compliance.api.d.a.c();
        } else {
            d2 = in.d();
        }
        AppLog.setChildModeBeforeInit(d2);
        if (d2) {
            list = com.ss.android.ugc.aweme.compliance.api.a.q().c();
        }
        AppLog.setWhiteEventFilterForChildMode(list);
        com.ss.android.ugc.aweme.statistic.b.a(this.f107819b);
        if (this.f107819b.getResources() == null) {
            Process.killProcess(Process.myPid());
        }
        b.a.f33348a.f33347a = 0;
        a.b.f109011a.a("method_init_push_duration", false);
        if (this.f107820c || com.ss.android.ugc.aweme.push.downgrade.h.a(this.f107819b, b2)) {
            com.ss.android.di.push.a.a().initMessageDepend();
        }
        a.b.f109011a.b("method_init_push_duration", false);
    }
}
