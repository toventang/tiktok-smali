package com.ss.android.ugc.aweme.discover.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f82587a;

    static {
        Covode.recordClassIndex(51414);
    }

    h(b bVar) {
        this.f82587a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f82587a.B();
    }
}
