package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f126399a;

    static {
        Covode.recordClassIndex(82928);
    }

    j(h hVar) {
        this.f126399a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        h hVar = this.f126399a;
        if (hVar.f126393j != null) {
            hVar.f126393j.c(hVar.f126391h);
        }
    }
}
