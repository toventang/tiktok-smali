package com.ss.android.ugc.aweme.recommend.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.t;
import h.a.n;
import h.a.z;
import h.f.a.m;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class RecommendUserListViewModel extends CommonListViewModel<User, RecommendUserListState> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f120174b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.friends.g.a f120175a = com.ss.android.ugc.aweme.recommend.users.b.f120122a.a();

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f120177a = new c();

        static {
            Covode.recordClassIndex(78167);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(78164);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78165);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final m<List<? extends User>, List<? extends User>, List<User>> j() {
        return f.f120180a;
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final h.f.a.b<RecommendUserListState, t<p<List<User>, o>>> a() {
        return new h(this);
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final h.f.a.b<RecommendUserListState, t<p<List<User>, o>>> b() {
        return new e(this);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        b_(new g(this));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new RecommendUserListState(null, null, false, 0, null, null, null, 127, null);
    }

    @Override // androidx.lifecycle.ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        this.f120175a.f39267a.bn_();
    }

    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f120178a = new d();

        static {
            Covode.recordClassIndex(78168);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                th.printStackTrace();
            }
        }
    }

    public static List<User> a(List<? extends User> list) {
        if (list != null) {
            return n.g((Collection) list);
        }
        return z.INSTANCE;
    }

    static final class g extends h.f.b.m implements h.f.a.b<RecommendUserListState, h.z> {
        final /* synthetic */ RecommendUserListViewModel this$0;

        static {
            Covode.recordClassIndex(78172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(RecommendUserListViewModel recommendUserListViewModel) {
            super(1);
            this.this$0 = recommendUserListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            l.d(recommendUserListState2, "");
            this.this$0.f120175a.a(recommendUserListState2.getRecommendUserType()).d(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f120181a;

                static {
                    Covode.recordClassIndex(78173);
                }

                {
                    this.f120181a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$g$1$a */
                static final class a extends h.f.b.m implements h.f.a.b<RecommendUserListState, RecommendUserListState> {
                    final /* synthetic */ List $list;
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(78174);
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
                        RecommendUserListState recommendUserListState2 = recommendUserListState;
                        l.d(recommendUserListState2, "");
                        return RecommendUserListState.copy$default(recommendUserListState2, null, null, false, 0, null, null, ListState.copy$default(recommendUserListState2.getSubstate(), null, RecommendUserListViewModel.a(this.$list), null, null, null, 29, null), 63, null);
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
                        this.f120181a.this$0.c(new a(arrayList, this));
                    }
                }
            });
            return h.z.f158842a;
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.b<RecommendUserListState, RecommendUserListState> {
        final /* synthetic */ a $params;

        static {
            Covode.recordClassIndex(78177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(a aVar) {
            super(1);
            this.$params = aVar;
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

    public static final class b extends h.f.b.m implements h.f.a.b<RecommendUserListState, RecommendUserListState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f120176a = new b();

        static {
            Covode.recordClassIndex(78166);
        }

        b() {
            super(1);
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
                if (!(t instanceof RecommendContact)) {
                    arrayList.add(t);
                }
            }
            return RecommendUserListState.copy$default(recommendUserListState2, null, null, false, 0, null, null, ListState.copy$default(recommendUserListState2.getSubstate(), null, arrayList, null, null, null, 29, null), 63, null);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<RecommendUserListState, t<p<? extends List<? extends User>, ? extends o>>> {
        final /* synthetic */ RecommendUserListViewModel this$0;

        static {
            Covode.recordClassIndex(78169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(RecommendUserListViewModel recommendUserListViewModel) {
            super(1);
            this.this$0 = recommendUserListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends User>, ? extends o>> invoke(RecommendUserListState recommendUserListState) {
            String userId;
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            l.d(recommendUserListState2, "");
            com.ss.android.ugc.aweme.friends.g.a aVar = this.this$0.f120175a;
            Integer valueOf = Integer.valueOf(recommendUserListState2.getSubstate().getPayload().f39460b);
            String str = null;
            if (recommendUserListState2.isMySelf()) {
                userId = null;
            } else {
                userId = recommendUserListState2.getUserId();
            }
            int recommendUserType = recommendUserListState2.getRecommendUserType();
            Integer valueOf2 = Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.d.a());
            String reportId = recommendUserListState2.getReportId();
            if (!recommendUserListState2.isMySelf()) {
                str = recommendUserListState2.getSecUserId();
            }
            t<R> d2 = aVar.a(30, valueOf, userId, recommendUserType, 0, valueOf2, reportId, 2, str).d(AnonymousClass1.f120179a);
            l.b(d2, "");
            return d2;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<RecommendUserListState, t<p<? extends List<? extends User>, ? extends o>>> {
        final /* synthetic */ RecommendUserListViewModel this$0;

        static {
            Covode.recordClassIndex(78175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(RecommendUserListViewModel recommendUserListViewModel) {
            super(1);
            this.this$0 = recommendUserListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends User>, ? extends o>> invoke(RecommendUserListState recommendUserListState) {
            String userId;
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            l.d(recommendUserListState2, "");
            com.ss.android.ugc.aweme.friends.g.a aVar = this.this$0.f120175a;
            String str = null;
            if (recommendUserListState2.isMySelf()) {
                userId = null;
            } else {
                userId = recommendUserListState2.getUserId();
            }
            int recommendUserType = recommendUserListState2.getRecommendUserType();
            Integer valueOf = Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.d.a());
            String reportId = recommendUserListState2.getReportId();
            if (!recommendUserListState2.isMySelf()) {
                str = recommendUserListState2.getSecUserId();
            }
            t<R> d2 = aVar.a(30, 0, userId, recommendUserType, 0, valueOf, reportId, 2, str).d(new f.a.d.g(this) {
                /* class com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f120182a;

                static {
                    Covode.recordClassIndex(78176);
                }

                {
                    this.f120182a = r1;
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    RecommendList recommendList = (RecommendList) obj;
                    l.d(recommendList, "");
                    return v.a(RecommendUserListViewModel.a(recommendList.getUserList()), new o(recommendList.hasMore(), recommendList.getCursor()));
                }
            });
            l.b(d2, "");
            return d2;
        }
    }

    static final class f extends h.f.b.m implements m<List<? extends User>, List<? extends User>, List<User>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f120180a = new f();

        static {
            Covode.recordClassIndex(78171);
        }

        f() {
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
            arrayList.addAll(list3);
            com.ss.android.ugc.aweme.l.a.a(arrayList, list4);
            return arrayList;
        }
    }
}
