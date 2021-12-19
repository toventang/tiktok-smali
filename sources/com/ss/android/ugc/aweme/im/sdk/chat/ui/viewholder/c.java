package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f101414a;

    /* renamed from: b  reason: collision with root package name */
    private final ai f101415b;

    static {
        Covode.recordClassIndex(64856);
    }

    public c(a aVar, ai aiVar) {
        this.f101414a = aVar;
        this.f101415b = aiVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        a aVar = this.f101414a;
        if (a.b(this.f101415b) && aVar.f101315f != null) {
            aVar.f101315f.setChecked(!aVar.f101315f.isChecked());
        }
    }
}
