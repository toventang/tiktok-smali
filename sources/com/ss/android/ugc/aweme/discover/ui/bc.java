package com.ss.android.ugc.aweme.discover.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bc implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bb f82420a;

    static {
        Covode.recordClassIndex(51298);
    }

    bc(bb bbVar) {
        this.f82420a = bbVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f82420a.b();
    }
}
