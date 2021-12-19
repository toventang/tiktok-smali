package com.ss.android.ugc.aweme.notification.vm.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.ac;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.notification.vm.a.e;
import com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ab;
import com.ss.android.ugc.aweme.profile.presenter.u;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.a.m;
import h.f.b.l;
import h.h;
import h.i;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class g implements e<Object, com.ss.android.ugc.aweme.notification.vm.a>, u {

    /* renamed from: a  reason: collision with root package name */
    public static final a f114183a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f114184b = i.a((h.f.a.a) new d(this));

    /* renamed from: c  reason: collision with root package name */
    private final h f114185c = i.a((h.f.a.a) f.f114190a);

    /* renamed from: d  reason: collision with root package name */
    private final h f114186d = i.a((h.f.a.a) c.f114188a);

    static {
        Covode.recordClassIndex(73407);
    }

    public final ab e() {
        return (ab) this.f114184b.getValue();
    }

    public final CopyOnWriteArrayList<m<RecommendList, Throwable, z>> f() {
        return (CopyOnWriteArrayList) this.f114185c.getValue();
    }

    public final CopyOnWriteArrayList<m<RecommendList, Throwable, z>> g() {
        return (CopyOnWriteArrayList) this.f114186d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73408);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<CopyOnWriteArrayList<m<? super RecommendList, ? super Throwable, ? extends z>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f114188a = new c();

        static {
            Covode.recordClassIndex(73411);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyOnWriteArrayList<m<? super RecommendList, ? super Throwable, ? extends z>> invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<CopyOnWriteArrayList<m<? super RecommendList, ? super Throwable, ? extends z>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f114190a = new f();

        static {
            Covode.recordClassIndex(73415);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyOnWriteArrayList<m<? super RecommendList, ? super Throwable, ? extends z>> invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<ab> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(73412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ab invoke() {
            return new ab(new RecommendCommonUserModel(), this.this$0);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final t<e.b<com.ss.android.ugc.aweme.notification.vm.a>> c() {
        t<e.b<com.ss.android.ugc.aweme.notification.vm.a>> a2 = t.a(new b(this));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final t<e.b<com.ss.android.ugc.aweme.notification.vm.a>> b() {
        e().e();
        t<e.b<com.ss.android.ugc.aweme.notification.vm.a>> a2 = t.a(new e(this));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final boolean d() {
        RecommendList a2 = e().a();
        if (a2 != null) {
            return a2.hasMore();
        }
        return false;
    }

    public final String h() {
        RecommendList a2 = e().a();
        if (a2 != null) {
            return a2.getRid();
        }
        return null;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final /* synthetic */ com.ss.android.ugc.aweme.notification.vm.a a() {
        return new com.ss.android.ugc.aweme.notification.vm.a(e().a(), null, 2);
    }

    public final int a(String str) {
        return e().a(str);
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f114187a;

        static {
            Covode.recordClassIndex(73409);
        }

        b(g gVar) {
            this.f114187a = gVar;
        }

        @Override // f.a.w
        public final void subscribe(final v<e.b<com.ss.android.ugc.aweme.notification.vm.a>> vVar) {
            l.d(vVar, "");
            this.f114187a.g().add(new m<RecommendList, Throwable, z>(this) {
                /* class com.ss.android.ugc.aweme.notification.vm.a.g.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(73410);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ z invoke(RecommendList recommendList, Throwable th) {
                    RecommendList recommendList2 = recommendList;
                    Throwable th2 = th;
                    if (th2 != null) {
                        v vVar = vVar;
                        l.b(vVar, "");
                        ac.a(vVar, th2);
                    } else {
                        v vVar2 = vVar;
                        l.b(vVar2, "");
                        ac.a(vVar2, this.this$0.f114187a.a(new com.ss.android.ugc.aweme.notification.vm.a(recommendList2, null, 2)));
                    }
                    return z.f158842a;
                }
            });
            ab e2 = this.f114187a.e();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            e2.a(g2.getCurUserId(), com.ss.android.ugc.aweme.utils.permission.d.a(), "0");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f114189a;

        static {
            Covode.recordClassIndex(73413);
        }

        e(g gVar) {
            this.f114189a = gVar;
        }

        @Override // f.a.w
        public final void subscribe(final v<e.b<com.ss.android.ugc.aweme.notification.vm.a>> vVar) {
            l.d(vVar, "");
            this.f114189a.f().add(new m<RecommendList, Throwable, z>(this) {
                /* class com.ss.android.ugc.aweme.notification.vm.a.g.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(73414);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ z invoke(RecommendList recommendList, Throwable th) {
                    RecommendList recommendList2 = recommendList;
                    Throwable th2 = th;
                    if (th2 != null) {
                        v vVar = vVar;
                        l.b(vVar, "");
                        ac.a(vVar, th2);
                    } else {
                        v vVar2 = vVar;
                        l.b(vVar2, "");
                        ac.a(vVar2, this.this$0.f114189a.a(new com.ss.android.ugc.aweme.notification.vm.a(recommendList2, null, 2)));
                    }
                    return z.f158842a;
                }
            });
            ab e2 = this.f114189a.e();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            e2.a(g2.getCurUserId(), com.ss.android.ugc.aweme.utils.permission.d.a(), "0", false);
        }
    }

    public final /* synthetic */ e.b a(Object obj) {
        l.d(obj, "");
        return e.a.a(this, obj);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.u
    public final void b(RecommendList recommendList) {
        if (recommendList != null) {
            List<User> inviterList = recommendList.getInviterList();
            if (inviterList != null) {
                Integer.valueOf(inviterList.size());
            }
            List<User> userList = recommendList.getUserList();
            if (userList != null) {
                Integer.valueOf(userList.size());
            }
        }
        f().size();
        a(g(), recommendList, null);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.u
    public final void a(RecommendList recommendList) {
        if (recommendList != null) {
            List<User> inviterList = recommendList.getInviterList();
            if (inviterList != null) {
                Integer.valueOf(inviterList.size());
            }
            List<User> userList = recommendList.getUserList();
            if (userList != null) {
                Integer.valueOf(userList.size());
            }
        }
        f().size();
        a(f(), recommendList, null);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.u
    public final void a(Exception exc) {
        f().size();
        g().size();
        if (exc != null) {
            exc.getMessage();
        } else {
            exc = new IllegalStateException("Unknown error for recommend");
        }
        a(f(), null, exc);
        a(g(), null, exc);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.notification.vm.a.e$b' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Throwable] */
    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final /* synthetic */ e.b<com.ss.android.ugc.aweme.notification.vm.a> a(com.ss.android.ugc.aweme.notification.vm.a aVar, Throwable th) {
        l.d(aVar, "");
        return e.a.a(this, aVar, th);
    }

    private static void a(CopyOnWriteArrayList<m<RecommendList, Throwable, z>> copyOnWriteArrayList, RecommendList recommendList, Throwable th) {
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().invoke(recommendList, th);
        }
        copyOnWriteArrayList.clear();
    }
}
