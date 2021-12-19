package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f102137a;

    /* renamed from: b  reason: collision with root package name */
    private final a f102138b;

    static {
        Covode.recordClassIndex(65349);
    }

    f(c cVar, a aVar) {
        this.f102137a = cVar;
        this.f102138b = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f102137a.a(this.f102138b);
    }
}
