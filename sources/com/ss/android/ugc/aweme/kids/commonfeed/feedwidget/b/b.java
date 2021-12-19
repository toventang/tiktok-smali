package com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f106105a;

    static {
        Covode.recordClassIndex(67866);
    }

    b(a aVar) {
        this.f106105a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f106105a.f();
    }
}
