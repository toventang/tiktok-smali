package com.ss.android.ugc.aweme.ad.comment.d;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f65657a;

    static {
        Covode.recordClassIndex(40406);
    }

    k(b bVar) {
        this.f65657a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f65657a.b(view);
    }
}
