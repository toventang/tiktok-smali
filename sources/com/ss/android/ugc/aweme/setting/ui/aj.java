package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.l.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aj implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122815a;

    static {
        Covode.recordClassIndex(80624);
    }

    aj(v vVar) {
        this.f122815a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        v vVar = this.f122815a;
        if (!a.a(view, 1200)) {
            r.a("enter_teen_protection", new d().a("enter_method", "click_button").a("enter_from", "settings_page").f66730a);
            com.ss.android.ugc.aweme.compliance.api.a.p().a(vVar);
        }
    }
}
