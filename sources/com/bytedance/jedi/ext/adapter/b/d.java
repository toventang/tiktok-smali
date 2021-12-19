package com.bytedance.jedi.ext.adapter.b;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.ext.adapter.b.e;
import com.bytedance.jedi.ext.adapter.b.f;
import com.bytedance.services.apm.api.a;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.b.l;
import java.util.List;

public abstract class d<VH extends e<?>, M extends f<VH>> extends RecyclerView.a<VH> implements c<VH, M> {
    static {
        Covode.recordClassIndex(24442);
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i2, boolean z);

    /* access modifiers changed from: protected */
    public abstract void a(g<VH> gVar);

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return b().b(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.c(recyclerView, "");
        b().a(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        l.c(recyclerView, "");
        b().b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.c(viewHolder, "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List list) {
        e eVar = (e) viewHolder;
        l.c(eVar, "");
        l.c(list, "");
        b();
        f.a(eVar, a(i2, true), i2, list);
    }

    private static RecyclerView.ViewHolder a(d dVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        l.c(viewGroup, "");
        e a3 = dVar.b().a(viewGroup, i2);
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
        return a3;
    }
}
