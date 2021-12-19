package com.ss.android.ugc.aweme.tools.mvtemplate;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    static final View.OnClickListener f140806a = new c();

    static {
        Covode.recordClassIndex(91933);
    }

    private c() {
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
    }
}
