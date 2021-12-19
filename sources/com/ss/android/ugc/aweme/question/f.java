package com.ss.android.ugc.aweme.question;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final e f119968a;

    static {
        Covode.recordClassIndex(77930);
    }

    f(e eVar) {
        this.f119968a = eVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f119968a.j();
    }
}
