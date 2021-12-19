package com.bytedance.tiktok.homepage.services;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopLeftIconInflate;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopRightIconInflate;
import com.ss.android.ugc.aweme.homepage.ui.inflate.TopTabViewInflate;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.e;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.q;
import com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService;

public final class MainFragmentCacheExpServiceImpl implements IMainFragmentCacheExpService {
    static {
        Covode.recordClassIndex(27193);
    }

    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final q a() {
        return new TopTabViewInflate();
    }

    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final q b() {
        return new MainFragmentTopLeftIconInflate();
    }

    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final q c() {
        return new MainFragmentTopRightIconInflate();
    }

    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final View d() {
        Object b2 = f.b(TopTabViewInflate.class);
        if (!(b2 instanceof TopTabViewInflate)) {
            b2 = null;
        }
        TopTabViewInflate topTabViewInflate = (TopTabViewInflate) b2;
        if (topTabViewInflate == null) {
            return null;
        }
        e eVar = topTabViewInflate.f99514a;
        topTabViewInflate.f99514a = null;
        return eVar;
    }
}
