package com.ss.android.ugc.aweme.editSticker.text.view;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f88694a;

    static {
        Covode.recordClassIndex(55801);
    }

    m(i iVar) {
        this.f88694a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        i iVar = this.f88694a;
        if (iVar.M != null) {
            iVar.M.a();
        }
        if (iVar.B != null) {
            iVar.B.a(iVar.getTextWrapList());
        }
    }
}
