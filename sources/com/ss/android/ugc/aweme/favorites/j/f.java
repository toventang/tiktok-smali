package com.ss.android.ugc.aweme.favorites.j;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final e f90697a;

    static {
        Covode.recordClassIndex(56965);
    }

    f(e eVar) {
        this.f90697a = eVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f90697a.onClick(view);
    }
}
