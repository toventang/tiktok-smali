package com.ss.android.ugc.aweme.discover.repo.fetcher;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.discover.api.DiscoverApiNew;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionList;
import com.ss.android.ugc.aweme.discover.model.TrendingTopic;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicList;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicOrAd;
import com.ss.android.ugc.aweme.discover.repo.fetcher.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.h;
import f.a.ab;
import f.a.e.e.e.v;
import f.a.t;
import f.a.x;
import h.a.n;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class b extends com.bytedance.jedi.a.f.d<c, DiscoverSectionList> {

    /* renamed from: i  reason: collision with root package name */
    public static final a f81999i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final DiscoverApiNew f82000a = DiscoverApiNew.a.f80769a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f82001b;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f82002f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f82003g = com.ss.android.ugc.aweme.discover.f.b.b();

    /* renamed from: h  reason: collision with root package name */
    long f82004h;

    static {
        Covode.recordClassIndex(51041);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51042);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final g f82017a = new g();

        static {
            Covode.recordClassIndex(51050);
        }

        g() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            TrendingTopicOrAd trendingTopicOrAd = (TrendingTopicOrAd) obj;
            l.d(trendingTopicOrAd, "");
            return new DiscoverSectionItem.TrendingTopicOrAdSection(trendingTopicOrAd);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$b  reason: collision with other inner class name */
    public static final class C1918b<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82005a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f82006b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f82007c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f82008d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f82009e;

        static {
            Covode.recordClassIndex(51043);
        }

        C1918b(b bVar, int i2, int i3, int i4, String str) {
            this.f82005a = bVar;
            this.f82006b = i2;
            this.f82007c = i3;
            this.f82008d = i4;
            this.f82009e = str;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            l.d(th, "");
            if (com.ss.android.ugc.aweme.discover.l.a.f81406a) {
                return ab.a(th);
            }
            com.ss.android.ugc.aweme.discover.l.a.f81406a = true;
            return this.f82005a.f82000a.getTrendingTopicsV2(this.f82006b, this.f82007c, 0, Integer.valueOf(this.f82008d), this.f82009e);
        }
    }

    static final class c<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f82011b;

        static {
            Covode.recordClassIndex(51044);
        }

        c(b bVar, boolean z) {
            this.f82010a = bVar;
            this.f82011b = z;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            l.d(list, "");
            if (!this.f82011b || !list.isEmpty()) {
                com.bytedance.ies.watcher.c.a("discovery_client_show_time");
                return new DiscoverSectionList(list, this.f82010a.f82001b, this.f82010a.f82002f, false, 8, null);
            }
            throw new Exception("api all went wrong");
        }
    }

    private t<DiscoverSectionItem.TrendingTopicOrAdSection> a(ab<TrendingTopicList> abVar) {
        l.d(abVar, "");
        t<R> d2 = abVar.c(new d(this)).b(new e(this)).d(f.f82016a).d(g.f82017a);
        l.b(d2, "");
        return d2;
    }

    /* access modifiers changed from: package-private */
    public static final class d<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82012a;

        static {
            Covode.recordClassIndex(51045);
        }

        d(b bVar) {
            this.f82012a = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
        @Override // f.a.d.g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r3) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.discover.model.TrendingTopicList r3 = (com.ss.android.ugc.aweme.discover.model.TrendingTopicList) r3
                java.lang.String r1 = ""
                h.f.b.l.d(r3, r1)
                com.ss.android.ugc.aweme.discover.repo.fetcher.b r0 = r2.f82012a
                boolean r0 = r0.f82003g
                if (r0 == 0) goto L_0x0057
                h.f.b.l.d(r3, r1)
                boolean r0 = com.ss.android.ugc.aweme.discover.repo.gson.a.a()
                if (r0 == 0) goto L_0x003a
                java.lang.String r1 = r3.jsonRawData
                java.util.List<com.ss.android.ugc.aweme.discover.model.TrendingTopic> r0 = r3.items
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x003a
                if (r1 == 0) goto L_0x003a
                java.util.List<com.ss.android.ugc.aweme.discover.model.TrendingTopic> r0 = r3.items
                java.lang.Object r0 = h.a.n.i(r0)
                com.ss.android.ugc.aweme.discover.model.TrendingTopic r0 = (com.ss.android.ugc.aweme.discover.model.TrendingTopic) r0
                boolean r0 = r0.getNeedToBeSupplied()
                if (r0 == 0) goto L_0x003a
                com.ss.android.ugc.aweme.discover.repo.gson.a$b r0 = new com.ss.android.ugc.aweme.discover.repo.gson.a$b
                r0.<init>(r1, r3)
                r3.setLazyParseCallable(r0)
            L_0x003a:
                java.util.concurrent.Callable r0 = r3.getLazyParseCallable()
                if (r0 == 0) goto L_0x0057
                com.ss.android.ugc.aweme.discover.repo.fetcher.b$d$1 r0 = new com.ss.android.ugc.aweme.discover.repo.fetcher.b$d$1
                r0.<init>(r3)
                f.a.t r0 = f.a.t.a(r0)
            L_0x0049:
                h.p r1 = new h.p
                if (r0 != 0) goto L_0x0053
                f.a.t<java.lang.Object> r0 = f.a.e.e.e.v.f157740a
                f.a.t r0 = f.a.h.a.a(r0)
            L_0x0053:
                r1.<init>(r3, r0)
                return r1
            L_0x0057:
                r0 = 0
                goto L_0x0049
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.repo.fetcher.b.d.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82014a;

        static {
            Covode.recordClassIndex(51047);
        }

        e(b bVar) {
            this.f82014a = bVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            p pVar = (p) obj;
            l.d(pVar, "");
            TrendingTopicList trendingTopicList = (TrendingTopicList) pVar.component1();
            t tVar = (t) pVar.component2();
            this.f82014a.f82001b = trendingTopicList.cursor;
            this.f82014a.f82002f = trendingTopicList.doesHaveMore();
            b bVar = this.f82014a;
            l.b(trendingTopicList, "");
            com.bytedance.frameworks.baselib.network.http.a<?> requestInfo = trendingTopicList.getRequestInfo();
            if (requestInfo != null) {
                long j2 = requestInfo.f28920h;
                long j3 = j2 - bVar.f82004h;
                if (j3 > 0 && bVar.f82004h > 0) {
                    com.bytedance.ies.watcher.c.a("discovery_trending_topic_receive_time", j3);
                }
                long j4 = requestInfo.f28917e - bVar.f82004h;
                if (j4 > 0 && bVar.f82004h > 0) {
                    com.bytedance.ies.watcher.c.a("discovery_trending_topic_real_request", j4);
                }
                long currentTimeMillis = System.currentTimeMillis() - j2;
                if (currentTimeMillis > 0) {
                    com.bytedance.ies.watcher.c.a("discovery_trending_topic_json_timing_gap", currentTimeMillis);
                }
            }
            bVar.f82004h = 0;
            return t.b((Iterable) trendingTopicList.items).a(tVar.a((f.a.d.g) AnonymousClass1.f82015a, false));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final f f82016a = new f();

        static {
            Covode.recordClassIndex(51049);
        }

        f() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            TrendingTopic trendingTopic = (TrendingTopic) obj;
            l.d(trendingTopic, "");
            List<Aweme> items = trendingTopic.getItems();
            if (items != null) {
                List g2 = n.g((Collection) items);
                if (!com.bytedance.common.utility.collection.b.a((Collection) g2)) {
                    for (int i2 = 0; i2 < g2.size(); i2++) {
                        Aweme a2 = AwemeService.b().a((Aweme) g2.get(i2));
                        l.b(a2, "");
                        g2.set(i2, a2);
                    }
                }
            }
            if (trendingTopic.isPicAd()) {
                return new TrendingTopicOrAd(trendingTopic.getAdData());
            }
            return new TrendingTopicOrAd(trendingTopic);
        }
    }

    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t a(Object obj) {
        boolean z;
        t tVar;
        t b2;
        t b3;
        c cVar = (c) obj;
        l.d(cVar, "");
        ArrayList<t> arrayList = new ArrayList();
        if (cVar.getCursor() == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean isFromSuggestSearch = cVar.isFromSuggestSearch();
        int a2 = com.bytedance.ies.abmock.b.a().a(true, "discovery_change_request_num", 10);
        if (a2 == 0) {
            a2 = 10;
        }
        if (z) {
            this.f82001b = 0;
            this.f82002f = true;
            if (h.f121133a.q()) {
                t<?> r = h.f121133a.r();
                Objects.requireNonNull(r, "null cannot be cast to non-null type io.reactivex.Observable<com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem.SuggestSearchSection>");
                arrayList.add(r);
            }
            if (!isFromSuggestSearch) {
                t<R> d2 = DiscoverApiNew.a.f80769a.getBannerList(1, Integer.valueOf(com.ss.android.ugc.aweme.compliance.api.a.g().b()), com.ss.android.ugc.aweme.compliance.api.a.d().f()).a(a.C1917a.f81997a).c(a.b.f81998a).d();
                l.b(d2, "");
                arrayList.add(d2);
                arrayList.add(a(0, a2));
            }
        } else {
            arrayList.add(a(cVar.getCursor(), 10));
        }
        if (com.bytedance.ies.abmock.b.a().a(true, "discover_async_request_fix", 0) == 2) {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) arrayList, 10));
            for (t tVar2 : arrayList) {
                if (z) {
                    b3 = tVar2.b((x) f.a.h.a.a(v.f157740a)).b(f.a.h.a.b(f.a.k.a.f158006c));
                } else {
                    b3 = tVar2.b(f.a.h.a.b(f.a.k.a.f158006c));
                }
                arrayList2.add(b3);
            }
            tVar = t.c(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList, 10));
            for (t tVar3 : arrayList) {
                if (z) {
                    b2 = tVar3.b((x) f.a.h.a.a(v.f157740a));
                } else {
                    b2 = tVar3.b(f.a.h.a.b(f.a.k.a.f158006c));
                }
                arrayList3.add(b2);
            }
            tVar = t.a(arrayList3);
        }
        t b4 = tVar.h().c(new c(this, z)).d().b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b4, "");
        return b4;
    }

    private final t<DiscoverSectionItem.TrendingTopicOrAdSection> a(int i2, int i3) {
        int b2 = com.ss.android.ugc.aweme.compliance.api.a.g().b();
        String f2 = com.ss.android.ugc.aweme.compliance.api.a.d().f();
        if (this.f82004h == 0) {
            this.f82004h = System.currentTimeMillis();
        }
        ab<TrendingTopicList> trendingTopicsV2 = this.f82000a.getTrendingTopicsV2(i2, i3, Integer.valueOf(com.ss.android.ugc.aweme.discover.l.a.b() ? 1 : 0), Integer.valueOf(b2), f2);
        if (com.ss.android.ugc.aweme.discover.l.a.a() && i2 == 0) {
            trendingTopicsV2 = trendingTopicsV2.d(new C1918b(this, 0, i3, b2, f2));
            l.b(trendingTopicsV2, "");
        }
        return a(trendingTopicsV2);
    }
}
