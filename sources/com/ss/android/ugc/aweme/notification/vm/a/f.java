package com.ss.android.ugc.aweme.notification.vm.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.ss.android.ugc.aweme.common.ac;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.e.a;
import com.ss.android.ugc.aweme.notification.vm.a.d;
import com.ss.android.ugc.aweme.notification.vm.a.e;
import f.a.t;
import f.a.w;
import h.a.ag;
import h.f.b.z;
import h.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class f implements e<b, List<? extends MusNotice>> {

    /* renamed from: h  reason: collision with root package name */
    public static final a f114142h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Object f114143a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public d.b f114144b = new d.b();

    /* renamed from: c  reason: collision with root package name */
    public boolean f114145c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f114146d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f114147e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f114148f;

    /* renamed from: g  reason: collision with root package name */
    public final int f114149g;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f114150i = h.i.a((h.f.a.a) d.f114157a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f114151j = h.i.a((h.f.a.a) e.f114158a);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f114152k = h.i.a((h.f.a.a) g.f114160a);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f114153l = h.i.a((h.f.a.a) C2923f.f114159a);

    /* renamed from: m  reason: collision with root package name */
    private LogPbBean f114154m;
    private int n;
    private long o;
    private volatile boolean p;

    public enum c {
        GROUP,
        REPORT,
        SHOP_IM;

        static {
            Covode.recordClassIndex(73388);
        }
    }

    static {
        Covode.recordClassIndex(73385);
    }

    private final List<MusNotice> h() {
        return (List) this.f114150i.getValue();
    }

    private final List<MusNotice> i() {
        return (List) this.f114151j.getValue();
    }

    private final List<MusNotice> j() {
        return (List) this.f114152k.getValue();
    }

    public final Map<Integer, NoticeItems> e() {
        return (Map) this.f114153l.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73386);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final boolean d() {
        return this.f114145c;
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f114155a;

        static {
            Covode.recordClassIndex(73387);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.f114155a == ((b) obj).f114155a;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f114155a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "ReqParam(markRead=" + this.f114155a + ")";
        }

        private /* synthetic */ b() {
            this(true);
        }

        public b(boolean z) {
            this.f114155a = z;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<List<MusNotice>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f114157a = new d();

        static {
            Covode.recordClassIndex(73389);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<MusNotice> invoke() {
            return new ArrayList();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<List<MusNotice>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f114158a = new e();

        static {
            Covode.recordClassIndex(73390);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<MusNotice> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.f$f  reason: collision with other inner class name */
    static final class C2923f extends h.f.b.m implements h.f.a.a<Map<Integer, NoticeItems>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2923f f114159a = new C2923f();

        static {
            Covode.recordClassIndex(73391);
        }

        C2923f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Integer, NoticeItems> invoke() {
            return new LinkedHashMap();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<List<MusNotice>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f114160a = new g();

        static {
            Covode.recordClassIndex(73392);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<MusNotice> invoke() {
            return new ArrayList();
        }
    }

    /* Return type fixed from 'f.a.t' to match base method */
    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final /* synthetic */ t<e.b<List<? extends MusNotice>>> b() {
        return a((b) null);
    }

    public final List<MusNotice> g() {
        MethodCollector.i(1210);
        synchronized (this.f114143a) {
            try {
                this.f114148f = false;
                this.f114146d = false;
            } catch (Throwable th) {
                MethodCollector.o(1210);
                throw th;
            }
        }
        List<MusNotice> f2 = a();
        MethodCollector.o(1210);
        return f2;
    }

    /* renamed from: f */
    public final List<MusNotice> a() {
        List<MusNotice> h2;
        List<MusNotice> k2;
        MethodCollector.i(3417);
        synchronized (this.f114143a) {
            try {
                if (this.f114146d) {
                    h2 = i();
                } else {
                    h2 = h();
                }
                k2 = h.a.n.k(h2);
            } finally {
                MethodCollector.o(3417);
            }
        }
        return k2;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final /* synthetic */ t<e.b<List<? extends MusNotice>>> c() {
        if (this.f114146d || this.f114144b.f114136a <= 0 || this.p || this.f114147e) {
            com.ss.android.ugc.aweme.common.f.c("MiddleDataSource", "loadMore blocked by:" + this.f114146d + ", " + this.f114144b + ", " + this.p + ", " + this.f114147e);
            t a2 = t.a(new h(this));
            h.f.b.l.b(a2, "");
            return a2;
        }
        this.f114147e = true;
        t a3 = t.a(new i(this));
        h.f.b.l.b(a3, "");
        return a3;
    }

    /* access modifiers changed from: package-private */
    public static final class k<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final k f114168a = new k();

        static {
            Covode.recordClassIndex(73398);
        }

        k() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            return v.a(c.REPORT, obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final m f114170a = new m();

        static {
            Covode.recordClassIndex(73400);
        }

        m() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            return v.a(c.SHOP_IM, obj);
        }
    }

    public final /* synthetic */ e.b a(Object obj) {
        h.f.b.l.d(obj, "");
        return e.a.a(this, obj);
    }

    static final class h<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f114161a;

        static {
            Covode.recordClassIndex(73393);
        }

        h(f fVar) {
            this.f114161a = fVar;
        }

        @Override // f.a.w
        public final void subscribe(f.a.v<e.b<List<MusNotice>>> vVar) {
            h.f.b.l.d(vVar, "");
            f fVar = this.f114161a;
            ac.a(vVar, fVar.a(fVar.a()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f114167a;

        static {
            Covode.recordClassIndex(73397);
        }

        j(f fVar) {
            this.f114167a = fVar;
        }

        @Override // f.a.w
        public final void subscribe(f.a.v<e.b<List<MusNotice>>> vVar) {
            h.f.b.l.d(vVar, "");
            f fVar = this.f114167a;
            ac.a(vVar, fVar.a(fVar.a()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final l f114169a = new l();

        static {
            Covode.recordClassIndex(73399);
        }

        l() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.d(th, "");
            com.ss.android.ugc.aweme.common.f.a("MiddleDataSource", "refresh report error", th);
            return v.a(c.REPORT, new NoticeListsResponse(null, null, null, 7, null));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final n f114171a = new n();

        static {
            Covode.recordClassIndex(73401);
        }

        n() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.d(th, "");
            com.ss.android.ugc.aweme.common.f.a("MiddleDataSource", "refresh shop error", th);
            return v.a(c.SHOP_IM, new NoticeListsResponse(null, null, null, 7, null));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f114172a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f114173b;

        static {
            Covode.recordClassIndex(73402);
        }

        o(f fVar, List list) {
            this.f114172a = fVar;
            this.f114173b = list;
        }

        @Override // f.a.w
        public final void subscribe(final f.a.v<e.b<List<MusNotice>>> vVar) {
            h.f.b.l.d(vVar, "");
            final z.e eVar = new z.e();
            eVar.element = null;
            t.a(this.f114173b).a(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.notification.vm.a.f.o.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ o f114174a;

                static {
                    Covode.recordClassIndex(73403);
                }

                {
                    this.f114174a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    MethodCollector.i(726);
                    h.p pVar = (h.p) obj;
                    if (pVar.getFirst() == c.GROUP) {
                        eVar.element = (T) pVar.getSecond();
                        synchronized (this.f114174a.f114172a.f114143a) {
                            try {
                                List<NoticeItems> notices = ((NoticeListsResponse) pVar.getSecond()).getNotices();
                                if (notices != null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (T t : notices) {
                                        if (t.getGroup() != this.f114174a.f114172a.f114149g) {
                                            arrayList.add(t);
                                        }
                                    }
                                    for (T t2 : arrayList) {
                                        this.f114174a.f114172a.e().put(Integer.valueOf(t2.getGroup()), t2);
                                    }
                                }
                            } finally {
                                MethodCollector.o(726);
                            }
                        }
                        return;
                    }
                    synchronized (this.f114174a.f114172a.f114143a) {
                        try {
                            List<NoticeItems> notices2 = ((NoticeListsResponse) pVar.getSecond()).getNotices();
                            if (notices2 != null) {
                                for (T t3 : notices2) {
                                    this.f114174a.f114172a.e().put(Integer.valueOf(t3.getGroup()), t3);
                                }
                            }
                        } finally {
                            MethodCollector.o(726);
                        }
                    }
                }
            }, new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.notification.vm.a.f.o.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ o f114176a;

                static {
                    Covode.recordClassIndex(73404);
                }

                {
                    this.f114176a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    com.ss.android.ugc.aweme.common.f.a("MiddleDataSource", "refresh error", th);
                    f.a.v vVar = vVar;
                    h.f.b.l.b(vVar, "");
                    ac.a(vVar, this.f114176a.f114172a.a(this.f114176a.f114172a.a((NoticeListsResponse) eVar.element, true), th));
                }
            }, new f.a.d.a(this) {
                /* class com.ss.android.ugc.aweme.notification.vm.a.f.o.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ o f114179a;

                static {
                    Covode.recordClassIndex(73405);
                }

                {
                    this.f114179a = r1;
                }

                @Override // f.a.d.a
                public final void a() {
                    f.a.v vVar = vVar;
                    h.f.b.l.b(vVar, "");
                    ac.a(vVar, this.f114179a.f114172a.a(this.f114179a.f114172a.a((NoticeListsResponse) eVar.element, true)));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f114182a;

        static {
            Covode.recordClassIndex(73406);
        }

        p(f fVar) {
            this.f114182a = fVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            a.b b2;
            NoticeListsResponse noticeListsResponse = (NoticeListsResponse) obj;
            h.f.b.l.d(noticeListsResponse, "");
            if (this.f114182a.f114149g == a.b.a() && (b2 = com.ss.android.ugc.aweme.notification.e.a.b()) != null) {
                h.f.b.l.d(noticeListsResponse, "");
                com.ss.android.ugc.aweme.notification.e.d.b(new a.b.f(b2, noticeListsResponse));
            }
            return v.a(c.GROUP, noticeListsResponse);
        }
    }

    public f(int i2) {
        this.f114149g = i2;
    }

    static final class i<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f114162a;

        static {
            Covode.recordClassIndex(73394);
        }

        i(f fVar) {
            this.f114162a = fVar;
        }

        @Override // f.a.w
        public final void subscribe(final f.a.v<e.b<List<MusNotice>>> vVar) {
            h.f.b.l.d(vVar, "");
            NotificationApi.a().fetchGroupNotice(new com.ss.android.ugc.aweme.notice.repo.list.bean.g(this.f114162a.f114149g, this.f114162a.f114144b.f114136a, this.f114162a.f114144b.f114137b, 0, 0, 24, null).toReqStr()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.notification.vm.a.f.i.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ i f114163a;

                static {
                    Covode.recordClassIndex(73395);
                }

                {
                    this.f114163a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    f.a.v vVar = vVar;
                    h.f.b.l.b(vVar, "");
                    ac.a(vVar, this.f114163a.f114162a.a(this.f114163a.f114162a.a((NoticeListsResponse) obj, false)));
                }
            }, new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.notification.vm.a.f.i.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ i f114165a;

                static {
                    Covode.recordClassIndex(73396);
                }

                {
                    this.f114165a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    this.f114165a.f114162a.f114147e = false;
                    f.a.v vVar = vVar;
                    h.f.b.l.b(vVar, "");
                    h.f.b.l.b(th, "");
                    ac.a(vVar, th);
                }
            });
        }
    }

    private final NoticeItems a(NoticeListsResponse noticeListsResponse) {
        MusNotice musNotice;
        T t = null;
        if (this.f114149g == 37) {
            ArrayList arrayList = new ArrayList();
            List<NoticeItems> notices = noticeListsResponse.getNotices();
            if (notices != null) {
                Iterator<T> it = notices.iterator();
                while (it.hasNext()) {
                    List<MusNotice> items = it.next().getItems();
                    if (!(items == null || (musNotice = (MusNotice) h.a.n.h((List) items)) == null)) {
                        com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar = musNotice.templateNotice;
                        if (eVar != null) {
                            eVar.f112855m = this.f114149g;
                        }
                        arrayList.add(musNotice);
                    }
                }
            }
            return new NoticeItems(arrayList, false, 0, 0, 0, 0, this.f114149g, 0, BuildConfig.VERSION_CODE, null);
        }
        List<NoticeItems> notices2 = noticeListsResponse.getNotices();
        if (notices2 == null) {
            return null;
        }
        Iterator<T> it2 = notices2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            if (next.getGroup() == this.f114149g) {
                t = next;
                break;
            }
        }
        return t;
    }

    private final void a(d.a aVar) {
        boolean z;
        MethodCollector.i(512);
        synchronized (this.f114143a) {
            try {
                h().clear();
                h().addAll(aVar.p);
                i().clear();
                i().addAll(aVar.q);
                if (!aVar.q.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                this.f114146d = z;
                this.f114154m = aVar.f114126d;
                this.o = aVar.f114127e;
                this.n = aVar.f114129g;
                this.f114144b = aVar.f114130h;
                this.f114145c = aVar.f114131i;
            } finally {
                MethodCollector.o(512);
            }
        }
    }

    public final List<MusNotice> b(List<? extends MusNotice> list) {
        MethodCollector.i(1154);
        h.f.b.l.d(list, "");
        if (this.p) {
            com.ss.android.ugc.aweme.common.f.c("MiddleDataSource", "cannot call insertLive when refreshing:" + list.size());
            List<MusNotice> f2 = a();
            MethodCollector.o(1154);
            return f2;
        }
        synchronized (this.f114143a) {
            try {
                if (!j().isEmpty() || !list.isEmpty()) {
                    j().clear();
                    j().addAll(list);
                    d.a(j(), h());
                    if (!i().isEmpty()) {
                        d.a(j(), i());
                    }
                    List<MusNotice> f3 = a();
                    MethodCollector.o(1154);
                    return f3;
                }
                return a();
            } finally {
                MethodCollector.o(1154);
            }
        }
    }

    public final t<e.b<List<MusNotice>>> a(b bVar) {
        int i2;
        if (this.p || this.f114147e) {
            com.ss.android.ugc.aweme.common.f.c("MiddleDataSource", "refresh blocked by loading now ");
            t<e.b<List<MusNotice>>> a2 = t.a(new j(this));
            h.f.b.l.b(a2, "");
            return a2;
        }
        this.p = true;
        if (bVar == null || bVar.f114155a) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        List c2 = h.a.n.c(NotificationApi.a().fetchGroupNotice(new com.ss.android.ugc.aweme.notice.repo.list.bean.g(this.f114149g, 0, 0, 0, i2, 14, null).toReqStr()).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new p(this)));
        if (this.f114149g == 37 && com.ss.android.ugc.aweme.notification.ab.f.a()) {
            c2.add(NotificationApi.a().fetchReportInboxNotice().b(f.a.h.a.b(f.a.k.a.f158006c)).d(k.f114168a).f(l.f114169a));
        } else if (this.f114149g == 599) {
            c2.add(NotificationApi.a().fetchShopInboxNotice().b(f.a.h.a.b(f.a.k.a.f158006c)).d(m.f114170a).f(n.f114171a));
        }
        t<e.b<List<MusNotice>>> a3 = t.a(new o(this, c2));
        h.f.b.l.b(a3, "");
        return a3;
    }

    public final List<MusNotice> a(List<NoticeItems> list) {
        d.a aVar;
        MethodCollector.i(752);
        h.f.b.l.d(list, "");
        if (this.p) {
            com.ss.android.ugc.aweme.common.f.c("MiddleDataSource", "cannot call insertExtra when refreshing:" + list.size());
            List<MusNotice> f2 = a();
            MethodCollector.o(752);
            return f2;
        } else if (list.isEmpty()) {
            com.ss.android.ugc.aweme.common.f.b("MiddleDataSource", "insertExtraListByJanus item empty");
            List<MusNotice> f3 = a();
            MethodCollector.o(752);
            return f3;
        } else {
            synchronized (this.f114143a) {
                try {
                    for (T t : list) {
                        e().put(Integer.valueOf(t.getGroup()), t);
                    }
                    aVar = new d.a(j(), ag.c(e()), h.a.z.INSTANCE, this.f114154m, this.o, false, this.n, this.f114144b, this.f114145c, this.f114148f);
                    for (T t2 : h()) {
                        if (!(((MusNotice) t2).type == 1001 || ((MusNotice) t2).type == 999 || t2.isMock())) {
                            aVar.a(t2);
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(752);
                    throw th;
                }
            }
            d.a(aVar);
            a(aVar);
            List<MusNotice> f4 = a();
            MethodCollector.o(752);
            return f4;
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.notification.vm.a.e$b' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Throwable] */
    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final /* synthetic */ e.b<List<? extends MusNotice>> a(List<? extends MusNotice> list, Throwable th) {
        h.f.b.l.d(list, "");
        return e.a.a(this, list, th);
    }

    public final List<MusNotice> a(NoticeListsResponse noticeListsResponse, boolean z) {
        b(noticeListsResponse, z);
        this.p = false;
        this.f114147e = false;
        return a();
    }

    public final void b(NoticeListsResponse noticeListsResponse, boolean z) {
        NoticeItems a2;
        Throwable th;
        MethodCollector.i(5546);
        if (noticeListsResponse == null || (a2 = a(noticeListsResponse)) == null) {
            MethodCollector.o(5546);
            return;
        }
        synchronized (this.f114143a) {
            try {
                List<MusNotice> j2 = j();
                Map c2 = ag.c(e());
                List<MusNotice> items = a2.getItems();
                if (items == null) {
                    items = h.a.z.INSTANCE;
                }
                try {
                    d.a aVar = new d.a(j2, c2, items, noticeListsResponse.getLobPb(), Math.max(a2.getLastReadTime(), this.o), z, a2.getTotal(), new d.b(a2.getMaxTime(), a2.getMinTime()), a2.getHasMore(), this.f114148f);
                    if (!z) {
                        for (T t : h()) {
                            if (!(((MusNotice) t).type == 1001 || ((MusNotice) t).type == 999 || t.isMock())) {
                                aVar.a(t);
                            }
                        }
                    }
                    d.a(aVar);
                    a(aVar);
                    MethodCollector.o(5546);
                } catch (Throwable th2) {
                    th = th2;
                    MethodCollector.o(5546);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.o(5546);
                throw th;
            }
        }
    }
}
