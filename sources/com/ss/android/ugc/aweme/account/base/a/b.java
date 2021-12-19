package com.ss.android.ugc.aweme.account.base.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f62888a;

    static {
        Covode.recordClassIndex(38743);
    }

    b(a aVar) {
        this.f62888a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f62888a.hide();
    }
}
