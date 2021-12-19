package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.preload.e;
import com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.model.o;
import com.ss.android.ugc.aweme.commercialize.model.r;
import com.ss.android.ugc.aweme.commercialize.utils.aq;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.n.h;
import h.a.af;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.j.g;
import h.v;
import h.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public final class ao implements ba {

    /* renamed from: a  reason: collision with root package name */
    static WeakReference<com.ss.android.ugc.aweme.feed.q.a> f75588a;

    /* renamed from: b  reason: collision with root package name */
    static volatile int f75589b = -1;

    /* renamed from: c  reason: collision with root package name */
    static volatile long f75590c;

    /* renamed from: d  reason: collision with root package name */
    public static final ao f75591d = new ao();

    /* renamed from: e  reason: collision with root package name */
    private static Timer f75592e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f75593f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile int f75594g = -1;

    /* renamed from: h  reason: collision with root package name */
    private static final Set<Integer> f75595h = new LinkedHashSet();

    /* renamed from: i  reason: collision with root package name */
    private static volatile boolean f75596i;

    public static final class c extends TimerTask {
        static {
            Covode.recordClassIndex(46634);
        }

        c() {
        }

        public final void run() {
            com.ss.android.ugc.aweme.feed.q.a aVar;
            WeakReference<com.ss.android.ugc.aweme.feed.q.a> weakReference = ao.f75588a;
            if (weakReference != null && (aVar = weakReference.get()) != null) {
                l.b(aVar, "");
                int aE = aVar.aE();
                com.ss.android.ugc.aweme.feed.adapter.b bVar = aVar.W;
                l.b(bVar, "");
                ao.a(aE, new ArrayList(bVar.e()));
            }
        }
    }

    private ao() {
    }

    private static r e() {
        r rVar = com.ss.android.ugc.aweme.commercialize.m.a.f74843b;
        if (rVar == null) {
            return com.ss.android.ugc.aweme.commercialize.m.a.f74842a;
        }
        return rVar;
    }

    public static void b() {
        Timer timer = f75592e;
        if (timer != null) {
            timer.cancel();
        }
        f75592e = null;
    }

    public static boolean d() {
        if (e().f74909b) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(46629);
    }

    public static void a() {
        long millis = TimeUnit.SECONDS.toMillis(com.ss.android.ugc.aweme.commercialize.abtest.b.a().getRequestPeriod());
        f75592e = new Timer();
        c cVar = new c();
        Timer timer = f75592e;
        if (timer != null) {
            timer.schedule(cVar, millis, millis);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.ba
    public final void c() {
        if (e().f74908a && f75596i) {
            f75588a = null;
            f75596i = false;
            f75594g = -1;
            f75589b = -1;
            f75595h.clear();
            b();
        }
    }

    static final class a extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75597a = new a();

        static {
            Covode.recordClassIndex(46630);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.feed.q.a aVar;
            WeakReference<com.ss.android.ugc.aweme.feed.q.a> weakReference = ao.f75588a;
            if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
                long j2 = 0;
                if (ao.f75590c != 0) {
                    j2 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - ao.f75590c);
                }
                if (j2 > com.ss.android.ugc.aweme.commercialize.abtest.b.a().getRequestPeriod()) {
                    l.b(aVar, "");
                    int aE = aVar.aE();
                    com.ss.android.ugc.aweme.feed.adapter.b bVar = aVar.W;
                    l.b(bVar, "");
                    if (ao.a(aE, new ArrayList(bVar.e()))) {
                        ao.b();
                        ao.a();
                    }
                }
            }
            return z.f158842a;
        }
    }

    public static final class b implements AwemeAdRankApi.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f75598a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f75599b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f75600c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f75601d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f75602e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f75603f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f75604g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List f75605h;

        static {
            Covode.recordClassIndex(46631);
        }

        static final class a extends m implements h.f.a.a<z> {
            final /* synthetic */ List $newCachedAwemeList;
            final /* synthetic */ String $requestId;
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(46632);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, List list, String str) {
                super(0);
                this.this$0 = bVar;
                this.$newCachedAwemeList = list;
                this.$requestId = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                com.ss.android.ugc.aweme.feed.q.a aVar;
                WeakReference<com.ss.android.ugc.aweme.feed.q.a> weakReference = ao.f75588a;
                h hVar = null;
                if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
                    int aE = aVar.aE();
                    int aF = aVar.aF();
                    if (this.this$0.f75602e == aE && this.this$0.f75602e == ao.f75589b && aF == this.this$0.f75603f) {
                        if (aVar instanceof h) {
                            hVar = aVar;
                        }
                        h hVar2 = hVar;
                        if (hVar2 != null) {
                            hVar2.a(this.$newCachedAwemeList, this.this$0.f75600c, this.this$0.f75604g, new h.a(this) {
                                /* class com.ss.android.ugc.aweme.commercialize.utils.ao.b.a.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ a f75606a;

                                static {
                                    Covode.recordClassIndex(46633);
                                }

                                /* JADX WARN: Incorrect args count in method signature: ()V */
                                {
                                    this.f75606a = r1;
                                }

                                @Override // com.ss.android.ugc.aweme.feed.n.h.a
                                public final void a(String str, Exception exc) {
                                    if (ao.d()) {
                                        String valueOf = String.valueOf(str);
                                        List<Aweme> list = this.f75606a.this$0.f75605h;
                                        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                                        for (Aweme aweme : list) {
                                            arrayList.add(aweme.getAid());
                                        }
                                        ap.a("fail", valueOf);
                                    }
                                }
                            });
                        } else if (ao.d()) {
                            List<Aweme> list = this.this$0.f75605h;
                            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                            for (Aweme aweme : list) {
                                arrayList.add(aweme.getAid());
                            }
                            ap.a("fail", "unsupported_page");
                        }
                    } else if (ao.d()) {
                        List<Aweme> list2 = this.this$0.f75605h;
                        ArrayList arrayList2 = new ArrayList(n.a((Iterable) list2, 10));
                        for (Aweme aweme2 : list2) {
                            arrayList2.add(aweme2.getAid());
                        }
                        ap.a("fail", "current_item_changed");
                    }
                }
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.a
        public final void a(String str) {
            l.d(str, "");
            if (ao.d()) {
                List<Aweme> list = this.f75605h;
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                for (Aweme aweme : list) {
                    arrayList.add(aweme.getAid());
                }
                ap.a("fail", str);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.a
        public final void a(String str, Exception exc) {
            String str2;
            l.d(str, "");
            if (ao.d()) {
                StringBuilder append = new StringBuilder().append(str).append(' ');
                if (exc != null) {
                    str2 = exc.getMessage();
                } else {
                    str2 = null;
                }
                String sb = append.append(str2).toString();
                List<Aweme> list = this.f75605h;
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                for (Aweme aweme : list) {
                    arrayList.add(aweme.getAid());
                }
                ap.a("fail", sb);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.a
        public final void a(List<o> list, String str) {
            e a2;
            Aweme repackAweme;
            l.d(list, "");
            List<Aweme> g2 = n.g((Collection) this.f75598a);
            for (T t : list) {
                Aweme repackAweme2 = t.getRepackAweme();
                if (!(repackAweme2 == null || !repackAweme2.isAd() || (repackAweme = t.getRepackAweme()) == null)) {
                    j.b(d.a(), repackAweme);
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "receive", repackAweme.getAwemeRawAd()).c();
                }
            }
            ArrayList arrayList = new ArrayList();
            for (T t2 : list) {
                Object repackAweme3 = t2.getRepackAweme();
                if (repackAweme3 != null || (repackAweme3 = this.f75599b.get(t2.getAwemeId())) != null) {
                    arrayList.add(repackAweme3);
                }
            }
            ArrayList arrayList2 = arrayList;
            int i2 = 0;
            for (Object obj : arrayList2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                Aweme aweme = (Aweme) obj;
                aweme.awemePosition = this.f75600c + i2;
                aweme.setFeedCount(this.f75601d);
                if (aweme.isAd()) {
                    g2.remove(aweme);
                }
                i2 = i3;
            }
            for (Aweme aweme2 : g2) {
                ao.a(aweme2);
            }
            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
            if (!(f2 == null || (a2 = f2.a()) == null)) {
                a2.a(arrayList2);
            }
            aq.a(new a(this, arrayList2, str));
        }

        b(List list, Map map, int i2, long j2, int i3, int i4, int i5, List list2) {
            this.f75598a = list;
            this.f75599b = map;
            this.f75600c = i2;
            this.f75601d = j2;
            this.f75602e = i3;
            this.f75603f = i4;
            this.f75604g = i5;
            this.f75605h = list2;
        }
    }

    public static void a(Aweme aweme) {
        Context a2 = d.a();
        j.b(a2, "delete", aweme, j.a(a2, aweme, false, (Map<String, String>) null));
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "delete", aweme.getAwemeRawAd()).c();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.ba
    public final void a(Object obj, int i2) {
        l.d(obj, "");
        f75589b = Math.max(f75589b, i2);
        if (e().f74908a) {
            if (!f75596i) {
                f75588a = new WeakReference<>(obj);
                f75596i = true;
                a();
            }
            a aVar = a.f75597a;
            l.d(aVar, "");
            i.b(new aq.b(aVar), i.f4824a);
        }
    }

    public static boolean a(int i2, List<? extends Aweme> list) {
        boolean z;
        boolean z2;
        l.d(list, "");
        if (!f75593f || i2 == f75594g || i2 < f75589b) {
            return false;
        }
        Set<Integer> set = f75595h;
        if (set.contains(Integer.valueOf(i2)) || (list.size() - i2) - 1 <= 2) {
            return false;
        }
        long b2 = e.b();
        if (b2 <= 0) {
            return false;
        }
        if (aq.a((Aweme) list.get(i2 + 1)) || aq.a((Aweme) list.get(i2 + 2)) || b2 < com.ss.android.ugc.aweme.commercialize.abtest.b.a().getVisitAdMaxInterval() - 1) {
            z = false;
        } else {
            z = true;
        }
        int i3 = i2 + 2;
        if (!aq.a((Aweme) list.get(i3)) || b2 > com.ss.android.ugc.aweme.commercialize.abtest.b.a().getVisitAdMinInterval() + 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(z || z2)) {
            return false;
        }
        f75594g = i2;
        set.add(Integer.valueOf(i2));
        f75590c = System.currentTimeMillis();
        int size = list.size() - 1;
        int size2 = list.size();
        long feedCount = ((Aweme) list.get(i3)).getFeedCount();
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            arrayList.add(v.a(t.getAid(), t));
        }
        Map a2 = ag.a(arrayList);
        g gVar = new g(i3, size);
        ArrayList arrayList2 = new ArrayList(n.a(gVar, 10));
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            arrayList2.add(list.get(((af) it).a()));
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (((Aweme) obj).isAd()) {
                arrayList4.add(obj);
            }
        }
        AwemeAdRankApi.a(arrayList3, b2, new b(arrayList4, a2, i3, feedCount, i2, size2, size, arrayList3));
        return true;
    }
}
