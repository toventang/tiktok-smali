package com.ss.android.ugc.aweme.view.a;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.ui.SmartRoundImageView;
import com.ss.android.ugc.aweme.common.ag;
import com.ss.android.ugc.aweme.model.j;
import com.ss.android.ugc.aweme.model.n;
import com.ss.android.ugc.aweme.model.q;
import com.ss.android.ugc.aweme.model.s;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;

public final class c extends RecyclerView.a<C3833c> {

    /* renamed from: c  reason: collision with root package name */
    public static final b f144047c = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f144048a;

    /* renamed from: b  reason: collision with root package name */
    public final a f144049b;

    /* renamed from: d  reason: collision with root package name */
    private final q f144050d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<j> f144051e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<n> f144052f;

    public interface a {
        static {
            Covode.recordClassIndex(94273);
        }

        void a(s sVar);
    }

    static {
        Covode.recordClassIndex(94272);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ C3833c onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(94274);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f144051e.size() + this.f144052f.size();
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f144057a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s f144058b;

        static {
            Covode.recordClassIndex(94276);
        }

        d(c cVar, s sVar) {
            this.f144057a = cVar;
            this.f144058b = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f144057a.f144049b.a(this.f144058b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.a.c$c  reason: collision with other inner class name */
    public static final class C3833c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final SmartImageView f144053a;

        /* renamed from: b  reason: collision with root package name */
        final SmartRoundImageView f144054b;

        /* renamed from: c  reason: collision with root package name */
        final View f144055c;

        /* renamed from: d  reason: collision with root package name */
        final View f144056d;

        static {
            Covode.recordClassIndex(94275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3833c(View view) {
            super(view);
            l.d(view, "");
            this.f144053a = (SmartImageView) view.findViewById(R.id.da0);
            this.f144054b = (SmartRoundImageView) view.findViewById(R.id.da7);
            this.f144055c = view.findViewById(R.id.d_z);
            this.f144056d = view.findViewById(R.id.da8);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(C3833c cVar, int i2) {
        j jVar;
        String str;
        boolean z;
        C3833c cVar2 = cVar;
        l.d(cVar2, "");
        if (i2 >= this.f144051e.size()) {
            n nVar = this.f144052f.get(i2 - this.f144051e.size());
            l.b(nVar, "");
            jVar = nVar;
        } else {
            j jVar2 = this.f144051e.get(i2);
            l.b(jVar2, "");
            jVar = jVar2;
        }
        String b2 = jVar.b();
        String h2 = jVar.c().h();
        int i3 = 0;
        if (h2 == null || h2.length() == 0) {
            str = jVar.c().a();
        } else {
            str = jVar.c().h();
        }
        if (str != null) {
            if (l.a(this.f144050d.b(str), jVar) || l.a(this.f144050d.c(str), jVar)) {
                z = true;
            } else {
                z = false;
            }
            if (this.f144048a == 1) {
                l.d(b2, "");
                View view = cVar2.f144056d;
                l.b(view, "");
                if (!z) {
                    i3 = 8;
                }
                view.setVisibility(i3);
                View view2 = cVar2.itemView;
                l.b(view2, "");
                Context context = view2.getContext();
                l.b(context, "");
                float a2 = ag.a.a(context, 22.0f);
                e.a aVar = new e.a();
                aVar.f39827a = true;
                aVar.f39831e = a2;
                e a3 = aVar.a();
                cVar2.f144054b.setCircleOptions(a3);
                v a4 = r.a(Uri.parse(b2));
                SmartRoundImageView smartRoundImageView = cVar2.f144054b;
                l.b(smartRoundImageView, "");
                a4.f39906b = smartRoundImageView.getContext();
                a4.E = cVar2.f144054b;
                a4.w = a3;
                a4.c();
            } else {
                l.d(b2, "");
                View view3 = cVar2.f144055c;
                l.b(view3, "");
                if (!z) {
                    i3 = 8;
                }
                view3.setVisibility(i3);
                v a5 = r.a(Uri.parse(b2));
                SmartImageView smartImageView = cVar2.f144053a;
                l.b(smartImageView, "");
                a5.f39906b = smartImageView.getContext();
                a5.E = cVar2.f144053a;
                a5.c();
            }
            cVar2.itemView.setOnClickListener(new d(this, jVar));
        }
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        C3833c cVar2;
        MethodCollector.i(2836);
        l.d(viewGroup, "");
        boolean z = true;
        if (cVar.f144048a != 1) {
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.apm, viewGroup, false);
            l.b(a2, "");
            cVar2 = new C3833c(a2);
        } else {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.apl, viewGroup, false);
            l.b(a3, "");
            cVar2 = new C3833c(a3);
        }
        try {
            if (cVar2.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar2.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = cVar2.getClass().getName();
        MethodCollector.o(2836);
        return cVar2;
    }

    public c(q qVar, ArrayList<j> arrayList, ArrayList<n> arrayList2, int i2, a aVar) {
        l.d(qVar, "");
        l.d(arrayList, "");
        l.d(arrayList2, "");
        l.d(aVar, "");
        this.f144050d = qVar;
        this.f144051e = arrayList;
        this.f144052f = arrayList2;
        this.f144048a = i2;
        this.f144049b = aVar;
    }
}
