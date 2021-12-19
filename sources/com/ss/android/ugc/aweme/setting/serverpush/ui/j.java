package com.ss.android.ugc.aweme.setting.serverpush.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final g f122635a;

    static {
        Covode.recordClassIndex(80464);
    }

    j(g gVar) {
        this.f122635a = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        g gVar = this.f122635a;
        if (view.getId() == R.id.qb && gVar.getActivity() != null) {
            gVar.getActivity().onBackPressed();
        }
    }
}
