package com.ss.android.ugc.aweme.shortvideo.widget.b;

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

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public h<View> f132896a;

    /* renamed from: b  reason: collision with root package name */
    public h<View> f132897b;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView.a f132898c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView.c f132899d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.b.a$a  reason: collision with other inner class name */
    public interface AbstractC3439a {
        static {
            Covode.recordClassIndex(86934);
        }

        int a(GridLayoutManager gridLayoutManager, GridLayoutManager.c cVar, int i2);
    }

    static {
        Covode.recordClassIndex(86931);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f132896a.b() + this.f132898c.getItemCount() + this.f132897b.b();
    }

    private boolean a(int i2) {
        if (i2 < this.f132896a.b()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void registerAdapterDataObserver(RecyclerView.c cVar) {
        super.registerAdapterDataObserver(cVar);
        this.f132898c.registerAdapterDataObserver(this.f132899d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void unregisterAdapterDataObserver(RecyclerView.c cVar) {
        super.unregisterAdapterDataObserver(cVar);
        this.f132898c.unregisterAdapterDataObserver(this.f132899d);
    }

    private boolean b(int i2) {
        if (this.f132896a.b() + this.f132898c.getItemCount() < i2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (a(i2)) {
            return this.f132896a.c(i2);
        }
        if (b(i2)) {
            return this.f132897b.c((i2 - this.f132896a.b()) - this.f132898c.getItemCount());
        }
        return this.f132898c.getItemViewType(i2 - this.f132896a.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f132898c.onAttachedToRecyclerView(recyclerView);
        final AnonymousClass1 r3 = new AbstractC3439a() {
            /* class com.ss.android.ugc.aweme.shortvideo.widget.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(86932);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.widget.b.a.AbstractC3439a
            public final int a(GridLayoutManager gridLayoutManager, GridLayoutManager.c cVar, int i2) {
                int itemViewType = a.this.getItemViewType(i2);
                if (a.this.f132896a.a(itemViewType, null) != null) {
                    return gridLayoutManager.f3760b;
                }
                if (a.this.f132897b.a(itemViewType, null) != null) {
                    return gridLayoutManager.f3760b;
                }
                if (cVar != null) {
                    return cVar.a(i2 - a.this.f132896a.b());
                }
                return 1;
            }
        };
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final GridLayoutManager.c cVar = gridLayoutManager.f3765g;
            gridLayoutManager.a(new GridLayoutManager.c() {
                /* class com.ss.android.ugc.aweme.shortvideo.widget.b.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(86933);
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
        this.f132898c.onViewAttachedToWindow(viewHolder);
        int layoutPosition = viewHolder.getLayoutPosition();
        if ((a(layoutPosition) || b(layoutPosition)) && (layoutParams = viewHolder.itemView.getLayoutParams()) != null && (layoutParams instanceof StaggeredGridLayoutManager.b)) {
            ((StaggeredGridLayoutManager.b) layoutParams).f3934b = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        if (!a(i2) && !b(i2)) {
            this.f132898c.onBindViewHolder(viewHolder, i2 - this.f132896a.b());
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(2201);
        if (aVar.f132896a.a(i2, null) != null) {
            viewHolder = b.a(aVar.f132896a.a(i2, null));
            viewHolder.setIsRecyclable(false);
        } else if (aVar.f132897b.a(i2, null) != null) {
            viewHolder = b.a(aVar.f132897b.a(i2, null));
            viewHolder.setIsRecyclable(false);
        } else {
            viewHolder = aVar.f132898c.onCreateViewHolder(viewGroup, i2);
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
        MethodCollector.o(2201);
        return viewHolder;
    }
}
