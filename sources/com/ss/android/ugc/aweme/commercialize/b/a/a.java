package com.ss.android.ugc.aweme.commercialize.b.a;

import android.view.ViewGroup;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.common.a.c;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.b.l;
import java.util.List;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public List<AnchorPublishStruct> f73701a;

    /* renamed from: b  reason: collision with root package name */
    public final m f73702b;

    /* renamed from: c  reason: collision with root package name */
    private final c<List<AnchorPublishStruct>> f73703c;

    static {
        Covode.recordClassIndex(45346);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f73701a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f73703c.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f73703c.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (i2 < this.f73701a.size()) {
            return this.f73703c.a(this.f73701a, i2);
        }
        return super.getItemViewType(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        this.f73703c.a(this.f73701a, i2, viewHolder);
    }

    public a(List<AnchorPublishStruct> list, m mVar) {
        l.d(list, "");
        l.d(mVar, "");
        this.f73701a = list;
        this.f73702b = mVar;
        c<List<AnchorPublishStruct>> cVar = new c<>();
        this.f73703c = cVar;
        cVar.a(new e(mVar));
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(6062);
        l.d(viewGroup, "");
        RecyclerView.ViewHolder a3 = aVar.f73703c.a(viewGroup, i2);
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
        MethodCollector.o(6062);
        return a3;
    }
}
