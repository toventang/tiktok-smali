package com.ss.android.ugc.aweme.friends.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f96816a;

    static {
        Covode.recordClassIndex(61420);
    }

    n(k kVar) {
        this.f96816a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f96816a.a("click_name");
    }
}
