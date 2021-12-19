package com.ss.android.ugc.aweme.commercialize.b.a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.a;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.Map;

public final class c extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public final List<WikipediaInfo> f73706a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.common.a.c<List<WikipediaInfo>> f73707b;

    static {
        Covode.recordClassIndex(45348);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f73706a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f73707b.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f73707b.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (i2 < this.f73706a.size()) {
            return this.f73707b.a(this.f73706a, i2);
        }
        return super.getItemViewType(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        this.f73707b.a(this.f73706a, i2, viewHolder);
    }

    public c(List<WikipediaInfo> list, Map<String, String> map, b<? super WikipediaInfo, z> bVar) {
        l.d(list, "");
        l.d(map, "");
        l.d(bVar, "");
        this.f73706a = list;
        com.ss.android.ugc.aweme.common.a.c<List<WikipediaInfo>> cVar = new com.ss.android.ugc.aweme.common.a.c<>();
        this.f73707b = cVar;
        cVar.a(new b(map, bVar));
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(5631);
        l.d(viewGroup, "");
        RecyclerView.ViewHolder a3 = cVar.f73707b.a(viewGroup, i2);
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
        MethodCollector.o(5631);
        return a3;
    }
}
