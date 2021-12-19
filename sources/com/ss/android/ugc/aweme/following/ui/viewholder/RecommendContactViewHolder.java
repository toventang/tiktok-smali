package com.ss.android.ugc.aweme.following.ui.viewholder;

import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import com.ss.android.ugc.aweme.friends.ui.x;
import com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState;
import com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel;
import h.f.b.l;
import h.h;
import h.z;

public final class RecommendContactViewHolder extends JediSimpleViewHolder<RecommendContact> implements au {

    /* renamed from: f  reason: collision with root package name */
    private final h f96608f;

    /* renamed from: g  reason: collision with root package name */
    private final x f96609g;

    static {
        Covode.recordClassIndex(61244);
    }

    public final RecommendUserListViewModel m() {
        return (RecommendUserListViewModel) this.f96608f.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        this.f96609g.setEnterFrom((String) withState(m(), c.f96610a));
    }

    public static final class a extends h.f.b.m implements h.f.a.a<RecommendUserListViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(61245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendContactViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_following_ui_viewholder_RecommendContactViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<RecommendUserListState, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f96610a = new c();

        static {
            Covode.recordClassIndex(61247);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            l.d(recommendUserListState2, "");
            return recommendUserListState2.getRecommendMobParams().f120183a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendContactViewHolder(x xVar) {
        super(xVar);
        l.d(xVar, "");
        this.f96609g = xVar;
        h.k.c a2 = h.f.b.ab.a(RecommendUserListViewModel.class);
        this.f96608f = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(RecommendContact recommendContact) {
        RecommendContact recommendContact2 = recommendContact;
        l.d(recommendContact2, "");
        this.f96609g.a(recommendContact2, getAdapterPosition());
        this.f96609g.setDislikeListener(new b(this));
    }

    static final class b extends h.f.b.m implements h.f.a.m<RecommendContact, Integer, z> {
        final /* synthetic */ RecommendContactViewHolder this$0;

        static {
            Covode.recordClassIndex(61246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RecommendContactViewHolder recommendContactViewHolder) {
            super(2);
            this.this$0 = recommendContactViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(RecommendContact recommendContact, Integer num) {
            RecommendContact recommendContact2 = recommendContact;
            num.intValue();
            l.d(recommendContact2, "");
            RecommendUserListViewModel m2 = this.this$0.m();
            l.d(recommendContact2, "");
            if (recommendContact2 instanceof RecommendContact) {
                m2.c(RecommendUserListViewModel.b.f120176a);
            } else {
                com.ss.android.ugc.aweme.friends.g.a aVar = m2.f120175a;
                String uid = recommendContact2.getUid();
                l.b(uid, "");
                l.b(aVar.a(uid, recommendContact2.getSecUid()).a(RecommendUserListViewModel.c.f120177a, RecommendUserListViewModel.d.f120178a), "");
            }
            return z.f158842a;
        }
    }
}
