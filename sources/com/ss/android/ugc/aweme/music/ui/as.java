package com.ss.android.ugc.aweme.music.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class as implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ah f111899a;

    static {
        Covode.recordClassIndex(71922);
    }

    as(ah ahVar) {
        this.f111899a = ahVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f111899a.b(view);
    }
}
