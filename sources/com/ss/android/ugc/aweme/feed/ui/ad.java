package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ad implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ab f94219a;

    static {
        Covode.recordClassIndex(59861);
    }

    ad(ab abVar) {
        this.f94219a = abVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f94219a.c();
    }
}
