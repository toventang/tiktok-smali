package com.ss.android.ugc.aweme.homepage.experiment;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CActivityMain;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMain;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPage;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.X2CTabItem;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService;

public final class HomepageExperimentServiceImpl implements IHomepageExperimentService {
    static {
        Covode.recordClassIndex(63187);
    }

    @Override // com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService
    public final void a() {
        f.n.a(X2CActivityMain.class, new X2CActivityMain()).a(X2CFragmentMainPage.class, new X2CFragmentMainPage()).a(X2CFragmentMain.class, new X2CFragmentMain()).a(X2CTabItem.class, new X2CTabItem()).a(PreDrawableInflate.class, new PreDrawableInflate());
        CommentServiceImpl.e();
        new f.a().b(PreDrawableInflate.class).a();
    }
}
