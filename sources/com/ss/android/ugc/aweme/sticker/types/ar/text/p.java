package com.ss.android.ugc.aweme.sticker.types.ar.text;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final n f135875a;

    static {
        Covode.recordClassIndex(88798);
    }

    p(n nVar) {
        this.f135875a = nVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f135875a.e();
    }
}
