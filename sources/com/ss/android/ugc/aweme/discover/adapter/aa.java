package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.widget.d;

final /* synthetic */ class aa implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final d f80300a;

    static {
        Covode.recordClassIndex(49989);
    }

    aa(d dVar) {
        this.f80300a = dVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f80300a.dismiss();
    }
}
