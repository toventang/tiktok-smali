package com.ss.android.ugc.aweme.profile.widgets.relations;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;

public final class ProfileRelationVM extends AssemViewModel<a> {
    static {
        Covode.recordClassIndex(76674);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ a f() {
        return new a();
    }

    static final class a extends m implements b<a, a> {
        final /* synthetic */ long $digCount;
        final /* synthetic */ int $followerCount;
        final /* synthetic */ int $followingCount;

        static {
            Covode.recordClassIndex(76675);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2, int i3, long j2) {
            super(1);
            this.$followerCount = i2;
            this.$followingCount = i3;
            this.$digCount = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            l.d(aVar, "");
            return new a(this.$followerCount, this.$followingCount, this.$digCount);
        }
    }
}
