package com.ss.android.ugc.aweme.sticker.types.ar.text;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final n f135874a;

    static {
        Covode.recordClassIndex(88797);
    }

    o(n nVar) {
        this.f135874a = nVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f135874a.a();
    }
}
