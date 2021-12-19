package com.ss.android.ugc.aweme.challenge.ui;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ac implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final aa f70117a;

    /* renamed from: b  reason: collision with root package name */
    private final Challenge f70118b;

    static {
        Covode.recordClassIndex(43245);
    }

    ac(aa aaVar, Challenge challenge) {
        this.f70117a = aaVar;
        this.f70118b = challenge;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        aa aaVar = this.f70117a;
        Challenge challenge = this.f70118b;
        r.a("click_related_tag", new d().a("related_tag_id", challenge.getCid()).a("tag_id", aaVar.f70110b).f66730a);
        Context context = aaVar.f70109a;
        String str = aaVar.f70110b;
        CommerceChallengeServiceImpl.e().a(challenge);
        SmartRouter.buildRoute(context, "//challenge/detail").withNavArg(new ChallengeDetailParam(challenge.getCid(), "from_related_tag", challenge.getType(), str)).open();
    }
}
