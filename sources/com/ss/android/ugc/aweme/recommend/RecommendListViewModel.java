package com.ss.android.ugc.aweme.recommend;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.t;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.f.b.z;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class RecommendListViewModel extends CommonListViewModel<User, RecommendUserListState> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f120031b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.friends.g.a f120032a = com.ss.android.ugc.aweme.recommend.users.b.f120122a.a();

    /* renamed from: c  reason: collision with root package name */
    private final h.h f120033c = h.i.a((h.f.a.a) d.f120035a);

    /* renamed from: d  reason: collision with root package name */
    private final h.h f120034d = h.i.a((h.f.a.a) e.f120036a);

    static {
        Covode.recordClassIndex(78006);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78007);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final m<List<? extends User>, List<? extends User>, List<User>> j() {
        return g.f120038a;
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final h.f.a.b<RecommendUserListState, t<p<List<User>, o>>> a() {
        return new i(this);
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final h.f.a.b<RecommendUserListState, t<p<List<User>, o>>> b() {
        return new f(this);
    }

    static final class d extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f120035a = new d();

        static {
            Covode.recordClassIndex(78010);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.ss.android.ugc.aweme.av.a.a(f.CONTACT));
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f120036a = new e();

        static {
            Covode.recordClassIndex(78011);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.ss.android.ugc.aweme.av.a.a(f.FACEBOOK));
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        b_(new h(this));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new RecommendUserListState(null, null, false, 0, null, null, null, 127, null);
    }

    @Override // androidx.lifecycle.ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        this.f120032a.f39267a.bn_();
    }

    static final class c extends h.f.b.m implements h.f.a.b<RecommendUserListState, z> {
        final /* synthetic */ z.a $isRecommendListEmpty;

        static {
            Covode.recordClassIndex(78009);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(z.a aVar) {
            super(1);
            this.$isRecommendListEmpty = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            l.d(recommendUserListState2, "");
            if (((ListState) recommendUserListState2.getSubstate()).getList().isEmpty()) {
                this.$isRecommendListEmpty.element = true;
            }
            return h.z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<RecommendUserListState, h.z> {
        final /* synthetic */ RecommendListViewModel this$0;

        static {
            Covode.recordClassIndex(78015);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(RecommendListViewModel recommendListViewModel) {
            super(1);
            this.this$0 = recommendListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            l.d(recommendUserListState2, "");
            this.this$0.f120032a.a(recommendUserListState2.getRecommendUserType()).d(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.recommend.RecommendListViewModel.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f120039a;

                static {
                    Covode.recordClassIndex(78016);
                }

                {
                    this.f120039a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$h$1$a */
                static final class a extends h.f.b.m implements h.f.a.b<RecommendUserListState, RecommendUserListState> {
                    final /* synthetic */ List $list;
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(78017);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(List list, AnonymousClass1 r3) {
                        super(1);
                        this.$list = list;
                        this.this$0 = r3;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ RecommendUserListState invoke(RecommendUserListState recommendUserListState) {
                        List list;
                        RecommendUserListState recommendUserListState2 = recommendUserListState;
                        l.d(recommendUserListState2, "");
                        ListState<User, o> substate = recommendUserListState2.getSubstate();
                        List list2 = this.$list;
                        if (list2 != null) {
                            list = n.g((Collection) list2);
                        } else {
                            list = h.a.z.INSTANCE;
                        }
                        return RecommendUserListState.copy$default(recommendUserListState2, null, null, false, 0, null, null, ListState.copy$default(substate, null, list, null, null, null, 29, null), 63, null);
                    }
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    List<T> list = (List) ((com.bytedance.jedi.a.c.f) obj).a();
                    if (list != null) {
                        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                        for (T t : list) {
                            arrayList.add(t.f142427a);
                        }
                        this.f120039a.this$0.c(new a(arrayList, this));
                    }
                }
            });
            return h.z.f158842a;
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.b<RecommendUserListState, RecommendUserListState> {
        final /* synthetic */ h $params;

        static {
            Covode.recordClassIndex(78020);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(h hVar) {
            super(1);
            this.$params = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ RecommendUserListState invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            l.d(recommendUserListState2, "");
            return RecommendUserListState.copy$default(recommendUserListState2, null, null, false, 0, null, this.$params, null, 95, null);
        }
    }

    public final boolean a(User user) {
        l.d(user, "");
        com.ss.android.ugc.aweme.friends.g.a aVar = this.f120032a;
        String uid = user.getUid();
        l.b(uid, "");
        aVar.a(uid, user.getSecUid()).c();
        c(new b(user));
        z.a aVar2 = new z.a();
        aVar2.element = false;
        b_(new c(aVar2));
        return aVar2.element;
    }

    static final class b extends h.f.b.m implements h.f.a.b<RecommendUserListState, RecommendUserListState> {
        final /* synthetic */ User $user;

        static {
            Covode.recordClassIndex(78008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(User user) {
            super(1);
            this.$user = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ RecommendUserListState invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            l.d(recommendUserListState2, "");
            List<User> list = recommendUserListState2.getSubstate().getList();
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!l.a((Object) t.getUid(), (Object) this.$user.getUid())) {
                    arrayList.add(t);
                }
            }
            return RecommendUserListState.copy$default(recommendUserListState2, null, null, false, 0, null, null, ListState.copy$default(recommendUserListState2.getSubstate(), null, arrayList, null, null, null, 29, null), 63, null);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<RecommendUserListState, t<p<? extends List<? extends User>, ? extends o>>> {
        final /* synthetic */ RecommendListViewModel this$0;

        static {
            Covode.recordClassIndex(78012);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(RecommendListViewModel recommendListViewModel) {
            super(1);
            this.this$0 = recommendListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends User>, ? extends o>> invoke(RecommendUserListState recommendUserListState) {
            String userId;
            String secUserId;
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            l.d(recommendUserListState2, "");
            com.ss.android.ugc.aweme.friends.g.a aVar = this.this$0.f120032a;
            Integer valueOf = Integer.valueOf(recommendUserListState2.getSubstate().getPayload().f39460b);
            if (recommendUserListState2.isMySelf()) {
                userId = null;
            } else {
                userId = recommendUserListState2.getUserId();
            }
            int recommendUserType = recommendUserListState2.getRecommendUserType();
            Integer valueOf2 = Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.d.a());
            com.ss.android.ugc.aweme.newfollow.c.e eVar = e.a.f112592a;
            l.b(eVar, "");
            String a2 = eVar.a();
            if (recommendUserListState2.isMySelf()) {
                secUserId = "0";
            } else {
                secUserId = recommendUserListState2.getSecUserId();
            }
            t<R> d2 = aVar.b(20, valueOf, userId, recommendUserType, 0, valueOf2, a2, 2, secUserId).d(AnonymousClass1.f120037a);
            l.b(d2, "");
            return d2;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<RecommendUserListState, t<p<? extends List<? extends User>, ? extends o>>> {
        final /* synthetic */ RecommendListViewModel this$0;

        static {
            Covode.recordClassIndex(78018);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(RecommendListViewModel recommendListViewModel) {
            super(1);
            this.this$0 = recommendListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends User>, ? extends o>> invoke(RecommendUserListState recommendUserListState) {
            String userId;
            String secUserId;
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            l.d(recommendUserListState2, "");
            com.ss.android.ugc.aweme.friends.g.a aVar = this.this$0.f120032a;
            if (recommendUserListState2.isMySelf()) {
                userId = null;
            } else {
                userId = recommendUserListState2.getUserId();
            }
            int recommendUserType = recommendUserListState2.getRecommendUserType();
            Integer valueOf = Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.d.a());
            com.ss.android.ugc.aweme.newfollow.c.e eVar = e.a.f112592a;
            l.b(eVar, "");
            String a2 = eVar.a();
            if (recommendUserListState2.isMySelf()) {
                secUserId = "0";
            } else {
                secUserId = recommendUserListState2.getSecUserId();
            }
            t<R> d2 = aVar.b(20, 0, userId, recommendUserType, 0, valueOf, a2, 2, secUserId).d(AnonymousClass1.f120040a);
            l.b(d2, "");
            return d2;
        }
    }

    static final class g extends h.f.b.m implements m<List<? extends User>, List<? extends User>, List<User>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f120038a = new g();

        static {
            Covode.recordClassIndex(78014);
        }

        g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ List<User> invoke(List<? extends User> list, List<? extends User> list2) {
            List<? extends User> list3 = list;
            List<? extends User> list4 = list2;
            l.d(list3, "");
            l.d(list4, "");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            com.ss.android.ugc.aweme.l.a.a(arrayList, list3);
            return arrayList;
        }
    }
}
