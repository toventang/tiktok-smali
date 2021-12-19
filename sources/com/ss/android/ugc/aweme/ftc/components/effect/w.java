package com.ss.android.ugc.aweme.ftc.components.effect;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import dmt.av.video.p;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final f f97888a;

    static {
        Covode.recordClassIndex(62215);
    }

    w(f fVar) {
        this.f97888a = fVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        f fVar = this.f97888a;
        p value = fVar.f97851d.getValue();
        if (value == null || value.f156931g != 0) {
            fVar.u.setCurrentItem(((Integer) view.getTag()).intValue());
        }
    }
}
