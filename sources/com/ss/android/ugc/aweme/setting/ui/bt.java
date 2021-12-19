package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.l.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bt implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122878a;

    static {
        Covode.recordClassIndex(80664);
    }

    bt(v vVar) {
        this.f122878a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        v vVar = this.f122878a;
        if (!a.a(view, 1200) && vVar.F != null) {
            vVar.F.a(vVar);
        }
    }
}
