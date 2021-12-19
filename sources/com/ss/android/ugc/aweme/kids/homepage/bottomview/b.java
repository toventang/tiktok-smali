package com.ss.android.ugc.aweme.kids.homepage.bottomview;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final HomeBottomTabView f106563a;

    static {
        Covode.recordClassIndex(68089);
    }

    b(HomeBottomTabView homeBottomTabView) {
        this.f106563a = homeBottomTabView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f106563a.setCurrentTab("discovery");
    }
}
