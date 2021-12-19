package com.ss.android.ugc.aweme.kids.commonfeed.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class c extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.kids.commonfeed.d.a.a> f105998a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Context f105999b;

    static {
        Covode.recordClassIndex(67812);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f105998a.size();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.kids.commonfeed.d.a.a f106002a;

        static {
            Covode.recordClassIndex(67814);
        }

        b(com.ss.android.ugc.aweme.kids.commonfeed.d.a.a aVar) {
            this.f106002a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.b<? super View, z> bVar = this.f106002a.f106010a;
            if (bVar != null) {
                l.b(view, "");
                bVar.invoke(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.b.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC2700c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.kids.commonfeed.d.a.a f106003a;

        static {
            Covode.recordClassIndex(67815);
        }

        View$OnClickListenerC2700c(com.ss.android.ugc.aweme.kids.commonfeed.d.a.a aVar) {
            this.f106003a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.b<? super View, z> bVar = this.f106003a.f106010a;
            if (bVar != null) {
                l.b(view, "");
                bVar.invoke(view);
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.kids.commonfeed.d.a.a f106004a;

        static {
            Covode.recordClassIndex(67816);
        }

        d(com.ss.android.ugc.aweme.kids.commonfeed.d.a.a aVar) {
            this.f106004a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.b<? super View, z> bVar = this.f106004a.f106010a;
            if (bVar != null) {
                l.b(view, "");
                bVar.invoke(view);
            }
        }
    }

    public c(Context context) {
        l.d(context, "");
        this.f105999b = context;
    }

    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final ImageView f106000a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f106001b;

        static {
            Covode.recordClassIndex(67813);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.co3);
            l.b(findViewById, "");
            this.f106000a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.co4);
            l.b(findViewById2, "");
            this.f106001b = (TextView) findViewById2;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        l.d(aVar2, "");
        com.ss.android.ugc.aweme.kids.commonfeed.d.a.a aVar3 = this.f105998a.get(i2);
        aVar2.f106000a.setImageDrawable(androidx.core.content.b.a(this.f105999b, aVar3.f106011b));
        aVar2.f106001b.setText(this.f105999b.getString(aVar3.f106012c));
        aVar2.itemView.setOnClickListener(new b(aVar3));
        aVar2.f106000a.setOnClickListener(new View$OnClickListenerC2700c(aVar3));
        aVar2.f106001b.setOnClickListener(new d(aVar3));
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(8637);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(cVar.f105999b), R.layout.ad7, viewGroup, false);
        l.b(a3, "");
        a aVar = new a(a3);
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
        MethodCollector.o(8637);
        return aVar;
    }
}
