package com.ss.android.ugc.aweme.dsp.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.dsp.common.b.a;
import com.ss.android.ugc.aweme.dsp.experiment.b;
import com.ss.android.ugc.aweme.dsp.playpage.a.a;
import com.ss.android.ugc.aweme.dsp.ui.MusicDspTab;
import h.f.b.l;

public final class MusicDspServiceImpl implements IMusicDspService {
    static {
        Covode.recordClassIndex(52354);
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final void b() {
        a.c("homepage_hot", "homepage_music_cover");
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final void e() {
        a.c("personal_homepage", "metab_music");
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final boolean f() {
        return b.a().getEnableMusicSeekBar();
    }

    public static IMusicDspService g() {
        MethodCollector.i(992);
        Object a2 = com.ss.android.ugc.b.a(IMusicDspService.class, false);
        if (a2 != null) {
            IMusicDspService iMusicDspService = (IMusicDspService) a2;
            MethodCollector.o(992);
            return iMusicDspService;
        }
        if (com.ss.android.ugc.b.bf == null) {
            synchronized (IMusicDspService.class) {
                try {
                    if (com.ss.android.ugc.b.bf == null) {
                        com.ss.android.ugc.b.bf = new MusicDspServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(992);
                    throw th;
                }
            }
        }
        MusicDspServiceImpl musicDspServiceImpl = (MusicDspServiceImpl) com.ss.android.ugc.b.bf;
        MethodCollector.o(992);
        return musicDspServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final boolean c() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        boolean z = false;
        if (!g2.isChildrenMode() && com.ss.android.ugc.aweme.dsp.experiment.a.a().getDspEntrance() == 1) {
            z = true;
        }
        StringBuilder append = new StringBuilder("showMusicDspEntranceInHomeTab ").append(z).append(' ');
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g3, "");
        String.valueOf(append.append(!g3.isChildrenMode()).toString());
        return z;
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final boolean d() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        boolean z = false;
        if (!g2.isChildrenMode() && com.ss.android.ugc.aweme.dsp.experiment.a.a().getDspEntrance() == 3) {
            z = true;
        }
        StringBuilder append = new StringBuilder("showMusicDspEntranceInMeTab ").append(z).append(' ');
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g3, "");
        String.valueOf(append.append(!g3.isChildrenMode()).toString());
        return z;
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final boolean a() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        boolean z = false;
        if (!g2.isChildrenMode() && com.ss.android.ugc.aweme.dsp.experiment.a.a().getDspEntrance() == 2) {
            z = true;
        }
        StringBuilder append = new StringBuilder("showMusicDspEntranceInForYouPage ").append(z).append(' ');
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g3, "");
        String.valueOf(append.append(!g3.isChildrenMode()).toString());
        return z;
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final void a(String str) {
        l.d(str, "");
        l.d(str, "");
        g.c().execute(new a.RunnableC1990a(str));
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final by a(Context context) {
        l.d(context, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isChildrenMode() || !c()) {
            return null;
        }
        com.ss.android.ugc.aweme.dsp.common.b.a.c("", "homepage_music_tab");
        return new MusicDspTab(context);
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final void a(String str, long j2) {
        l.d(str, "");
        l.d(str, "");
        g.c().execute(new a.b(str, j2));
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final void a(Context context, String str, String str2) {
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        SmartRouter.buildRoute(context, "//music/dsp").withParam("enter_from", str).withParam("enter_method", str2).open();
    }
}
