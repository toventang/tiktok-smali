package com.ss.android.ugc.aweme.crossplatform.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.LinkedList;

public final class c extends RecyclerView.a<d> {

    /* renamed from: a  reason: collision with root package name */
    public LinkedList<l> f78535a;

    static {
        Covode.recordClassIndex(48772);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ d onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f78535a.size();
    }

    public final void a(LinkedList<l> linkedList) {
        l.d(linkedList, "");
        this.f78535a = linkedList;
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(d dVar, int i2) {
        d dVar2 = dVar;
        l.d(dVar2, "");
        l lVar = this.f78535a.get(i2);
        l.b(lVar, "");
        l lVar2 = lVar;
        l.d(lVar2, "");
        dVar2.f78537b = i2;
        dVar2.f78536a = lVar2;
        View view = dVar2.itemView;
        l.b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.fcm);
        l.b(tuxTextView, "");
        tuxTextView.setText(lVar2.f78554a);
        View view2 = dVar2.itemView;
        l.b(view2, "");
        TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.clf);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(lVar2.f78555b);
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(12883);
        l.d(viewGroup, "");
        View a3 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.v6, null, false);
        l.b(a3, "");
        d dVar = new d(a3);
        try {
            if (dVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(dVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) dVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(dVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = dVar.getClass().getName();
        MethodCollector.o(12883);
        return dVar;
    }
}
