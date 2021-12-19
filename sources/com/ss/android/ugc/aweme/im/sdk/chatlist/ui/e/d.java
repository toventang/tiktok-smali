package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f102133a;

    /* renamed from: b  reason: collision with root package name */
    private final a f102134b;

    static {
        Covode.recordClassIndex(65347);
    }

    d(c cVar, a aVar) {
        this.f102133a = cVar;
        this.f102134b = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f102133a.c(this.f102134b);
    }
}
