package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class as implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f77864a;

    /* renamed from: b  reason: collision with root package name */
    private final o f77865b;

    static {
        Covode.recordClassIndex(48253);
    }

    as(a aVar, o oVar) {
        this.f77864a = aVar;
        this.f77865b = oVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        a aVar = this.f77864a;
        if (this.f77865b.getResType() == 1) {
            aVar.c(R.string.fn6);
        }
    }
}
