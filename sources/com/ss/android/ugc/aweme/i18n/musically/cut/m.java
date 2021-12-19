package com.ss.android.ugc.aweme.i18n.musically.cut;

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

public final class m extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public h<View> f99867a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public h<View> f99868b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView.a f99869c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView.c f99870d = new RecyclerView.c() {
        /* class com.ss.android.ugc.aweme.i18n.musically.cut.m.AnonymousClass3 */

        static {
            Covode.recordClassIndex(63672);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a() {
            m.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3) {
            m mVar = m.this;
            mVar.notifyItemRangeChanged(mVar.f99867a.b() + i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b(int i2, int i3) {
            m mVar = m.this;
            mVar.notifyItemRangeInserted(mVar.f99867a.b() + i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void c(int i2, int i3) {
            m mVar = m.this;
            mVar.notifyItemRangeRemoved(mVar.f99867a.b() + i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, int i4) {
            m mVar = m.this;
            mVar.notifyItemMoved(mVar.f99867a.b() + i2, m.this.f99867a.b() + i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, Object obj) {
            m mVar = m.this;
            mVar.notifyItemRangeChanged(mVar.f99867a.b() + i2, i3, obj);
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(63673);
        }

        int a(GridLayoutManager gridLayoutManager, GridLayoutManager.c cVar, int i2);
    }

    static {
        Covode.recordClassIndex(63669);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f99867a.b() + this.f99869c.getItemCount() + this.f99868b.b();
    }

    private boolean a(int i2) {
        if (i2 < this.f99867a.b()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void registerAdapterDataObserver(RecyclerView.c cVar) {
        super.registerAdapterDataObserver(cVar);
        this.f99869c.registerAdapterDataObserver(this.f99870d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void unregisterAdapterDataObserver(RecyclerView.c cVar) {
        super.unregisterAdapterDataObserver(cVar);
        this.f99869c.unregisterAdapterDataObserver(this.f99870d);
    }

    public m(RecyclerView.a aVar) {
        this.f99869c = aVar;
    }

    private boolean b(int i2) {
        if (this.f99867a.b() + this.f99869c.getItemCount() < i2) {
            return true;
        }
        return false;
    }

    public final void a(View view) {
        h<View> hVar = this.f99868b;
        hVar.b(hVar.b() + 200000, view);
        notifyItemRangeChanged(getItemCount() - this.f99868b.b(), this.f99868b.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (a(i2)) {
            return this.f99867a.c(i2);
        }
        if (b(i2)) {
            return this.f99868b.c((i2 - this.f99867a.b()) - this.f99869c.getItemCount());
        }
        return this.f99869c.getItemViewType(i2 - this.f99867a.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f99869c.onAttachedToRecyclerView(recyclerView);
        final AnonymousClass1 r3 = new a() {
            /* class com.ss.android.ugc.aweme.i18n.musically.cut.m.AnonymousClass1 */

            static {
                Covode.recordClassIndex(63670);
            }

            @Override // com.ss.android.ugc.aweme.i18n.musically.cut.m.a
            public final int a(GridLayoutManager gridLayoutManager, GridLayoutManager.c cVar, int i2) {
                int itemViewType = m.this.getItemViewType(i2);
                if (m.this.f99867a.a(itemViewType, null) != null) {
                    return gridLayoutManager.f3760b;
                }
                if (m.this.f99868b.a(itemViewType, null) != null) {
                    return gridLayoutManager.f3760b;
                }
                if (cVar != null) {
                    return cVar.a(i2 - m.this.f99867a.b());
                }
                return 1;
            }
        };
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final GridLayoutManager.c cVar = gridLayoutManager.f3765g;
            gridLayoutManager.a(new GridLayoutManager.c() {
                /* class com.ss.android.ugc.aweme.i18n.musically.cut.m.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(63671);
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.c
                public final int a(int i2) {
                    return r3.a(gridLayoutManager, cVar, i2);
                }
            });
            gridLayoutManager.a(gridLayoutManager.f3760b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        ViewGroup.LayoutParams layoutParams;
        this.f99869c.onViewAttachedToWindow(viewHolder);
        int layoutPosition = viewHolder.getLayoutPosition();
        if ((a(layoutPosition) || b(layoutPosition)) && (layoutParams = viewHolder.itemView.getLayoutParams()) != null && (layoutParams instanceof StaggeredGridLayoutManager.b)) {
            ((StaggeredGridLayoutManager.b) layoutParams).f3934b = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        if (!a(i2) && !b(i2)) {
            this.f99869c.onBindViewHolder(viewHolder, i2 - this.f99867a.b());
        }
    }

    private static RecyclerView.ViewHolder a(m mVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(11474);
        if (mVar.f99867a.a(i2, null) != null) {
            viewHolder = w.a(viewGroup.getContext(), mVar.f99867a.a(i2, null));
            viewHolder.setIsRecyclable(false);
        } else if (mVar.f99868b.a(i2, null) != null) {
            viewHolder = w.a(viewGroup.getContext(), mVar.f99868b.a(i2, null));
            viewHolder.setIsRecyclable(false);
        } else {
            viewHolder = mVar.f99869c.onCreateViewHolder(viewGroup, i2);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(11474);
        return viewHolder;
    }
}
