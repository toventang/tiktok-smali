package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ai implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ag f101339a;

    static {
        Covode.recordClassIndex(64809);
    }

    ai(ag agVar) {
        this.f101339a = agVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f101339a.a(view);
    }
}
