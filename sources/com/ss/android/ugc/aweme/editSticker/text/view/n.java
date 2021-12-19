package com.ss.android.ugc.aweme.editSticker.text.view;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f88695a;

    static {
        Covode.recordClassIndex(55802);
    }

    n(i iVar) {
        this.f88695a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        i iVar = this.f88695a;
        if (iVar.M != null) {
            iVar.M.a();
        }
        if (iVar.B != null) {
            iVar.B.a(iVar.getTextWrapList());
        }
    }
}
