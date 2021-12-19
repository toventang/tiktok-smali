package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f72826a;

    static {
        Covode.recordClassIndex(44856);
    }

    y(k kVar) {
        this.f72826a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f72826a.c("click_gift_summary_stripe");
    }
}
