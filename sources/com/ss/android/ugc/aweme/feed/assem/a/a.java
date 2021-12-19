package com.ss.android.ugc.aweme.feed.assem.a;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
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
    static final /* synthetic */ i[] f91978a = {new w(a.class, "vm", "<v#0>", 1)};

    public static final class b extends m implements h.f.a.b<S, S> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(57915);
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
        Covode.recordClassIndex(57913);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.a.a$a  reason: collision with other inner class name */
    public static final class C2218a extends m implements h.f.a.a<String> {
        final /* synthetic */ c $viewModelClass;

        static {
            Covode.recordClassIndex(57914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2218a(c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final VideoShareViewModel a(aj ajVar) {
        AssemViewModel assemViewModel = null;
        try {
            com.ss.android.ugc.aweme.feed.assem.b bVar = ((VideoViewCell) ajVar).aC;
            if (bVar != null) {
                c a2 = ab.a(VideoShareViewModel.class);
                assemViewModel = (FeedBaseViewModel) k.a(bVar, a2, i.c.f25720a, new C2218a(a2), k.b.f28699a, k.a(bVar), b.INSTANCE, null, null, k.b(bVar), k.c(bVar)).a(null, f91978a[0]);
            } else {
                q.m223constructorimpl(null);
            }
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
        return (VideoShareViewModel) assemViewModel;
    }
}
