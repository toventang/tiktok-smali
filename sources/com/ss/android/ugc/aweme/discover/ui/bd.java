package com.ss.android.ugc.aweme.discover.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import java.util.Collections;
import java.util.List;

public class bd<T> extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    protected List<T> f82421a = Collections.emptyList();

    /* renamed from: b  reason: collision with root package name */
    public a<T> f82422b;

    public interface a<T> {
        static {
            Covode.recordClassIndex(51300);
        }

        RecyclerView.ViewHolder a();

        void a(RecyclerView.ViewHolder viewHolder, T t);
    }

    static {
        Covode.recordClassIndex(51299);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f82421a.size();
    }

    public final void a(List<T> list) {
        this.f82421a = list;
        notifyDataSetChanged();
    }

    public bd(a<T> aVar) {
        this.f82422b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        this.f82422b.a(viewHolder, this.f82421a.get(i2));
    }

    private static RecyclerView.ViewHolder a(bd bdVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(2146);
        a<T> aVar = bdVar.f82422b;
        bdVar.f82421a.get(i2);
        RecyclerView.ViewHolder a3 = aVar.a();
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
        MethodCollector.o(2146);
        return a3;
    }
}
