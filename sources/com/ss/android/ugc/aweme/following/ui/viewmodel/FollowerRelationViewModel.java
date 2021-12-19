package com.ss.android.ugc.aweme.following.ui.viewmodel;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.experiment.gb;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.t;
import h.f.b.z;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class FollowerRelationViewModel extends JediViewModel<FollowerRelationState> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f96623d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.following.repository.b f96624a = new com.ss.android.ugc.aweme.following.repository.b();

    /* renamed from: b  reason: collision with root package name */
    public boolean f96625b = true;

    /* renamed from: c  reason: collision with root package name */
    public final ListMiddleware<FollowerRelationState, Object, com.ss.android.ugc.aweme.following.repository.f> f96626c = new ListMiddleware<>(new j(this), new k(this), null, l.f96632a, 4);

    static {
        Covode.recordClassIndex(61261);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61262);
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
        ListMiddleware<FollowerRelationState, Object, com.ss.android.ugc.aweme.following.repository.f> listMiddleware = this.f96626c;
        listMiddleware.a(a.f96655a, b.f96627a);
        a(listMiddleware);
    }

    @Override // androidx.lifecycle.ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        this.f96624a.f39267a.bn_();
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ FollowerRelationState d() {
        return new FollowerRelationState(null, null, null, null, false, 0, null, null, null, 511, null);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<FollowerRelationState, z> {
        final /* synthetic */ z.a $lastHotsoonHasMore;
        final /* synthetic */ z.e $lastHotsoonText;

        static {
            Covode.recordClassIndex(61265);
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
        public final /* synthetic */ h.z invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            this.$lastHotsoonHasMore.element = followerRelationState2.isHotsoonHasMore();
            this.$lastHotsoonText.element = (T) followerRelationState2.getHotsoonText();
            return h.z.f158842a;
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.b<FollowerRelationState, FollowerRelationState> {
        final /* synthetic */ List $recommendList;

        static {
            Covode.recordClassIndex(61278);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(List list) {
            super(1);
            this.$recommendList = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FollowerRelationState invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            return FollowerRelationState.copy$default(followerRelationState2, null, null, this.$recommendList, null, false, 0, null, null, null, 507, null);
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<FollowerRelationState, h.z> {
        final /* synthetic */ String $des;
        final /* synthetic */ FollowerRelationViewModel this$0;

        static {
            Covode.recordClassIndex(61267);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(FollowerRelationViewModel followerRelationViewModel, String str) {
            super(1);
            this.this$0 = followerRelationViewModel;
            this.$des = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            final ArrayList arrayList = new ArrayList();
            String userId = followerRelationState2.getUserId();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            arrayList.add(new com.ss.android.ugc.aweme.following.a.e(8, TextUtils.equals(userId, g2.getCurUserId()), this.$des));
            this.this$0.c(new h.f.a.b<FollowerRelationState, FollowerRelationState>() {
                /* class com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(61268);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ FollowerRelationState invoke(FollowerRelationState followerRelationState) {
                    FollowerRelationState followerRelationState2 = followerRelationState;
                    h.f.b.l.d(followerRelationState2, "");
                    return FollowerRelationState.copy$default(followerRelationState2, null, null, null, ListState.copy$default(followerRelationState2.getListState(), null, arrayList, null, null, null, 29, null), false, 0, null, null, null, 503, null);
                }
            });
            return h.z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<FollowerRelationState, h.z> {
        final /* synthetic */ String $des;
        final /* synthetic */ FollowerRelationViewModel this$0;

        static {
            Covode.recordClassIndex(61270);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(FollowerRelationViewModel followerRelationViewModel, String str) {
            super(1);
            this.this$0 = followerRelationViewModel;
            this.$des = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            ListMiddleware<FollowerRelationState, Object, com.ss.android.ugc.aweme.following.repository.f> listMiddleware = this.this$0.f96626c;
            int size = followerRelationState2.getListState().getList().size();
            String userId = followerRelationState2.getUserId();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            listMiddleware.a(size, new com.ss.android.ugc.aweme.following.a.e(11, TextUtils.equals(userId, g2.getCurUserId()), this.$des));
            return h.z.f158842a;
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.b<FollowerRelationState, h.z> {
        final /* synthetic */ FollowerRelationViewModel this$0;

        static {
            Covode.recordClassIndex(61271);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(FollowerRelationViewModel followerRelationViewModel) {
            super(1);
            this.this$0 = followerRelationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            ListMiddleware<FollowerRelationState, Object, com.ss.android.ugc.aweme.following.repository.f> listMiddleware = this.this$0.f96626c;
            int size = followerRelationState2.getListState().getList().size();
            String userId = followerRelationState2.getUserId();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            listMiddleware.a(size, new com.ss.android.ugc.aweme.following.a.e(10, TextUtils.equals(userId, g2.getCurUserId())));
            return h.z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<FollowerRelationState, t<p<? extends List<? extends Object>, ? extends com.ss.android.ugc.aweme.following.repository.f>>> {
        final /* synthetic */ FollowerRelationViewModel this$0;

        static {
            Covode.recordClassIndex(61272);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(FollowerRelationViewModel followerRelationViewModel) {
            super(1);
            this.this$0 = followerRelationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends Object>, ? extends com.ss.android.ugc.aweme.following.repository.f>> invoke(FollowerRelationState followerRelationState) {
            final FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            this.this$0.f96625b = true;
            t<R> d2 = this.this$0.f96624a.a(followerRelationState2.getUserId(), followerRelationState2.getSecUserId(), 0, 0, FollowerRelationViewModel.a(true, true), com.ss.android.ugc.aweme.utils.permission.d.a(), 0).d(new f.a.d.g(this) {
                /* class com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel.j.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ j f96628a;

                static {
                    Covode.recordClassIndex(61273);
                }

                {
                    this.f96628a = r1;
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    int i2;
                    int i3;
                    com.ss.android.ugc.aweme.following.a.b bVar = (com.ss.android.ugc.aweme.following.a.b) obj;
                    h.f.b.l.d(bVar, "");
                    this.f96628a.this$0.a(bVar);
                    this.f96628a.this$0.a(bVar, true);
                    List<User> list = bVar.f96315a;
                    h.f.b.l.b(list, "");
                    ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
                    for (T t : list) {
                        h.f.b.l.b(t, "");
                        t.setRequestId(bVar.extra.logid);
                        arrayList.add(new com.ss.android.ugc.aweme.following.a.g(1, t));
                    }
                    boolean z = bVar.f96317c;
                    int i4 = bVar.f96321g;
                    long j2 = bVar.f96319e;
                    boolean z2 = bVar.f96322h;
                    if (this.f96628a.this$0.f96625b) {
                        i2 = 1;
                    } else {
                        i2 = 1 + followerRelationState2.getListState().getPayload().f96371e;
                    }
                    List<User> list2 = bVar.f96315a;
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

    public final void a(com.ss.android.ugc.aweme.following.a.b bVar) {
        z.a aVar = new z.a();
        aVar.element = false;
        z.e eVar = new z.e();
        eVar.element = "";
        b_(new d(aVar, eVar));
        c(new e(aVar, bVar, eVar));
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<FollowerRelationState, FollowerRelationState> {
        final /* synthetic */ z.a $lastHotsoonHasMore;
        final /* synthetic */ z.e $lastHotsoonText;
        final /* synthetic */ com.ss.android.ugc.aweme.following.a.b $resp;

        static {
            Covode.recordClassIndex(61266);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(z.a aVar, com.ss.android.ugc.aweme.following.a.b bVar, z.e eVar) {
            super(1);
            this.$lastHotsoonHasMore = aVar;
            this.$resp = bVar;
            this.$lastHotsoonText = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FollowerRelationState invoke(FollowerRelationState followerRelationState) {
            boolean z;
            T t;
            FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            if (this.$lastHotsoonHasMore.element || this.$resp.f96324j == 1) {
                z = true;
            } else {
                z = false;
            }
            int i2 = this.$resp.f96326l;
            String str = this.$resp.f96325k;
            if (str == null || str.length() == 0) {
                t = this.$lastHotsoonText.element;
            } else {
                t = this.$resp.f96325k;
            }
            h.f.b.l.b(t, "");
            return FollowerRelationState.copy$default(followerRelationState2, null, null, null, null, z, i2, t, null, null, 399, null);
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<FollowerRelationState, h.z> {
        final /* synthetic */ String $des;
        final /* synthetic */ FollowerRelationViewModel this$0;

        static {
            Covode.recordClassIndex(61269);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(FollowerRelationViewModel followerRelationViewModel, String str) {
            super(1);
            this.this$0 = followerRelationViewModel;
            this.$des = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            ListMiddleware<FollowerRelationState, Object, com.ss.android.ugc.aweme.following.repository.f> listMiddleware = this.this$0.f96626c;
            int size = followerRelationState2.getListState().getList().size();
            String userId = followerRelationState2.getUserId();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            String userId2 = followerRelationState2.getUserId();
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g3, "");
            List b2 = h.a.n.b(new com.ss.android.ugc.aweme.following.a.e(11, TextUtils.equals(userId, g2.getCurUserId()), this.$des), new com.ss.android.ugc.aweme.following.a.e(10, TextUtils.equals(userId2, g3.getCurUserId())));
            h.f.b.l.c(b2, "");
            listMiddleware.a(new ListMiddleware.d(listMiddleware, size, b2));
            return h.z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<FollowerRelationState, t<p<? extends List<? extends Object>, ? extends com.ss.android.ugc.aweme.following.repository.f>>> {
        final /* synthetic */ FollowerRelationViewModel this$0;

        static {
            Covode.recordClassIndex(61274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(FollowerRelationViewModel followerRelationViewModel) {
            super(1);
            this.this$0 = followerRelationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends Object>, ? extends com.ss.android.ugc.aweme.following.repository.f>> invoke(FollowerRelationState followerRelationState) {
            final FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            this.this$0.f96625b = false;
            t<R> d2 = this.this$0.f96624a.a(followerRelationState2.getUserId(), followerRelationState2.getSecUserId(), followerRelationState2.getListState().getPayload().f96369c, followerRelationState2.getListState().getPayload().f39460b, FollowerRelationViewModel.a(false, followerRelationState2.getListState().getPayload().f96370d), com.ss.android.ugc.aweme.utils.permission.d.a(), followerRelationState2.getVcdCount()).d(new f.a.d.g(this) {
                /* class com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel.k.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ k f96630a;

                static {
                    Covode.recordClassIndex(61275);
                }

                {
                    this.f96630a = r1;
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    int i2;
                    int i3;
                    com.ss.android.ugc.aweme.following.a.b bVar = (com.ss.android.ugc.aweme.following.a.b) obj;
                    h.f.b.l.d(bVar, "");
                    this.f96630a.this$0.a(bVar);
                    this.f96630a.this$0.a(bVar, false);
                    List<User> list = bVar.f96315a;
                    h.f.b.l.b(list, "");
                    ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
                    for (T t : list) {
                        h.f.b.l.b(t, "");
                        arrayList.add(new com.ss.android.ugc.aweme.following.a.g(1, t));
                    }
                    boolean z = bVar.f96317c;
                    int i4 = bVar.f96321g;
                    long j2 = bVar.f96319e;
                    boolean z2 = bVar.f96322h;
                    if (this.f96630a.this$0.f96625b) {
                        i2 = 1;
                    } else {
                        i2 = 1 + followerRelationState2.getListState().getPayload().f96371e;
                    }
                    List<User> list2 = bVar.f96315a;
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

    public static final class m extends h.f.b.m implements h.f.a.b<FollowerRelationState, h.z> {
        final /* synthetic */ String $uid;
        final /* synthetic */ FollowerRelationViewModel this$0;

        static {
            Covode.recordClassIndex(61277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(FollowerRelationViewModel followerRelationViewModel, String str) {
            super(1);
            this.this$0 = followerRelationViewModel;
            this.$uid = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            Iterator<Object> it = followerRelationState2.getListState().getList().iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!(next instanceof com.ss.android.ugc.aweme.following.a.g) || !h.f.b.l.a((Object) ((com.ss.android.ugc.aweme.following.a.g) next).f96343b.getUid(), (Object) this.$uid)) {
                    i2++;
                } else if (i2 != -1) {
                    List<? extends Object> g2 = h.a.n.g((Collection) followerRelationState2.getListState().getList());
                    g2.remove(i2);
                    this.this$0.f96626c.a(g2);
                }
            }
            return h.z.f158842a;
        }
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        b_(new h(this, str));
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<FollowerRelationState, FollowerRelationState> {
        final /* synthetic */ boolean $isRefresh$inlined;
        final /* synthetic */ com.ss.android.ugc.aweme.following.a.b $this_run;
        final /* synthetic */ FollowerRelationViewModel this$0;

        static {
            Covode.recordClassIndex(61264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.ss.android.ugc.aweme.following.a.b bVar, FollowerRelationViewModel followerRelationViewModel, boolean z) {
            super(1);
            this.$this_run = bVar;
            this.this$0 = followerRelationViewModel;
            this.$isRefresh$inlined = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FollowerRelationState invoke(FollowerRelationState followerRelationState) {
            List<User> g2;
            FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            if (!this.$isRefresh$inlined) {
                hashMap.putAll(followerRelationState2.getUnreadCountMap());
                arrayList.addAll(followerRelationState2.getUnreadUidList());
            }
            List<User> list = this.$this_run.f96315a;
            if (!(list == null || (g2 = h.a.n.g((Iterable) list)) == null)) {
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
            return FollowerRelationState.copy$default(followerRelationState2, null, null, null, null, false, 0, null, hashMap, arrayList, 127, null);
        }
    }

    public final void a(com.ss.android.ugc.aweme.following.a.b bVar, boolean z) {
        if (bVar != null) {
            c(new c(bVar, this, z));
        }
    }

    static final class b extends h.f.b.m implements h.f.a.m<FollowerRelationState, ListState<Object, com.ss.android.ugc.aweme.following.repository.f>, FollowerRelationState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f96627a = new b();

        static {
            Covode.recordClassIndex(61263);
        }

        b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ FollowerRelationState invoke(FollowerRelationState followerRelationState, ListState<Object, com.ss.android.ugc.aweme.following.repository.f> listState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            ListState<Object, com.ss.android.ugc.aweme.following.repository.f> listState2 = listState;
            h.f.b.l.d(followerRelationState2, "");
            h.f.b.l.d(listState2, "");
            return FollowerRelationState.copy$default(followerRelationState2, null, null, null, listState2, false, 0, null, null, null, 503, null);
        }
    }

    public static int a(boolean z, boolean z2) {
        if (gb.a()) {
            if (z) {
                return 2;
            }
        } else if (z) {
            return 1;
        }
        if (z2) {
            return 2;
        }
        return 1;
    }

    static final class l extends h.f.b.m implements h.f.a.m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f96632a = new l();

        static {
            Covode.recordClassIndex(61276);
        }

        l() {
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
        this.f96626c.loadMore();
        return true;
    }
}
