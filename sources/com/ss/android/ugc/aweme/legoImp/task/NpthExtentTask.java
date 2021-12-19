package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.crash.runtime.ConfigManager;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.app.d.b;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.dynamicfeature.AddInstalledModulesInfoTask;
import com.ss.android.ugc.aweme.experiment.ex;
import com.ss.android.ugc.aweme.im.h;
import com.ss.android.ugc.aweme.launcher.LauncherServiceImpl;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import java.util.List;

public class NpthExtentTask implements a, w {
    static {
        Covode.recordClassIndex(69072);
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return q.f107989a;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final ac e() {
        return ac.CPU;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final String[] c() {
        return new String[]{"AccountInitializerTask"};
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (!f.b(context).contains("miniapp")) {
            h.f100086a.lock();
            if (ex.b()) {
                new NpthCoreInitTask().a(context);
            }
            try {
                Npth.registerCrashCallback(new t(context), CrashType.ALL);
                com.ss.android.ugc.aweme.framework.a.a.a("NpthTask");
                com.ss.android.ugc.aweme.i18n.a.a();
                ConfigManager configManager = Npth.getConfigManager();
                LauncherServiceImpl.b();
                configManager.setDebugMode(false);
                ICrashReportService provideErrorReporter = AVExternalServiceImpl.a().provideErrorReporter();
                Npth.registerCrashCallback(new w(provideErrorReporter), CrashType.NATIVE);
                Npth.registerCrashCallback(new x(provideErrorReporter), CrashType.JAVA);
                Npth.setAttachUserData(new b(context, new d()), CrashType.ALL);
                new AddInstalledModulesInfoTask().a(context);
                AVExternalServiceImpl.a().provideErrorReporter().addCrashEffectIdInfoListener(u.f107996a);
                if (ex.b()) {
                    com.ss.android.b.a.a.a.a(new Runnable() {
                        /* class com.ss.android.ugc.aweme.legoImp.task.NpthExtentTask.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(69073);
                        }

                        public final void run() {
                            new com.ss.android.ugc.aweme.app.d.a().run();
                        }
                    }, 200);
                }
                com.ss.android.ugc.aweme.launcher.service.godzilla.a.f107294a.a();
                Npth.customActivityName(v.f107997a);
            } finally {
                h.f100086a.unlock();
            }
        }
    }
}
