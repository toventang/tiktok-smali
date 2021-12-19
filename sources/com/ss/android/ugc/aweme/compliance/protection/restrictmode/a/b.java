package com.ss.android.ugc.aweme.compliance.protection.restrictmode.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.tiktok.homepage.mainfragment.toolbar.b f77995a;

    /* renamed from: b  reason: collision with root package name */
    private final SpecialTopicEntry f77996b;

    static {
        Covode.recordClassIndex(48350);
    }

    b(com.bytedance.tiktok.homepage.mainfragment.toolbar.b bVar, SpecialTopicEntry specialTopicEntry) {
        this.f77995a = bVar;
        this.f77996b = specialTopicEntry;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        com.bytedance.tiktok.homepage.mainfragment.toolbar.b bVar = this.f77995a;
        SpecialTopicEntry specialTopicEntry = this.f77996b;
        SmartRouter.buildRoute(bVar.getActivity(), specialTopicEntry.getLandingRoute()).open();
        r.a("topic_entrance_click", new d().a("enter_from", bVar.g()).a(StringSet.type, specialTopicEntry.getEventName()).a("url", specialTopicEntry.getLandingRoute()).f66730a);
    }
}
