package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;

final /* synthetic */ class bc implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final MvImageChooseAdapter.e f129053a;

    static {
        Covode.recordClassIndex(84701);
    }

    bc(MvImageChooseAdapter.e eVar) {
        this.f129053a = eVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f129053a.f128874f.performClick();
    }
}
