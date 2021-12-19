package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.widget.b.e;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.a.ag;
import h.f.a.q;
import h.f.b.m;
import h.p;
import h.v;
import h.z;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class a<ADAPTER extends f<Effect>> extends Fragment implements d<Fragment> {

    /* renamed from: a  reason: collision with root package name */
    protected RecyclerView f136426a;

    /* renamed from: b  reason: collision with root package name */
    protected LinearLayoutManager f136427b;

    /* renamed from: c  reason: collision with root package name */
    protected com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> f136428c;

    /* renamed from: d  reason: collision with root package name */
    public ADAPTER f136429d;

    /* renamed from: e  reason: collision with root package name */
    public int f136430e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView.RecycledViewPool f136431f;

    /* renamed from: g  reason: collision with root package name */
    protected l.a f136432g;

    /* renamed from: h  reason: collision with root package name */
    protected l.b f136433h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f136434i;

    /* renamed from: j  reason: collision with root package name */
    public final f.a.l.c<Integer> f136435j;

    /* renamed from: k  reason: collision with root package name */
    public int f136436k = 10;

    /* renamed from: l  reason: collision with root package name */
    private o f136437l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f136438m;
    private boolean n;

    static {
        Covode.recordClassIndex(89092);
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public abstract void k();

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.d
    public final /* bridge */ /* synthetic */ Fragment l() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final boolean m() {
        if (this.f136437l != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final RecyclerView a() {
        RecyclerView recyclerView = this.f136426a;
        if (recyclerView == null) {
            h.f.b.l.a("recyclerView");
        }
        return recyclerView;
    }

    /* access modifiers changed from: protected */
    public final LinearLayoutManager b() {
        LinearLayoutManager linearLayoutManager = this.f136427b;
        if (linearLayoutManager == null) {
            h.f.b.l.a("layoutManager");
        }
        return linearLayoutManager;
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> c() {
        com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> bVar = this.f136428c;
        if (bVar == null) {
            h.f.b.l.a("statusView");
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.aweme.sticker.d.d e() {
        l.b bVar = this.f136433h;
        if (bVar == null) {
            h.f.b.l.a("requiredDependency");
        }
        return bVar.f136206b;
    }

    /* access modifiers changed from: protected */
    public final g f() {
        l.b bVar = this.f136433h;
        if (bVar == null) {
            h.f.b.l.a("requiredDependency");
        }
        return bVar.f136209e;
    }

    /* access modifiers changed from: protected */
    public final l.a g() {
        l.a aVar = this.f136432g;
        if (aVar == null) {
            h.f.b.l.a("optionalDependency");
        }
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.e
    public final t<Integer> h() {
        t<Integer> c2 = this.f136435j.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    /* access modifiers changed from: protected */
    public final l.b i() {
        l.b bVar = this.f136433h;
        if (bVar == null) {
            h.f.b.l.a("requiredDependency");
        }
        return bVar;
    }

    public a() {
        f.a.l.c<Integer> cVar = new f.a.l.c<>();
        h.f.b.l.b(cVar, "");
        this.f136435j = cVar;
    }

    public final o d() {
        o oVar = this.f136437l;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (m()) {
            RecyclerView recyclerView = this.f136426a;
            if (recyclerView == null) {
                h.f.b.l.a("recyclerView");
            }
            recyclerView.f();
            RecyclerView recyclerView2 = this.f136426a;
            if (recyclerView2 == null) {
                h.f.b.l.a("recyclerView");
            }
            recyclerView2.c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a$a  reason: collision with other inner class name */
    public static final class C3561a extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f136439a;

        static {
            Covode.recordClassIndex(89093);
        }

        C3561a(a aVar) {
            this.f136439a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            this.f136439a.f136435j.onNext(Integer.valueOf(i2));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<ViewGroup, View> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a$d$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC3562a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f136442a;

            static {
                Covode.recordClassIndex(89100);
            }

            View$OnClickListenerC3562a(d dVar) {
                this.f136442a = dVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f136442a.this$0.k();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            h.f.a.b<? super ViewGroup, ? extends p<? extends View, ? extends View>> bVar;
            p pVar;
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            if (!(!this.this$0.m() || (bVar = this.this$0.i().f136210f.f135206f) == null || (pVar = (p) bVar.invoke(viewGroup2)) == null)) {
                Object component1 = pVar.component1();
                ((View) pVar.component2()).setOnClickListener(new View$OnClickListenerC3562a(this));
                if (component1 != null) {
                    return component1;
                }
            }
            return e.a(viewGroup2, new q<TextView, TextView, TextView, z>(this) {
                /* class com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(89098);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // h.f.a.q
                public final /* synthetic */ z invoke(TextView textView, TextView textView2, TextView textView3) {
                    TextView textView4 = textView;
                    TextView textView5 = textView2;
                    TextView textView6 = textView3;
                    h.f.b.l.d(textView4, "");
                    h.f.b.l.d(textView5, "");
                    h.f.b.l.d(textView6, "");
                    textView4.setText(R.string.h2z);
                    textView5.setText(R.string.h2y);
                    textView6.setText(R.string.h35);
                    textView6.setOnClickListener(new View.OnClickListener(this) {
                        /* class com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a.d.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f136441a;

                        static {
                            Covode.recordClassIndex(89099);
                        }

                        {
                            this.f136441a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            this.f136441a.this$0.this$0.k();
                        }
                    });
                    return z.f158842a;
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f136434i = z;
        if (this.f136438m && !this.n) {
            j();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<ViewGroup, View> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            h.f.a.b<? super ViewGroup, ? extends View> bVar;
            Object invoke;
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            if (!this.this$0.m() || (bVar = this.this$0.i().f136210f.f135203c) == null || (invoke = bVar.invoke(viewGroup2)) == null) {
                return e.a(viewGroup2);
            }
            return invoke;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<ViewGroup, View> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89095);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            h.f.a.b<? super ViewGroup, ? extends View> bVar;
            Object invoke;
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            if (!this.this$0.m() || (bVar = this.this$0.i().f136210f.f135204d) == null || (invoke = bVar.invoke(viewGroup2)) == null) {
                return e.a(viewGroup2, AnonymousClass1.f136440a);
            }
            return invoke;
        }
    }

    public LinearLayoutManager a(View view) {
        int i2;
        h.f.b.l.d(view, "");
        if (!m()) {
            i2 = 5;
        } else {
            l.b bVar = this.f136433h;
            if (bVar == null) {
                h.f.b.l.a("requiredDependency");
            }
            i2 = bVar.f136210f.f135201a;
        }
        view.getContext();
        return new GridLayoutManager(i2, 1, false);
    }

    public void a(List<? extends Effect> list) {
        h.f.b.l.d(list, "");
        ADAPTER adapter = this.f136429d;
        if (adapter != null && getActivity() != null && !list.isEmpty()) {
            adapter.f136368i = this.f136430e;
            adapter.a(list);
        }
    }

    /* access modifiers changed from: protected */
    public com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> b(View view) {
        h.f.b.l.d(view, "");
        Map a2 = ag.a(v.a(com.ss.android.ugc.tools.view.widget.b.a.LOADING, new b(this)), v.a(com.ss.android.ugc.tools.view.widget.b.a.EMPTY, new c(this)), v.a(com.ss.android.ugc.tools.view.widget.b.a.ERROR, new d(this)));
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        com.ss.android.ugc.tools.view.widget.b.d dVar = new com.ss.android.ugc.tools.view.widget.b.d(context, a2, com.ss.android.ugc.tools.view.widget.b.a.NONE, (byte) 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        dVar.setLayoutParams(layoutParams);
        View view2 = getView();
        Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view2).addView(dVar);
        return dVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.e
    public final void b(int i2, boolean z) {
        if (this.f136429d == null || i2 < 0) {
            return;
        }
        if (z) {
            RecyclerView recyclerView = this.f136426a;
            if (recyclerView == null) {
                h.f.b.l.a("recyclerView");
            }
            recyclerView.d(i2);
            return;
        }
        RecyclerView recyclerView2 = this.f136426a;
        if (recyclerView2 == null) {
            h.f.b.l.a("recyclerView");
        }
        recyclerView2.b(i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i2;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f136427b = a(view);
        h.f.b.l.d(view, "");
        View findViewById = view.findViewById(R.id.eb9);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        if (!m()) {
            i2 = 5;
        } else {
            l.b bVar = this.f136433h;
            if (bVar == null) {
                h.f.b.l.a("requiredDependency");
            }
            i2 = bVar.f136210f.f135202b;
        }
        recyclerView.setItemViewCacheSize(i2);
        recyclerView.setRecycledViewPool(this.f136431f);
        h.f.b.l.b(findViewById, "");
        LinearLayoutManager linearLayoutManager = this.f136427b;
        if (linearLayoutManager == null) {
            h.f.b.l.a("layoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.a(new C3561a(this));
        this.f136426a = recyclerView;
        this.f136428c = b(view);
        this.f136438m = true;
        if (this.f136434i && !this.n) {
            j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a_s, viewGroup, false);
    }

    public final void a(int i2, l.b bVar, l.a aVar, RecyclerView.RecycledViewPool recycledViewPool) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        this.f136430e = i2;
        this.f136437l = bVar.f136205a;
        this.f136433h = bVar;
        this.f136432g = aVar;
        this.f136431f = recycledViewPool;
    }
}
