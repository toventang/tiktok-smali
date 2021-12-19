package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.l.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class at implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122825a;

    static {
        Covode.recordClassIndex(80634);
    }

    at(v vVar) {
        this.f122825a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        v vVar = this.f122825a;
        if (!a.a(view, 1200)) {
            r.a("enter_account_security", new d().a("enter_from", "settings_page").f66730a);
            SmartRouter.buildRoute(vVar, "//setting/security").open();
        }
    }
}
