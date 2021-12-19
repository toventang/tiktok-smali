package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class as implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f72536a;

    static {
        Covode.recordClassIndex(44698);
    }

    as(k kVar) {
        this.f72536a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        k kVar = this.f72536a;
        if (kVar.getContext() != null) {
            new b(kVar).e(R.string.hb2).b();
        }
    }
}
