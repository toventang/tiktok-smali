package com.ss.android.ugc.aweme.comment.page.tag;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class SectionCell extends PowerCell<k> {
    static {
        Covode.recordClassIndex(44400);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.j3, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(k kVar) {
        k kVar2 = kVar;
        l.d(kVar2, "");
        View view = this.itemView;
        l.b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.dwq);
        l.b(tuxTextView, "");
        tuxTextView.setText(kVar2.f72267a);
    }
}
