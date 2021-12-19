package com.ss.android.ugc.aweme.inbox.widget.multi;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.g;
import com.ss.android.ugc.aweme.inbox.api.MultiApiManager;
import com.ss.android.ugc.aweme.inbox.q;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.i;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class MultiViewModel extends ac implements g {
    public static final int q = a.b.a();
    public static final a r = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final t<List<k>> f104392a;

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<List<k>> f104393b;

    /* renamed from: c  reason: collision with root package name */
    final t<InboxAdapterWidget.b> f104394c;

    /* renamed from: d  reason: collision with root package name */
    public final LiveData<InboxAdapterWidget.b> f104395d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.android.widget.d<Boolean> f104396e;

    /* renamed from: f  reason: collision with root package name */
    public final LiveData<Boolean> f104397f;

    /* renamed from: g  reason: collision with root package name */
    final com.ss.android.ugc.aweme.inbox.f.a f104398g;

    /* renamed from: h  reason: collision with root package name */
    d f104399h;

    /* renamed from: i  reason: collision with root package name */
    b f104400i;

    /* renamed from: j  reason: collision with root package name */
    b f104401j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f104402k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f104403l;

    /* renamed from: m  reason: collision with root package name */
    p<Integer, Boolean> f104404m;
    public NoticeCombineResponse n;
    public NoticeListsResponse o;
    public FollowPageResponse p;
    private final f.a.b.a s = new f.a.b.a();
    private final h t = i.a((h.f.a.a) b.f104405a);
    private final b u;
    private final b v;
    private c w;
    private i x;

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f104407a = new d();

        static {
            Covode.recordClassIndex(66852);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private final String e() {
        return (String) this.t.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66849);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static MultiViewModel a(Fragment fragment) {
            l.d(fragment, "");
            ac a2 = ae.a(fragment, (ad.b) null).a(MultiViewModel.class);
            l.b(a2, "");
            return (MultiViewModel) a2;
        }
    }

    private void g() {
        this.f104394c.postValue(InboxAdapterWidget.b.LOADING);
    }

    public final boolean c() {
        if (this.f104399h != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f104409a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f104410b;

        static {
            Covode.recordClassIndex(66854);
        }

        f(z.e eVar, Map map) {
            this.f104409a = eVar;
            this.f104410b = map;
        }

        public final void run() {
            r.a(this.f104409a.element, this.f104410b);
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        this.s.dispose();
        com.ss.android.ugc.aweme.friends.service.a.f97047a.b(this);
    }

    static final class b extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104405a = new b();

        static {
            Covode.recordClassIndex(66850);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return dg.a().b(n.a(new com.ss.android.ugc.aweme.notice.repo.list.bean.g(MultiViewModel.q, 0, 0, 0, 0, 14, null)));
        }
    }

    static {
        Covode.recordClassIndex(66848);
    }

    static p<Integer, Boolean> d() {
        boolean z;
        int[] e2 = n.e((Collection<Integer>) com.ss.android.ugc.aweme.notification.redpoint.f.b());
        int a2 = com.ss.android.ugc.aweme.notice.api.b.a(Arrays.copyOf(e2, e2.length));
        int[] e3 = n.e((Collection<Integer>) com.ss.android.ugc.aweme.notification.redpoint.f.a());
        int a3 = com.ss.android.ugc.aweme.notice.api.b.a(Arrays.copyOf(e3, e3.length));
        Integer valueOf = Integer.valueOf(a2);
        if (a3 > 0) {
            z = true;
        } else {
            z = false;
        }
        return v.a(valueOf, Boolean.valueOf(z));
    }

    private static c f() {
        int i2 = 1;
        com.ss.android.ugc.aweme.inbox.r decideDisplay$default = q.decideDisplay$default(q.CONTACTS, null, 1, null);
        if (decideDisplay$default != com.ss.android.ugc.aweme.inbox.r.TOP || decideDisplay$default == null) {
            return null;
        }
        if (!com.ss.android.ugc.aweme.inbox.b.c.c()) {
            if (com.ss.android.ugc.aweme.inbox.b.c.d()) {
                i2 = 2;
            } else {
                i2 = -1;
            }
        }
        return new c(i2);
    }

    public MultiViewModel() {
        t<List<k>> tVar = new t<>();
        this.f104392a = tVar;
        this.f104393b = tVar;
        t<InboxAdapterWidget.b> tVar2 = new t<>();
        this.f104394c = tVar2;
        this.f104395d = tVar2;
        com.bytedance.android.widget.d<Boolean> dVar = new com.bytedance.android.widget.d<>();
        this.f104396e = dVar;
        this.f104397f = dVar;
        com.ss.android.ugc.aweme.inbox.f.a aVar = new com.ss.android.ugc.aweme.inbox.f.a();
        this.f104398g = aVar;
        b b2 = aVar.b();
        this.u = b2;
        b c2 = aVar.c();
        this.v = c2;
        this.w = f();
        i iVar = null;
        com.ss.android.ugc.aweme.inbox.r decideDisplay$default = q.decideDisplay$default(q.THIRD_PLATFORM, null, 1, null);
        if (decideDisplay$default == com.ss.android.ugc.aweme.inbox.r.TOP && decideDisplay$default != null) {
            iVar = new i();
        }
        this.x = iVar;
        this.f104400i = b2;
        this.f104401j = c2;
        this.f104404m = d();
        tVar.postValue(a());
        com.ss.android.ugc.aweme.friends.service.a.f97047a.a(this);
    }

    /* access modifiers changed from: package-private */
    public final List<k> a() {
        ArrayList arrayList = new ArrayList();
        d dVar = this.f104399h;
        if (dVar != null) {
            arrayList.add(dVar);
        }
        c cVar = this.w;
        if (cVar != null) {
            arrayList.add(cVar);
        }
        i iVar = this.x;
        if (iVar != null) {
            arrayList.add(iVar);
        }
        b bVar = this.f104401j;
        if (bVar != null) {
            arrayList.add(bVar);
        }
        arrayList.add(this.f104400i);
        return arrayList;
    }

    public final void b() {
        g();
        boolean i2 = com.ss.android.ugc.aweme.inbox.b.c.i();
        f.a.t<NoticeCombineResponse> b2 = MultiApiManager.a().fetchCombineNotice(5, "tiktok_message", 0, 3, 81, i2 ? 1 : 0, com.bytedance.android.livesdkapi.m.a.a(com.bytedance.ies.ugc.appcontext.d.a())).b(f.a.h.a.b(f.a.k.a.f158006c)).b(f.a.h.a.a(f.a.e.e.e.v.f157740a));
        MultiApiManager.API a2 = MultiApiManager.a();
        String e2 = e();
        l.b(e2, "");
        f.a.t a3 = f.a.t.a(b2, a2.fetchGroupNotice(e2).b(f.a.h.a.b(f.a.k.a.f158006c)).b(f.a.h.a.a(f.a.e.e.e.v.f157740a)));
        if (com.ss.android.ugc.aweme.inbox.b.c.h()) {
            a3 = a3.a(MultiApiManager.a().fetchFollowPageData(com.ss.android.ugc.aweme.inbox.b.c.i(), 0, 20, 0, 0, 0).b(f.a.h.a.b(f.a.k.a.f158006c)).b(f.a.h.a.a(f.a.e.e.e.v.f157740a)));
        }
        this.n = null;
        this.o = null;
        this.p = null;
        this.s.a(a3.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this), d.f104407a, new e(this)));
    }

    /* access modifiers changed from: package-private */
    public static final class e implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiViewModel f104408a;

        static {
            Covode.recordClassIndex(66853);
        }

        e(MultiViewModel multiViewModel) {
            this.f104408a = multiViewModel;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:48:0x011f, code lost:
            if (r7 != null) goto L_0x00da;
         */
        @Override // f.a.d.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
            // Method dump skipped, instructions count: 296
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel.e.a():void");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiViewModel f104406a;

        static {
            Covode.recordClassIndex(66851);
        }

        c(MultiViewModel multiViewModel) {
            this.f104406a = multiViewModel;
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            MultiViewModel multiViewModel = this.f104406a;
            if (baseResponse instanceof NoticeCombineResponse) {
                multiViewModel.n = (NoticeCombineResponse) baseResponse;
            } else if (baseResponse instanceof NoticeListsResponse) {
                multiViewModel.o = (NoticeListsResponse) baseResponse;
            } else if (baseResponse instanceof FollowPageResponse) {
                multiViewModel.p = (FollowPageResponse) baseResponse;
            }
        }
    }

    private static p<String, String> a(n nVar) {
        String str;
        int i2 = m.f104494a[nVar.f104495a.ordinal()];
        String str2 = "0";
        if (i2 == 1) {
            str2 = String.valueOf(nVar.f104496b);
            str = "number_dot";
        } else if (i2 == 2) {
            str = "yellow_dot";
        } else if (i2 == 3) {
            str = null;
        } else {
            throw new h.n();
        }
        return v.a(str2, str);
    }

    public final void a(k kVar) {
        l.d(kVar, "");
        List<k> value = this.f104393b.getValue();
        if (value != null) {
            List<k> g2 = n.g((Collection) value);
            int indexOf = g2.indexOf(kVar);
            g2.size();
            k remove = g2.remove(indexOf);
            if (remove instanceof i) {
                this.x = null;
            } else if (remove instanceof c) {
                this.w = null;
                com.ss.android.ugc.aweme.notification.utils.e.a(com.ss.android.ugc.aweme.inbox.r.TOP);
            }
            this.f104392a.setValue(g2);
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.g
    public final void a(com.ss.android.ugc.aweme.recommend.f fVar) {
        l.d(fVar, "");
        if (fVar != com.ss.android.ugc.aweme.recommend.f.CONTACT) {
            return;
        }
        if (com.ss.android.ugc.aweme.friends.service.a.f97047a.d().c()) {
            if (this.w != null) {
                ArrayList arrayList = null;
                this.w = null;
                List<k> value = this.f104393b.getValue();
                if (value != null) {
                    arrayList = new ArrayList();
                    for (T t2 : value) {
                        if (!(t2 instanceof c)) {
                            arrayList.add(t2);
                        }
                    }
                }
                this.f104392a.postValue(arrayList);
            }
        } else if (this.w == null) {
            this.w = f();
            this.f104392a.postValue(a());
        }
    }

    public static void a(b bVar, String str, String str2) {
        l.d(bVar, "");
        l.d(str, "");
        l.d(str2, "");
        a("show", bVar, str, str2);
    }

    public static void a(String str, b bVar, String str2, String str3) {
        p<String, String> a2 = a(bVar.f104446e);
        String component1 = a2.component1();
        String component2 = a2.component2();
        Map b2 = ag.b(v.a("enter_from", "notification_page"), v.a("show_cnt", component1), v.a("action_type", str), v.a("show_message_type", str2), v.a("has_dots", str3));
        if (component2 != null) {
            b2.put("notice_type", component2);
        }
        z.e eVar = new z.e();
        eVar.element = "inbox_activity_notice";
        if (bVar.f104442a == e.FOLLOWER) {
            eVar.element = "inbox_follower_notice";
        }
        r.a().execute(new f(eVar, b2));
    }
}
