package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.l.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ap implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122821a;

    static {
        Covode.recordClassIndex(80630);
    }

    ap(v vVar) {
        this.f122821a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        v vVar = this.f122821a;
        if (!a.a(view, 1200)) {
            SmartRouter.buildRoute(vVar, "aweme://setting/datasaver").open();
            r.onEventV3("enter_data_saver");
        }
    }
}
