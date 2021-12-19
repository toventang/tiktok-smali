package com.ss.android.ugc.aweme.ad.comment.d;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f65653a;

    static {
        Covode.recordClassIndex(40402);
    }

    g(b bVar) {
        this.f65653a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f65653a.f(view);
    }
}
