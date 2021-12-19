package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class bo implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bj f72593a;

    static {
        Covode.recordClassIndex(44725);
    }

    bo(bj bjVar) {
        this.f72593a = bjVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f72593a.b();
    }
}
