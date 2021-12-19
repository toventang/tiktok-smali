package com.ss.android.ugc.aweme.ad.comment.d;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f65658a;

    static {
        Covode.recordClassIndex(40407);
    }

    l(b bVar) {
        this.f65658a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f65658a.a(view);
    }
}
