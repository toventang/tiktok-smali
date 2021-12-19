package com.ss.android.ugc.aweme.mix.mixdetail;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class c extends com.bytedance.assem.arch.d.a implements v {

    /* renamed from: j  reason: collision with root package name */
    public String f109985j;

    /* renamed from: k  reason: collision with root package name */
    private n f109986k;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f109987l;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(70498);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a invoke(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70496);
    }

    public final MixVideosManageViewModel u() {
        return (MixVideosManageViewModel) this.f109987l.getValue();
    }

    public static final class e extends com.bytedance.s.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f109988a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f109989b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f109990c;

        static {
            Covode.recordClassIndex(70502);
        }

        @Override // com.bytedance.s.a.a
        public final void b() {
            super.b();
            com.bytedance.assem.arch.extensions.b.b(this.f109988a);
        }

        @Override // com.bytedance.s.a.a
        public final void a() {
            super.a();
            T t = this.f109989b.element;
            l.b(t, "");
            t.setVisibility(0);
            this.f109989b.element.f();
        }

        @Override // com.bytedance.s.a.a
        public final void a(Exception exc) {
            super.a(exc);
            T t = this.f109989b.element;
            l.b(t, "");
            new com.bytedance.tux.g.b((View) t).e(R.string.de8).b();
            this.f109989b.element.h();
        }

        @Override // com.bytedance.s.a.a
        public final void a(boolean z) {
            super.a(z);
            this.f109989b.element.a(true);
            T t = this.f109990c.element;
            l.b(t, "");
            if (t.getState().b() == 0) {
                this.f109989b.element.g();
            } else {
                this.f109989b.element.a(true);
            }
        }

        e(c cVar, z.e eVar, z.e eVar2) {
            this.f109988a = cVar;
            this.f109989b = eVar;
            this.f109990c = eVar2;
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70497);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public c() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(MixVideosManageViewModel.class);
        a aVar2 = new a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (aVar == null || l.a(aVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f109987l = bVar;
    }

    @Override // com.ss.android.ugc.aweme.mix.mixdetail.v
    public final void a(PowerCell<?> powerCell) {
        n nVar;
        if (powerCell != null && (nVar = this.f109986k) != null) {
            nVar.b(powerCell);
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        z.e eVar = new z.e();
        eVar.element = (T) view.findViewById(R.id.e_o);
        DmtStatusView.a a2 = DmtStatusView.a.a(ar_());
        Context ar_ = ar_();
        d.a a3 = new d.a(ar_).a(2131233268, (int) com.bytedance.common.utility.n.b(ar_, 72.0f), (int) com.bytedance.common.utility.n.b(ar_, 72.0f));
        String string = com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.bnl);
        l.b(string, "");
        Object[] objArr = new Object[1];
        String str = u().f110072l;
        if (str == null) {
            l.a("mMixName");
        }
        objArr[0] = str;
        String a4 = com.a.a(string, Arrays.copyOf(objArr, 1));
        l.b(a4, "");
        DmtStatusView.a a5 = a2.a(a3.a(a4).c(R.string.bnj).f33648a);
        a5.f33605g = 0;
        eVar.element.setBuilder(a5.a(R.string.g21));
        z.e eVar2 = new z.e();
        eVar2.element = (T) view.findViewById(R.id.cn6);
        f.a.a(this, u(), d.f109991a, com.bytedance.assem.arch.viewModel.l.a(), new C2817c(eVar, eVar2), 4);
        f.a.a(this, u(), e.f109992a, com.bytedance.assem.arch.viewModel.l.a(), new d(this, eVar), 4);
        eVar2.element.a(MixFeedManageCell.class);
        eVar2.element.setLifecycleOwner(this);
        eVar2.element.setHasFixedSize(true);
        eVar2.element.a(u().h());
        eVar2.element.a(new a());
        eVar2.element.a(new e(this, eVar, eVar2));
        String g2 = u().g();
        this.f109985j = g2;
        if (g2 != null) {
            MixVideosManageViewModel u = u();
            String str2 = this.f109985j;
            if (str2 == null) {
                l.b();
            }
            l.d(str2, "");
            u.f110071k = str2;
            u.h().f34367c.e();
        }
        z.e eVar3 = new z.e();
        eVar3.element = null;
        T t = eVar2.element;
        l.b(t, "");
        eVar3.element = (T) new x(t, u(), false);
        T t2 = eVar3.element;
        Objects.requireNonNull(t2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.mix.mixdetail.TouchCallbackCenter");
        n nVar = new n(t2);
        this.f109986k = nVar;
        nVar.a((RecyclerView) eVar2.element);
        f.a.a(this, u(), f.f109993a, (k) null, new f(eVar3), 6);
    }

    static final class f extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends Boolean>, h.z> {
        final /* synthetic */ z.e $callback;

        static {
            Covode.recordClassIndex(70503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(z.e eVar) {
            super(2);
            this.$callback = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            l.d(pVar, "");
            l.d(aVar2, "");
            this.$callback.element.f110163a = aVar2.f25631b.booleanValue();
            return h.z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends Boolean>, h.z> {
        final /* synthetic */ z.e $statusView;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(70500);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, z.e eVar) {
            super(2);
            this.this$0 = cVar;
            this.$statusView = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            l.d(pVar, "");
            l.d(aVar2, "");
            if (aVar2.f25631b.booleanValue()) {
                p.a(this.this$0.u(), new h.f.a.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a, h.z>(this) {
                    /* class com.ss.android.ugc.aweme.mix.mixdetail.c.d.AnonymousClass1 */
                    final /* synthetic */ d this$0;

                    static {
                        Covode.recordClassIndex(70501);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar) {
                        com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar2 = aVar;
                        l.d(aVar2, "");
                        List<Aweme> list = aVar2.f110133a;
                        if (list == null || list.size() != 0) {
                            this.this$0.$statusView.element.d();
                        } else {
                            this.this$0.$statusView.element.g();
                        }
                        return h.z.f158842a;
                    }
                });
            }
            return h.z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$c  reason: collision with other inner class name */
    static final class C2817c extends m implements h.f.a.m<p, List<? extends Aweme>, h.z> {
        final /* synthetic */ z.e $powerList;
        final /* synthetic */ z.e $statusView;

        static {
            Covode.recordClassIndex(70499);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2817c(z.e eVar, z.e eVar2) {
            super(2);
            this.$statusView = eVar;
            this.$powerList = eVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(p pVar, List<? extends Aweme> list) {
            List<? extends Aweme> list2 = list;
            l.d(pVar, "");
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.ss.android.ugc.aweme.mix.mixdetail.viewholder.b(it.next()));
                }
                List k2 = h.a.n.k(arrayList);
                if (list2.isEmpty()) {
                    this.$statusView.element.g();
                } else {
                    this.$statusView.element.d();
                }
                T t = this.$powerList.element;
                l.b(t, "");
                t.getState().b(k2);
            }
            return h.z.f158842a;
        }
    }
}
