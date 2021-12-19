package com.ss.android.ugc.aweme.music.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class av implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ah f111902a;

    static {
        Covode.recordClassIndex(71925);
    }

    av(ah ahVar) {
        this.f111902a = ahVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f111902a.b(view);
    }
}
