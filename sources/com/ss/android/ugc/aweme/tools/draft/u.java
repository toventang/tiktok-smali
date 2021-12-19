package com.ss.android.ugc.aweme.tools.draft;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;

final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeDraftViewHolder f139869a;

    static {
        Covode.recordClassIndex(91416);
    }

    u(AwemeDraftViewHolder awemeDraftViewHolder) {
        this.f139869a = awemeDraftViewHolder;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AwemeDraftViewHolder awemeDraftViewHolder = this.f139869a;
        if (awemeDraftViewHolder.f139325m) {
            awemeDraftViewHolder.f139321i.setChecked(!((c) awemeDraftViewHolder.t).y);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - awemeDraftViewHolder.q >= 500) {
            awemeDraftViewHolder.q = currentTimeMillis;
            awemeDraftViewHolder.o.a(awemeDraftViewHolder.getAdapterPosition(), (c) awemeDraftViewHolder.t);
        }
    }
}
