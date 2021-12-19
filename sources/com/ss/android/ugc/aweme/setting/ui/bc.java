package com.ss.android.ugc.aweme.setting.ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.l.a.a;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bc implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122861a;

    static {
        Covode.recordClassIndex(80647);
    }

    bc(v vVar) {
        this.f122861a = vVar;
    }

    public final void onClick(View view) {
        c cVar;
        ClickAgent.onClick(view);
        v vVar = this.f122861a;
        if (!a.a(view, 1200) && (cVar = com.ss.android.ugc.aweme.setting.g.a.f122197a) != null && !TextUtils.isEmpty(cVar.f122558b)) {
            SmartRouter.buildRoute(vVar, "aweme://webview").withParam(Uri.parse(cVar.f122558b)).withParam("title", vVar.getString(R.string.cqb)).open();
        }
    }
}
