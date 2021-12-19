package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f72799a;

    static {
        Covode.recordClassIndex(44844);
    }

    m(k kVar) {
        this.f72799a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f72799a.v();
    }
}
