package com.ss.android.ugc.aweme.ad.comment.d;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f65650a;

    static {
        Covode.recordClassIndex(40399);
    }

    d(b bVar) {
        this.f65650a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f65650a.i(view);
    }
}
