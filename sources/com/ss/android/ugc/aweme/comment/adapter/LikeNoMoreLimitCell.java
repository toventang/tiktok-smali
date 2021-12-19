package com.ss.android.ugc.aweme.comment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class LikeNoMoreLimitCell extends PowerCell<ag> {
    static {
        Covode.recordClassIndex(43906);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.j0, viewGroup, false);
        l.b(a2, "");
        return a2;
    }
}
