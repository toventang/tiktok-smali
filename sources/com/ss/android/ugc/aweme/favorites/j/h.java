package com.ss.android.ugc.aweme.favorites.j;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final e f90699a;

    static {
        Covode.recordClassIndex(56967);
    }

    h(e eVar) {
        this.f90699a = eVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f90699a.onClick(view);
    }
}
