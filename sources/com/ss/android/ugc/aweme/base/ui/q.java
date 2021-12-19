package com.ss.android.ugc.aweme.base.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeHybridLabelModel f68405a;

    static {
        Covode.recordClassIndex(42112);
    }

    q(AwemeHybridLabelModel awemeHybridLabelModel) {
        this.f68405a = awemeHybridLabelModel;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        t.a(t.a(), this.f68405a.getRefUrl());
    }
}
