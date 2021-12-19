package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final s f71432a;

    static {
        Covode.recordClassIndex(43959);
    }

    t(s sVar) {
        this.f71432a = sVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f71432a.f();
    }
}
