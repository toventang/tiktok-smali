package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.c;

final /* synthetic */ class at implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ak f131417a;

    static {
        Covode.recordClassIndex(86095);
    }

    at(ak akVar) {
        this.f131417a = akVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ak akVar = this.f131417a;
        a.b.a(akVar, c.f128469a);
        akVar.W.a();
    }
}
