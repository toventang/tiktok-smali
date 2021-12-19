package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

final /* synthetic */ class aq implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f77862a;

    static {
        Covode.recordClassIndex(48251);
    }

    aq(a aVar) {
        this.f77862a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        a aVar = this.f77862a;
        r.a("change_transl_auth_status", new d().a("enter_method", "setting").a("to_status", aVar.f77833h ? "off" : "on").a("group_id", aVar.f77828c.getAid()).f66730a);
        aVar.f();
    }
}
