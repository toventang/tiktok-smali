package com.ss.android.ugc.aweme.i18n.language.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f99770a;

    static {
        Covode.recordClassIndex(63613);
    }

    b(a aVar) {
        this.f99770a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        a aVar = this.f99770a;
        i.a(3);
        r.a("choose_language_popup", new d().a("enter_from", "homepage_hot").a("language_type", "cancel").f66730a);
        aVar.dismiss();
    }
}
