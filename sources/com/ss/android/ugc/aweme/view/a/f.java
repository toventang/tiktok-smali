package com.ss.android.ugc.aweme.view.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.model.d;
import com.ss.android.ugc.aweme.model.e;
import com.ss.android.ugc.aweme.model.g;
import com.ss.android.ugc.aweme.model.m;
import com.ss.android.ugc.aweme.model.q;
import com.ss.android.ugc.aweme.model.s;
import com.ss.android.ugc.aweme.model.u;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.view.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;

public final class f extends RecyclerView.a<b> implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final a f144066a;

    /* renamed from: b  reason: collision with root package name */
    private final q f144067b;

    /* renamed from: c  reason: collision with root package name */
    private final u f144068c;

    public interface a {
        static {
            Covode.recordClassIndex(94280);
        }

        void a(d dVar);

        void a(d dVar, e eVar);

        void a(s sVar);

        void b(d dVar);
    }

    static {
        Covode.recordClassIndex(94279);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f144068c.c().size();
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final TuxTextView f144069a;

        /* renamed from: b  reason: collision with root package name */
        final TuxButton f144070b;

        /* renamed from: c  reason: collision with root package name */
        final TuxButton f144071c;

        /* renamed from: d  reason: collision with root package name */
        final RecyclerView f144072d;

        /* renamed from: e  reason: collision with root package name */
        final RecyclerView f144073e;

        /* renamed from: f  reason: collision with root package name */
        public final a f144074f;

        static {
            Covode.recordClassIndex(94281);
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f144075a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f144076b;

            static {
                Covode.recordClassIndex(94282);
            }

            a(b bVar, d dVar) {
                this.f144075a = bVar;
                this.f144076b = dVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f144075a.f144074f.a(this.f144076b);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.view.a.f$b$b  reason: collision with other inner class name */
        static final class View$OnClickListenerC3834b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f144077a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f144078b;

            static {
                Covode.recordClassIndex(94283);
            }

            View$OnClickListenerC3834b(b bVar, d dVar) {
                this.f144077a = bVar;
                this.f144078b = dVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f144077a.f144074f.b(this.f144078b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view, a aVar) {
            super(view);
            l.d(view, "");
            l.d(aVar, "");
            this.f144074f = aVar;
            this.f144069a = (TuxTextView) view.findViewById(R.id.db6);
            this.f144070b = (TuxButton) view.findViewById(R.id.d_r);
            this.f144071c = (TuxButton) view.findViewById(R.id.d_s);
            this.f144072d = (RecyclerView) view.findViewById(R.id.d_w);
            this.f144073e = (RecyclerView) view.findViewById(R.id.da9);
        }
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f144079a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f144080b;

        static {
            Covode.recordClassIndex(94284);
        }

        @Override // com.ss.android.ugc.aweme.view.a.b
        public final void a(e eVar) {
            l.d(eVar, "");
            this.f144079a.f144066a.a(this.f144080b, eVar);
        }

        c(f fVar, d dVar) {
            this.f144079a = fVar;
            this.f144080b = dVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.view.a.c.a
    public final void a(s sVar) {
        l.d(sVar, "");
        notifyDataSetChanged();
        this.f144066a.a(sVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        b bVar2 = bVar;
        l.d(bVar2, "");
        d dVar = this.f144068c.c().get(i2);
        l.b(dVar, "");
        d dVar2 = dVar;
        c cVar = new c(this, dVar2);
        q qVar = this.f144067b;
        l.d(qVar, "");
        l.d(dVar2, "");
        l.d(this, "");
        l.d(cVar, "");
        TuxTextView tuxTextView = bVar2.f144069a;
        l.b(tuxTextView, "");
        tuxTextView.setText(dVar2.b());
        boolean z2 = !dVar2.f().isEmpty();
        TuxButton tuxButton = bVar2.f144070b;
        l.b(tuxButton, "");
        if (z2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        tuxButton.setVisibility(i3);
        bVar2.f144070b.setOnClickListener(new b.a(bVar2, dVar2));
        if (dVar2.j() != null) {
            z = true;
        } else {
            z = false;
        }
        TuxButton tuxButton2 = bVar2.f144071c;
        l.b(tuxButton2, "");
        if (z) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        tuxButton2.setVisibility(i4);
        bVar2.f144071c.setOnClickListener(new b.View$OnClickListenerC3834b(bVar2, dVar2));
        if (dVar2.i() != null) {
            g i7 = dVar2.i();
            if (i7 == null) {
                l.b();
            }
            RecyclerView recyclerView = bVar2.f144072d;
            l.b(recyclerView, "");
            View view = bVar2.itemView;
            l.b(view, "");
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            RecyclerView recyclerView2 = bVar2.f144072d;
            l.b(recyclerView2, "");
            recyclerView2.setAdapter(new a(i7, cVar));
        } else {
            RecyclerView recyclerView3 = bVar2.f144072d;
            l.b(recyclerView3, "");
            recyclerView3.setVisibility(8);
        }
        if ((!dVar2.g().isEmpty()) || (!dVar2.e().isEmpty())) {
            if (dVar2.c() == m.GRID) {
                i5 = 3;
            } else {
                i5 = 6;
            }
            if (dVar2.c() == m.GRID) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            RecyclerView recyclerView4 = bVar2.f144073e;
            l.b(recyclerView4, "");
            View view2 = bVar2.itemView;
            l.b(view2, "");
            view2.getContext();
            recyclerView4.setLayoutManager(new GridLayoutManager(i5));
            ArrayList arrayList = new ArrayList(dVar2.g().values());
            RecyclerView recyclerView5 = bVar2.f144073e;
            l.b(recyclerView5, "");
            recyclerView5.setAdapter(new c(qVar, arrayList, dVar2.e(), i6, this));
            return;
        }
        RecyclerView recyclerView6 = bVar2.f144073e;
        l.b(recyclerView6, "");
        recyclerView6.setVisibility(8);
    }

    public f(q qVar, u uVar, a aVar) {
        l.d(qVar, "");
        l.d(uVar, "");
        l.d(aVar, "");
        this.f144067b = qVar;
        this.f144068c = uVar;
        this.f144066a = aVar;
    }

    private static RecyclerView.ViewHolder a(f fVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(2775);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.apj, viewGroup, false);
        l.b(a3, "");
        b bVar = new b(a3, fVar.f144066a);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = bVar.getClass().getName();
        MethodCollector.o(2775);
        return bVar;
    }
}
