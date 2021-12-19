package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tux.a.i.a;

final /* synthetic */ class cu implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72698a;

    static {
        Covode.recordClassIndex(44792);
    }

    cu(bz bzVar) {
        this.f72698a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        new a(this.f72698a.getContext()).a("Gifting is unavailable to reply").a();
    }
}
