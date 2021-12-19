package com.ss.android.ugc.aweme.choosemusic.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.a.i;

final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i.a f70309a;

    static {
        Covode.recordClassIndex(43370);
    }

    j(i.a aVar) {
        this.f70309a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        i.a aVar = this.f70309a;
        if (i.this.f70304a != null) {
            i.this.f70304a.a(aVar.f70307c, aVar.getLayoutPosition());
        }
    }
}
