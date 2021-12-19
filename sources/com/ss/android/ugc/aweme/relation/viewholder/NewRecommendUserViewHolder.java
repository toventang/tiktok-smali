package com.ss.android.ugc.aweme.relation.viewholder;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.y;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.j;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.cj;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.recommend.RecommendListViewModel;
import com.ss.android.ugc.aweme.recommend.RecommendUserListState;
import com.ss.android.ugc.aweme.recommend.g;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.ss.android.ugc.aweme.utils.eu;
import h.f.b.z;
import java.util.ArrayList;

public final class NewRecommendUserViewHolder extends JediBaseViewHolder<NewRecommendUserViewHolder, com.ss.android.ugc.aweme.following.a.g> implements au {

    /* renamed from: g  reason: collision with root package name */
    final h.h f120485g;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f120486j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f120487k;

    /* renamed from: l  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.recommend.a f120488l;

    static {
        Covode.recordClassIndex(78423);
    }

    private final RecommendListViewModel o() {
        return (RecommendListViewModel) this.f120486j.getValue();
    }

    private final FollowingRelationViewModel p() {
        return (FollowingRelationViewModel) this.f120487k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private final String q() {
        return (String) withState(o(), g.f120489a);
    }

    private final String s() {
        return (String) withState(o(), i.f120491a);
    }

    private final String t() {
        return (String) withState(o(), h.f120490a);
    }

    private final String r() {
        z.e eVar = new z.e();
        eVar.element = "";
        withState(o(), new f(eVar));
        return eVar.element;
    }

    public final String n() {
        z.e eVar = new z.e();
        eVar.element = "";
        withState(o(), new e(eVar));
        return eVar.element;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        f.a.b.b unused = selectSubscribe(m(), a.f120496a, new ah(), l.f120493a);
        h.a.a(this, m(), b.f120497a, (ah) null, m.f120494a, (h.f.a.b) null, n.f120495a, 10);
        a(((com.ss.android.ugc.aweme.following.a.g) aI_()).f96343b, 5);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<FollowRelationTabViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(78424);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_relation_viewholder_NewRecommendUserViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<RecommendListViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(78425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.recommend.RecommendListViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_relation_viewholder_NewRecommendUserViewHolder$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<FollowingRelationViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(78426);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_relation_viewholder_NewRecommendUserViewHolder$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public final UserViewModel m() {
        k kVar = new k(this);
        JediViewHolderProxy jediViewHolderProxy = this.f39565d;
        if (jediViewHolderProxy != null) {
            JediViewModel jediViewModel = (JediViewModel) j.a.a(d(), jediViewHolderProxy.b()).a(getClass().getName() + '_' + UserViewModel.class.getName(), UserViewModel.class);
            y a2 = jediViewModel.f39365j.a(UserViewModel.class);
            if (a2 != null) {
                a2.binding(jediViewModel);
            }
            jediViewModel.a_(kVar);
            return (UserViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.b<RecommendUserListState, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f120489a = new g();

        static {
            Covode.recordClassIndex(78430);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            h.f.b.l.d(recommendUserListState2, "");
            return recommendUserListState2.getUserId();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.b<RecommendUserListState, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f120491a = new i();

        static {
            Covode.recordClassIndex(78432);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            h.f.b.l.d(recommendUserListState2, "");
            return recommendUserListState2.getRecommendMobParams().f120065b;
        }
    }

    public final void a(User user) {
        this.f120488l.a(user);
        this.f120488l.setEventListener(new d(this, user));
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<Integer, h.z> {
        final /* synthetic */ User $user;
        final /* synthetic */ NewRecommendUserViewHolder this$0;

        static {
            Covode.recordClassIndex(78427);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(NewRecommendUserViewHolder newRecommendUserViewHolder, User user) {
            super(1);
            this.this$0 = newRecommendUserViewHolder;
            this.$user = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Integer num) {
            this.this$0.a(this.$user, num.intValue());
            NewRecommendUserViewHolder newRecommendUserViewHolder = this.this$0;
            newRecommendUserViewHolder.withState((FollowRelationTabViewModel) newRecommendUserViewHolder.f120485g.getValue(), j.f120492a);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<RecommendUserListState, h.z> {
        final /* synthetic */ z.e $enterFrom;

        static {
            Covode.recordClassIndex(78428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(z.e eVar) {
            super(1);
            this.$enterFrom = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            h.f.b.l.d(recommendUserListState2, "");
            this.$enterFrom.element = recommendUserListState2.getRecommendUserType() == 13 ? (T) "following_list" : (T) recommendUserListState2.getRecommendMobParams().f120064a;
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<RecommendUserListState, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f120490a = new h();

        static {
            Covode.recordClassIndex(78431);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            h.f.b.l.d(recommendUserListState2, "");
            if (recommendUserListState2.getRecommendUserType() != 13 || !com.ss.android.ugc.aweme.social.a.b.b()) {
                return "";
            }
            return "bottom";
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<FollowRelationState, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f120492a = new j();

        static {
            Covode.recordClassIndex(78433);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(FollowRelationState followRelationState) {
            FollowRelationState followRelationState2 = followRelationState;
            h.f.b.l.d(followRelationState2, "");
            if (followRelationState2.isFollowingTab() && com.ss.android.ugc.aweme.social.a.b.b()) {
                com.ss.android.ugc.aweme.social.a.c.d();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<UserState, UserState> {
        final /* synthetic */ NewRecommendUserViewHolder this$0;

        static {
            Covode.recordClassIndex(78434);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(NewRecommendUserViewHolder newRecommendUserViewHolder) {
            super(1);
            this.this$0 = newRecommendUserViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ UserState invoke(UserState userState) {
            UserState userState2 = userState;
            h.f.b.l.d(userState2, "");
            return UserState.copy$default(userState2, ((com.ss.android.ugc.aweme.following.a.g) this.this$0.aI_()).f96343b, false, null, null, null, 30, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<RecommendUserListState, h.z> {
        final /* synthetic */ z.e $enterFrom;

        static {
            Covode.recordClassIndex(78429);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(z.e eVar) {
            super(1);
            this.$enterFrom = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            h.f.b.l.d(recommendUserListState2, "");
            if (recommendUserListState2.isMySelf() && recommendUserListState2.getRecommendUserType() == 13) {
                this.$enterFrom.element = "following_list";
            } else if (recommendUserListState2.getRecommendUserType() == 21) {
                this.$enterFrom.element = "suggested_list";
            }
            return h.z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewRecommendUserViewHolder(com.ss.android.ugc.aweme.recommend.a aVar) {
        super(aVar.getView());
        h.f.b.l.d(aVar, "");
        this.f120488l = aVar;
        h.k.c a2 = h.f.b.ab.a(FollowRelationTabViewModel.class);
        this.f120485g = h.i.a((h.f.a.a) new a(this, a2, a2));
        h.k.c a3 = h.f.b.ab.a(RecommendListViewModel.class);
        this.f120486j = h.i.a((h.f.a.a) new b(this, a3, a3));
        h.k.c a4 = h.f.b.ab.a(FollowingRelationViewModel.class);
        this.f120487k = h.i.a((h.f.a.a) new c(this, a4, a4));
    }

    static final class l extends h.f.b.m implements h.f.a.m<NewRecommendUserViewHolder, User, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f120493a = new l();

        static {
            Covode.recordClassIndex(78435);
        }

        l() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(NewRecommendUserViewHolder newRecommendUserViewHolder, User user) {
            NewRecommendUserViewHolder newRecommendUserViewHolder2 = newRecommendUserViewHolder;
            User user2 = user;
            h.f.b.l.d(newRecommendUserViewHolder2, "");
            h.f.b.l.d(user2, "");
            newRecommendUserViewHolder2.a(user2);
            ((com.ss.android.ugc.aweme.following.a.g) newRecommendUserViewHolder2.aI_()).f96343b.setFollowStatus(user2.getFollowStatus());
            return h.z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<NewRecommendUserViewHolder, Throwable, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f120494a = new m();

        static {
            Covode.recordClassIndex(78436);
        }

        m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(NewRecommendUserViewHolder newRecommendUserViewHolder, Throwable th) {
            NewRecommendUserViewHolder newRecommendUserViewHolder2 = newRecommendUserViewHolder;
            Throwable th2 = th;
            h.f.b.l.d(newRecommendUserViewHolder2, "");
            h.f.b.l.d(th2, "");
            View view = newRecommendUserViewHolder2.itemView;
            h.f.b.l.b(view, "");
            Activity a2 = o.a(view.getContext());
            h.f.b.l.b(a2, "");
            com.ss.android.ugc.aweme.common.l.a(a2, th2);
            newRecommendUserViewHolder2.a(((com.ss.android.ugc.aweme.following.a.g) newRecommendUserViewHolder2.aI_()).f96343b);
            newRecommendUserViewHolder2.m().a();
            return h.z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<NewRecommendUserViewHolder, FollowStatus, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f120495a = new n();

        static {
            Covode.recordClassIndex(78437);
        }

        n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(NewRecommendUserViewHolder newRecommendUserViewHolder, FollowStatus followStatus) {
            NewRecommendUserViewHolder newRecommendUserViewHolder2 = newRecommendUserViewHolder;
            h.f.b.l.d(newRecommendUserViewHolder2, "");
            h.f.b.l.d(followStatus, "");
            newRecommendUserViewHolder2.m();
            String n = newRecommendUserViewHolder2.n();
            String uid = ((com.ss.android.ugc.aweme.following.a.g) newRecommendUserViewHolder2.aI_()).f96343b.getUid();
            h.f.b.l.b(uid, "");
            UserViewModel.a(n, uid, ((com.ss.android.ugc.aweme.following.a.g) newRecommendUserViewHolder2.aI_()).f96343b.getFollowStatus());
            return h.z.f158842a;
        }
    }

    public final void a(User user, int i2) {
        int i3;
        String str;
        String str2;
        u.a aVar;
        int i4;
        user.setRequestId(((com.ss.android.ugc.aweme.following.a.g) aI_()).f96345d);
        int i5 = 1;
        if (i2 != 1) {
            int i6 = 2;
            if (i2 == 2) {
                if (user.getFollowStatus() == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (cj.a()) {
                    if (i3 != 1) {
                        i6 = 0;
                    } else if (user.isSecret()) {
                        i6 = 4;
                    } else if (user.getFollowerStatus() != 1) {
                        i6 = 1;
                    }
                    com.ss.android.ugc.aweme.recommend.a aVar2 = this.f120488l;
                    if (user.getFollowerStatus() == 1) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    aVar2.a(i6, i4, null);
                }
                m().a(new n.a().a(user.getUid()).b(user.getSecUid()).a(i3).c(n()).b(12).a());
                if (user.getFollowStatus() == 0) {
                    str = "follow";
                } else {
                    str = "follow_cancel";
                }
                if (user.getFollowerStatus() == 1) {
                    str2 = "mutual";
                } else {
                    str2 = "single";
                }
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", n()).a("rec_type", user.getRecType()).a("to_user_id", user.getUid()).a("impr_order", ((com.ss.android.ugc.aweme.following.a.g) aI_()).f96344c).a("previous_page", s()).a("req_id", user.getRequestId()).a("follow_type", str2).a("is_private", user.isSecret() ? 1 : 0);
                int followStatus = user.getFollowStatus();
                if (followStatus == 0) {
                    i5 = -1;
                } else if (followStatus == 4) {
                    i5 = 0;
                }
                r.a(str, a2.a("cancel_type", i5).f66730a);
                u q = new u().a(r()).q(s());
                q.f109596a = u.c.CARD;
                if (user.getFollowStatus() == 0) {
                    aVar = u.a.FOLLOW;
                } else {
                    aVar = u.a.FOLLOW_CANCEL;
                }
                q.f109597b = aVar;
                q.a(user).s(user.getRequestId()).p(t()).t(q()).f();
            } else if (i2 == 3) {
                if (o().a(((com.ss.android.ugc.aweme.following.a.g) aI_()).f96343b)) {
                    p().a(new ArrayList());
                }
                r.a("close_recommend_user_cell", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", n()).a("rec_type", user.getRecType()).a("relation_type", user.getFriendTypeStr()).a("rec_uid", user.getUid()).a("impr_order", ((com.ss.android.ugc.aweme.following.a.g) aI_()).f96344c).a("previous_page", s()).a("req_id", user.getRequestId()).f66730a);
                u q2 = new u().a(r()).q(s());
                q2.f109596a = u.c.CARD;
                q2.f109597b = u.a.CLOSE;
                q2.a(user).s(user.getRequestId()).p(t()).t(q()).f();
            } else if (i2 == 5) {
                if (user.isShould_write_impr()) {
                    e.a.f112592a.a(1, user.getUid());
                }
                r.a("show_recommend_user_cell", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", n()).a("rec_type", user.getRecType()).a("rec_uid", user.getUid()).a("impr_order", ((com.ss.android.ugc.aweme.following.a.g) aI_()).f96344c).a("previous_page", s()).a("relation_type", user.getFriendTypeStr()).a("req_id", ((com.ss.android.ugc.aweme.following.a.g) aI_()).f96345d).f66730a);
                u q3 = new u().a(r()).q(s());
                q3.f109596a = u.c.CARD;
                q3.f109597b = u.a.SHOW;
                q3.a(user).s(user.getRequestId()).p(t()).t(q()).f();
            }
        } else {
            View view = this.itemView;
            h.f.b.l.b(view, "");
            Context context = view.getContext();
            if (context != null) {
                SmartRouter.buildRoute(context, "//user/profile").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("extra_mutual_relation", user.getMutualStruct()).withParam("extra_from_mutual", true).withParam("enter_from", n()).withParam("enter_from_request_id", user.getRequestId()).withParam("recommend_enter_profile_params", new com.ss.android.ugc.aweme.recommend.g(r(), s(), u.c.CARD, user.getRecType(), g.a.a(user), user.getUid(), null, null, user.getRequestId(), q(), user.getFriendTypeStr(), null, 2048, null)).open();
            }
            com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", n()).a("rec_type", user.getRecType()).a("to_user_id", user.getUid()).a("impr_order", ((com.ss.android.ugc.aweme.following.a.g) aI_()).f96344c).a("previous_page", s()).a("req_id", user.getRequestId()).a("impr_id", user.getUid());
            h.f.b.l.b(a3, "");
            r.a("enter_personal_detail", eu.a(a3, user).f66730a);
            u q4 = new u().a(r()).q(s());
            q4.f109596a = u.c.CARD;
            q4.f109597b = u.a.ENTER_PROFILE;
            q4.a(user).s(user.getRequestId()).t(q()).p(t()).f();
        }
    }
}
