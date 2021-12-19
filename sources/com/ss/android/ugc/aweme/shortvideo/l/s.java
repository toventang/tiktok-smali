package com.ss.android.ugc.aweme.shortvideo.l;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final q f128738a;

    static {
        Covode.recordClassIndex(84380);
    }

    s(q qVar) {
        this.f128738a = qVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f128738a.a();
    }
}
