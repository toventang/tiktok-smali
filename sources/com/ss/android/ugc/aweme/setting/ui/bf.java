package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.l.a.a;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bf implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122864a;

    static {
        Covode.recordClassIndex(80650);
    }

    bf(v vVar) {
        this.f122864a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        v vVar = this.f122864a;
        if (a.a(view, 1200)) {
            return;
        }
        if (!v.L()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(vVar).a(R.string.de8).a();
        } else {
            SmartRouter.buildRoute(vVar, "//about_activity").open();
        }
    }
}
