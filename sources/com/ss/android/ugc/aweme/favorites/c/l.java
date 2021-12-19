package com.ss.android.ugc.aweme.favorites.c;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.m;
import h.h;
import h.k.k;
import h.z;
import java.util.List;

public final class l extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    final h f90559j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f90560k;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.e, com.ss.android.ugc.aweme.favorites.viewmodel.e> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(56877);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.favorites.viewmodel.e invoke(com.ss.android.ugc.aweme.favorites.viewmodel.e eVar) {
            h.f.b.l.c(eVar, "");
            return eVar;
        }
    }

    public interface c extends com.bytedance.assem.arch.service.c {
        static {
            Covode.recordClassIndex(56878);
        }

        void c();
    }

    static {
        Covode.recordClassIndex(56875);
    }

    static final class d extends m implements h.f.a.a<c> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(56879);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return com.bytedance.assem.arch.service.d.b(this.this$0, ab.a(c.class));
        }
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ TuxStatusView $statusView;

        static {
            Covode.recordClassIndex(56882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(TuxStatusView tuxStatusView) {
            super(0);
            this.$statusView = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$statusView.a();
            this.$statusView.setVisibility(0);
            return z.f158842a;
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(56876);
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

    public l() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(VideoCollectionListViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f90560k = bVar;
        this.f90559j = h.i.a((h.f.a.a) new d(this));
    }

    static final class g extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ TuxStatusView $statusView;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(56883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(l lVar, TuxStatusView tuxStatusView) {
            super(1);
            this.this$0 = lVar;
            this.$statusView = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            this.$statusView.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.c.l.g.AnonymousClass1 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(56884);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    ((c) this.this$0.this$0.f90559j.getValue()).c();
                    return z.f158842a;
                }
            }));
            this.$statusView.setVisibility(0);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        h.f.b.l.d(view, "");
        TuxStatusView tuxStatusView = (TuxStatusView) view;
        Context context = tuxStatusView.getContext();
        k kVar = m.f90562a;
        e eVar = new e(tuxStatusView, context);
        AssemViewModel.a((VideoCollectionListViewModel) this.f90560k.getValue(), kVar, null, new g(this, tuxStatusView), new f(tuxStatusView), eVar, 2);
    }

    static final class e extends m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.b>, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ TuxStatusView $statusView;

        static {
            Covode.recordClassIndex(56880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(TuxStatusView tuxStatusView, Context context) {
            super(1);
            this.$statusView = tuxStatusView;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.b> list) {
            List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.b> list2 = list;
            h.f.b.l.d(list2, "");
            if (list2.isEmpty()) {
                TuxStatusView tuxStatusView = this.$statusView;
                TuxStatusView.c cVar = new TuxStatusView.c();
                String string = this.$context.getString(R.string.bsy);
                h.f.b.l.b(string, "");
                TuxStatusView.c a2 = cVar.a(string);
                String string2 = this.$context.getString(R.string.bsx);
                h.f.b.l.b(string2, "");
                tuxStatusView.setStatus(a2.a((CharSequence) string2).a(com.bytedance.tux.c.c.a(AnonymousClass1.f90561a)));
                this.$statusView.setVisibility(0);
            } else {
                this.$statusView.setVisibility(8);
            }
            return z.f158842a;
        }
    }
}
