package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f78022a;

    static {
        Covode.recordClassIndex(48373);
    }

    b(a aVar) {
        this.f78022a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f78022a.getActivity().onBackPressed();
    }
}
