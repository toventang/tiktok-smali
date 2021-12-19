package com.ss.android.ugc.aweme.kids.homepage.bottomview;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final HomeBottomTabView f106566a;

    static {
        Covode.recordClassIndex(68092);
    }

    e(HomeBottomTabView homeBottomTabView) {
        this.f106566a = homeBottomTabView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f106566a.setCurrentTab("personal_homepage");
    }
}
