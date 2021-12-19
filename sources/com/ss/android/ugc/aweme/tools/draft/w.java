package com.ss.android.ugc.aweme.tools.draft;

import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;

final /* synthetic */ class w implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeDraftViewHolder f139953a;

    static {
        Covode.recordClassIndex(91460);
    }

    w(AwemeDraftViewHolder awemeDraftViewHolder) {
        this.f139953a = awemeDraftViewHolder;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AwemeDraftViewHolder awemeDraftViewHolder = this.f139953a;
        ((c) awemeDraftViewHolder.t).y = z;
        com.ss.android.ugc.aweme.tools.draft.j.c.a().notifyDraftCheckedChanged((c) awemeDraftViewHolder.t, z);
    }
}
