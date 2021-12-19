package com.ss.android.ugc.aweme.commercialize.link.micro;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

public final class a extends LinearLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.link.video.a f74516a;

    static {
        Covode.recordClassIndex(45952);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        com.ss.android.ugc.aweme.commercialize.link.video.a aVar = this.f74516a;
        if (aVar != null) {
            aVar.b();
        }
    }
}
