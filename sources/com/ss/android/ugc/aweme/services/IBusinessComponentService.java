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

public interface IBusinessComponentService {
    static {
        Covode.recordClassIndex(79457);
    }

    c getAppStateReporter();

    com.ss.android.ugc.aweme.t.c getBusinessBridgeService();

    ac getDetailPageOperatorProvider();

    b getLiveAllService();

    com.ss.android.ugc.aweme.live.feedpage.c getLiveStateManager();

    a getMainHelperService();

    com.ss.android.ugc.aweme.favorites.j.c getMediumWebViewRefHolder();

    Class<? extends e> getProfilePageClass();

    Dialog newOptionsDialog(Context context, Aweme aweme, String str);

    o newScrollSwitchHelper(Context context, ScrollableViewPager scrollableViewPager, p pVar);
}
