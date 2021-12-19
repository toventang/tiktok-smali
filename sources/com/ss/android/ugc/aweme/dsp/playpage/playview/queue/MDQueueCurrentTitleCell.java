package com.ss.android.ugc.aweme.dsp.playpage.playview.queue;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.dsp.playpage.model.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class MDQueueCurrentTitleCell extends PowerCell<c> {
    static {
        Covode.recordClassIndex(52311);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int j() {
        return R.layout.am3;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a, java.util.List] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(c cVar, List list) {
        c cVar2 = cVar;
        l.d(cVar2, "");
        l.d(list, "");
        View view = this.itemView;
        String string = view.getResources().getString(cVar2.f83738a);
        l.b(string, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.cqa);
        l.b(tuxTextView, "");
        tuxTextView.setText(view.getResources().getString(R.string.dbv, string));
    }
}
