package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class bz implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bm f117009a;

    static {
        Covode.recordClassIndex(75560);
    }

    bz(bm bmVar) {
        this.f117009a = bmVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f117009a.n();
    }
}
