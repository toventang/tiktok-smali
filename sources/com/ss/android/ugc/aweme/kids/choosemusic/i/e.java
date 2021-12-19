package com.ss.android.ugc.aweme.kids.choosemusic.i;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f105757a;

    static {
        Covode.recordClassIndex(67710);
    }

    e(a aVar) {
        this.f105757a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f105757a.a(view);
    }
}
