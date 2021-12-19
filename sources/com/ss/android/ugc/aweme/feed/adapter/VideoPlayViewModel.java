package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.v;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class VideoPlayViewModel extends AssemViewModel<bd> {

    /* renamed from: k  reason: collision with root package name */
    public static final a f91532k = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public ad f91533j;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f91534l = true;

    public static final class a {

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel$a$a  reason: collision with other inner class name */
        public static final class C2209a extends m implements h.f.a.b<bd, bd> {
            public static final C2209a INSTANCE = new C2209a();

            static {
                Covode.recordClassIndex(57611);
            }

            public C2209a() {
                super(1);
            }

            public final bd invoke(bd bdVar) {
                l.c(bdVar, "");
                return bdVar;
            }
        }

        static {
            Covode.recordClassIndex(57610);
        }

        public static final class d extends m implements h.f.a.a<com.bytedance.assem.arch.b.g> {
            final /* synthetic */ com.bytedance.assem.arch.b.g $this_holderViewModel;

            static {
                Covode.recordClassIndex(57614);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(com.bytedance.assem.arch.b.g gVar) {
                super(0);
                this.$this_holderViewModel = gVar;
            }

            @Override // h.f.a.a
            public final com.bytedance.assem.arch.b.g invoke() {
                return this.$this_holderViewModel;
            }
        }

        private a() {
        }

        public static final class c extends m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bd>> {
            public static final c INSTANCE = new c();

            static {
                Covode.recordClassIndex(57613);
            }

            public c() {
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
                Covode.recordClassIndex(57615);
            }

            public e() {
                super(0);
            }

            @Override // h.f.a.a
            public final com.bytedance.assem.arch.viewModel.c invoke() {
                return new com.bytedance.assem.arch.viewModel.c();
            }
        }

        public static final class b extends m implements h.f.a.a<String> {
            final /* synthetic */ com.bytedance.assem.arch.b.g $this_holderViewModel;
            final /* synthetic */ h.k.c $viewModelClass;

            static {
                Covode.recordClassIndex(57612);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(com.bytedance.assem.arch.b.g gVar, h.k.c cVar) {
                super(0);
                this.$this_holderViewModel = gVar;
                this.$viewModelClass = cVar;
            }

            @Override // h.f.a.a
            public final String invoke() {
                return l.a(this.$viewModelClass.b(), (Object) String.valueOf(this.$this_holderViewModel.hashCode()));
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static VideoPlayViewModel a(com.bytedance.assem.arch.b.g gVar) {
            l.d(gVar, "");
            h.k.c a2 = ab.a(VideoPlayViewModel.class);
            return (VideoPlayViewModel) new com.bytedance.ext_power_list.f(a2, new b(gVar, a2), c.INSTANCE, new d(gVar), gVar, e.INSTANCE, C2209a.INSTANCE).getValue();
        }
    }

    static {
        Covode.recordClassIndex(57609);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean bL_() {
        return this.f91534l;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ bd f() {
        return new bd();
    }

    public final void g() {
        ad adVar = this.f91533j;
        if (adVar != null) {
            adVar.G();
        } else {
            v.O().B();
        }
    }

    public final void h() {
        ad adVar = this.f91533j;
        if (adVar != null) {
            adVar.F();
        } else {
            v.O().y();
        }
    }

    public final void i() {
        a(new k());
    }

    public final void a(int i2) {
        a(new h(i2));
    }

    static final class b extends m implements h.f.a.b<bd, bd> {
        final /* synthetic */ double $duration;

        static {
            Covode.recordClassIndex(57616);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(double d2) {
            super(1);
            this.$duration = d2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bd invoke(bd bdVar) {
            bd bdVar2 = bdVar;
            l.d(bdVar2, "");
            return bd.a(bdVar2, null, null, null, null, null, null, null, null, Double.valueOf(this.$duration), null, 767);
        }
    }

    static final class d extends m implements h.f.a.b<bd, bd> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f91535a = new d();

        static {
            Covode.recordClassIndex(57618);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bd invoke(bd bdVar) {
            bd bdVar2 = bdVar;
            l.d(bdVar2, "");
            return bd.a(bdVar2, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(z.f158842a), null, null, null, null, 991);
        }
    }

    static final class e extends m implements h.f.a.b<bd, bd> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f91536a = new e();

        static {
            Covode.recordClassIndex(57619);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bd invoke(bd bdVar) {
            bd bdVar2 = bdVar;
            l.d(bdVar2, "");
            return bd.a(bdVar2, null, null, null, null, new com.bytedance.assem.arch.extensions.a(z.f158842a), null, null, null, null, null, 1007);
        }
    }

    static final class f extends m implements h.f.a.b<bd, bd> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f91537a = new f();

        static {
            Covode.recordClassIndex(57620);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bd invoke(bd bdVar) {
            bd bdVar2 = bdVar;
            l.d(bdVar2, "");
            return bd.a(bdVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(z.f158842a), null, null, null, null, null, null, 1015);
        }
    }

    static final class g extends m implements h.f.a.b<bd, bd> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f91538a = new g();

        static {
            Covode.recordClassIndex(57621);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bd invoke(bd bdVar) {
            bd bdVar2 = bdVar;
            l.d(bdVar2, "");
            return bd.a(bdVar2, null, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(z.f158842a), null, null, null, 959);
        }
    }

    static final class i extends m implements h.f.a.b<bd, bd> {
        final /* synthetic */ Aweme $aweme;

        static {
            Covode.recordClassIndex(57623);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Aweme aweme) {
            super(1);
            this.$aweme = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bd invoke(bd bdVar) {
            bd bdVar2 = bdVar;
            l.d(bdVar2, "");
            return bd.a(bdVar2, null, null, null, null, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(this.$aweme), 511);
        }
    }

    static final class c extends m implements h.f.a.b<bd, bd> {
        final /* synthetic */ float $progress;

        static {
            Covode.recordClassIndex(57617);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(float f2) {
            super(1);
            this.$progress = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bd invoke(bd bdVar) {
            bd bdVar2 = bdVar;
            l.d(bdVar2, "");
            return bd.a(bdVar2, null, null, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(Float.valueOf(this.$progress)), null, null, 895);
        }
    }

    static final class h extends m implements h.f.a.b<bd, bd> {
        final /* synthetic */ int $pause;

        static {
            Covode.recordClassIndex(57622);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(int i2) {
            super(1);
            this.$pause = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bd invoke(bd bdVar) {
            bd bdVar2 = bdVar;
            l.d(bdVar2, "");
            return bd.a(bdVar2, null, new com.bytedance.assem.arch.extensions.a(Integer.valueOf(this.$pause)), null, null, null, null, null, null, null, null, 1021);
        }
    }

    static final class j extends m implements h.f.a.b<bd, bd> {
        final /* synthetic */ boolean $start = true;

        static {
            Covode.recordClassIndex(57624);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bd invoke(bd bdVar) {
            bd bdVar2 = bdVar;
            l.d(bdVar2, "");
            return bd.a(bdVar2, new com.bytedance.assem.arch.extensions.a(Boolean.valueOf(this.$start)), null, null, null, null, null, null, null, null, null, 1022);
        }
    }

    static final class k extends m implements h.f.a.b<bd, bd> {
        final /* synthetic */ boolean $stop = true;

        static {
            Covode.recordClassIndex(57625);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bd invoke(bd bdVar) {
            bd bdVar2 = bdVar;
            l.d(bdVar2, "");
            return bd.a(bdVar2, null, null, new com.bytedance.assem.arch.extensions.a(Boolean.valueOf(this.$stop)), null, null, null, null, null, null, null, 1019);
        }
    }
}
