package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.l;
import com.ss.android.ugc.aweme.shortvideo.cut.q;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e;
import com.ss.android.ugc.aweme.shortvideo.cut.z;

public final class f extends q {
    static {
        Covode.recordClassIndex(82709);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(l lVar) {
        super(lVar);
        h.f.b.l.d(lVar, "");
    }

    @Override // androidx.recyclerview.widget.n.a, com.ss.android.ugc.aweme.shortvideo.cut.q
    public final int a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        h.f.b.l.d(recyclerView, "");
        h.f.b.l.d(viewHolder, "");
        if (!(viewHolder instanceof z.a) && !(viewHolder instanceof e.a)) {
            return super.a(recyclerView, viewHolder);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.n.a, com.ss.android.ugc.aweme.shortvideo.cut.q
    public final boolean b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        h.f.b.l.d(recyclerView, "");
        h.f.b.l.d(viewHolder, "");
        h.f.b.l.d(viewHolder2, "");
        if (!(viewHolder2 instanceof z.a) && !(viewHolder2 instanceof e.a)) {
            return super.b(recyclerView, viewHolder, viewHolder2);
        }
        return false;
    }
}
