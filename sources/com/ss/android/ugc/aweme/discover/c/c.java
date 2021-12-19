package com.ss.android.ugc.aweme.discover.c;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.a;
import com.ss.android.ugc.aweme.common.a.b;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class c<T> extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.common.a.c<List<T>> f80902a = new com.ss.android.ugc.aweme.common.a.c<>();

    /* renamed from: j  reason: collision with root package name */
    public final List<T> f80903j = new ArrayList();

    static {
        Covode.recordClassIndex(50296);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f80903j.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.c.c<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final c<?> a(b<List<T>> bVar) {
        l.d(bVar, "");
        this.f80902a.a(bVar);
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        return this.f80902a.a(this.f80903j, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        return this.f80902a.b(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        this.f80902a.c(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        this.f80902a.d(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        this.f80902a.a(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        this.f80902a.a(this.f80903j, i2, viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        l.d(viewHolder, "");
        l.d(list, "");
        this.f80902a.a(this.f80903j, i2, viewHolder, list);
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(3411);
        l.d(viewGroup, "");
        RecyclerView.ViewHolder a3 = cVar.f80902a.a(viewGroup, i2);
        l.b(a3, "");
        try {
            if (a3.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    a.a(stringBuffer.toString());
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
        MethodCollector.o(3411);
        return a3;
    }
}
