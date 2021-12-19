package com.ss.android.ugc.aweme.legoImp.task.mainProcessTask;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import com.ss.android.ugc.aweme.feed.api.h;
import com.ss.android.ugc.aweme.homepage.experiment.HomepageExperimentServiceImpl;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.b;
import java.util.List;

public final class InitLegoInflate implements w {
    static {
        Covode.recordClassIndex(69224);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
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
        return ae.MAIN;
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
        IHomepageExperimentService homepageExperimentServiceImpl;
        MethodCollector.i(6900);
        if (Build.VERSION.SDK_INT == 24 || Build.VERSION.SDK_INT == 25) {
            new FrameLayout(context);
        }
        Object a2 = b.a(IHomepageExperimentService.class, false);
        if (a2 != null) {
            homepageExperimentServiceImpl = (IHomepageExperimentService) a2;
        } else {
            homepageExperimentServiceImpl = new HomepageExperimentServiceImpl();
        }
        homepageExperimentServiceImpl.a();
        CommonFeedLaunchServiceImpl.b();
        NoticeServiceImpl.f();
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).initLegoInflate();
        h.a();
        f.n.a(X2CFragmentMainPageIcon.class, new X2CFragmentMainPageIcon());
        MethodCollector.o(6900);
    }
}
