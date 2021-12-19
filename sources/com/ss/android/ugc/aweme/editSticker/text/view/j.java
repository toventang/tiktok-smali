package com.ss.android.ugc.aweme.editSticker.text.view;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f88691a;

    static {
        Covode.recordClassIndex(55798);
    }

    j(i iVar) {
        this.f88691a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f88691a.j();
    }
}
