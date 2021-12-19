package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.s;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f117136a;

    static {
        Covode.recordClassIndex(75653);
    }

    f(View view) {
        this.f117136a = view;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        View view2 = this.f117136a;
        s.a.f66880a.a().b(true);
        view2.setVisibility(8);
    }
}
