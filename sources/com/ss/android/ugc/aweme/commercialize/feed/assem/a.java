package com.ss.android.ugc.aweme.commercialize.feed.assem;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.w;
import h.k.c;
import h.k.i;
import h.q;
import h.r;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f74087a = {new w(a.class, "vm", "<v#0>", 1)};

    public static final class b extends m implements h.f.a.b<S, S> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(45652);
        }

        public b() {
            super(1);
        }

        public final S invoke(S s) {
            l.c(s, "");
            return s;
        }
    }

    static {
        Covode.recordClassIndex(45650);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.assem.a$a  reason: collision with other inner class name */
    public static final class C1673a extends m implements h.f.a.a<String> {
        final /* synthetic */ c $viewModelClass;

        static {
            Covode.recordClassIndex(45651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1673a(c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final AdInteractiveVM a(aj ajVar) {
        com.ss.android.ugc.aweme.feed.assem.b bVar;
        AssemViewModel assemViewModel = null;
        if (ajVar == null) {
            return null;
        }
        try {
            if (!(ajVar instanceof VideoViewCell)) {
                ajVar = null;
            }
            VideoViewCell videoViewCell = (VideoViewCell) ajVar;
            if (videoViewCell == null || (bVar = videoViewCell.aC) == null) {
                q.m223constructorimpl(null);
            } else {
                c a2 = ab.a(AdInteractiveVM.class);
                assemViewModel = (FeedBaseViewModel) k.a(bVar, a2, i.c.f25720a, new C1673a(a2), k.b.f28699a, k.a(bVar), b.INSTANCE, null, null, k.b(bVar), k.c(bVar)).a(null, f74087a[0]);
            }
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
        return (AdInteractiveVM) assemViewModel;
    }
}
