package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.aj;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.experiment.gb;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.t;
import h.a.n;
import h.f.b.z;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public final class FollowingRelationViewModel extends JediViewModel<FollowingRelationState> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f96633f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.following.repository.c f96634a = new com.ss.android.ugc.aweme.following.repository.c();

    /* renamed from: b  reason: collision with root package name */
    public boolean f96635b;

    /* renamed from: c  reason: collision with root package name */
    public int f96636c;

    /* renamed from: d  reason: collision with root package name */
    public final int f96637d;

    /* renamed from: e  reason: collision with root package name */
    public final ListMiddleware<FollowingRelationState, Object, com.ss.android.ugc.aweme.following.repository.f> f96638e;

    static {
        Covode.recordClassIndex(61280);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61281);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        ListMiddleware<FollowingRelationState, Object, com.ss.android.ugc.aweme.following.repository.f> listMiddleware = this.f96638e;
        listMiddleware.a(b.f96656a, b.f96639a);
        a(listMiddleware);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ FollowingRelationState d() {
        return new FollowingRelationState(null, null, false, null, null, false, 0, null, null, null, 1023, null);
    }

    @Override // androidx.lifecycle.ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        c(l.f96646a);
        super.onCleared();
        f.a.b.b bVar = this.f96634a.f96362d;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f96634a.f39267a.bn_();
    }

    public FollowingRelationViewModel() {
        int i2 = 1;
        this.f96635b = true;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        this.f96637d = !g2.isUidContactPermisioned() ? 2 : i2;
        this.f96638e = new ListMiddleware<>(new i(this), new j(this), h.f96640a, k.f96645a);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<FollowingRelationState, z> {
        final /* synthetic */ z.a $lastHotsoonHasMore;
        final /* synthetic */ z.e $lastHotsoonText;

        static {
            Covode.recordClassIndex(61284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(z.a aVar, z.e eVar) {
            super(1);
            this.$lastHotsoonHasMore = aVar;
            this.$lastHotsoonText = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(FollowingRelationState followingRelationState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            h.f.b.l.d(followingRelationState2, "");
            this.$lastHotsoonHasMore.element = followingRelationState2.isHotsoonHasMore();
            this.$lastHotsoonText.element = (T) followingRelationState2.getHotsoonText();
            return h.z.f158842a;
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<FollowingRelationState, h.z> {
        final /* synthetic */ String $des;
        final /* synthetic */ FollowingRelationViewModel this$0;

        static {
            Covode.recordClassIndex(61287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(FollowingRelationViewModel followingRelationViewModel, String str) {
            super(1);
            this.this$0 = followingRelationViewModel;
            this.$des = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(FollowingRelationState followingRelationState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            h.f.b.l.d(followingRelationState2, "");
            this.this$0.f96638e.a(0, new com.ss.android.ugc.aweme.following.a.e(7, followingRelationState2.isSelf(), this.$des));
            return h.z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<FollowingRelationState, FollowingRelationState> {
        final /* synthetic */ List $recommendList;

        static {
            Covode.recordClassIndex(61295);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(List list) {
            super(1);
            this.$recommendList = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FollowingRelationState invoke(FollowingRelationState followingRelationState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            h.f.b.l.d(followingRelationState2, "");
            return FollowingRelationState.copy$default(followingRelationState2, null, null, false, this.$recommendList, null, false, 0, null, null, null, 1015, null);
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<FollowingRelationState, h.z> {
        final /* synthetic */ FollowingRelationViewModel this$0;

        static {
            Covode.recordClassIndex(61286);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(FollowingRelationViewModel followingRelationViewModel) {
            super(1);
            this.this$0 = followingRelationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(FollowingRelationState followingRelationState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            h.f.b.l.d(followingRelationState2, "");
            this.this$0.f96638e.a(followingRelationState2.getListState().getList().size(), new com.ss.android.ugc.aweme.following.a.e(9, followingRelationState2.isSelf()));
            return h.z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<FollowingRelationState, t<p<? extends List<? extends Object>, ? extends com.ss.android.ugc.aweme.following.repository.f>>> {
        final /* synthetic */ FollowingRelationViewModel this$0;

        static {
            Covode.recordClassIndex(61289);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(FollowingRelationViewModel followingRelationViewModel) {
            super(1);
            this.this$0 = followingRelationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends Object>, ? extends com.ss.android.ugc.aweme.following.repository.f>> invoke(FollowingRelationState followingRelationState) {
            final FollowingRelationState followingRelationState2 = followingRelationState;
            h.f.b.l.d(followingRelationState2, "");
            this.this$0.f96635b = true;
            com.ss.android.ugc.aweme.following.repository.c cVar = this.this$0.f96634a;
            String userId = followingRelationState2.getUserId();
            String secUserId = followingRelationState2.getSecUserId();
            followingRelationState2.isSelf();
            t<R> d2 = cVar.a(userId, secUserId, 0, 0, FollowingRelationViewModel.a(true, true), this.this$0.f96637d, 0, this.this$0.f96636c).d(new f.a.d.g(this) {
                /* class com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel.i.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ i f96641a;

                static {
                    Covode.recordClassIndex(61290);
                }

                {
                    this.f96641a = r1;
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    int i2;
                    int i3;
                    com.ss.android.ugc.aweme.following.a.c cVar = (com.ss.android.ugc.aweme.following.a.c) obj;
                    h.f.b.l.d(cVar, "");
                    this.f96641a.this$0.a(cVar, true);
                    this.f96641a.this$0.a(cVar);
                    List<User> list = cVar.f96327a;
                    h.f.b.l.b(list, "");
                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                    for (T t : list) {
                        h.f.b.l.b(t, "");
                        t.setRequestId(cVar.extra.logid);
                        arrayList.add(new com.ss.android.ugc.aweme.following.a.g(0, t));
                    }
                    boolean z = cVar.f96329c;
                    int i4 = cVar.f96332f;
                    long j2 = cVar.f96331e;
                    boolean z2 = cVar.f96333g;
                    if (this.f96641a.this$0.f96635b) {
                        i2 = 1;
                    } else {
                        i2 = 1 + followingRelationState2.getListState().getPayload().f96371e;
                    }
                    List<User> list2 = cVar.f96327a;
                    if (list2 != null) {
                        i3 = list2.size();
                    } else {
                        i3 = 0;
                    }
                    return v.a(arrayList, new com.ss.android.ugc.aweme.following.repository.f(z, i4, j2, z2, i2, i3));
                }
            });
            h.f.b.l.b(d2, "");
            return d2;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<FollowingRelationState, FollowingRelationState> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f96646a = new l();

        static {
            Covode.recordClassIndex(61294);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FollowingRelationState invoke(FollowingRelationState followingRelationState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            h.f.b.l.d(followingRelationState2, "");
            return FollowingRelationState.copy$default(followingRelationState2, null, null, false, null, ListState.copy$default(followingRelationState2.getListState(), null, null, new aj(h.a.z.INSTANCE), new aj(h.a.z.INSTANCE), null, 19, null), false, 0, null, null, null, 1007, null);
        }
    }

    public final void a(com.ss.android.ugc.aweme.following.a.c cVar) {
        z.a aVar = new z.a();
        aVar.element = false;
        z.e eVar = new z.e();
        eVar.element = "";
        b_(new d(aVar, eVar));
        c(new e(aVar, cVar, eVar));
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<FollowingRelationState, FollowingRelationState> {
        final /* synthetic */ z.a $lastHotsoonHasMore;
        final /* synthetic */ z.e $lastHotsoonText;
        final /* synthetic */ com.ss.android.ugc.aweme.following.a.c $resp;

        static {
            Covode.recordClassIndex(61285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(z.a aVar, com.ss.android.ugc.aweme.following.a.c cVar, z.e eVar) {
            super(1);
            this.$lastHotsoonHasMore = aVar;
            this.$resp = cVar;
            this.$lastHotsoonText = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FollowingRelationState invoke(FollowingRelationState followingRelationState) {
            boolean z;
            T t;
            FollowingRelationState followingRelationState2 = followingRelationState;
            h.f.b.l.d(followingRelationState2, "");
            if (this.$lastHotsoonHasMore.element || this.$resp.a()) {
                z = true;
            } else {
                z = false;
            }
            int i2 = this.$resp.f96334h;
            String str = this.$resp.f96335i;
            if (str == null || str.length() == 0) {
                t = this.$lastHotsoonText.element;
            } else {
                t = this.$resp.f96335i;
            }
            h.f.b.l.b(t, "");
            return FollowingRelationState.copy$default(followingRelationState2, null, null, false, null, null, z, i2, t, null, null, 799, null);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<FollowingRelationState, t<p<? extends List<? extends Object>, ? extends com.ss.android.ugc.aweme.following.repository.f>>> {
        final /* synthetic */ FollowingRelationViewModel this$0;

        static {
            Covode.recordClassIndex(61291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(FollowingRelationViewModel followingRelationViewModel) {
            super(1);
            this.this$0 = followingRelationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends Object>, ? extends com.ss.android.ugc.aweme.following.repository.f>> invoke(FollowingRelationState followingRelationState) {
            final FollowingRelationState followingRelationState2 = followingRelationState;
            h.f.b.l.d(followingRelationState2, "");
            this.this$0.f96635b = false;
            com.ss.android.ugc.aweme.following.repository.c cVar = this.this$0.f96634a;
            String userId = followingRelationState2.getUserId();
            String secUserId = followingRelationState2.getSecUserId();
            long j2 = followingRelationState2.getListState().getPayload().f96369c;
            int i2 = followingRelationState2.getListState().getPayload().f39460b;
            followingRelationState2.isSelf();
            t<R> d2 = cVar.a(userId, secUserId, j2, i2, FollowingRelationViewModel.a(false, followingRelationState2.getListState().getPayload().f96370d), this.this$0.f96637d, followingRelationState2.getVcdCount(), this.this$0.f96636c).d(new f.a.d.g(this) {
                /* class com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel.j.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ j f96643a;

                static {
                    Covode.recordClassIndex(61292);
                }

                {
                    this.f96643a = r1;
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    int i2;
                    int i3;
                    com.ss.android.ugc.aweme.following.a.c cVar = (com.ss.android.ugc.aweme.following.a.c) obj;
                    h.f.b.l.d(cVar, "");
                    this.f96643a.this$0.a(cVar);
                    this.f96643a.this$0.a(cVar, false);
                    List<User> list = cVar.f96327a;
                    h.f.b.l.b(list, "");
                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                    for (T t : list) {
                        h.f.b.l.b(t, "");
                        arrayList.add(new com.ss.android.ugc.aweme.following.a.g(0, t));
                    }
                    boolean z = cVar.f96329c;
                    int i4 = cVar.f96332f;
                    long j2 = cVar.f96331e;
                    boolean z2 = cVar.f96333g;
                    if (this.f96643a.this$0.f96635b) {
                        i2 = 1;
                    } else {
                        i2 = followingRelationState2.getListState().getPayload().f96371e + 1;
                    }
                    List<User> list2 = cVar.f96327a;
                    if (list2 != null) {
                        i3 = list2.size();
                    } else {
                        i3 = 0;
                    }
                    return v.a(arrayList, new com.ss.android.ugc.aweme.following.repository.f(z, i4, j2, z2, i2, i3));
                }
            });
            h.f.b.l.b(d2, "");
            return d2;
        }
    }

    public final void a(List<? extends Object> list) {
        h.f.b.l.d(list, "");
        c(new m(list));
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<FollowingRelationState, FollowingRelationState> {
        final /* synthetic */ boolean $isRefresh$inlined;
        final /* synthetic */ com.ss.android.ugc.aweme.following.a.c $this_run;
        final /* synthetic */ FollowingRelationViewModel this$0;

        static {
            Covode.recordClassIndex(61283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.ss.android.ugc.aweme.following.a.c cVar, FollowingRelationViewModel followingRelationViewModel, boolean z) {
            super(1);
            this.$this_run = cVar;
            this.this$0 = followingRelationViewModel;
            this.$isRefresh$inlined = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FollowingRelationState invoke(FollowingRelationState followingRelationState) {
            List<User> g2;
            FollowingRelationState followingRelationState2 = followingRelationState;
            h.f.b.l.d(followingRelationState2, "");
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            if (!this.$isRefresh$inlined) {
                hashMap.putAll(followingRelationState2.getUnreadCountMap());
                arrayList.addAll(followingRelationState2.getUnreadUidList());
            }
            List<User> list = this.$this_run.f96327a;
            if (!(list == null || (g2 = n.g((Iterable) list)) == null)) {
                for (User user : g2) {
                    if (user.getUnReadVideoInfo() != null) {
                        user.getUid();
                        user.getUnReadVideoCount();
                        if (user.getUnReadVideoCount() > 0) {
                            String uid = user.getUid();
                            h.f.b.l.b(uid, "");
                            hashMap.put(uid, Integer.valueOf(user.getUnReadVideoCount()));
                            String uid2 = user.getUid();
                            h.f.b.l.b(uid2, "");
                            arrayList.add(uid2);
                        }
                    }
                }
            }
            return FollowingRelationState.copy$default(followingRelationState2, null, null, false, null, null, false, 0, null, hashMap, arrayList, 255, null);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f96640a = new h();

        static {
            Covode.recordClassIndex(61288);
        }

        h() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ List<? extends Object> invoke(List<? extends Object> list, List<? extends Object> list2) {
            h.f.b.l.d(list, "");
            h.f.b.l.d(list2, "");
            return list2;
        }
    }

    public static int a(boolean z, boolean z2) {
        if (z) {
            if (gb.a()) {
                return 2;
            }
            return 1;
        } else if (z2) {
            return 2;
        } else {
            return 1;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.m<FollowingRelationState, ListState<Object, com.ss.android.ugc.aweme.following.repository.f>, FollowingRelationState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f96639a = new b();

        static {
            Covode.recordClassIndex(61282);
        }

        b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ FollowingRelationState invoke(FollowingRelationState followingRelationState, ListState<Object, com.ss.android.ugc.aweme.following.repository.f> listState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            ListState<Object, com.ss.android.ugc.aweme.following.repository.f> listState2 = listState;
            h.f.b.l.d(followingRelationState2, "");
            h.f.b.l.d(listState2, "");
            return FollowingRelationState.copy$default(followingRelationState2, null, null, false, null, listState2, false, 0, null, null, null, 1007, null);
        }
    }

    public final void a(com.ss.android.ugc.aweme.following.a.c cVar, boolean z) {
        if (cVar != null) {
            c(new c(cVar, this, z));
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f96645a = new k();

        static {
            Covode.recordClassIndex(61293);
        }

        k() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ List<? extends Object> invoke(List<? extends Object> list, List<? extends Object> list2) {
            List<? extends Object> list3 = list;
            List<? extends Object> list4 = list2;
            h.f.b.l.d(list3, "");
            h.f.b.l.d(list4, "");
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (T t : list3) {
                if (t instanceof com.ss.android.ugc.aweme.following.a.g) {
                    T t2 = t;
                    if (hashSet.add(t2.f96343b.getUid())) {
                        arrayList.add(com.ss.android.ugc.aweme.following.a.g.a(t2, i2));
                        i2++;
                    }
                }
                arrayList.add(t);
            }
            for (T t3 : list4) {
                Objects.requireNonNull(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.following.model.RelationUser");
                T t4 = t3;
                if (hashSet.add(t4.f96343b.getUid())) {
                    arrayList.add(com.ss.android.ugc.aweme.following.a.g.a(t4, i2));
                    i2++;
                }
            }
            return arrayList;
        }
    }

    public final boolean a(boolean z, int i2, int i3) {
        if (!z || (i2 != 1 ? i2 != 2 || i3 >= 5 : i3 >= 15)) {
            return false;
        }
        this.f96638e.loadMore();
        return true;
    }
}
