package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.util.aw;

final /* synthetic */ class du implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    static final View.OnClickListener f131698a = new du();

    static {
        Covode.recordClassIndex(86250);
    }

    private du() {
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        aw.a(view.getContext(), "toast");
    }
}
