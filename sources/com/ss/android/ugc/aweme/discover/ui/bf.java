package com.ss.android.ugc.aweme.discover.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bf implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final be f82433a;

    static {
        Covode.recordClassIndex(51304);
    }

    bf(be beVar) {
        this.f82433a = beVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f82433a.d();
    }
}
