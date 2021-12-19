package com.ss.android.ugc.aweme.notificationlive.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.aj;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public final class PushSettingNotificationChoiceViewModel extends JediViewModel<NotificationChoiceState> {

    /* renamed from: g  reason: collision with root package name */
    public static final a f114384g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.notificationlive.repository.d f114385a = new com.ss.android.ugc.aweme.notificationlive.repository.d();

    /* renamed from: b  reason: collision with root package name */
    public boolean f114386b;

    /* renamed from: c  reason: collision with root package name */
    public final int f114387c;

    /* renamed from: d  reason: collision with root package name */
    public final int f114388d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f114389e;

    /* renamed from: f  reason: collision with root package name */
    public final ListMiddleware<NotificationChoiceState, Object, com.ss.android.ugc.aweme.following.repository.f> f114390f;

    static {
        Covode.recordClassIndex(73580);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73581);
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
        ListMiddleware<NotificationChoiceState, Object, com.ss.android.ugc.aweme.following.repository.f> listMiddleware = this.f114390f;
        listMiddleware.a(j.f114472a, b.f114391a);
        a(listMiddleware);
    }

    @Override // androidx.lifecycle.ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        c(j.f114398a);
        super.onCleared();
        this.f114385a.f39267a.bn_();
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ NotificationChoiceState d() {
        return new NotificationChoiceState(null, null, false, null, false, 0, null, false, null, null, 1023, null);
    }

    public PushSettingNotificationChoiceViewModel() {
        int i2 = 1;
        this.f114386b = true;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        this.f114388d = !g2.isUidContactPermisioned() ? 2 : i2;
        this.f114390f = new ListMiddleware<>(new g(this), new h(this), f.f114392a, i.f114397a);
    }

    public final boolean a(boolean z) {
        if (z) {
            this.f114390f.loadMore();
        }
        return z;
    }

    public final void b(boolean z) {
        c(new k(z));
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<NotificationChoiceState, z> {
        final /* synthetic */ z.a $lastHotsoonHasMore;
        final /* synthetic */ z.e $lastHotsoonText;

        static {
            Covode.recordClassIndex(73584);
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
        public final /* synthetic */ h.z invoke(NotificationChoiceState notificationChoiceState) {
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            l.d(notificationChoiceState2, "");
            this.$lastHotsoonHasMore.element = notificationChoiceState2.isHotsoonHasMore();
            this.$lastHotsoonText.element = (T) notificationChoiceState2.getHotsoonText();
            return h.z.f158842a;
        }
    }

    static final class k extends m implements h.f.a.b<NotificationChoiceState, NotificationChoiceState> {
        final /* synthetic */ boolean $state;

        static {
            Covode.recordClassIndex(73593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(boolean z) {
            super(1);
            this.$state = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ NotificationChoiceState invoke(NotificationChoiceState notificationChoiceState) {
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            l.d(notificationChoiceState2, "");
            return NotificationChoiceState.copy$default(notificationChoiceState2, null, null, false, null, false, 0, null, this.$state, null, null, 895, null);
        }
    }

    static final class g extends m implements h.f.a.b<NotificationChoiceState, t<p<? extends List<? extends Object>, ? extends com.ss.android.ugc.aweme.following.repository.f>>> {
        final /* synthetic */ PushSettingNotificationChoiceViewModel this$0;

        static {
            Covode.recordClassIndex(73587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel) {
            super(1);
            this.this$0 = pushSettingNotificationChoiceViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends Object>, ? extends com.ss.android.ugc.aweme.following.repository.f>> invoke(NotificationChoiceState notificationChoiceState) {
            final NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            l.d(notificationChoiceState2, "");
            this.this$0.f114386b = true;
            t<R> d2 = this.this$0.f114385a.a(notificationChoiceState2.getUserId(), notificationChoiceState2.getSecUserId(), 0, 0, this.this$0.f114388d, 0, this.this$0.f114387c).d(new f.a.d.g(this) {
                /* class com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f114393a;

                static {
                    Covode.recordClassIndex(73588);
                }

                {
                    this.f114393a = r1;
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    int i2;
                    int i3;
                    com.ss.android.ugc.aweme.following.a.c cVar = (com.ss.android.ugc.aweme.following.a.c) obj;
                    l.d(cVar, "");
                    this.f114393a.this$0.a(cVar, true);
                    this.f114393a.this$0.a(cVar);
                    boolean z = cVar.f96329c;
                    int i4 = cVar.f96332f;
                    long j2 = cVar.f96331e;
                    boolean z2 = cVar.f96333g;
                    if (this.f114393a.this$0.f114386b) {
                        i2 = 1;
                    } else {
                        i2 = notificationChoiceState2.getListState().getPayload().f96371e + 1;
                    }
                    List<User> list = cVar.f96327a;
                    if (list != null) {
                        i3 = list.size();
                    } else {
                        i3 = 0;
                    }
                    com.ss.android.ugc.aweme.following.repository.f fVar = new com.ss.android.ugc.aweme.following.repository.f(z, i4, j2, z2, i2, i3);
                    List<User> list2 = cVar.f96327a;
                    l.b(list2, "");
                    ArrayList arrayList = new ArrayList(n.a((Iterable) list2, 10));
                    for (T t : list2) {
                        l.b(t, "");
                        arrayList.add(new com.ss.android.ugc.aweme.following.a.g(0, t));
                    }
                    List g2 = n.g((Collection) arrayList);
                    if (!g2.isEmpty()) {
                        g2.add(0, new com.ss.android.ugc.aweme.following.a.f(18, null, 2));
                        g2.add(1, new com.ss.android.ugc.aweme.following.a.f(17, null, 2));
                    } else {
                        g2.add(0, new com.ss.android.ugc.aweme.following.a.f(18, null, 2));
                    }
                    return v.a(g2, fVar);
                }
            });
            l.b(d2, "");
            return d2;
        }
    }

    static final class j extends m implements h.f.a.b<NotificationChoiceState, NotificationChoiceState> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f114398a = new j();

        static {
            Covode.recordClassIndex(73592);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ NotificationChoiceState invoke(NotificationChoiceState notificationChoiceState) {
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            l.d(notificationChoiceState2, "");
            return NotificationChoiceState.copy$default(notificationChoiceState2, null, null, false, ListState.copy$default(notificationChoiceState2.getListState(), null, null, new aj(h.a.z.INSTANCE), new aj(h.a.z.INSTANCE), null, 19, null), false, 0, null, false, null, null, 1015, null);
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
    public static final class e extends m implements h.f.a.b<NotificationChoiceState, NotificationChoiceState> {
        final /* synthetic */ z.a $lastHotsoonHasMore;
        final /* synthetic */ z.e $lastHotsoonText;
        final /* synthetic */ com.ss.android.ugc.aweme.following.a.c $resp;

        static {
            Covode.recordClassIndex(73585);
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
        public final /* synthetic */ NotificationChoiceState invoke(NotificationChoiceState notificationChoiceState) {
            boolean z;
            T t;
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            l.d(notificationChoiceState2, "");
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
            l.b(t, "");
            return NotificationChoiceState.copy$default(notificationChoiceState2, null, null, false, null, z, i2, t, false, null, null, 911, null);
        }
    }

    static final class h extends m implements h.f.a.b<NotificationChoiceState, t<p<? extends List<? extends Object>, ? extends com.ss.android.ugc.aweme.following.repository.f>>> {
        final /* synthetic */ PushSettingNotificationChoiceViewModel this$0;

        static {
            Covode.recordClassIndex(73589);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel) {
            super(1);
            this.this$0 = pushSettingNotificationChoiceViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends Object>, ? extends com.ss.android.ugc.aweme.following.repository.f>> invoke(NotificationChoiceState notificationChoiceState) {
            final NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            l.d(notificationChoiceState2, "");
            this.this$0.f114386b = false;
            t<R> d2 = this.this$0.f114385a.a(notificationChoiceState2.getUserId(), notificationChoiceState2.getSecUserId(), notificationChoiceState2.getListState().getPayload().f96369c, notificationChoiceState2.getListState().getPayload().f39460b, this.this$0.f114388d, notificationChoiceState2.getVcdCount(), this.this$0.f114387c).d(new f.a.d.g(this) {
                /* class com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f114395a;

                static {
                    Covode.recordClassIndex(73590);
                }

                {
                    this.f114395a = r1;
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    int i2;
                    int i3;
                    com.ss.android.ugc.aweme.following.a.c cVar = (com.ss.android.ugc.aweme.following.a.c) obj;
                    l.d(cVar, "");
                    this.f114395a.this$0.a(cVar);
                    this.f114395a.this$0.a(cVar, false);
                    List<User> list = cVar.f96327a;
                    l.b(list, "");
                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                    for (T t : list) {
                        l.b(t, "");
                        arrayList.add(new com.ss.android.ugc.aweme.following.a.g(0, t));
                    }
                    boolean z = cVar.f96329c;
                    int i4 = cVar.f96332f;
                    long j2 = cVar.f96331e;
                    boolean z2 = cVar.f96333g;
                    if (this.f114395a.this$0.f114386b) {
                        i2 = 1;
                    } else {
                        i2 = notificationChoiceState2.getListState().getPayload().f96371e + 1;
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
            l.b(d2, "");
            return d2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<NotificationChoiceState, NotificationChoiceState> {
        final /* synthetic */ boolean $isRefresh$inlined;
        final /* synthetic */ com.ss.android.ugc.aweme.following.a.c $this_run;
        final /* synthetic */ PushSettingNotificationChoiceViewModel this$0;

        static {
            Covode.recordClassIndex(73583);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.ss.android.ugc.aweme.following.a.c cVar, PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel, boolean z) {
            super(1);
            this.$this_run = cVar;
            this.this$0 = pushSettingNotificationChoiceViewModel;
            this.$isRefresh$inlined = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ NotificationChoiceState invoke(NotificationChoiceState notificationChoiceState) {
            List<User> g2;
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            l.d(notificationChoiceState2, "");
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            if (!this.$isRefresh$inlined) {
                hashMap.putAll(notificationChoiceState2.getUnreadCountMap());
                arrayList.addAll(notificationChoiceState2.getUnreadUidList());
            }
            List<User> list = this.$this_run.f96327a;
            if (!(list == null || (g2 = n.g((Iterable) list)) == null)) {
                for (User user : g2) {
                    if (user.getUnReadVideoInfo() != null) {
                        user.getUid();
                        user.getUnReadVideoCount();
                        if (user.getUnReadVideoCount() > 0) {
                            String uid = user.getUid();
                            l.b(uid, "");
                            hashMap.put(uid, Integer.valueOf(user.getUnReadVideoCount()));
                            String uid2 = user.getUid();
                            l.b(uid2, "");
                            arrayList.add(uid2);
                        }
                    }
                }
            }
            return NotificationChoiceState.copy$default(notificationChoiceState2, null, null, false, null, false, 0, null, false, hashMap, arrayList, 255, null);
        }
    }

    static final class f extends m implements h.f.a.m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f114392a = new f();

        static {
            Covode.recordClassIndex(73586);
        }

        f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ List<? extends Object> invoke(List<? extends Object> list, List<? extends Object> list2) {
            l.d(list, "");
            l.d(list2, "");
            return list2;
        }
    }

    public final void a(com.ss.android.ugc.aweme.following.a.c cVar, boolean z) {
        if (cVar != null) {
            c(new c(cVar, this, z));
        }
    }

    static final class b extends m implements h.f.a.m<NotificationChoiceState, ListState<Object, com.ss.android.ugc.aweme.following.repository.f>, NotificationChoiceState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f114391a = new b();

        static {
            Covode.recordClassIndex(73582);
        }

        b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ NotificationChoiceState invoke(NotificationChoiceState notificationChoiceState, ListState<Object, com.ss.android.ugc.aweme.following.repository.f> listState) {
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            ListState<Object, com.ss.android.ugc.aweme.following.repository.f> listState2 = listState;
            l.d(notificationChoiceState2, "");
            l.d(listState2, "");
            return NotificationChoiceState.copy$default(notificationChoiceState2, null, null, false, listState2, false, 0, null, false, null, null, 1015, null);
        }
    }

    static final class i extends m implements h.f.a.m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f114397a = new i();

        static {
            Covode.recordClassIndex(73591);
        }

        i() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ List<? extends Object> invoke(List<? extends Object> list, List<? extends Object> list2) {
            List<? extends Object> list3 = list;
            List<? extends Object> list4 = list2;
            l.d(list3, "");
            l.d(list4, "");
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
}
