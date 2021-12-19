package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class cn implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72691a;

    static {
        Covode.recordClassIndex(44785);
    }

    cn(bz bzVar) {
        this.f72691a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        bz bzVar = this.f72691a;
        bzVar.U.a(bzVar.f72651d.getSelectionStart(), bzVar.f72651d.getText());
    }
}
