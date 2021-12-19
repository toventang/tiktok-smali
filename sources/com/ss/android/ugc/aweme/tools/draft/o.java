package com.ss.android.ugc.aweme.tools.draft;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;

final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeDraftNewViewHolder f139860a;

    static {
        Covode.recordClassIndex(91410);
    }

    o(AwemeDraftNewViewHolder awemeDraftNewViewHolder) {
        this.f139860a = awemeDraftNewViewHolder;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AwemeDraftNewViewHolder awemeDraftNewViewHolder = this.f139860a;
        if (awemeDraftNewViewHolder.f139298c) {
            awemeDraftNewViewHolder.f139297b.setChecked(!((c) awemeDraftNewViewHolder.t).y);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - awemeDraftNewViewHolder.f139302g >= 500) {
            awemeDraftNewViewHolder.f139302g = currentTimeMillis;
            awemeDraftNewViewHolder.f139300e.a(awemeDraftNewViewHolder.getAdapterPosition(), (c) awemeDraftNewViewHolder.t);
        }
    }
}
