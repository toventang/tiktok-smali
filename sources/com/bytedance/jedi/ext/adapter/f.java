package com.bytedance.jedi.ext.adapter;

import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.a.b;
import com.bytedance.jedi.arch.ext.list.a.c;
import com.bytedance.jedi.arch.ext.list.a.e;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.ext.adapter.internal.a;
import com.bytedance.jedi.ext.adapter.internal.h;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public abstract class f<T> extends a<T, JediViewHolder<? extends g, T>, i<JediViewHolder<? extends g, T>>> {

    /* renamed from: b  reason: collision with root package name */
    public final i<JediViewHolder<? extends g, T>> f39705b;

    /* renamed from: c  reason: collision with root package name */
    public final m f39706c;

    /* renamed from: d  reason: collision with root package name */
    private final b<T> f39707d;

    static {
        Covode.recordClassIndex(24466);
    }

    @Override // com.bytedance.jedi.arch.ext.list.a, com.bytedance.jedi.ext.adapter.a
    public final b<T> a() {
        return this.f39707d;
    }

    @Override // com.bytedance.jedi.ext.adapter.b.c
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.ext.adapter.b.f b() {
        return this.f39705b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        RecyclerView recyclerView;
        int i2;
        JediViewHolder jediViewHolder = (JediViewHolder) viewHolder;
        l.c(jediViewHolder, "");
        i<JediViewHolder<? extends g, T>> iVar = this.f39705b;
        l.c(jediViewHolder, "");
        a aVar = iVar.f39680b;
        l.c(jediViewHolder, "");
        h hVar = aVar.f39726c;
        if (hVar != null && (recyclerView = aVar.f39725b.f39649a) != null) {
            int itemViewType = jediViewHolder.getItemViewType();
            l.c(recyclerView, "");
            RecyclerView.RecycledViewPool.ScrapData scrapData = recyclerView.getRecycledViewPool().mScrap.get(itemViewType);
            if (scrapData != null) {
                i2 = scrapData.mMaxScrap;
            } else {
                i2 = -1;
            }
            int recycledViewCount = recyclerView.getRecycledViewPool().getRecycledViewCount(itemViewType);
            if (i2 != -1 && i2 <= recycledViewCount) {
                l.c(jediViewHolder, "");
                int itemViewType2 = jediViewHolder.getItemViewType();
                List<RecyclerView.ViewHolder> list = hVar.a().get(itemViewType2);
                if (list == null) {
                    list = new ArrayList<>();
                    hVar.a().put(itemViewType2, list);
                }
                list.add(jediViewHolder);
                l.c(jediViewHolder, "");
                jediViewHolder.resetInternal();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(m mVar, e eVar, c<T> cVar) {
        super(eVar, cVar);
        l.c(mVar, "");
        l.c(cVar, "");
        this.f39706c = mVar;
        i<JediViewHolder<? extends g, T>> iVar = new i<>(mVar);
        a(iVar);
        this.f39705b = iVar;
        this.f39707d = new b<>(new d(this), cVar, eVar);
    }
}
