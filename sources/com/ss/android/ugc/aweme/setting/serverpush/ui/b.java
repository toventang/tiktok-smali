package com.ss.android.ugc.aweme.setting.serverpush.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f122612a;

    static {
        Covode.recordClassIndex(80453);
    }

    b(a aVar) {
        this.f122612a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        a aVar = this.f122612a;
        if (view.getId() == R.id.qb && aVar.getActivity() != null) {
            aVar.getActivity().onBackPressed();
        }
    }
}
