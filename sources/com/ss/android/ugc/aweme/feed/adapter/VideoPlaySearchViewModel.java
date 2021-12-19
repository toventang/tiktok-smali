package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.k.c;
import h.z;

public final class VideoPlaySearchViewModel extends AssemViewModel<bc> {

    /* renamed from: j  reason: collision with root package name */
    public static final a f91530j = new a((byte) 0);

    static {
        Covode.recordClassIndex(57604);
    }

    public static final class a {

        public static final class b extends m implements h.f.a.b<bc, bc> {
            public static final b INSTANCE = new b();

            static {
                Covode.recordClassIndex(57607);
            }

            public b() {
                super(1);
            }

            public final bc invoke(bc bcVar) {
                l.c(bcVar, "");
                return bcVar;
            }
        }

        static {
            Covode.recordClassIndex(57605);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a$a  reason: collision with other inner class name */
        public static final class C2208a extends m implements h.f.a.a<String> {
            final /* synthetic */ c $viewModelClass;

            static {
                Covode.recordClassIndex(57606);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2208a(c cVar) {
                super(0);
                this.$viewModelClass = cVar;
            }

            @Override // h.f.a.a
            public final String invoke() {
                return "assem_" + h.f.a.a(this.$viewModelClass).getName();
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ bc f() {
        return new bc();
    }

    static final class b extends m implements h.f.a.b<bc, bc> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f91531a = new b();

        static {
            Covode.recordClassIndex(57608);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bc invoke(bc bcVar) {
            l.d(bcVar, "");
            return new bc(new com.bytedance.assem.arch.extensions.a(z.f158842a));
        }
    }
}
