package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.l.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aq implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122822a;

    static {
        Covode.recordClassIndex(80631);
    }

    aq(v vVar) {
        this.f122822a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        v vVar = this.f122822a;
        if (!a.a(view, 1200)) {
            r.a("live_photo_manage", new d().a("enter_from", "settings_page").f66730a);
            SmartRouter.buildRoute(vVar, "aweme://livewallpaper").withParam("from", "setting").open();
        }
    }
}
