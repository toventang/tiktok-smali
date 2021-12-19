package com.ss.android.ugc.aweme.kids.discovery.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.c.h;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class c extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<g> f106387a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<g> f106388b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final h<g> f106389c = new h<>();

    /* renamed from: d  reason: collision with root package name */
    final h f106390d = new h();

    /* renamed from: e  reason: collision with root package name */
    public RecyclerView f106391e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView.a<RecyclerView.ViewHolder> f106392f;

    /* renamed from: g  reason: collision with root package name */
    private final h<g> f106393g = new h<>();

    /* renamed from: h  reason: collision with root package name */
    private final a f106394h = new a(this);

    static {
        Covode.recordClassIndex(67990);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a extends RecyclerView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f106395a;

        static {
            Covode.recordClassIndex(67991);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a() {
            this.f106395a.notifyDataSetChanged();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(c cVar) {
            this.f106395a = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3) {
            c cVar = this.f106395a;
            cVar.notifyItemRangeChanged(cVar.f106387a.size() + i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b(int i2, int i3) {
            c cVar = this.f106395a;
            cVar.notifyItemRangeInserted(cVar.f106387a.size() + i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void c(int i2, int i3) {
            c cVar = this.f106395a;
            cVar.notifyItemRangeRemoved(cVar.f106387a.size() + i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, int i4) {
            c cVar = this.f106395a;
            cVar.notifyItemMoved(cVar.f106387a.size() + i2, this.f106395a.f106387a.size() + i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, Object obj) {
            c cVar = this.f106395a;
            cVar.notifyItemRangeChanged(cVar.f106387a.size() + i2, i3, obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f106387a.size() + this.f106388b.size() + this.f106392f.getItemCount();
    }

    private final boolean a(int i2) {
        if (i2 < this.f106387a.size()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        this.f106391e = null;
        this.f106392f.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void registerAdapterDataObserver(RecyclerView.c cVar) {
        l.d(cVar, "");
        super.registerAdapterDataObserver(cVar);
        this.f106392f.registerAdapterDataObserver(this.f106394h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void unregisterAdapterDataObserver(RecyclerView.c cVar) {
        l.d(cVar, "");
        super.unregisterAdapterDataObserver(cVar);
        this.f106392f.unregisterAdapterDataObserver(this.f106394h);
    }

    private final boolean b(int i2) {
        if (i2 >= this.f106387a.size() + this.f106392f.getItemCount()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        if (h.a(viewHolder.getItemViewType())) {
            return super.onFailedToRecycleView(viewHolder);
        }
        return this.f106392f.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        if (h.a(viewHolder.getItemViewType())) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f106392f.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        if (h.a(viewHolder.getItemViewType())) {
            super.onViewRecycled(viewHolder);
        } else {
            this.f106392f.onViewRecycled(viewHolder);
        }
    }

    public static final class b extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f106396e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f106397f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ GridLayoutManager.c f106398g;

        static {
            Covode.recordClassIndex(67992);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            if (h.a(this.f106396e.getItemViewType(i2))) {
                GridLayoutManager gridLayoutManager = this.f106397f;
                if (gridLayoutManager != null) {
                    return gridLayoutManager.f3760b;
                }
                return 1;
            }
            GridLayoutManager.c cVar = this.f106398g;
            if (cVar != null) {
                return cVar.a(i2 - this.f106396e.f106387a.size());
            }
            return 1;
        }

        b(c cVar, GridLayoutManager gridLayoutManager, GridLayoutManager.c cVar2) {
            this.f106396e = cVar;
            this.f106397f = gridLayoutManager;
            this.f106398g = cVar2;
        }
    }

    public c(RecyclerView.a<RecyclerView.ViewHolder> aVar) {
        l.d(aVar, "");
        this.f106392f = aVar;
        setHasStableIds(this.f106392f.mHasStableIds);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        this.f106391e = recyclerView;
        this.f106392f.onAttachedToRecyclerView(recyclerView);
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.a(new b(this, gridLayoutManager, gridLayoutManager.f3765g));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        if (h.a(viewHolder.getItemViewType())) {
            View view = viewHolder.itemView;
            l.b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.b) {
                ((StaggeredGridLayoutManager.b) layoutParams).f3934b = true;
                return;
            }
            return;
        }
        this.f106392f.onViewAttachedToWindow(viewHolder);
    }

    public final void a(View view) {
        int i2;
        int size = this.f106388b.size();
        if (size >= 0 && size <= this.f106388b.size() && view != null) {
            h hVar = this.f106390d;
            if (hVar.f106419b.size() > 0) {
                Integer removeFirst = hVar.f106419b.removeFirst();
                l.b(removeFirst, "");
                i2 = removeFirst.intValue();
            } else {
                i2 = hVar.f106418a;
                if (i2 <= 110000) {
                    hVar.f106418a++;
                } else {
                    throw new IllegalStateException("Your viewType is too much,it's impossible in common");
                }
            }
            g gVar = new g(i2, view);
            this.f106388b.add(gVar);
            this.f106389c.b(i2, gVar);
            notifyItemInserted((getItemCount() - this.f106388b.size()) + size);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        if (a(i2)) {
            return this.f106387a.get(i2).f106416a;
        }
        if (b(i2)) {
            return this.f106388b.get((i2 - this.f106387a.size()) - this.f106392f.getItemCount()).f106416a;
        }
        int itemViewType = this.f106392f.getItemViewType(i2 - this.f106387a.size());
        if (!h.a(itemViewType)) {
            return itemViewType;
        }
        throw new IllegalArgumentException("HeaderAndFooterWrapper use the viewType between 100000 and 110000");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (!a(i2) && !b(i2)) {
            this.f106392f.onBindViewHolder(viewHolder, i2 - this.f106387a.size());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        l.d(viewHolder, "");
        l.d(list, "");
        if (!a(i2) && !b(i2)) {
            this.f106392f.onBindViewHolder(viewHolder, i2 - this.f106387a.size(), list);
        }
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(3357);
        l.d(viewGroup, "");
        g a3 = cVar.f106393g.a(i2, null);
        if (a3 == null) {
            a3 = cVar.f106389c.a(i2, null);
        }
        if (a3 == null) {
            a3 = cVar.f106392f.onCreateViewHolder(viewGroup, i2);
            l.b(a3, "");
        }
        try {
            if (a3.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a3.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a3.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = a3.getClass().getName();
        MethodCollector.o(3357);
        return a3;
    }
}
