package com.ss.android.ugc.aweme.notification.vm;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.ac;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.bean.q;
import com.ss.android.ugc.aweme.notification.bean.r;
import com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.ss.android.ugc.aweme.notification.vm.a.e;
import com.ss.android.ugc.aweme.notification.vm.a.f;
import com.ss.android.ugc.aweme.notification.vm.a.h;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.t;
import f.a.v;
import f.a.w;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class d extends c {

    /* renamed from: i  reason: collision with root package name */
    public static final a f114253i = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.notification.vm.a.h f114254d = new com.ss.android.ugc.aweme.notification.vm.a.h();

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.notification.vm.a.f f114255e = new com.ss.android.ugc.aweme.notification.vm.a.f(this.f114228b);

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.notification.vm.a.a f114256f = new com.ss.android.ugc.aweme.notification.vm.a.a();

    /* renamed from: g  reason: collision with root package name */
    public volatile com.ss.android.ugc.aweme.notification.vm.a.e<?, List<MusNotice>> f114257g;

    /* renamed from: h  reason: collision with root package name */
    public volatile b f114258h;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f114259j = h.i.a((h.f.a.a) k.f114283a);

    public enum b {
        PRELOAD_INJECT_CACHE,
        PRELOAD_REFRESH_EXCEPT_REC,
        PRELOAD_REFRESH_CLICK,
        REFRESH,
        LOAD_MORE,
        EXPAND,
        REFRESH_LIVE,
        REFRESH_FOLLOW_REQ;

        static {
            Covode.recordClassIndex(73460);
        }
    }

    static {
        Covode.recordClassIndex(73458);
    }

    /* access modifiers changed from: protected */
    public void b(b bVar) {
        l.d(bVar, "");
    }

    /* access modifiers changed from: protected */
    public final List<b> k() {
        return (List) this.f114259j.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73459);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final boolean n() {
        if (this.f114257g != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.c
    public boolean i() {
        return a(b.REFRESH);
    }

    private static boolean o() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.c
    public final boolean j() {
        return a(new f(this));
    }

    public final boolean l() {
        return a(new j(this));
    }

    public final boolean m() {
        return a(new h(this));
    }

    static final class k extends m implements h.f.a.a<List<? extends b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f114283a = new k();

        static {
            Covode.recordClassIndex(73479);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends b> invoke() {
            return n.b(b.PRELOAD_REFRESH_EXCEPT_REC, b.PRELOAD_REFRESH_CLICK, b.REFRESH);
        }
    }

    public d() {
        super(a.b.a());
    }

    /* access modifiers changed from: package-private */
    public static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f114266a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f114267b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f114268c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f114269d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f114270e;

        static {
            Covode.recordClassIndex(73467);
        }

        g(d dVar, boolean z, List list, b bVar, boolean z2) {
            this.f114266a = dVar;
            this.f114267b = z;
            this.f114268c = list;
            this.f114269d = bVar;
            this.f114270e = z2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.notification.bean.i iVar;
            this.f114266a.e().setValue(Boolean.valueOf(this.f114267b));
            this.f114266a.a().setValue(this.f114268c);
            b bVar = this.f114269d;
            if (this.f114266a.k().contains(bVar)) {
                com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.notification.bean.i> b2 = this.f114266a.b();
                if (!this.f114268c.isEmpty() || !this.f114270e) {
                    iVar = com.ss.android.ugc.aweme.notification.bean.i.SUCCESS;
                } else {
                    iVar = com.ss.android.ugc.aweme.notification.bean.i.ERROR;
                }
                b2.setValue(iVar);
                this.f114266a.f114258h = null;
            } else if (bVar == b.LOAD_MORE) {
                this.f114266a.c().setValue(com.ss.android.ugc.aweme.notification.bean.i.SUCCESS);
            }
            this.f114266a.b(this.f114269d);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(73468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (this.this$0.d()) {
                com.ss.android.ugc.aweme.common.f.c("NotificationTLModel", "refreshFollowReq but loading now");
                z = false;
            } else {
                com.ss.android.ugc.aweme.common.f.b("NotificationTLModel", "refreshFollowReq start");
                t f2 = t.a(FollowRequestApiManager.f113442b.fetchFollowRequestList(System.currentTimeMillis() / 1000, 1, 0)).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new h.l(this.this$0.f114254d)).f(h.m.f114216a);
                l.b(f2, "");
                f.a.b.b a2 = f2.a(new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.notification.vm.d.h.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ h f114271a;

                    static {
                        Covode.recordClassIndex(73469);
                    }

                    {
                        this.f114271a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        Boolean bool = (Boolean) obj;
                        l.b(bool, "");
                        if (bool.booleanValue()) {
                            this.f114271a.this$0.b(b.REFRESH_FOLLOW_REQ, false);
                        }
                    }
                }, AnonymousClass2.f114272a);
                l.b(a2, "");
                f.a.j.a.a(a2, this.this$0.g());
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class j extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(73476);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (this.this$0.d()) {
                com.ss.android.ugc.aweme.common.f.c("NotificationTLModel", "refreshLive but loading now");
                z = false;
            } else {
                com.ss.android.ugc.aweme.common.f.b("NotificationTLModel", "refreshLive start");
                t<R> f2 = NotificationApi.a().fetchLiveNotice("tiktok_message", 0, 3, 81).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new h.n(this.this$0.f114254d, SystemClock.elapsedRealtime())).f(h.o.f114219a);
                l.b(f2, "");
                f.a.b.b a2 = f2.a(new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.notification.vm.d.j.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ j f114281a;

                    static {
                        Covode.recordClassIndex(73477);
                    }

                    {
                        this.f114281a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        Boolean bool = (Boolean) obj;
                        l.b(bool, "");
                        if (bool.booleanValue()) {
                            this.f114281a.this$0.f114255e.b(this.f114281a.this$0.f114254d.f());
                            this.f114281a.this$0.b(b.REFRESH_LIVE, false);
                        }
                    }
                }, AnonymousClass2.f114282a);
                l.b(a2, "");
                f.a.j.a.a(a2, this.this$0.g());
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class f extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(73464);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            Object obj;
            boolean z = false;
            if (this.this$0.d()) {
                com.ss.android.ugc.aweme.common.f.c("NotificationTLModel", "loadMore but loading now");
            } else {
                com.ss.android.ugc.aweme.notification.vm.a.e<?, List<MusNotice>> eVar = this.this$0.f114257g;
                if (eVar == null || true != eVar.d()) {
                    com.ss.android.ugc.aweme.common.f.c("NotificationTLModel", "loadMore but now more");
                    List<MusNotice> value = this.this$0.a().getValue();
                    if (value != null) {
                        obj = n.j((List) value);
                    } else {
                        obj = null;
                    }
                    if (obj instanceof com.ss.android.ugc.aweme.notification.bean.h) {
                        com.ss.android.ugc.aweme.arch.widgets.base.c<List<MusNotice>> a2 = this.this$0.a();
                        List<MusNotice> value2 = this.this$0.a().getValue();
                        if (value2 == null) {
                            l.b();
                        }
                        l.b(value2, "");
                        List<MusNotice> g2 = n.g((Collection) value2);
                        n.d((List) g2);
                        a2.postValue(g2);
                    }
                } else {
                    com.ss.android.ugc.aweme.common.f.b("NotificationTLModel", "loadMore start");
                    com.ss.android.ugc.aweme.notification.b.a.a(this.this$0.c(), com.ss.android.ugc.aweme.notification.bean.i.LOADING);
                    f.a.b.b a3 = eVar.c().b(f.a.h.a.b(f.a.k.a.f158006c)).a(new f.a.d.f(this) {
                        /* class com.ss.android.ugc.aweme.notification.vm.d.f.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ f f114264a;

                        static {
                            Covode.recordClassIndex(73465);
                        }

                        {
                            this.f114264a = r1;
                        }

                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Object obj) {
                            this.f114264a.this$0.b(b.LOAD_MORE, false);
                        }
                    }, new f.a.d.f(this) {
                        /* class com.ss.android.ugc.aweme.notification.vm.d.f.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ f f114265a;

                        static {
                            Covode.recordClassIndex(73466);
                        }

                        {
                            this.f114265a = r1;
                        }

                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Object obj) {
                            com.ss.android.ugc.aweme.common.f.a("NotificationTLModel", "loadMore error", (Throwable) obj);
                            this.f114265a.this$0.c().postValue(com.ss.android.ugc.aweme.notification.bean.i.ERROR);
                        }
                    });
                    l.b(a3, "");
                    f.a.j.a.a(a3, this.this$0.g());
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ b $reason;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(73471);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(d dVar, b bVar) {
            super(0);
            this.this$0 = dVar;
            this.$reason = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            final boolean z;
            t<e.b<List<MusNotice>>> b2;
            boolean z2 = true;
            if (!this.this$0.k().contains(this.$reason) || this.this$0.d()) {
                com.ss.android.ugc.aweme.common.f.c("NotificationTLModel", "refresh illegal state, reason:" + this.$reason + ", isLoading:" + this.this$0.d());
                z2 = false;
            } else {
                com.ss.android.ugc.aweme.common.f.b("NotificationTLModel", "refresh start, reason:" + this.$reason);
                com.ss.android.ugc.aweme.notification.b.a.a(this.this$0.b(), com.ss.android.ugc.aweme.notification.bean.i.LOADING);
                this.this$0.f114258h = this.$reason;
                List<com.ss.android.ugc.aweme.notification.vm.a.e> c2 = n.c(this.this$0.f114254d, this.this$0.f114255e);
                if (com.ss.android.ugc.aweme.recommend.users.b.f120122a.c() && (this.$reason == b.REFRESH || this.$reason == b.PRELOAD_REFRESH_CLICK)) {
                    c2.add(this.this$0.f114256f);
                    this.this$0.f114255e.f114148f = true;
                }
                ArrayList arrayList = new ArrayList(n.a((Iterable) c2, 10));
                for (com.ss.android.ugc.aweme.notification.vm.a.e eVar : c2) {
                    if (this.$reason == b.PRELOAD_REFRESH_EXCEPT_REC && (eVar instanceof com.ss.android.ugc.aweme.notification.vm.a.f)) {
                        b2 = ((com.ss.android.ugc.aweme.notification.vm.a.f) eVar).a(new f.b(false));
                    } else if (this.$reason != b.PRELOAD_REFRESH_EXCEPT_REC || !(eVar instanceof com.ss.android.ugc.aweme.notification.vm.a.h)) {
                        b2 = eVar.b();
                    } else {
                        b2 = ((com.ss.android.ugc.aweme.notification.vm.a.h) eVar).a(new h.b(false));
                    }
                    arrayList.add(b2);
                }
                ArrayList arrayList2 = arrayList;
                List<MusNotice> value = this.this$0.a().getValue();
                if (value == null || value.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                final AtomicInteger atomicInteger = new AtomicInteger(-2);
                final z.a aVar = new z.a();
                aVar.element = false;
                f.a.b.b a2 = t.a(arrayList2).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new f.a.d.g(this) {
                    /* class com.ss.android.ugc.aweme.notification.vm.d.i.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ i f114273a;

                    static {
                        Covode.recordClassIndex(73472);
                    }

                    {
                        this.f114273a = r1;
                    }

                    @Override // f.a.d.g
                    public final /* synthetic */ Object apply(Object obj) {
                        e.b bVar = (e.b) obj;
                        l.d(bVar, "");
                        if (((bVar.f114139a instanceof com.ss.android.ugc.aweme.notification.vm.a.h) || (bVar.f114139a instanceof com.ss.android.ugc.aweme.notification.vm.a.f)) && atomicInteger.incrementAndGet() == 0) {
                            this.f114273a.this$0.f114255e.b(this.f114273a.this$0.f114254d.f());
                            this.f114273a.this$0.f114255e.a(this.f114273a.this$0.f114254d.g());
                        }
                        return new e.b(bVar.f114139a, bVar.f114139a.a(), bVar.f114141c);
                    }
                }).a(new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.notification.vm.d.i.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ i f114275a;

                    static {
                        Covode.recordClassIndex(73473);
                    }

                    {
                        this.f114275a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        e.b bVar = (e.b) obj;
                        if ((bVar.f114139a instanceof com.ss.android.ugc.aweme.notification.vm.a.f) && z && (!bVar.f114140b.isEmpty())) {
                            com.ss.android.ugc.aweme.common.f.b("NotificationTLModel", "handle pre-refresh result, reason:" + this.f114275a.$reason);
                            this.f114275a.this$0.b(this.f114275a.$reason, false);
                        }
                        if (bVar.f114141c != null) {
                            aVar.element = true;
                        }
                    }
                }, new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.notification.vm.d.i.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ i f114278a;

                    static {
                        Covode.recordClassIndex(73474);
                    }

                    {
                        this.f114278a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        com.ss.android.ugc.aweme.common.f.a("NotificationTLModel", "refresh error, reason:" + this.f114278a.$reason, (Throwable) obj);
                        this.f114278a.this$0.a(this.f114278a.$reason, true);
                    }
                }, new f.a.d.a(this) {
                    /* class com.ss.android.ugc.aweme.notification.vm.d.i.AnonymousClass4 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ i f114279a;

                    static {
                        Covode.recordClassIndex(73475);
                    }

                    {
                        this.f114279a = r1;
                    }

                    @Override // f.a.d.a
                    public final void a() {
                        this.f114279a.this$0.a(this.f114279a.$reason, aVar.element);
                    }
                });
                l.b(a2, "");
                f.a.j.a.a(a2, this.this$0.g());
            }
            return Boolean.valueOf(z2);
        }
    }

    public final int a(String str) {
        return this.f114256f.a(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.d$d  reason: collision with other inner class name */
    public static final class C2926d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f114262a;

        static {
            Covode.recordClassIndex(73462);
        }

        public C2926d(d dVar) {
            this.f114262a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f114262a.b(b.EXPAND, false);
        }
    }

    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f114263a = new e();

        static {
            Covode.recordClassIndex(73463);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.common.f.a("NotificationTLModel", "expand unknown error", (Throwable) obj);
        }
    }

    public final boolean a(b bVar) {
        l.d(bVar, "");
        return a(new i(this, bVar));
    }

    public static final class c<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f114261a;

        static {
            Covode.recordClassIndex(73461);
        }

        public c(d dVar) {
            this.f114261a = dVar;
        }

        @Override // f.a.w
        public final void subscribe(v<Boolean> vVar) {
            l.d(vVar, "");
            this.f114261a.f114255e.g();
            ac.a((v) vVar, (Object) true);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.c
    public final void a(MusNotice musNotice) {
        l.d(musNotice, "");
        com.bytedance.ies.ugc.appcontext.d.a();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = o();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
            com.ss.android.ugc.aweme.common.f.c("NotificationTLModel", "deleteData net unavailable");
            f().setValue(h.v.a(musNotice, com.ss.android.ugc.aweme.notification.bean.b.NET_ERR));
            return;
        }
        int i2 = musNotice.type;
        if (i2 == 2001 || i2 == 2011) {
            com.ss.android.ugc.aweme.common.f.b("NotificationTLModel", "deleteRecommend start");
            Objects.requireNonNull(musNotice, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.bean.RecommendNotice");
            User user = ((q) musNotice).f113282b;
            if (user == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.recommend.users.b bVar = com.ss.android.ugc.aweme.recommend.users.b.f120122a;
            String uid = user.getUid();
            l.b(uid, "");
            bVar.a(uid, user.getSecUid());
            com.ss.android.ugc.aweme.notification.utils.e.b(user, Integer.valueOf(this.f114256f.a(user.getUid())), com.ss.android.ugc.aweme.notification.utils.f.a(Integer.valueOf(this.f114228b)));
            List<MusNotice> value = a().getValue();
            if (value != null) {
                List<MusNotice> g2 = n.g((Collection) value);
                g2.remove(musNotice);
                h().add(musNotice.nid);
                MusNotice musNotice2 = (MusNotice) n.j((List) g2);
                if (musNotice2 != null && 2000 == musNotice2.type) {
                    h().add(((MusNotice) n.d((List) g2)).nid);
                }
                a().setValue(g2);
                f().setValue(h.v.a(musNotice, com.ss.android.ugc.aweme.notification.bean.b.SUCCESS));
                return;
            }
            return;
        }
        super.a(musNotice);
    }

    public final synchronized void a(b bVar, boolean z) {
        MethodCollector.i(728);
        if (this.f114255e.f114148f && this.f114256f.a().isEmpty()) {
            this.f114255e.f114148f = false;
            this.f114255e.g();
        }
        b(bVar, z);
        MethodCollector.o(728);
    }

    public final synchronized void b(b bVar, boolean z) {
        MethodCollector.i(27);
        l.d(bVar, "");
        List<MusNotice> h2 = this.f114254d.a();
        List<MusNotice> f2 = this.f114255e.a();
        List<MusNotice> f3 = this.f114256f.a();
        if (!h2.isEmpty() || !f2.isEmpty() || !f3.isEmpty()) {
            List<MusNotice> arrayList = new ArrayList<>();
            arrayList.add(new r());
            arrayList.addAll(h2);
            if (f2.isEmpty()) {
                arrayList.add(new q(2003, null, null, 0, 14));
            } else {
                arrayList.addAll(f2);
            }
            this.f114257g = null;
            if (this.f114255e.f114146d || !this.f114255e.f114145c) {
                arrayList.addAll(f3);
                if (this.f114256f.e().d()) {
                    this.f114257g = this.f114256f;
                    arrayList.add(new com.ss.android.ugc.aweme.notification.bean.h());
                }
            } else {
                this.f114257g = this.f114255e;
                arrayList.add(new com.ss.android.ugc.aweme.notification.bean.h());
            }
            a(arrayList);
            com.ss.android.ugc.aweme.common.f.b("NotificationTLModel", "handleCombine, reason:" + bVar + ", hasError:" + z + ", result:[" + arrayList.size() + ", " + n() + ", " + (this.f114257g instanceof com.ss.android.ugc.aweme.notification.vm.a.f) + "], top:[" + h2.size() + "], middle:[" + f2.size() + ", " + this.f114255e.f114145c + ", " + this.f114255e.f114146d + "], bottom:[" + f3.size() + ", " + this.f114256f.e().d() + ']');
            a(bVar, arrayList, z);
            MethodCollector.o(27);
            return;
        }
        a(bVar, h.a.z.INSTANCE, z);
        MethodCollector.o(27);
    }

    private final void a(b bVar, List<? extends MusNotice> list, boolean z) {
        b.i.b(new g(this, n(), list, bVar, z), b.i.f4826c);
    }
}
