package com.ss.android.ugc.aweme.search.middlepage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class VisitedAccountTitleCell extends PowerCell<e> {
    static {
        Covode.recordClassIndex(79135);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(e eVar) {
        l.d(eVar, "");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.awd, viewGroup, false);
        l.b(a2, "");
        return a2;
    }
}
