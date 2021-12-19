package com.ss.android.ugc.aweme.discover.alading;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView.a f80705a;

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView.c f80706b;

    static {
        Covode.recordClassIndex(50194);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        RecyclerView.a aVar = this.f80705a;
        if (aVar != null) {
            return aVar.getItemCount();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return this.f80705a.getItemViewType(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.a aVar = this.f80705a;
        if (aVar != null) {
            aVar.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        RecyclerView.a aVar = this.f80705a;
        if (aVar != null) {
            aVar.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.a aVar = this.f80705a;
        if (aVar != null) {
            return aVar.onFailedToRecycleView(viewHolder);
        }
        return super.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        RecyclerView.a aVar = this.f80705a;
        if (aVar != null) {
            aVar.onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        RecyclerView.a aVar = this.f80705a;
        if (aVar != null) {
            aVar.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        RecyclerView.a aVar = this.f80705a;
        if (aVar != null) {
            aVar.onViewRecycled(viewHolder);
        }
    }

    public final void a(RecyclerView.a aVar) {
        RecyclerView.a aVar2 = this.f80705a;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                try {
                    aVar2.unregisterAdapterDataObserver(this.f80706b);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            this.f80705a = aVar;
            c cVar = new c(this);
            this.f80706b = cVar;
            aVar.registerAdapterDataObserver(cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        this.f80705a.onBindViewHolder(viewHolder, i2);
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(2101);
        RecyclerView.ViewHolder onCreateViewHolder = aVar.f80705a.onCreateViewHolder(viewGroup, i2);
        try {
            if (onCreateViewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(onCreateViewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) onCreateViewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(onCreateViewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = onCreateViewHolder.getClass().getName();
        MethodCollector.o(2101);
        return onCreateViewHolder;
    }
}
