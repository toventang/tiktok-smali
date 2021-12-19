package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f70898a;

    static {
        Covode.recordClassIndex(43673);
    }

    c(a aVar) {
        this.f70898a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f70898a.a(view);
    }
}
