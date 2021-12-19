package com.bytedance.android.live.liveinteract.multilive.anchor.ui.b;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import j.a.a.c;

public abstract class a<D, VH extends b<D>> extends c<D, VH> {
    static {
        Covode.recordClassIndex(6347);
    }

    @Override // j.a.a.c
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
        b bVar = (b) viewHolder;
        l.d(bVar, "");
        bVar.getAdapterPosition();
        bVar.a(obj);
    }
}
