package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ae implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f98021a;

    static {
        Covode.recordClassIndex(62308);
    }

    ae(i iVar) {
        this.f98021a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        i iVar = this.f98021a;
        iVar.f98069d.a();
        iVar.a(false, (h) null, false);
    }
}
