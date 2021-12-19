package com.ss.android.ugc.aweme.kids.homepage.bottomview;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final HomeBottomTabView f106551a;

    static {
        Covode.recordClassIndex(68085);
    }

    a(HomeBottomTabView homeBottomTabView) {
        this.f106551a = homeBottomTabView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f106551a.setCurrentTab("homepage_hot");
    }
}
