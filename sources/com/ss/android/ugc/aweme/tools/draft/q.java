package com.ss.android.ugc.aweme.tools.draft;

import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;

final /* synthetic */ class q implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeDraftNewViewHolder f139862a;

    static {
        Covode.recordClassIndex(91412);
    }

    q(AwemeDraftNewViewHolder awemeDraftNewViewHolder) {
        this.f139862a = awemeDraftNewViewHolder;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AwemeDraftNewViewHolder awemeDraftNewViewHolder = this.f139862a;
        ((c) awemeDraftNewViewHolder.t).y = z;
        com.ss.android.ugc.aweme.tools.draft.j.c.a().notifyDraftCheckedChanged((c) awemeDraftNewViewHolder.t, z);
    }
}
