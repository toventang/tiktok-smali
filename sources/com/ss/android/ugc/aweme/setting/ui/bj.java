package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bj implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122868a;

    static {
        Covode.recordClassIndex(80654);
    }

    bj(v vVar) {
        this.f122868a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f122868a.onUserInfoClick(view);
    }
}
