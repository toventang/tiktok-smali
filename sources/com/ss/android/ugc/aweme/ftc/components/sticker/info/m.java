package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f98086a;

    static {
        Covode.recordClassIndex(62346);
    }

    m(i iVar) {
        this.f98086a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f98086a.e();
    }
}
