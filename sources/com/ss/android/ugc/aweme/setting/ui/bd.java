package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.l.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bd implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122862a;

    static {
        Covode.recordClassIndex(80648);
    }

    bd(v vVar) {
        this.f122862a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        a.a(view, 1200);
    }
}
