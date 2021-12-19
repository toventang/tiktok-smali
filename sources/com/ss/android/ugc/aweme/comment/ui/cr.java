package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class cr implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72695a;

    static {
        Covode.recordClassIndex(44789);
    }

    cr(bz bzVar) {
        this.f72695a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f72695a.Z.b().setValue(null);
    }
}
