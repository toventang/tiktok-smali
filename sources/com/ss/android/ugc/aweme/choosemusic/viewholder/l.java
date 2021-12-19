package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f70915a;

    static {
        Covode.recordClassIndex(43684);
    }

    l(k kVar) {
        this.f70915a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f70915a.a();
    }
}
