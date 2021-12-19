package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.g.a;

final /* synthetic */ class cg implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72682a;

    static {
        Covode.recordClassIndex(44778);
    }

    cg(bz bzVar) {
        this.f72682a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        bz bzVar = this.f72682a;
        bzVar.f72660m.setVisibility(8);
        bzVar.n.setImageBitmap(null);
        bzVar.a((a) null);
        bzVar.a(true, true);
    }
}
