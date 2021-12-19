package com.ss.android.ugc.aweme.notification.vm.a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.ac;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequest;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.notification.bean.LiveMessage;
import com.ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import com.ss.android.ugc.aweme.notification.bean.p;
import com.ss.android.ugc.aweme.notification.bean.t;
import com.ss.android.ugc.aweme.notification.e.a;
import com.ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel;
import com.ss.android.ugc.aweme.notification.vm.a.e;
import f.a.v;
import f.a.w;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class h implements e<b, List<? extends MusNotice>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f114191a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f114192b = h.i.a((h.f.a.a) p.f114220a);

    /* renamed from: c  reason: collision with root package name */
    private final h.h f114193c = h.i.a((h.f.a.a) c.f114200a);

    /* renamed from: d  reason: collision with root package name */
    private final h.h f114194d = h.i.a((h.f.a.a) r.f114222a);

    /* renamed from: e  reason: collision with root package name */
    private final h.h f114195e = h.i.a((h.f.a.a) f.f114203a);

    /* renamed from: f  reason: collision with root package name */
    private final h.h f114196f = h.i.a((h.f.a.a) d.f114201a);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f114197g = h.i.a((h.f.a.a) e.f114202a);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f114198h = h.i.a((h.f.a.a) q.f114221a);

    static {
        Covode.recordClassIndex(73416);
    }

    private List<MusNotice> j() {
        return (List) this.f114192b.getValue();
    }

    private List<t> k() {
        return (List) this.f114194d.getValue();
    }

    private List<com.ss.android.ugc.aweme.notification.bean.p> l() {
        return (List) this.f114195e.getValue();
    }

    private final TutorialVideoViewModel m() {
        return (TutorialVideoViewModel) this.f114198h.getValue();
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final boolean d() {
        return false;
    }

    public final List<com.ss.android.ugc.aweme.notification.bean.d> e() {
        return (List) this.f114193c.getValue();
    }

    public final List<com.ss.android.ugc.aweme.notification.bean.f> f() {
        return (List) this.f114196f.getValue();
    }

    public final List<NoticeItems> g() {
        return (List) this.f114197g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73417);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f114199a;

        static {
            Covode.recordClassIndex(73418);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.f114199a == ((b) obj).f114199a;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f114199a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "ReqParam(markRead=" + this.f114199a + ")";
        }

        private /* synthetic */ b() {
            this(true);
        }

        public b(boolean z) {
            this.f114199a = z;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<List<com.ss.android.ugc.aweme.notification.bean.d>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f114200a = new c();

        static {
            Covode.recordClassIndex(73419);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<com.ss.android.ugc.aweme.notification.bean.d> invoke() {
            return new ArrayList();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<List<com.ss.android.ugc.aweme.notification.bean.f>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f114201a = new d();

        static {
            Covode.recordClassIndex(73420);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<com.ss.android.ugc.aweme.notification.bean.f> invoke() {
            return new ArrayList();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<List<NoticeItems>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f114202a = new e();

        static {
            Covode.recordClassIndex(73421);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<NoticeItems> invoke() {
            return new ArrayList();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<List<com.ss.android.ugc.aweme.notification.bean.p>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f114203a = new f();

        static {
            Covode.recordClassIndex(73422);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<com.ss.android.ugc.aweme.notification.bean.p> invoke() {
            return new ArrayList();
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<List<MusNotice>> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f114220a = new p();

        static {
            Covode.recordClassIndex(73435);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<MusNotice> invoke() {
            return new ArrayList();
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<List<t>> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f114222a = new r();

        static {
            Covode.recordClassIndex(73437);
        }

        r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<t> invoke() {
            return new ArrayList();
        }
    }

    /* Return type fixed from 'f.a.t' to match base method */
    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final /* synthetic */ f.a.t<e.b<List<? extends MusNotice>>> b() {
        return a((b) null);
    }

    /* Return type fixed from 'f.a.t' to match base method */
    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final /* synthetic */ f.a.t<e.b<List<? extends MusNotice>>> c() {
        return e.a.a();
    }

    static final class q extends h.f.b.m implements h.f.a.a<TutorialVideoViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f114221a = new q();

        static {
            Covode.recordClassIndex(73436);
        }

        q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TutorialVideoViewModel invoke() {
            TutorialVideoViewModel tutorialVideoViewModel = new TutorialVideoViewModel();
            tutorialVideoViewModel.a(com.bytedance.ies.ugc.appcontext.f.j());
            return tutorialVideoViewModel;
        }
    }

    /* renamed from: h */
    public final synchronized List<MusNotice> a() {
        List<MusNotice> k2;
        MethodCollector.i(4028);
        k2 = h.a.n.k(j());
        MethodCollector.o(4028);
        return k2;
    }

    public final synchronized void i() {
        MethodCollector.i(1024);
        j().clear();
        j().addAll(e());
        j().addAll(k());
        j().addAll(l());
        MethodCollector.o(1024);
    }

    /* access modifiers changed from: package-private */
    public static final class j<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f114213a;

        static {
            Covode.recordClassIndex(73429);
        }

        j(h hVar) {
            this.f114213a = hVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            TutorialVideoResp tutorialVideoResp = (TutorialVideoResp) obj;
            h.f.b.l.d(tutorialVideoResp, "");
            this.f114213a.a(tutorialVideoResp);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f114204a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f114205b;

        static {
            Covode.recordClassIndex(73423);
        }

        g(h hVar, List list) {
            this.f114204a = hVar;
            this.f114205b = list;
        }

        @Override // f.a.w
        public final void subscribe(final v<e.b<List<MusNotice>>> vVar) {
            h.f.b.l.d(vVar, "");
            f.a.t.a(this.f114205b).a(AnonymousClass1.f114206a, new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.notification.vm.a.h.g.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f114207a;

                static {
                    Covode.recordClassIndex(73425);
                }

                {
                    this.f114207a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    com.ss.android.ugc.aweme.common.f.a("TopDataSource", "refresh error", th);
                    this.f114207a.f114204a.i();
                    v vVar = vVar;
                    h.f.b.l.b(vVar, "");
                    ac.a(vVar, this.f114207a.f114204a.a(this.f114207a.f114204a.a(), th));
                }
            }, new f.a.d.a(this) {
                /* class com.ss.android.ugc.aweme.notification.vm.a.h.g.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f114209a;

                static {
                    Covode.recordClassIndex(73426);
                }

                {
                    this.f114209a = r1;
                }

                @Override // f.a.d.a
                public final void a() {
                    this.f114209a.f114204a.i();
                    v vVar = vVar;
                    h.f.b.l.b(vVar, "");
                    h hVar = this.f114209a.f114204a;
                    List<MusNotice> h2 = this.f114209a.f114204a.a();
                    h.f.b.l.d(h2, "");
                    ac.a(vVar, e.a.a(hVar, h2));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.h$h  reason: collision with other inner class name */
    public static final class C2924h<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f114211a;

        static {
            Covode.recordClassIndex(73427);
        }

        C2924h(h hVar) {
            this.f114211a = hVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            NoticeCombineResponse noticeCombineResponse = (NoticeCombineResponse) obj;
            h.f.b.l.d(noticeCombineResponse, "");
            a.b b2 = com.ss.android.ugc.aweme.notification.e.a.b();
            if (b2 != null) {
                h.f.b.l.d(noticeCombineResponse, "");
                com.ss.android.ugc.aweme.notification.e.d.b(new a.b.e(b2, noticeCombineResponse));
            }
            this.f114211a.a(noticeCombineResponse);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final i f114212a = new i();

        static {
            Covode.recordClassIndex(73428);
        }

        i() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.d(th, "");
            com.ss.android.ugc.aweme.common.f.a("TopDataSource", "refresh janus error", th);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final k f114214a = new k();

        static {
            Covode.recordClassIndex(73430);
        }

        k() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.d(th, "");
            com.ss.android.ugc.aweme.common.f.a("TopDataSource", "refresh tutorial error", th);
            return z.f158842a;
        }
    }

    public static final class m<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final m f114216a = new m();

        static {
            Covode.recordClassIndex(73432);
        }

        m() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.d(th, "");
            com.ss.android.ugc.aweme.common.f.a("TopDataSource", "refreshFollowReq error", th);
            return false;
        }
    }

    public static final class o<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final o f114219a = new o();

        static {
            Covode.recordClassIndex(73434);
        }

        o() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.d(th, "");
            com.ss.android.ugc.aweme.common.f.a("TopDataSource", "refreshLive error", th);
            return false;
        }
    }

    public final synchronized void a(TutorialVideoResp tutorialVideoResp) {
        MethodCollector.i(985);
        k().clear();
        if (tutorialVideoResp.getInfo() != null) {
            List<t> k2 = k();
            TutorialVideoInfo info = tutorialVideoResp.getInfo();
            if (info == null) {
                h.f.b.l.b();
            }
            k2.add(t.a.a(info));
        }
        MethodCollector.o(985);
    }

    public static final class l<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f114215a;

        static {
            Covode.recordClassIndex(73431);
        }

        public l(h hVar) {
            this.f114215a = hVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Boolean apply(FollowRequestResponse followRequestResponse) {
            int i2;
            Boolean valueOf;
            MethodCollector.i(4392);
            h.f.b.l.d(followRequestResponse, "");
            int i3 = followRequestResponse.total;
            synchronized (this.f114215a) {
                try {
                    com.ss.android.ugc.aweme.notification.bean.d dVar = (com.ss.android.ugc.aweme.notification.bean.d) h.a.n.h((List) this.f114215a.e());
                    boolean z = false;
                    if (dVar != null) {
                        i2 = dVar.f113238a;
                    } else {
                        i2 = 0;
                    }
                    if (i3 != i2) {
                        this.f114215a.e().clear();
                        if (i3 > 0) {
                            this.f114215a.e().add(new com.ss.android.ugc.aweme.notification.bean.d(i3, h.a.z.INSTANCE));
                        }
                        this.f114215a.i();
                        z = true;
                    }
                    valueOf = Boolean.valueOf(z);
                } finally {
                    MethodCollector.o(4392);
                }
            }
            return valueOf;
        }
    }

    public final f.a.t<e.b<List<MusNotice>>> a(b bVar) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (bVar != null) {
            z = bVar.f114199a;
        } else {
            z = true;
        }
        f.a.t f2 = f.a.t.a(MusNotificationApiManager.a(z)).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new C2924h(this)).f(i.f114212a);
        h.f.b.l.b(f2, "");
        arrayList.add(f2);
        if (!com.ss.android.ugc.aweme.notification.utils.l.a() && com.bytedance.ies.abmock.b.a().a(true, "inbox_has_top_msg", false)) {
            f.a.t<R> f3 = m().a().b(f.a.h.a.b(f.a.k.a.f158006c)).d(new j(this)).f(k.f114214a);
            h.f.b.l.b(f3, "");
            arrayList.add(f3);
        }
        f.a.t<e.b<List<MusNotice>>> a2 = f.a.t.a(new g(this, arrayList));
        h.f.b.l.b(a2, "");
        return a2;
    }

    public static final class n<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f114217a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f114218b;

        static {
            Covode.recordClassIndex(73433);
        }

        public n(h hVar, long j2) {
            this.f114217a = hVar;
            this.f114218b = j2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Boolean apply(LiveNoticeMessageResponse liveNoticeMessageResponse) {
            List<CombineLiveNotice> list;
            boolean z;
            MethodCollector.i(4112);
            h.f.b.l.d(liveNoticeMessageResponse, "");
            com.ss.android.ugc.aweme.notification.utils.e.a(liveNoticeMessageResponse, SystemClock.elapsedRealtime() - this.f114218b);
            LiveMessage liveMessage = liveNoticeMessageResponse.liveMessage;
            if (liveMessage != null) {
                list = liveMessage.liveNotice;
            } else {
                list = null;
            }
            boolean z2 = false;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                synchronized (this.f114217a) {
                    try {
                        this.f114217a.f().clear();
                        List<com.ss.android.ugc.aweme.notification.bean.f> f2 = this.f114217a.f();
                        LiveMessage liveMessage2 = liveNoticeMessageResponse.liveMessage;
                        if (liveMessage2 == null) {
                            h.f.b.l.b();
                        }
                        List<CombineLiveNotice> list2 = liveMessage2.liveNotice;
                        if (list2 == null) {
                            h.f.b.l.b();
                        }
                        ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(com.ss.android.ugc.aweme.notification.bean.g.a(it.next()));
                        }
                        f2.addAll(arrayList);
                    } catch (Throwable th) {
                        MethodCollector.o(4112);
                        throw th;
                    }
                }
                z2 = true;
            }
            Boolean valueOf = Boolean.valueOf(z2);
            MethodCollector.o(4112);
            return valueOf;
        }
    }

    public final synchronized void a(NoticeCombineResponse noticeCombineResponse) {
        MethodCollector.i(909);
        NoticeCombineDatas data = noticeCombineResponse.getData();
        if (data == null) {
            MethodCollector.o(909);
            return;
        }
        e().clear();
        l().clear();
        f().clear();
        g().clear();
        FollowRequest followRequest = data.getFollowRequest();
        if (followRequest != null && followRequest.getFollowRequestCount() > 0) {
            e().add(new com.ss.android.ugc.aweme.notification.bean.d(followRequest.getFollowRequestCount(), h.a.z.INSTANCE));
        }
        com.ss.android.ugc.aweme.notice.repo.list.bean.k recommendAvatars = data.getRecommendAvatars();
        if (recommendAvatars != null) {
            LiveOuterService.s();
            List<UrlModel> list = recommendAvatars.f112868a;
            if (list != null && !list.isEmpty()) {
                l().add(p.a.a(recommendAvatars));
            }
        }
        List<CombineLiveNotice> liveNotices = data.getLiveNotices();
        if (liveNotices != null) {
            Iterator<T> it = liveNotices.iterator();
            while (it.hasNext()) {
                f().add(com.ss.android.ugc.aweme.notification.bean.g.a(it.next()));
            }
        }
        List<NoticeItems> shopNotice = data.getShopNotice();
        if (shopNotice != null) {
            g().addAll(shopNotice);
        }
        List<NoticeItems> reportNotice = data.getReportNotice();
        if (reportNotice != null) {
            g().addAll(reportNotice);
            MethodCollector.o(909);
            return;
        }
        MethodCollector.o(909);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.notification.vm.a.e$b' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Throwable] */
    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final /* synthetic */ e.b<List<? extends MusNotice>> a(List<? extends MusNotice> list, Throwable th) {
        h.f.b.l.d(list, "");
        return e.a.a(this, list, th);
    }
}
