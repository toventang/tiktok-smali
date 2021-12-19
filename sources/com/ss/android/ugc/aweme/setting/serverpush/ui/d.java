package com.ss.android.ugc.aweme.setting.serverpush.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.r;

final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f122614a;

    static {
        Covode.recordClassIndex(80455);
    }

    d(a aVar) {
        this.f122614a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        a aVar = this.f122614a;
        if (a.a(aVar.getContext())) {
            SmartRouter.buildRoute(aVar.getContext(), "aweme://push_setting_notification_choice").withParam("enter_from", "settings_page").open();
            r.a("enter_push_setting_detail", new com.ss.android.ugc.aweme.app.f.d().a("label", "live_push").f66730a);
        }
    }
}
