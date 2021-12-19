package com.ss.android.ugc.aweme.profile.widgets.userId;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;

public final class MyProfileUserIdVM extends AssemViewModel<a> {
    static {
        Covode.recordClassIndex(76697);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ a f() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements b<a, a> {
        final /* synthetic */ boolean $show;

        static {
            Covode.recordClassIndex(76698);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(1);
            this.$show = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            l.d(aVar, "");
            return new a(this.$show);
        }
    }

    public final void a(boolean z) {
        a(new a(z));
    }
}
