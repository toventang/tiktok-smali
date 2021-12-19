package com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bd;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.VPAOptedOutMaskVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.z;

public final class a extends com.ss.android.ugc.aweme.feed.assem.base.a<a> {
    static final /* synthetic */ h.k.i[] u = {new y(a.class, "maskVM", "getMaskVM()Lcom/ss/android/ugc/aweme/feed/assem/vpaoptedoutmask/VPAOptedOutMaskVM;", 0)};
    private final h.h.d v;
    private final h.h w;
    private final h.h x;
    private SparseArray y;

    public static final class b extends m implements h.f.a.b<e, e> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58739);
        }

        public b() {
            super(1);
        }

        public final e invoke(e eVar) {
            l.c(eVar, "");
            return eVar;
        }
    }

    public static final class c extends m implements h.f.a.b<bd, bd> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(58740);
        }

        public c() {
            super(1);
        }

        public final bd invoke(bd bdVar) {
            l.c(bdVar, "");
            return bdVar;
        }
    }

    public static final class f extends m implements h.f.a.b<ck, ck> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(58743);
        }

        public f() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            l.c(ckVar, "");
            return ckVar;
        }
    }

    static {
        Covode.recordClassIndex(58737);
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.ts;
    }

    public final VPAOptedOutMaskVM F() {
        return (VPAOptedOutMaskVM) this.v.a(this, u[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.y == null) {
            this.y = new SparseArray();
        }
        View view = (View) this.y.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s = s();
        if (s == null) {
            return null;
        }
        View findViewById = s.findViewById(R.id.dlk);
        this.y.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public static final class d extends m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bd>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58741);
        }

        public d() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bd> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class e extends m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(58742);
        }

        public e() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class g extends m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(58744);
        }

        public g() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class h extends m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(58745);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$a  reason: collision with other inner class name */
    public static final class C2253a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58738);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2253a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        super.x();
        f.a.a(this, F(), b.f92644a, (com.bytedance.assem.arch.viewModel.k) null, i.f92641a, 6);
    }

    public a() {
        i.c cVar = i.c.f25720a;
        h.k.c a2 = ab.a(VPAOptedOutMaskVM.class);
        this.v = com.bytedance.ext_power_list.k.a(this, a2, cVar == null ? i.c.f25720a : cVar, new C2253a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        this.w = new com.bytedance.ext_power_list.g(ab.a(VideoPlayViewModel.class), this, d.INSTANCE, e.INSTANCE, c.INSTANCE);
        this.x = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, g.INSTANCE, h.INSTANCE, f.INSTANCE);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        l.d(videoItemParams, "");
        B().setVisibility(F().h());
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        l.d(view, "");
        f.a.b(this, (VideoPlayViewModel) this.w.getValue(), c.f92645a, (com.bytedance.assem.arch.viewModel.k) null, j.f92642a, 6);
        f.a.b(this, (VideoViewModel) this.x.getValue(), d.f92646a, (com.bytedance.assem.arch.viewModel.k) null, k.f92643a, 6);
        B().setVisibility(8);
    }

    static final class j extends m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f92642a = new j();

        static {
            Covode.recordClassIndex(58747);
        }

        j() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2) {
            a aVar3 = aVar;
            l.d(aVar3, "");
            l.d(aVar2, "");
            aVar3.F().b(VPAOptedOutMaskVM.a.f92640a);
            return z.f158842a;
        }
    }

    static final class k extends m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f92643a = new k();

        static {
            Covode.recordClassIndex(58748);
        }

        k() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar2) {
            a aVar3 = aVar;
            l.d(aVar3, "");
            VPAOptedOutMaskVM F = aVar3.F();
            F.a(new VPAOptedOutMaskVM.b(F));
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.m<a, Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f92641a = new i();

        static {
            Covode.recordClassIndex(58746);
        }

        i() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, Integer num) {
            a aVar2 = aVar;
            int intValue = num.intValue();
            l.d(aVar2, "");
            aVar2.B().setVisibility(intValue);
            if (intValue == 0) {
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", ((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar2)).mEventType);
                Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar2)).mAweme;
                l.b(aweme, "");
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", aweme.getAid());
                Aweme aweme2 = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar2)).mAweme;
                l.b(aweme2, "");
                r.a("opt_out_layer_show", a3.a("author_id", aweme2.getAuthorUid()).a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.a(((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar2)).mAweme, ((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar2)).mPageType))).f66730a);
            }
            return z.f158842a;
        }
    }
}
