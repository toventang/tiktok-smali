package com.ss.android.ugc.aweme.music.assem.list.cell.assem;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import com.bytedance.assem.arch.b.i;
import com.bytedance.assem.arch.b.u;
import com.bytedance.assem.arch.b.w;
import com.bytedance.assem.arch.b.x;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.ss.android.ugc.aweme.music.assem.h;
import com.ss.android.ugc.aweme.music.search.SearchMusicActivity;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.m;
import h.f.b.y;
import h.z;
import java.util.List;
import java.util.Objects;

public final class l extends x<l> implements i<com.ss.android.ugc.aweme.music.assem.list.cell.d> {
    static final /* synthetic */ h.k.i[] u = {new y(l.class, "musicFakeViewModel", "getMusicFakeViewModel()Lcom/ss/android/ugc/aweme/music/assem/list/cell/assem/MusicFakeViewModel;", 0)};
    final h.h.d v;

    public static final class b extends m implements h.f.a.b<m, m> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(71458);
        }

        public b() {
            super(1);
        }

        public final m invoke(m mVar) {
            h.f.b.l.c(mVar, "");
            return mVar;
        }
    }

    static {
        Covode.recordClassIndex(71456);
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.aox;
    }

    @Override // com.bytedance.assem.arch.b.i
    public final void a() {
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
    }

    @Override // com.bytedance.assem.arch.b.v, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        u.a(this, new d(this));
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71457);
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

    static final class c extends m implements h.f.a.a<ad.b> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(71459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            Context ar_ = this.this$0.ar_();
            Objects.requireNonNull(ar_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ad.b a2 = dagger.hilt.android.internal.b.a.a((e) ar_);
            if (a2 == null) {
                h.f.b.l.b();
            }
            return a2;
        }
    }

    public l() {
        com.bytedance.assem.arch.viewModel.i iVar = i.d.f25721a;
        c cVar = new c(this);
        h.k.c a2 = ab.a(MusicFakeViewModel.class);
        this.v = k.a(this, a2, iVar == null ? i.c.f25720a : iVar, new a(a2), k.b.f28699a, cVar, b.INSTANCE, null, null, k.b(this), k.c(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.music.assem.list.cell.d dVar) {
        h.f.b.l.d(dVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void b(com.ss.android.ugc.aweme.music.assem.list.cell.d dVar) {
        h.f.b.l.d(dVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ boolean c(com.ss.android.ugc.aweme.music.assem.list.cell.d dVar) {
        h.f.b.l.d(dVar, "");
        return true;
    }

    static final class d extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(71460);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            assembler2.b(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.m, z>) new h.f.a.b<com.bytedance.assem.arch.core.m, z>(this) {
                /* class com.ss.android.ugc.aweme.music.assem.list.cell.assem.l.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(71461);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.m mVar) {
                    Context context;
                    h.k.c<? extends w<? extends com.bytedance.tiktok.proxy.d>> a2;
                    com.bytedance.assem.arch.core.m mVar2 = mVar;
                    h.f.b.l.d(mVar2, "");
                    Fragment a3 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) this.this$0.this$0);
                    if (a3 != null) {
                        context = a3.getContext();
                    } else {
                        context = null;
                    }
                    if (context instanceof SearchMusicActivity) {
                        a2 = ab.a(com.ss.android.ugc.aweme.music.search.a.a.class);
                    } else {
                        l lVar = this.this$0.this$0;
                        com.ss.android.ugc.aweme.music.assem.b bVar = (com.ss.android.ugc.aweme.music.assem.b) com.bytedance.assem.arch.service.d.a((AssemViewModel) lVar.v.a(lVar, l.u[0]), ab.a(h.class));
                        if (bVar == null || !bVar.f111137e) {
                            a2 = ab.a(f.class);
                        } else {
                            a2 = ab.a(a.class);
                        }
                    }
                    mVar2.a(a2);
                    mVar2.f25580d = R.id.cqk;
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.List] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.music.assem.list.cell.d dVar, List list) {
        h.f.b.l.d(dVar, "");
    }
}
