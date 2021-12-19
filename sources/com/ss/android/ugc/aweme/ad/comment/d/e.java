package com.ss.android.ugc.aweme.ad.comment.d;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f65651a;

    static {
        Covode.recordClassIndex(40400);
    }

    e(b bVar) {
        this.f65651a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f65651a.h(view);
    }
}
