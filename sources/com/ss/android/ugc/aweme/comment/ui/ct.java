package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ct implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72697a;

    static {
        Covode.recordClassIndex(44791);
    }

    ct(bz bzVar) {
        this.f72697a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f72697a.i();
    }
}
