package com.ss.android.ugc.aweme.story.avatar;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.a.n;
import h.c.d;
import h.f.b.l;
import h.f.b.m;

public final class StoryAvatarEntrySharedVM extends BaseDetailShareVM<b, r, Integer> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f136764m = new a((byte) 0);

    static {
        Covode.recordClassIndex(89351);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int a(String str) {
        l.d(str, "");
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final int getPageType(int i2) {
        return 40;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89352);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new b();
    }

    static final class c extends m implements h.f.a.b<b, b> {
        final /* synthetic */ com.bytedance.ext_power_list.a $newListState;

        static {
            Covode.recordClassIndex(89354);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.bytedance.ext_power_list.a aVar) {
            super(1);
            this.$newListState = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ b invoke(b bVar) {
            l.d(bVar, "");
            return b.a(this.$newListState);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final /* synthetic */ Integer a(com.ss.android.ugc.aweme.feed.param.b bVar) {
        l.d(bVar, "");
        return 1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final /* synthetic */ Aweme b(r rVar) {
        r rVar2 = rVar;
        l.d(rVar2, "");
        return rVar2.f136843a;
    }

    static final class b extends m implements h.f.a.b<b, b> {
        final /* synthetic */ Aweme $aweme;

        static {
            Covode.recordClassIndex(89353);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Aweme aweme) {
            super(1);
            this.$aweme = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ b invoke(b bVar) {
            l.d(bVar, "");
            return b.a(new com.bytedance.ext_power_list.a(null, null, null, n.a(new r(this.$aweme)), 7));
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object a(d<? super f<Integer>> dVar) {
        return f.a.a(new IllegalStateException("should never do refresh in AvatarEntrySharedVM"));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final void a(com.bytedance.ext_power_list.a<r> aVar) {
        l.d(aVar, "");
        a((h.f.a.b) new c(aVar));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* synthetic */ Object a(Object obj, d dVar) {
        ((Number) obj).intValue();
        return f.a.a(new IllegalStateException("should never load more in AvatarEntrySharedVM"));
    }
}
