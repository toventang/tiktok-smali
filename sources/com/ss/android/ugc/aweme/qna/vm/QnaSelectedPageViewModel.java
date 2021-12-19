package com.ss.android.ugc.aweme.qna.vm;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;

public final class QnaSelectedPageViewModel extends AssemViewModel<h> {
    static {
        Covode.recordClassIndex(77731);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ h f() {
        return new h();
    }

    public final void a(com.ss.android.ugc.aweme.qna.fragment.a aVar) {
        l.d(aVar, "");
        a(new a(aVar));
    }

    static final class a extends m implements b<h, h> {
        final /* synthetic */ com.ss.android.ugc.aweme.qna.fragment.a $currentFragment;

        static {
            Covode.recordClassIndex(77732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.ss.android.ugc.aweme.qna.fragment.a aVar) {
            super(1);
            this.$currentFragment = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h invoke(h hVar) {
            l.d(hVar, "");
            return new h(new com.bytedance.assem.arch.extensions.a(this.$currentFragment));
        }
    }
}
