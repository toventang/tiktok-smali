package com.ss.android.ugc.aweme.discover.c;

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
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<g> f80890a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<g> f80891b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final h<g> f80892c = new h<>();

    /* renamed from: d  reason: collision with root package name */
    public final h f80893d = new h();

    /* renamed from: e  reason: collision with root package name */
    public RecyclerView f80894e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView.a<RecyclerView.ViewHolder> f80895f;

    /* renamed from: g  reason: collision with root package name */
    private final h<g> f80896g = new h<>();

    /* renamed from: h  reason: collision with root package name */
    private final C1887a f80897h = new C1887a(this);

    static {
        Covode.recordClassIndex(50292);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.c.a$a  reason: collision with other inner class name */
    public static final class C1887a extends RecyclerView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f80898a;

        static {
            Covode.recordClassIndex(50293);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a() {
            this.f80898a.notifyDataSetChanged();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1887a(a aVar) {
            this.f80898a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3) {
            a aVar = this.f80898a;
            aVar.notifyItemRangeChanged(aVar.f80890a.size() + i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b(int i2, int i3) {
            a aVar = this.f80898a;
            aVar.notifyItemRangeInserted(aVar.f80890a.size() + i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void c(int i2, int i3) {
            a aVar = this.f80898a;
            aVar.notifyItemRangeRemoved(aVar.f80890a.size() + i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, int i4) {
            a aVar = this.f80898a;
            aVar.notifyItemMoved(aVar.f80890a.size() + i2, this.f80898a.f80890a.size() + i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, Object obj) {
            a aVar = this.f80898a;
            aVar.notifyItemRangeChanged(aVar.f80890a.size() + i2, i3, obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f80890a.size() + this.f80891b.size() + this.f80895f.getItemCount();
    }

    public final List<View> a() {
        ArrayList<g> arrayList = this.f80890a;
        ArrayList arrayList2 = new ArrayList(n.a((Iterable) arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g) it.next()).itemView);
        }
        return arrayList2;
    }

    private final boolean a(int i2) {
        if (i2 < this.f80890a.size()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        this.f80894e = null;
        this.f80895f.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void unregisterAdapterDataObserver(RecyclerView.c cVar) {
        l.d(cVar, "");
        super.unregisterAdapterDataObserver(cVar);
        this.f80895f.unregisterAdapterDataObserver(this.f80897h);
    }

    private final boolean b(int i2) {
        if (i2 >= this.f80890a.size() + this.f80895f.getItemCount()) {
            return true;
        }
        return false;
    }

    public final void a(View view) {
        a(this.f80890a.size(), view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        if (h.a(viewHolder.getItemViewType())) {
            return super.onFailedToRecycleView(viewHolder);
        }
        return this.f80895f.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        if (h.a(viewHolder.getItemViewType())) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f80895f.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        if (h.a(viewHolder.getItemViewType())) {
            super.onViewRecycled(viewHolder);
        } else {
            this.f80895f.onViewRecycled(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void registerAdapterDataObserver(RecyclerView.c cVar) {
        l.d(cVar, "");
        super.registerAdapterDataObserver(cVar);
        RecyclerView.a<RecyclerView.ViewHolder> aVar = this.f80895f;
        if (aVar != null) {
            try {
                aVar.unregisterAdapterDataObserver(this.f80897h);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        this.f80895f.registerAdapterDataObserver(this.f80897h);
    }

    public static final class b extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f80899e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f80900f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ GridLayoutManager.c f80901g;

        static {
            Covode.recordClassIndex(50294);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            if (h.a(this.f80899e.getItemViewType(i2))) {
                GridLayoutManager gridLayoutManager = this.f80900f;
                if (gridLayoutManager != null) {
                    return gridLayoutManager.f3760b;
                }
                return 1;
            }
            GridLayoutManager.c cVar = this.f80901g;
            if (cVar != null) {
                return cVar.a(i2 - this.f80899e.f80890a.size());
            }
            return 1;
        }

        b(a aVar, GridLayoutManager gridLayoutManager, GridLayoutManager.c cVar) {
            this.f80899e = aVar;
            this.f80900f = gridLayoutManager;
            this.f80901g = cVar;
        }
    }

    public a(RecyclerView.a<RecyclerView.ViewHolder> aVar) {
        l.d(aVar, "");
        this.f80895f = aVar;
        setHasStableIds(this.f80895f.mHasStableIds);
    }

    private boolean c(int i2) {
        if (i2 < 0 || i2 >= this.f80890a.size()) {
            return false;
        }
        g remove = this.f80890a.remove(i2);
        l.b(remove, "");
        g gVar = remove;
        this.f80896g.b(gVar.f80925a);
        gVar.setIsRecyclable(false);
        this.f80893d.b(gVar.f80925a);
        notifyItemRemoved(i2);
        return true;
    }

    public final boolean b(View view) {
        int i2 = 0;
        if (view == null) {
            return false;
        }
        Iterator<g> it = this.f80890a.iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (l.a(it.next().itemView, view)) {
                break;
            } else {
                i2++;
            }
        }
        return c(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        this.f80894e = recyclerView;
        this.f80895f.onAttachedToRecyclerView(recyclerView);
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.a(new b(this, gridLayoutManager, gridLayoutManager.f3765g));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
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
        this.f80895f.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (a(i2)) {
            return this.f80890a.get(i2).f80925a;
        }
        if (b(i2)) {
            return this.f80891b.get((i2 - this.f80890a.size()) - this.f80895f.getItemCount()).f80925a;
        }
        int itemViewType = this.f80895f.getItemViewType(i2 - this.f80890a.size());
        if (!h.a(itemViewType)) {
            return itemViewType;
        }
        throw new IllegalArgumentException("HeaderAndFooterWrapper use the viewType between 100000 and 110000");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (!a(i2) && !b(i2)) {
            this.f80895f.onBindViewHolder(viewHolder, i2 - this.f80890a.size());
        }
    }

    public final void a(int i2, View view) {
        if (i2 >= 0 && i2 <= this.f80890a.size() && view != null) {
            int a2 = this.f80893d.a();
            g gVar = new g(a2, view);
            this.f80890a.add(gVar);
            this.f80896g.b(a2, gVar);
            notifyItemInserted(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        l.d(viewHolder, "");
        l.d(list, "");
        if (!a(i2) && !b(i2)) {
            this.f80895f.onBindViewHolder(viewHolder, i2 - this.f80890a.size(), list);
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(1456);
        l.d(viewGroup, "");
        g a3 = aVar.f80896g.a(i2, null);
        if (a3 == null) {
            a3 = aVar.f80892c.a(i2, null);
        }
        if (a3 == null) {
            a3 = aVar.f80895f.onCreateViewHolder(viewGroup, i2);
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
        MethodCollector.o(1456);
        return a3;
    }
}
