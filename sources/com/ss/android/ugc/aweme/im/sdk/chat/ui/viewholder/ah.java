package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ah implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ag f101337a;

    /* renamed from: b  reason: collision with root package name */
    private final View.OnClickListener f101338b;

    static {
        Covode.recordClassIndex(64808);
    }

    ah(ag agVar, View.OnClickListener onClickListener) {
        this.f101337a = agVar;
        this.f101338b = onClickListener;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f101337a.a(this.f101338b, view);
    }
}
