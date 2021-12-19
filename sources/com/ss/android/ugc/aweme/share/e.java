package com.ss.android.ugc.aweme.share;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final d f123472a;

    static {
        Covode.recordClassIndex(81068);
    }

    e(d dVar) {
        this.f123472a = dVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f123472a.g();
    }
}
