package com.ss.android.ugc.aweme.sticker.types.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.h.v;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.sticker.panel.k;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.types.b.d;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.ss.android.ugc.tools.view.widget.c.a;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f136041a;

    /* renamed from: b  reason: collision with root package name */
    public final d f136042b;

    /* renamed from: c  reason: collision with root package name */
    public final o f136043c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f136044d;

    /* renamed from: e  reason: collision with root package name */
    public final LiveData<List<ComposerNode>> f136045e;

    /* renamed from: f  reason: collision with root package name */
    public final k f136046f;

    /* renamed from: g  reason: collision with root package name */
    public final h.f.a.b<ComposerNode, z> f136047g;

    /* renamed from: h  reason: collision with root package name */
    private ComposerNode f136048h;

    /* renamed from: i  reason: collision with root package name */
    private final FilterBeautySeekBar f136049i;

    /* renamed from: j  reason: collision with root package name */
    private final a f136050j;

    static {
        Covode.recordClassIndex(88870);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.multi.a
    public final void a() {
        this.f136041a.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.multi.a
    public final void b() {
        this.f136049i.setVisibility(8);
        this.f136041a.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.multi.a
    public final void c() {
        RecyclerView.a adapter = this.f136041a.getAdapter();
        if (adapter == null) {
            l.b();
        }
        adapter.notifyDataSetChanged();
    }

    public final class a extends RecyclerView.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public ComposerNode f136052a;

        /* renamed from: b  reason: collision with root package name */
        List<? extends ComposerNode> f136053b;

        static {
            Covode.recordClassIndex(88872);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            List<ComposerNode> a2;
            ComposerNode composerNode = this.f136052a;
            if (composerNode == null || (a2 = a(composerNode)) == null) {
                return 0;
            }
            return a2.size();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.sticker.types.b.c$a$a  reason: collision with other inner class name */
        public static final class C3547a extends m implements h.f.a.b<a.C4052a, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final C3547a f136055a = new C3547a();

            static {
                Covode.recordClassIndex(88873);
            }

            C3547a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(a.C4052a aVar) {
                a.C4052a aVar2 = aVar;
                l.d(aVar2, "");
                aVar2.f150400j = true;
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        public final List<ComposerNode> a(ComposerNode composerNode) {
            List g2;
            if (composerNode.children == null) {
                return n.a(composerNode);
            }
            ArrayList arrayList = new ArrayList();
            List<ComposerNode> list = composerNode.children;
            if (!(list == null || (g2 = n.g((Iterable) list)) == null)) {
                Iterator it = g2.iterator();
                while (it.hasNext()) {
                    it.next();
                    arrayList.addAll(a(composerNode));
                }
            }
            return n.k(arrayList);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
            if (r2 == null) goto L_0x0014;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onBindViewHolder(com.ss.android.ugc.aweme.sticker.types.b.c.b r8, int r9) {
            /*
            // Method dump skipped, instructions count: 159
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.types.b.c.a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(9268);
            l.d(viewGroup, "");
            k kVar = c.this.f136046f;
            Context context = viewGroup.getContext();
            l.b(context, "");
            p a3 = com.ss.android.ugc.aweme.sticker.widget.b.a(kVar, context, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, C3547a.f136055a, 254);
            b bVar = new b(c.this, (FrameLayout) a3.component1(), (com.ss.android.ugc.tools.view.widget.c.b) a3.component2());
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
            MethodCollector.o(9268);
            return bVar;
        }
    }

    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final com.ss.android.ugc.tools.view.widget.c.b f136056a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f136057b;

        static {
            Covode.recordClassIndex(88874);
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.f.a.b f136058a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ComposerNode f136059b;

            static {
                Covode.recordClassIndex(88875);
            }

            a(h.f.a.b bVar, ComposerNode composerNode) {
                this.f136058a = bVar;
                this.f136059b = composerNode;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f136058a.invoke(this.f136059b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, View view, com.ss.android.ugc.tools.view.widget.c.b bVar) {
            super(view);
            l.d(view, "");
            l.d(bVar, "");
            this.f136057b = cVar;
            this.f136056a = bVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.b.b
    public final void a(ComposerNode composerNode) {
        List<ComposerNode> list;
        this.f136048h = composerNode;
        a aVar = this.f136050j;
        aVar.f136052a = composerNode;
        if (composerNode != null) {
            list = aVar.a(composerNode);
        } else {
            list = null;
        }
        aVar.f136053b = list;
        this.f136050j.notifyDataSetChanged();
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.b.b
    public final void a(ComposerNode composerNode, h.f.a.b<? super Integer, z> bVar) {
        l.d(composerNode, "");
        l.d(bVar, "");
        this.f136049i.setVisibility(0);
        this.f136049i.setOnSeekBarChangeListener(new d.a(bVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.ComposerNode, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(androidx.appcompat.app.d dVar, o oVar, ViewGroup viewGroup, LiveData<List<ComposerNode>> liveData, k kVar, h.f.a.b<? super ComposerNode, z> bVar) {
        l.d(dVar, "");
        l.d(oVar, "");
        l.d(viewGroup, "");
        l.d(liveData, "");
        l.d(kVar, "");
        l.d(bVar, "");
        this.f136042b = dVar;
        this.f136043c = oVar;
        this.f136044d = viewGroup;
        this.f136045e = liveData;
        this.f136046f = kVar;
        this.f136047g = bVar;
        a aVar = new a();
        this.f136050j = aVar;
        View c2 = v.c((View) viewGroup, (int) R.id.ecx);
        Objects.requireNonNull(c2, "null cannot be cast to non-null type androidx.appcompat.widget.ViewStubCompat");
        View a2 = ((ViewStubCompat) c2).a();
        View c3 = v.c(a2, (int) R.id.c7p);
        l.b(c3, "");
        RecyclerView recyclerView = (RecyclerView) c3;
        this.f136041a = recyclerView;
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        View c4 = v.c(a2, (int) R.id.acl);
        l.b(c4, "");
        this.f136049i = (FilterBeautySeekBar) c4;
        liveData.observe(dVar, new u(this) {
            /* class com.ss.android.ugc.aweme.sticker.types.b.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f136051a;

            static {
                Covode.recordClassIndex(88871);
            }

            {
                this.f136051a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                RecyclerView.a adapter = this.f136051a.f136041a.getAdapter();
                if (adapter == null) {
                    l.b();
                }
                adapter.notifyDataSetChanged();
            }
        });
    }
}
