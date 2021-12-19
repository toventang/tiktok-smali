package com.ss.android.ugc.aweme.tools.draft;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.shortvideo.cr;

final /* synthetic */ class v implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeDraftViewHolder f139870a;

    static {
        Covode.recordClassIndex(91417);
    }

    v(AwemeDraftViewHolder awemeDraftViewHolder) {
        this.f139870a = awemeDraftViewHolder;
    }

    public final boolean onLongClick(View view) {
        AwemeDraftViewHolder awemeDraftViewHolder = this.f139870a;
        cr.a();
        if (!cr.a(view.getContext())) {
            return true;
        }
        awemeDraftViewHolder.o.a(view, (c) awemeDraftViewHolder.t);
        return true;
    }
}
