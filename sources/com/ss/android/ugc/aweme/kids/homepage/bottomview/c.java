package com.ss.android.ugc.aweme.kids.homepage.bottomview;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final HomeBottomTabView f106564a;

    static {
        Covode.recordClassIndex(68090);
    }

    c(HomeBottomTabView homeBottomTabView) {
        this.f106564a = homeBottomTabView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        HomeBottomTabView homeBottomTabView = this.f106564a;
        homeBottomTabView.setCurrentTab("tab_publish");
        homeBottomTabView.f106540a.a();
    }
}
