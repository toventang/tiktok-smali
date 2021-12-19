package com.ss.android.ugc.aweme.comment.page.tag.a;

import android.view.View;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.i;
import com.bytedance.ext_power_list.m;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.comment.page.tag.SearchResultListCell;
import com.ss.android.ugc.aweme.comment.page.tag.SectionCell;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class e extends m<VideoTagSearchListViewModel> {

    /* renamed from: j  reason: collision with root package name */
    public TuxStatusView f72180j;

    /* renamed from: k  reason: collision with root package name */
    public c f72181k = c.INIT;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f72182l = h.i.a((h.f.a.a) d.f72185a);

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f72183m;
    private final h.h n;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c, com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(44441);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c invoke(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c cVar) {
            l.c(cVar, "");
            return cVar;
        }
    }

    public enum c {
        INIT,
        LOCAL_COMPLETE,
        LOCAL_EMPTY;

        static {
            Covode.recordClassIndex(44442);
        }
    }

    static {
        Covode.recordClassIndex(44439);
    }

    @Override // com.bytedance.ext_power_list.m
    public final PowerList v() {
        return (PowerList) this.n.getValue();
    }

    /* renamed from: x */
    public final VideoTagSearchListViewModel u() {
        return (VideoTagSearchListViewModel) this.f72183m.getValue();
    }

    static final class d extends h.f.b.m implements h.f.a.a<TuxStatusView.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f72185a = new d();

        static {
            Covode.recordClassIndex(44443);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxStatusView.c invoke() {
            return com.ss.android.ugc.aweme.tux.a.g.a.b(new TuxStatusView.c());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.e$e  reason: collision with other inner class name */
    static final class C1622e extends h.f.b.m implements h.f.a.a<PowerList> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(44444);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1622e(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PowerList invoke() {
            return this.this$0.s().findViewById(R.id.dme);
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(44440);
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

    @Override // com.bytedance.ext_power_list.m
    public final com.bytedance.ies.powerlist.page.config.c w() {
        com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
        cVar.f34356a = 5;
        cVar.f34357b = false;
        return cVar.a(LoadingFooterCell.class);
    }

    static final class j extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(44449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.this$0.f72181k == c.LOCAL_EMPTY) {
                TuxStatusView a2 = e.a(this.this$0);
                if (a2 != null) {
                    a2.setVisibility(0);
                }
                TuxStatusView a3 = e.a(this.this$0);
                if (a3 != null) {
                    a3.a();
                }
            }
            return z.f158842a;
        }
    }

    public final void y() {
        TuxStatusView.c cVar = (TuxStatusView.c) this.f72182l.getValue();
        if (cVar != null) {
            TuxStatusView tuxStatusView = this.f72180j;
            if (tuxStatusView == null) {
                l.a("statusView");
            } else {
                tuxStatusView.setStatus(cVar);
            }
            TuxStatusView tuxStatusView2 = this.f72180j;
            if (tuxStatusView2 == null) {
                l.a("statusView");
            } else {
                tuxStatusView2.setVisibility(0);
            }
        }
    }

    public e() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(VideoTagSearchListViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f72183m = bVar;
        this.n = h.i.a((h.f.a.a) new C1622e(this));
    }

    public static final class f extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f72186a;

        static {
            Covode.recordClassIndex(44445);
        }

        f(e eVar) {
            this.f72186a = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            d dVar = (d) com.bytedance.assem.arch.service.d.c(this.f72186a, ab.a(d.class));
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    public static final /* synthetic */ TuxStatusView a(e eVar) {
        TuxStatusView tuxStatusView = eVar.f72180j;
        if (tuxStatusView == null) {
            l.a("statusView");
        }
        return tuxStatusView;
    }

    static final class g extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(44446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.d(th, "");
            if (this.this$0.f72181k == c.LOCAL_EMPTY) {
                this.this$0.y();
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.bytedance.ext_power_list.l, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(44450);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ext_power_list.l lVar) {
            l.d(lVar, "");
            e.a(this.this$0.u(), new h.f.a.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c, z>(this) {
                /* class com.ss.android.ugc.aweme.comment.page.tag.a.e.k.AnonymousClass1 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(44451);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c cVar) {
                    com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c cVar2 = cVar;
                    l.d(cVar2, "");
                    List b2 = i.a.b(cVar2);
                    if (b2 == null || b2.isEmpty()) {
                        this.this$0.this$0.y();
                    } else {
                        TuxStatusView a2 = e.a(this.this$0.this$0);
                        if (a2 != null) {
                            a2.setVisibility(8);
                        }
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ext_power_list.m, com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        super.b(view);
        TuxStatusView tuxStatusView = (TuxStatusView) s().findViewById(R.id.e_o);
        l.b(tuxStatusView, "");
        this.f72180j = tuxStatusView;
        PowerList v = v();
        v.a(SearchResultListCell.class, SectionCell.class);
        v.a(new f(this));
        v.setItemAnimator(null);
        com.bytedance.assem.arch.service.d.a(this, ab.a(d.class), f.f72187a, g.f72188a, new h(this));
        f.a.a(this, u(), h.f72189a, com.bytedance.assem.arch.viewModel.l.a(), new i(this), 4);
        AssemViewModel.a(u(), i.f72190a, null, new g(this), new j(this), new k(this), 2);
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.extensions.a<? extends Boolean>, String, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(44447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar, String str) {
            String str2 = str;
            l.d(aVar, "");
            PowerList v = this.this$0.v();
            v.getState().a();
            int i2 = 0;
            if (str2 == null || str2.length() == 0) {
                i2 = 4;
            }
            v.setVisibility(i2);
            this.this$0.f72181k = c.INIT;
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<p, h.p<? extends List<? extends IMUser>, ? extends String>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(44448);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, h.p<? extends List<? extends IMUser>, ? extends String> pVar2) {
            h.p<? extends List<? extends IMUser>, ? extends String> pVar3 = pVar2;
            l.d(pVar, "");
            l.d(pVar3, "");
            List<IMUser> list = (List) pVar3.component1();
            String str = (String) pVar3.component2();
            e eVar = this.this$0;
            if (eVar.v().getVisibility() == 0) {
                if (list.isEmpty()) {
                    eVar.f72181k = c.LOCAL_EMPTY;
                    eVar.u().f72309l = h.a.z.INSTANCE;
                } else {
                    eVar.f72181k = c.LOCAL_COMPLETE;
                    TuxStatusView tuxStatusView = eVar.f72180j;
                    if (tuxStatusView == null) {
                        l.a("statusView");
                    } else {
                        tuxStatusView.setVisibility(8);
                    }
                    VideoTagSearchListViewModel x = eVar.u();
                    l.d(list, "");
                    l.d(str, "");
                    x.f72309l = h.a.z.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    String string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.bzl);
                    l.b(string, "");
                    arrayList.add(new com.ss.android.ugc.aweme.comment.page.tag.k(string));
                    ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
                    for (IMUser iMUser : list) {
                        arrayList2.add(new com.ss.android.ugc.aweme.comment.page.tag.j(iMUser, str));
                    }
                    arrayList.addAll(arrayList2);
                    x.f72309l = arrayList;
                    x.a((Collection) arrayList);
                }
                eVar.u().g();
            }
            return z.f158842a;
        }
    }
}
