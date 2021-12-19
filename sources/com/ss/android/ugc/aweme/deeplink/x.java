package com.ss.android.ugc.aweme.deeplink;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class x implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final UpdateTipActivity f79546a;

    static {
        Covode.recordClassIndex(49406);
    }

    x(UpdateTipActivity updateTipActivity) {
        this.f79546a = updateTipActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f79546a.a();
    }
}
