package com.ss.android.ugc.aweme.music.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class aw implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ah f111903a;

    static {
        Covode.recordClassIndex(71926);
    }

    aw(ah ahVar) {
        this.f111903a = ahVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f111903a.b(view);
    }
}
