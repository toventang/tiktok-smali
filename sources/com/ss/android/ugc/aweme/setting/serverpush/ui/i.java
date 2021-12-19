package com.ss.android.ugc.aweme.setting.serverpush.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final g f122634a;

    static {
        Covode.recordClassIndex(80463);
    }

    i(g gVar) {
        this.f122634a = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        g gVar = this.f122634a;
        if (g.a(gVar.getContext())) {
            SmartRouter.buildRoute(gVar.getContext(), "aweme://push_setting_notification_choice").withParam("enter_from", "settings_page").open();
            r.a("enter_push_setting_detail", new d().a("label", "live_push").f66730a);
        }
    }
}
