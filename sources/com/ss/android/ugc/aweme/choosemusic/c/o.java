package com.ss.android.ugc.aweme.choosemusic.c;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f70492a;

    static {
        Covode.recordClassIndex(43467);
    }

    o(j jVar) {
        this.f70492a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        j jVar = this.f70492a;
        if (!jVar.f70482e && jVar.w != null) {
            jVar.w.onClick(view);
        }
    }
}
