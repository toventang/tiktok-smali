package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.ugc.statisticlogger.a;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.CommandDispatcher;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.ss.android.ugc.aweme.app.launch.b;
import com.ss.android.ugc.aweme.app.launch.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.experiment.ai;
import com.ss.android.ugc.aweme.experiment.ci;
import com.ss.android.ugc.aweme.experiment.en;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.legoImpl.AccountInitializerTaskImpl;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.sec.h;
import com.ss.android.ugc.aweme.sec.i;
import com.ss.android.ugc.aweme.utils.in;
import java.util.List;

public class LegacyTask implements w {

    /* renamed from: a  reason: collision with root package name */
    Application f107829a;

    /* renamed from: b  reason: collision with root package name */
    boolean f107830b;

    /* renamed from: c  reason: collision with root package name */
    String f107831c = a.a();

    static {
        Covode.recordClassIndex(69050);
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
            Covode.recordClassIndex(69052);
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
            com.ss.android.ugc.aweme.launcher.service.account.a.f107290a.a(false, "did_change");
        }

        /* synthetic */ DeviceIdChangeTask(LegacyTask legacyTask, byte b2) {
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
        boolean d2;
        List<String> list;
        SharedPreferences a2;
        this.f107829a = (Application) context;
        this.f107830b = com.ss.android.common.util.f.a(context);
        com.ss.android.message.a.a(this.f107829a);
        h.f121820a = new i();
        com.ss.android.ugc.aweme.framework.d.a.f96678a = this.f107829a;
        new f.c().b(AccountInitializerTaskImpl.f().c()).a();
        if (this.f107830b) {
            NetworkUtils.setCommandListener(CommandDispatcher.a.f66490a);
            a.b.f109011a.a("cold_boot_legacy_init_appdata", false);
            if (!d.e()) {
                InitAllServiceImpl.q().e();
                com.ss.android.ugc.aweme.app.launch.d.a();
            }
            b.a(this.f107829a);
            com.bytedance.ies.ugc.statisticlogger.a.c().d(new p(this));
            c.a(this.f107829a);
            if (!d.f()) {
                InitAllServiceImpl.q().a();
            }
            a.b.f109011a.b("cold_boot_legacy_init_appdata", false);
        } else {
            String b2 = com.ss.android.common.util.f.b(this.f107829a);
            if (!m.a(b2) && b2.endsWith(":ad")) {
                int i2 = Build.VERSION.SDK_INT;
                try {
                    Reflect.on(this).set("mBase", new com.ss.android.newmedia.b(this.f107829a.getBaseContext()));
                } catch (Throwable unused) {
                    Process.killProcess(Process.myPid());
                }
            }
            String a3 = com.ss.android.ugc.aweme.app.ad.a(Process.myPid());
            if (a3 != null && a3.endsWith(":push")) {
                Logger.debug();
            }
        }
        Application application = this.f107829a;
        if (!(application == null || (a2 = com.ss.android.ugc.aweme.bf.d.a(application, com.ss.android.deviceregister.a.a.f59402a, 0)) == null)) {
            s.f93857a = TextUtils.isEmpty(a2.getString("device_id", ""));
        }
        if (!d.g()) {
            a.b.f109011a.a("cold_boot_legacy_init_applog", false);
            try {
                AppLog.setUseGoogleAdId(true);
            } catch (IllegalStateException e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("initApplog startLaunch:" + (System.currentTimeMillis() - a.b.f109011a.f109007h));
                com.ss.android.ugc.aweme.framework.a.a.a((Exception) e2);
            }
            if (!((Boolean) en.f89942c.getValue()).booleanValue()) {
                AppLog.registerLogRequestCallback(new AppLog.j() {
                    /* class com.ss.android.ugc.aweme.legoImp.task.LegacyTask.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(69051);
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
            }
            if (com.ss.android.ugc.aweme.compliance.api.a.q().d()) {
                d2 = com.ss.android.ugc.aweme.compliance.api.d.a.c();
            } else {
                d2 = in.d();
            }
            AppLog.setChildModeBeforeInit(d2);
            if (d2) {
                list = com.ss.android.ugc.aweme.compliance.api.a.q().c();
            } else {
                list = null;
            }
            AppLog.setWhiteEventFilterForChildMode(list);
            if (((Boolean) ai.f89537c.getValue()).booleanValue()) {
                AppLog.setStartLogReaperDelay(5000);
            }
            com.ss.android.ugc.aweme.statistic.b.a(this.f107829a);
            a.b.f109011a.b("cold_boot_legacy_init_applog", false);
        }
        if (this.f107829a.getResources() == null) {
            Process.killProcess(Process.myPid());
        }
        InitAllServiceImpl.q().h();
        b.a.f33348a.f33347a = 0;
        a.b.f109011a.a("method_init_push_duration", false);
        if (!InitPushTask.c()) {
            InitPushTask.b(context);
        }
        a.b.f109011a.b("method_init_push_duration", false);
        com.ss.android.ugc.aweme.app.f.d.f66729b = ci.f89698a;
    }
}
