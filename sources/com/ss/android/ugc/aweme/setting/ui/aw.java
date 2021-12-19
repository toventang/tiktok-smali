package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aw implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122828a;

    static {
        Covode.recordClassIndex(80637);
    }

    aw(v vVar) {
        this.f122828a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f122828a.h(view);
    }
}
