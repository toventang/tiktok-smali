package com.ss.android.ugc.tools.view.widget.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.tools.view.widget.a.a;
import h.f.b.l;
import java.util.List;

public abstract class d extends e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f150344a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView.a<RecyclerView.ViewHolder> f150345b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f150346c = true;

    static {
        Covode.recordClassIndex(98892);
    }

    public abstract void a(RecyclerView.ViewHolder viewHolder);

    public abstract RecyclerView.ViewHolder b(ViewGroup viewGroup);

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        int itemCount = this.f150345b.getItemCount();
        if ((!this.f150346c || itemCount != 0) && this.f150344a) {
            return itemCount + 1;
        }
        return itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        if (i2 != this.f150345b.getItemCount() || !this.f150344a) {
            return this.f150345b.getItemViewType(i2);
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.tools.view.widget.a.e
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        boolean z;
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        View view = viewHolder.itemView;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.b)) {
            StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams;
            if (getItemViewType(viewHolder.getLayoutPosition()) == Integer.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            bVar.f3934b = z;
        }
    }

    public d(RecyclerView.a<RecyclerView.ViewHolder> aVar, boolean z) {
        l.d(aVar, "");
        this.f150345b = aVar;
        l.d(aVar, "");
        l.d(this, "");
        aVar.registerAdapterDataObserver(new a.C4051a(this));
        this.f150344a = true;
    }

    @Override // com.ss.android.ugc.tools.view.widget.a.e
    public final int a(int i2, GridLayoutManager gridLayoutManager) {
        l.d(gridLayoutManager, "");
        if (getItemViewType(i2) == Integer.MIN_VALUE) {
            return gridLayoutManager.f3760b;
        }
        RecyclerView.a<RecyclerView.ViewHolder> aVar = this.f150345b;
        if (aVar instanceof e) {
            return ((e) aVar).a(i2, gridLayoutManager);
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (getItemViewType(i2) == Integer.MIN_VALUE) {
            a(viewHolder);
        } else {
            this.f150345b.onBindViewHolder(viewHolder, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        l.d(viewHolder, "");
        l.d(list, "");
        if (getItemViewType(i2) == Integer.MIN_VALUE) {
            onBindViewHolder(viewHolder, i2);
        } else {
            this.f150345b.onBindViewHolder(viewHolder, i2, list);
        }
    }

    private static RecyclerView.ViewHolder a(d dVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        l.d(viewGroup, "");
        if (Integer.MIN_VALUE == i2) {
            viewHolder = dVar.b(viewGroup);
        } else {
            viewHolder = dVar.f150345b.onCreateViewHolder(viewGroup, i2);
            l.b(viewHolder, "");
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
        return viewHolder;
    }
}
