package com.bytedance.android.live.liveinteract.a.b.a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.a.b.a.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import j.a.a.c;

public abstract class a<D, VH extends b<D>> extends c<D, VH> {
    static {
        Covode.recordClassIndex(5130);
    }

    @Override // j.a.a.c
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
        b bVar = (b) viewHolder;
        l.d(bVar, "");
        bVar.getAdapterPosition();
        bVar.a(obj);
    }
}
