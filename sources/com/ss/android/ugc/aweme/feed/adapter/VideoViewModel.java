package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoCaptionUpdateParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import h.f.b.ab;
import h.z;

public final class VideoViewModel extends AssemViewModel<ck> {

    /* renamed from: j  reason: collision with root package name */
    public static final a f91574j = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private final boolean f91575k = true;

    public static final class a {

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewModel$a$a  reason: collision with other inner class name */
        public static final class C2210a extends h.f.b.m implements h.f.a.b<ck, ck> {
            public static final C2210a INSTANCE = new C2210a();

            static {
                Covode.recordClassIndex(57649);
            }

            public C2210a() {
                super(1);
            }

            public final ck invoke(ck ckVar) {
                h.f.b.l.c(ckVar, "");
                return ckVar;
            }
        }

        static {
            Covode.recordClassIndex(57648);
        }

        public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.b.g> {
            final /* synthetic */ com.bytedance.assem.arch.b.g $this_holderViewModel;

            static {
                Covode.recordClassIndex(57652);
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

        public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
            public static final c INSTANCE = new c();

            static {
                Covode.recordClassIndex(57651);
            }

            public c() {
                super(0);
            }

            @Override // h.f.a.a
            public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
                return new com.bytedance.assem.jedi_vm.viewModel.b<>();
            }
        }

        public static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
            public static final e INSTANCE = new e();

            static {
                Covode.recordClassIndex(57653);
            }

            public e() {
                super(0);
            }

            @Override // h.f.a.a
            public final com.bytedance.assem.arch.viewModel.c invoke() {
                return new com.bytedance.assem.arch.viewModel.c();
            }
        }

        public static final class b extends h.f.b.m implements h.f.a.a<String> {
            final /* synthetic */ com.bytedance.assem.arch.b.g $this_holderViewModel;
            final /* synthetic */ h.k.c $viewModelClass;

            static {
                Covode.recordClassIndex(57650);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(com.bytedance.assem.arch.b.g gVar, h.k.c cVar) {
                super(0);
                this.$this_holderViewModel = gVar;
                this.$viewModelClass = cVar;
            }

            @Override // h.f.a.a
            public final String invoke() {
                return h.f.b.l.a(this.$viewModelClass.b(), (Object) String.valueOf(this.$this_holderViewModel.hashCode()));
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static VideoViewModel a(com.bytedance.assem.arch.b.g gVar) {
            h.f.b.l.d(gVar, "");
            h.k.c a2 = ab.a(VideoViewModel.class);
            return (VideoViewModel) new com.bytedance.ext_power_list.f(a2, new b(gVar, a2), c.INSTANCE, new d(gVar), gVar, e.INSTANCE, C2210a.INSTANCE).getValue();
        }
    }

    static {
        Covode.recordClassIndex(57647);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean bL_() {
        return this.f91575k;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ ck f() {
        return new ck();
    }

    static final class b extends h.f.b.m implements h.f.a.b<ck, ck> {
        final /* synthetic */ boolean $clicked = true;

        static {
            Covode.recordClassIndex(57654);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ck invoke(ck ckVar) {
            ck ckVar2 = ckVar;
            h.f.b.l.d(ckVar2, "");
            return ck.a(ckVar2, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(Boolean.valueOf(this.$clicked)), 2047);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<ck, ck> {
        final /* synthetic */ VideoCaptionUpdateParams $param;

        static {
            Covode.recordClassIndex(57655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VideoCaptionUpdateParams videoCaptionUpdateParams) {
            super(1);
            this.$param = videoCaptionUpdateParams;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ck invoke(ck ckVar) {
            ck ckVar2 = ckVar;
            h.f.b.l.d(ckVar2, "");
            return ck.a(ckVar2, null, null, null, null, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(this.$param), null, null, 3583);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<ck, ck> {
        final /* synthetic */ Aweme $aweme;

        static {
            Covode.recordClassIndex(57656);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Aweme aweme) {
            super(1);
            this.$aweme = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ck invoke(ck ckVar) {
            ck ckVar2 = ckVar;
            h.f.b.l.d(ckVar2, "");
            return ck.a(ckVar2, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(this.$aweme), null, null, null, null, null, null, 4063);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<ck, ck> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f91576a = new e();

        static {
            Covode.recordClassIndex(57657);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ck invoke(ck ckVar) {
            ck ckVar2 = ckVar;
            h.f.b.l.d(ckVar2, "");
            return ck.a(ckVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(z.f158842a), null, null, null, null, null, null, null, null, 4087);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<ck, ck> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f91577a = new f();

        static {
            Covode.recordClassIndex(57658);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ck invoke(ck ckVar) {
            ck ckVar2 = ckVar;
            h.f.b.l.d(ckVar2, "");
            return ck.a(ckVar2, null, null, null, null, new com.bytedance.assem.arch.extensions.a(z.f158842a), null, null, null, null, null, null, null, 4079);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<ck, ck> {
        final /* synthetic */ int $position;

        static {
            Covode.recordClassIndex(57659);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(int i2) {
            super(1);
            this.$position = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ck invoke(ck ckVar) {
            ck ckVar2 = ckVar;
            h.f.b.l.d(ckVar2, "");
            return ck.a(ckVar2, null, null, null, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(Integer.valueOf(this.$position)), null, null, null, 3839);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<ck, ck> {
        final /* synthetic */ String $aid;

        static {
            Covode.recordClassIndex(57660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(String str) {
            super(1);
            this.$aid = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ck invoke(ck ckVar) {
            ck ckVar2 = ckVar;
            h.f.b.l.d(ckVar2, "");
            return ck.a(ckVar2, null, new com.bytedance.assem.arch.extensions.a(this.$aid), null, null, null, null, null, null, null, null, null, null, 4093);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<ck, ck> {
        final /* synthetic */ int $position;

        static {
            Covode.recordClassIndex(57661);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(int i2) {
            super(1);
            this.$position = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ck invoke(ck ckVar) {
            ck ckVar2 = ckVar;
            h.f.b.l.d(ckVar2, "");
            return ck.a(ckVar2, new com.bytedance.assem.arch.extensions.a(Integer.valueOf(this.$position)), null, null, null, null, null, null, null, null, null, null, null, 4094);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<ck, ck> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f91578a = new j();

        static {
            Covode.recordClassIndex(57662);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ck invoke(ck ckVar) {
            ck ckVar2 = ckVar;
            h.f.b.l.d(ckVar2, "");
            return ck.a(ckVar2, null, null, new com.bytedance.assem.arch.extensions.a(z.f158842a), null, null, null, null, null, null, null, null, null, 4091);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<ck, ck> {
        final /* synthetic */ boolean $startOrStop;

        static {
            Covode.recordClassIndex(57663);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(boolean z) {
            super(1);
            this.$startOrStop = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ck invoke(ck ckVar) {
            ck ckVar2 = ckVar;
            h.f.b.l.d(ckVar2, "");
            return ck.a(ckVar2, null, null, null, null, null, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(Boolean.valueOf(this.$startOrStop)), null, 3071);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<ck, ck> {
        final /* synthetic */ VideoItemParams $params;

        static {
            Covode.recordClassIndex(57664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(VideoItemParams videoItemParams) {
            super(1);
            this.$params = videoItemParams;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ck invoke(ck ckVar) {
            ck ckVar2 = ckVar;
            h.f.b.l.d(ckVar2, "");
            return ck.a(ckVar2, null, null, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(this.$params), null, null, null, null, 3967);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<ck, ck> {
        final /* synthetic */ VideoItemParams $params;

        static {
            Covode.recordClassIndex(57665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(VideoItemParams videoItemParams) {
            super(1);
            this.$params = videoItemParams;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ck invoke(ck ckVar) {
            ck ckVar2 = ckVar;
            h.f.b.l.d(ckVar2, "");
            return ck.a(ckVar2, null, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(this.$params), null, null, null, null, null, 4031);
        }
    }
}
