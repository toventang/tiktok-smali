package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f122832a;

    static {
        Covode.recordClassIndex(80641);
    }

    b(a aVar) {
        this.f122832a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f122832a.hide();
    }
}
