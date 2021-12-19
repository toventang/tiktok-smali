package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends RecyclerView.a<a> {
    static {
        Covode.recordClassIndex(83711);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return 10;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        l.d(aVar2, "");
        TextView textView = aVar2.f127700a;
        com.ss.android.ugc.tools.view.style.b a2 = b.a.a().a(0);
        Context context = aVar2.f127700a.getContext();
        l.b(context, "");
        textView.setBackground(a2.a(r.a(context, 2.0f)).b(aVar2.f127700a.getResources().getColor(R.color.c9)).a());
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f127700a;

        /* renamed from: b  reason: collision with root package name */
        public final View f127701b;

        /* renamed from: c  reason: collision with root package name */
        public final b f127702c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f127703d;

        static {
            Covode.recordClassIndex(83712);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, View view, b bVar2) {
            super(view);
            l.d(view, "");
            l.d(bVar2, "");
            this.f127703d = bVar;
            this.f127701b = view;
            this.f127702c = bVar2;
            View findViewById = view.findViewById(R.id.evk);
            l.b(findViewById, "");
            this.f127700a = (TextView) findViewById;
        }
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(6006);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9m, viewGroup, false);
        l.b(a3, "");
        a aVar = new a(bVar, a3, bVar);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar.getClass().getName();
        MethodCollector.o(6006);
        return aVar;
    }
}
