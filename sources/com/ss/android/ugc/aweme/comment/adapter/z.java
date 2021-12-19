package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final x f71440a;

    static {
        Covode.recordClassIndex(43967);
    }

    z(x xVar) {
        this.f71440a = xVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f71440a.h();
    }
}
