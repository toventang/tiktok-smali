package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.l.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aa implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122806a;

    static {
        Covode.recordClassIndex(80615);
    }

    aa(v vVar) {
        this.f122806a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        v vVar = this.f122806a;
        if (!a.a(view, 1200)) {
            r.a("edit_profile", new d().a("enter_method", "click_setting_profile").f66730a);
            SmartRouter.buildRoute(vVar, "aweme://profile_edit").open();
        }
    }
}
