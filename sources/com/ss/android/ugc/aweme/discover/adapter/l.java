package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import java.util.List;
import java.util.Objects;

public final class l<VH extends RecyclerView.ViewHolder> extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public int f80562a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView.a<VH> f80563b;

    /* renamed from: c  reason: collision with root package name */
    final o f80564c;

    /* renamed from: d  reason: collision with root package name */
    final e f80565d;

    /* renamed from: e  reason: collision with root package name */
    RecyclerView f80566e;

    /* renamed from: f  reason: collision with root package name */
    d f80567f;

    /* renamed from: g  reason: collision with root package name */
    RecyclerView.n f80568g;

    public interface e {
        static {
            Covode.recordClassIndex(50124);
        }
    }

    static {
        Covode.recordClassIndex(50119);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    static class b implements o {
        static {
            Covode.recordClassIndex(50121);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.discover.adapter.o
        public final n a(ViewGroup viewGroup) {
            return new c(new m(viewGroup.getContext()));
        }
    }

    static class d extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        RecyclerView f80571e;

        /* renamed from: f  reason: collision with root package name */
        GridLayoutManager f80572f;

        /* renamed from: g  reason: collision with root package name */
        GridLayoutManager.c f80573g;

        static {
            Covode.recordClassIndex(50123);
        }

        d() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            if (i2 < this.f80571e.getAdapter().getItemCount() - 1) {
                return this.f80573g.a(i2);
            }
            return this.f80572f.f3760b;
        }
    }

    private void a() {
        notifyItemChanged(getItemCount() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f80563b.getItemCount() + 1;
    }

    static class a extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        e f80569a;

        static {
            Covode.recordClassIndex(50120);
        }

        a(e eVar) {
            this.f80569a = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            super.a(recyclerView, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            super.a(recyclerView, i2, i3);
            recyclerView.canScrollVertically(1);
        }
    }

    static class c extends n {

        /* renamed from: a  reason: collision with root package name */
        m f80570a;

        static {
            Covode.recordClassIndex(50122);
        }

        c(View view) {
            super(view);
            this.f80570a = (m) view;
        }

        @Override // com.ss.android.ugc.aweme.discover.adapter.n
        public final void a(int i2) {
            this.f80570a.setState(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void setHasStableIds(boolean z) {
        this.f80563b.setHasStableIds(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.RecyclerView$ViewHolder */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof n) {
            return super.onFailedToRecycleView(viewHolder);
        }
        return this.f80563b.onFailedToRecycleView(viewHolder);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.RecyclerView$ViewHolder */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof n) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.f80563b.onViewAttachedToWindow(viewHolder);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.RecyclerView$ViewHolder */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof n) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f80563b.onViewDetachedFromWindow(viewHolder);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.RecyclerView$ViewHolder */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof n) {
            super.onViewRecycled(viewHolder);
        } else {
            this.f80563b.onViewRecycled(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void registerAdapterDataObserver(RecyclerView.c cVar) {
        super.registerAdapterDataObserver(cVar);
        this.f80563b.registerAdapterDataObserver(cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void unregisterAdapterDataObserver(RecyclerView.c cVar) {
        super.unregisterAdapterDataObserver(cVar);
        this.f80563b.unregisterAdapterDataObserver(cVar);
    }

    public static <VH extends RecyclerView.ViewHolder> l<VH> a(RecyclerView.a<VH> aVar) {
        Objects.requireNonNull(aVar);
        if (!(aVar instanceof l)) {
            return new l<>(aVar, new b((byte) 0));
        }
        throw new IllegalArgumentException("LoadMoreAdapter can't wrap itself.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        if (i2 < this.f80563b.getItemCount()) {
            return this.f80563b.getItemId(i2);
        }
        return super.getItemId(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (i2 < this.f80563b.getItemCount()) {
            return this.f80563b.getItemViewType(i2);
        }
        return 65298;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f80563b.onDetachedFromRecyclerView(recyclerView);
        if (this.f80567f != null) {
            this.f80567f = null;
        }
        RecyclerView.n nVar = this.f80568g;
        if (nVar != null) {
            this.f80566e.b(nVar);
        }
        this.f80566e = null;
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public final void a(int i2) {
        if (i2 != 0 && i2 != 1 && i2 != 3 && i2 != 2) {
            throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
        } else if (this.f80562a != i2) {
            this.f80562a = i2;
            a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f80566e = recyclerView;
        if (this.f80567f == null && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            d dVar = new d();
            this.f80567f = dVar;
            dVar.f80571e = recyclerView;
            dVar.f80572f = (GridLayoutManager) recyclerView.getLayoutManager();
            dVar.f80573g = dVar.f80572f.f3765g;
            dVar.f80572f.a(dVar);
        }
        if (this.f80568g == null && this.f80565d != null) {
            this.f80568g = new a(this.f80565d);
        }
        RecyclerView.n nVar = this.f80568g;
        if (nVar != null) {
            this.f80566e.a(nVar);
        }
        this.f80563b.onAttachedToRecyclerView(recyclerView);
    }

    private l(RecyclerView.a<VH> aVar, o oVar) {
        this.f80563b = aVar;
        this.f80564c = oVar;
        this.f80565d = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        if (i2 < this.f80563b.getItemCount()) {
            this.f80563b.onBindViewHolder(viewHolder, i2);
        } else {
            ((n) viewHolder).a(this.f80562a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.RecyclerView$ViewHolder */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        if (i2 < this.f80563b.getItemCount()) {
            this.f80563b.onBindViewHolder(viewHolder, i2, list);
        } else {
            super.onBindViewHolder(viewHolder, i2, list);
        }
    }

    private static RecyclerView.ViewHolder a(l lVar, ViewGroup viewGroup, int i2) {
        VH vh;
        boolean a2;
        MethodCollector.i(5567);
        if (i2 == 65298) {
            vh = lVar.f80564c.a(viewGroup);
        } else {
            vh = lVar.f80563b.onCreateViewHolder(viewGroup, i2);
        }
        try {
            if (vh.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(vh.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) vh.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(vh.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = vh.getClass().getName();
        MethodCollector.o(5567);
        return vh;
    }
}
