package com.ss.android.ugc.aweme.setting.serverpush.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.fg;
import com.ss.android.ugc.tiktok.security.a.a;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f122613a;

    static {
        Covode.recordClassIndex(80454);
    }

    c(a aVar) {
        this.f122613a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        a aVar = this.f122613a;
        try {
            fg.b(aVar.getContext());
        } catch (Exception unused) {
            Context context = aVar.getContext();
            Intent intent = new Intent("android.settings.SETTINGS");
            a.a(intent, context);
            context.startActivity(intent);
        }
        r.a("notifications_click", new d().a("status", fg.a(aVar.getContext()) ? "on" : "off").f66730a);
    }
}
