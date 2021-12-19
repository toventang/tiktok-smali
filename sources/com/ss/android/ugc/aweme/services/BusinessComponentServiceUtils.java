package com.ss.android.ugc.aweme.services;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.ScrollableViewPager;
import com.ss.android.ugc.aweme.base.ui.e;
import com.ss.android.ugc.aweme.base.ui.p;
import com.ss.android.ugc.aweme.detail.operators.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.i.c;
import com.ss.android.ugc.aweme.main.o;
import com.ss.android.ugc.aweme.main.service.a;
import com.ss.android.ugc.aweme.story.live.b;

public class BusinessComponentServiceUtils {
    private static volatile IBusinessComponentService sBusinessComponentService;

    static {
        Covode.recordClassIndex(79438);
    }

    public static c getAppStateReporter() {
        return getBusinessComponentService().getAppStateReporter();
    }

    public static com.ss.android.ugc.aweme.t.c getBusinessBridgeService() {
        return getBusinessComponentService().getBusinessBridgeService();
    }

    private static IBusinessComponentService getBusinessComponentService() {
        if (sBusinessComponentService == null) {
            sBusinessComponentService = BusinessComponentServiceImpl.createIBusinessComponentServicebyMonsterPlugin(false);
        }
        return sBusinessComponentService;
    }

    public static ac getDetailPageOperatorProvider() {
        return getBusinessComponentService().getDetailPageOperatorProvider();
    }

    public static b getLiveAllService() {
        return getBusinessComponentService().getLiveAllService();
    }

    public static com.ss.android.ugc.aweme.live.feedpage.c getLiveStateManager() {
        return getBusinessComponentService().getLiveStateManager();
    }

    public static a getMainHelperService() {
        return getBusinessComponentService().getMainHelperService();
    }

    public static com.ss.android.ugc.aweme.favorites.j.c getMediumWebViewRefHolder() {
        return getBusinessComponentService().getMediumWebViewRefHolder();
    }

    public static Class<? extends e> getProfilePageClass() {
        return getBusinessComponentService().getProfilePageClass();
    }

    public static Dialog newOptionsDialog(Context context, Aweme aweme, String str) {
        return getBusinessComponentService().newOptionsDialog(context, aweme, str);
    }

    public static o newScrollSwitchHelper(Context context, ScrollableViewPager scrollableViewPager, p pVar) {
        return getBusinessComponentService().newScrollSwitchHelper(context, scrollableViewPager, pVar);
    }
}
