package com.ss.android.ugc.aweme.services;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.ui.ScrollableViewPager;
import com.ss.android.ugc.aweme.base.ui.e;
import com.ss.android.ugc.aweme.base.ui.p;
import com.ss.android.ugc.aweme.detail.operators.ac;
import com.ss.android.ugc.aweme.detail.operators.t;
import com.ss.android.ugc.aweme.favorites.j.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.i.a;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.ar;
import com.ss.android.ugc.aweme.main.bb;
import com.ss.android.ugc.aweme.main.o;
import com.ss.android.ugc.aweme.profile.k;
import com.ss.android.ugc.aweme.share.s;
import com.ss.android.ugc.aweme.story.live.b;
import com.ss.android.ugc.aweme.t.c;

public class BusinessComponentServiceImpl implements IBusinessComponentService {
    private c businessBridgeService;
    private ac detailPageOperatorProvider;

    static {
        Covode.recordClassIndex(79437);
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public com.ss.android.ugc.aweme.favorites.j.c getMediumWebViewRefHolder() {
        return d.f90680b;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public Class<? extends e> getProfilePageClass() {
        return k.class;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public com.ss.android.ugc.aweme.i.c getAppStateReporter() {
        return a.c();
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public com.ss.android.ugc.aweme.main.service.a getMainHelperService() {
        return new ar();
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public c getBusinessBridgeService() {
        if (this.businessBridgeService == null) {
            this.businessBridgeService = new com.ss.android.ugc.aweme.t.a();
        }
        return this.businessBridgeService;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public ac getDetailPageOperatorProvider() {
        if (this.detailPageOperatorProvider == null) {
            this.detailPageOperatorProvider = new t();
        }
        return this.detailPageOperatorProvider;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public b getLiveAllService() {
        return LiveOuterService.s().f();
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public com.ss.android.ugc.aweme.live.feedpage.c getLiveStateManager() {
        return LiveOuterService.s().b();
    }

    public static IBusinessComponentService createIBusinessComponentServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(5374);
        Object a2 = com.ss.android.ugc.b.a(IBusinessComponentService.class, z);
        if (a2 != null) {
            IBusinessComponentService iBusinessComponentService = (IBusinessComponentService) a2;
            MethodCollector.o(5374);
            return iBusinessComponentService;
        }
        if (com.ss.android.ugc.b.dp == null) {
            synchronized (IBusinessComponentService.class) {
                try {
                    if (com.ss.android.ugc.b.dp == null) {
                        com.ss.android.ugc.b.dp = new BusinessComponentServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5374);
                    throw th;
                }
            }
        }
        BusinessComponentServiceImpl businessComponentServiceImpl = (BusinessComponentServiceImpl) com.ss.android.ugc.b.dp;
        MethodCollector.o(5374);
        return businessComponentServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public Dialog newOptionsDialog(Context context, Aweme aweme, String str) {
        return s.a.a(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessComponentService
    public o newScrollSwitchHelper(Context context, ScrollableViewPager scrollableViewPager, p pVar) {
        return new bb(context, scrollableViewPager, pVar);
    }
}
