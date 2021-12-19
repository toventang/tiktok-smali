package com.ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f70838a;

    static {
        Covode.recordClassIndex(43646);
    }

    j(c cVar) {
        this.f70838a = cVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        c cVar = this.f70838a;
        cVar.f70819j.setText("");
        cVar.f70819j.requestFocus();
        cVar.f70819j.post(new h(cVar));
    }
}
