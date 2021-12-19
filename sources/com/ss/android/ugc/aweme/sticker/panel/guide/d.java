package com.ss.android.ugc.aweme.sticker.panel.guide;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f135165a;

    static {
        Covode.recordClassIndex(88352);
    }

    d(c cVar) {
        this.f135165a = cVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f135165a.f135156i.run();
    }
}
