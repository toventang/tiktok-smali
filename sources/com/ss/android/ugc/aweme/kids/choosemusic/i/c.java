package com.ss.android.ugc.aweme.kids.choosemusic.i;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f105755a;

    static {
        Covode.recordClassIndex(67708);
    }

    c(a aVar) {
        this.f105755a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f105755a.a(view);
    }
}
