package com.ss.android.ugc.aweme.setting.ui;

import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.l.a.a;
import com.ss.android.ugc.aweme.ug.h.c;
import com.ss.android.ugc.aweme.ug.h.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class an implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122819a;

    static {
        Covode.recordClassIndex(80628);
    }

    an(v vVar) {
        this.f122819a = vVar;
    }

    public final void onClick(View view) {
        c a2;
        ClickAgent.onClick(view);
        v vVar = this.f122819a;
        if (!a.a(view, 1200) && (a2 = d.a()) != null) {
            SmartRouter.buildRoute(vVar, "//webview").withParam(Uri.parse(a2.f141951b)).open();
        }
    }
}
