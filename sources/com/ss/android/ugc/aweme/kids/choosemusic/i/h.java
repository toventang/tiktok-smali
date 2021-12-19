package com.ss.android.ugc.aweme.kids.choosemusic.i;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final g f105767a;

    static {
        Covode.recordClassIndex(67714);
    }

    h(g gVar) {
        this.f105767a = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f105767a.a();
    }
}
