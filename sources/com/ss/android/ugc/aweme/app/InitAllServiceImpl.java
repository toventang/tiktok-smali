package com.ss.android.ugc.aweme.app;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.j;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.i18n.language.a;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.InitAbTest;
import com.ss.android.ugc.aweme.legoImp.task.InstallEventBus;
import com.ss.android.ugc.aweme.legoImp.task.RegisterLifecycle;
import com.ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask;
import com.ss.android.ugc.b;

public class InitAllServiceImpl extends p {

    /* renamed from: a  reason: collision with root package name */
    boolean f66492a;

    static {
        Covode.recordClassIndex(40868);
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final w l() {
        return new InitAbTest();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final w m() {
        return new RegisterLifecycle();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void n() {
        a.a(null);
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final w o() {
        return new YoutubeRefreshTask();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final w p() {
        return new InstallEventBus();
    }

    public static IInitAllService q() {
        MethodCollector.i(4829);
        Object a2 = b.a(IInitAllService.class, false);
        if (a2 != null) {
            IInitAllService iInitAllService = (IInitAllService) a2;
            MethodCollector.o(4829);
            return iInitAllService;
        }
        if (b.L == null) {
            synchronized (IInitAllService.class) {
                try {
                    if (b.L == null) {
                        b.L = new InitAllServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4829);
                    throw th;
                }
            }
        }
        p pVar = (p) b.L;
        MethodCollector.o(4829);
        return pVar;
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService, com.ss.android.ugc.aweme.app.p
    public final void a(Context context) {
        if (s.a().booleanValue()) {
            com.ss.android.ugc.aweme.launcher.a.a(new y(this));
        } else if (j.d()) {
            com.ss.android.ugc.aweme.launcher.a.a(new z(this, context));
        }
    }
}
