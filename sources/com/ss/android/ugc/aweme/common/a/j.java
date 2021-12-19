package com.ss.android.ugc.aweme.common.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h.c f76378a;

    static {
        Covode.recordClassIndex(47134);
    }

    j(h.c cVar) {
        this.f76378a = cVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        h.c cVar = this.f76378a;
        if (h.this.r != null) {
            h.this.r.l();
        }
        if (cVar.f76372a != null) {
            cVar.f76372a.f76379a = false;
        }
    }
}
