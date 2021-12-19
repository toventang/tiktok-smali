package com.ss.android.ugc.aweme.music.assem.a;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.music.assem.LegacyCommunicateViewModel;
import com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.music.assem.list.s;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Objects;

public final class b extends a {

    /* renamed from: j  reason: collision with root package name */
    public boolean f111124j;

    /* renamed from: k  reason: collision with root package name */
    public View f111125k;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f111126l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f111127m;

    /* renamed from: com.ss.android.ugc.aweme.music.assem.a.b$b  reason: collision with other inner class name */
    public static final class C2844b extends m implements h.f.a.b<s, s> {
        public static final C2844b INSTANCE = new C2844b();

        static {
            Covode.recordClassIndex(71315);
        }

        public C2844b() {
            super(1);
        }

        public final s invoke(s sVar) {
            l.c(sVar, "");
            return sVar;
        }
    }

    public static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.music.assem.a, com.ss.android.ugc.aweme.music.assem.a> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(71317);
        }

        public d() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.music.assem.a invoke(com.ss.android.ugc.aweme.music.assem.a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(71313);
    }

    private final OriginMusicListViewModel u() {
        return (OriginMusicListViewModel) this.f111126l.getValue();
    }

    private final LegacyCommunicateViewModel v() {
        return (LegacyCommunicateViewModel) this.f111127m.getValue();
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(71320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            View view = this.this$0.f111125k;
            if (view != null) {
                view.setVisibility(4);
            }
            return z.f158842a;
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71314);
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

    public static final class c extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class e extends m implements h.f.a.a<ad.b> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(71318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            Context ar_ = this.this$0.ar_();
            Objects.requireNonNull(ar_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ad.b a2 = dagger.hilt.android.internal.b.a.a((androidx.fragment.app.e) ar_);
            if (a2 == null) {
                l.b();
            }
            return a2;
        }
    }

    public b() {
        com.bytedance.assem.arch.viewModel.b bVar;
        com.bytedance.assem.arch.viewModel.b bVar2;
        i.d dVar = i.d.f25721a;
        e eVar = new e(this);
        h.k.c a2 = ab.a(OriginMusicListViewModel.class);
        a aVar = new a(a2);
        C2844b bVar3 = C2844b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), eVar, bVar3, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), eVar, bVar3, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), eVar, bVar3, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f111126l = bVar;
        i.d dVar2 = i.d.f25721a;
        h.k.c a3 = ab.a(LegacyCommunicateViewModel.class);
        c cVar = new c(a3);
        d dVar3 = d.INSTANCE;
        if (l.a(dVar2, i.a.f25718a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, dVar3, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar2, i.d.f25721a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, dVar3, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar2 == null || l.a(dVar2, i.b.f25719a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, dVar3, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f111127m = bVar2;
    }

    static final class i extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(71322);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.f111124j = bool.booleanValue();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        View findViewById;
        MethodCollector.i(8782);
        l.d(view, "");
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.ed6);
        if (viewStub != null) {
            findViewById = viewStub.inflate();
        } else {
            findViewById = view.findViewById(R.id.dop);
        }
        this.f111125k = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(4);
        }
        AssemViewModel.a(u(), c.f111128a, null, null, new g(this), null, 22);
        f.a.a(this, u(), d.f111129a, com.bytedance.assem.arch.viewModel.l.a(), new h(this), 4);
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.music.assem.h.class), e.f111130a, new i(this));
        f.a.a(this, v(), f.f111131a, com.bytedance.assem.arch.viewModel.l.a(), new j(this), 4);
        f.a.a(this, v(), g.f111132a, com.bytedance.assem.arch.viewModel.l.a(), new f(this), 4);
        MethodCollector.o(8782);
    }

    static final class f extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends Object>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(71319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends Object> aVar) {
            l.d(pVar, "");
            View view = this.this$0.f111125k;
            if (view != null) {
                view.setVisibility(4);
            }
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.m<p, List<? extends com.ss.android.ugc.aweme.music.assem.list.cell.d>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(71321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, List<? extends com.ss.android.ugc.aweme.music.assem.list.cell.d> list) {
            View view;
            List<? extends com.ss.android.ugc.aweme.music.assem.list.cell.d> list2 = list;
            l.d(pVar, "");
            if ((list2 == null || list2.isEmpty()) && (view = this.this$0.f111125k) != null) {
                view.setVisibility(4);
            }
            return z.f158842a;
        }
    }

    static final class j extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends Object>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(71323);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends Object> aVar) {
            View view;
            l.d(pVar, "");
            if (this.this$0.f111124j && (view = this.this$0.f111125k) != null) {
                view.setVisibility(0);
            }
            return z.f158842a;
        }
    }
}
