package com.ss.android.ugc.aweme.tools.draft;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.shortvideo.cr;

final /* synthetic */ class p implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeDraftNewViewHolder f139861a;

    static {
        Covode.recordClassIndex(91411);
    }

    p(AwemeDraftNewViewHolder awemeDraftNewViewHolder) {
        this.f139861a = awemeDraftNewViewHolder;
    }

    public final boolean onLongClick(View view) {
        AwemeDraftNewViewHolder awemeDraftNewViewHolder = this.f139861a;
        cr.a();
        if (!cr.a(view.getContext())) {
            return true;
        }
        awemeDraftNewViewHolder.f139300e.a(view, (c) awemeDraftNewViewHolder.t);
        return true;
    }
}
