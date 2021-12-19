package com.ss.android.ugc.aweme.inbox;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.inbox.x;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ab;
import com.ss.android.ugc.aweme.profile.presenter.u;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public final class RecommendUserVM extends ac implements com.ss.android.ugc.aweme.friends.g, u {

    /* renamed from: k  reason: collision with root package name */
    public static final a f103989k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> f103990a;

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<Boolean> f103991b;

    /* renamed from: c  reason: collision with root package name */
    public final LiveData<InboxAdapterWidget.b> f103992c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<List<ad>> f103993d;

    /* renamed from: e  reason: collision with root package name */
    public final LiveData<List<ad>> f103994e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.a<Boolean> f103995f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f103996g;

    /* renamed from: h  reason: collision with root package name */
    public final Set<String> f103997h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f103998i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f103999j;

    /* renamed from: l  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.arch.widgets.base.c<InboxAdapterWidget.b> f104000l;

    /* renamed from: m  reason: collision with root package name */
    private List<z> f104001m;
    private List<? extends af> n;
    private final h o;
    private d p;
    private w q;
    private final h r;
    private final h s;

    static {
        Covode.recordClassIndex(66606);
    }

    public RecommendUserVM() {
        this(false, 1, null);
    }

    private final aa i() {
        return (aa) this.r.getValue();
    }

    public final ab a() {
        return (ab) this.o.getValue();
    }

    public final Set<String> b() {
        return (Set) this.s.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66607);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static RecommendUserVM a(Fragment fragment) {
            l.d(fragment, "");
            ac a2 = ae.a(fragment, (ad.b) null).a(RecommendUserVM.class);
            l.b(a2, "");
            return (RecommendUserVM) a2;
        }
    }

    static final class b extends m implements h.f.a.a<Set<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104002a = new b();

        static {
            Covode.recordClassIndex(66608);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    static final class g extends m implements h.f.a.a<aa> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f104008a = new g();

        static {
            Covode.recordClassIndex(66613);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ aa invoke() {
            return new aa();
        }
    }

    private void k() {
        this.f104000l.postValue(InboxAdapterWidget.b.LOADING);
    }

    static final class e extends m implements h.f.a.a<ab> {
        final /* synthetic */ RecommendUserVM this$0;

        static {
            Covode.recordClassIndex(66611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(RecommendUserVM recommendUserVM) {
            super(0);
            this.this$0 = recommendUserVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ab invoke() {
            return new ab(new RecommendCommonUserModel(), this.this$0);
        }
    }

    public static int c() {
        if (com.ss.android.ugc.aweme.friends.service.a.f97047a.d().c()) {
            return 1;
        }
        return 2;
    }

    public final void f() {
        this.f103993d.postValue(a(this));
    }

    public final void g() {
        this.f103993d.postValue(a(x.a.SHOW));
    }

    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendUserVM f104003a;

        static {
            Covode.recordClassIndex(66609);
        }

        public c(RecommendUserVM recommendUserVM) {
            this.f104003a = recommendUserVM;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ab a2 = this.f104003a.a();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            a2.a(g2.getCurUserId(), RecommendUserVM.c(), "0");
            return z.f158842a;
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendUserVM f104004a;

        static {
            Covode.recordClassIndex(66610);
        }

        d(RecommendUserVM recommendUserVM) {
            this.f104004a = recommendUserVM;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ab a2 = this.f104004a.a();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            a2.a(g2.getCurUserId(), RecommendUserVM.c(), "0", true);
            return z.f158842a;
        }
    }

    private final d h() {
        r decideDisplay$default = q.decideDisplay$default(q.CONTACTS, null, 1, null);
        if (decideDisplay$default == null || !(!this.f103999j) || decideDisplay$default != r.BOTTOM) {
            return null;
        }
        return new d();
    }

    private final List<ad> j() {
        ArrayList arrayList = new ArrayList();
        d dVar = this.p;
        if (dVar != null) {
            arrayList.add(dVar);
        }
        w wVar = this.q;
        if (wVar != null) {
            arrayList.add(wVar);
        }
        return arrayList;
    }

    public final boolean d() {
        Boolean value = this.f103995f.getValue();
        if (value != null) {
            return value.booleanValue();
        }
        return false;
    }

    public final void e() {
        k();
        a().e();
        i.b(new d(this), i.f4824a);
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        a().b();
        com.ss.android.ugc.aweme.friends.service.a.f97047a.b(this);
    }

    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendUserVM f104005a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f104006b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f104007c;

        static {
            Covode.recordClassIndex(66612);
        }

        public f(RecommendUserVM recommendUserVM, User user, Map map) {
            this.f104005a = recommendUserVM;
            this.f104006b = user;
            this.f104007c = map;
        }

        public final void run() {
            String str;
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "notification_page").a("rec_type", this.f104006b.getRecType()).a("rec_uid", this.f104006b.getUid());
            RecommendUserVM recommendUserVM = this.f104005a;
            String uid = this.f104006b.getUid();
            String str2 = "";
            l.b(uid, str2);
            r.a("show_recommend_user_cell", a2.a("impr_order", recommendUserVM.a(uid)).a("req_id", this.f104006b.getRequestId()).a("button_type", NoticeServiceImpl.f().a(this.f104006b)).a("relation_type", this.f104006b.getFriendTypeStr()).f66730a);
            com.ss.android.ugc.aweme.metrics.u a3 = new com.ss.android.ugc.aweme.metrics.u().a("notification_page");
            a3.f109596a = u.c.CARD;
            a3.f109597b = u.a.SHOW;
            com.ss.android.ugc.aweme.metrics.u s = a3.a(this.f104006b).s(this.f104006b.getRequestId());
            Map map = this.f104007c;
            if (!(map == null || (str = (String) map.get("position")) == null)) {
                str2 = str;
            }
            s.p(str2).f();
        }
    }

    public final int a(String str) {
        l.d(str, "");
        return a().a(str);
    }

    private final void a(InboxAdapterWidget.b bVar) {
        List<ad> value;
        if ((bVar == InboxAdapterWidget.b.FAIL || bVar == InboxAdapterWidget.b.EMPTY) && (value = this.f103994e.getValue()) != null && !value.isEmpty()) {
            this.f104000l.setValue(InboxAdapterWidget.b.SUCCESS);
        } else {
            this.f104000l.setValue(bVar);
        }
    }

    private static /* synthetic */ List a(RecommendUserVM recommendUserVM) {
        x.a aVar = x.a.HIDE;
        List<? extends af> list = recommendUserVM.n;
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f104041a);
        }
        ac acVar = new ac(arrayList, recommendUserVM.n.size());
        List<ad> j2 = recommendUserVM.j();
        j2.addAll(recommendUserVM.f104001m);
        j2.add(acVar);
        if (!(!j2.isEmpty())) {
            return new ArrayList();
        }
        j2.add(0, recommendUserVM.i());
        j2.add(new x(aVar));
        return j2;
    }

    private static p<List<z>, List<af>> c(RecommendList recommendList) {
        List list;
        List list2;
        List<User> inviterList = recommendList.getInviterList();
        if (inviterList != null) {
            list = new ArrayList();
            for (T t : inviterList) {
                if (t != null) {
                    String rid = recommendList.getRid();
                    l.b(rid, "");
                    list.add(new z(t, rid));
                }
            }
        } else {
            list = h.a.z.INSTANCE;
        }
        List<User> userList = recommendList.getUserList();
        if (userList != null) {
            list2 = new ArrayList();
            for (T t2 : userList) {
                if (t2 != null) {
                    String rid2 = recommendList.getRid();
                    l.b(rid2, "");
                    list2.add(new ae(t2, rid2));
                }
            }
        } else {
            list2 = h.a.z.INSTANCE;
        }
        return new p<>(list, list2);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.u
    public final void b(RecommendList recommendList) {
        if (recommendList != null) {
            this.f103996g = recommendList.hasMore();
            p<List<z>, List<af>> c2 = c(recommendList);
            List<z> component1 = c2.component1();
            List<af> component2 = c2.component2();
            if (!component1.isEmpty() || !component2.isEmpty()) {
                this.f104001m = component1;
                this.n = component2;
                this.f103993d.setValue(a(x.a.SHOW));
                return;
            }
            this.f103993d.setValue(a(x.a.HIDE));
            return;
        }
        this.f103993d.setValue(a(x.a.HIDE));
    }

    public RecommendUserVM(boolean z) {
        this.f103999j = z;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> cVar = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();
        this.f103990a = cVar;
        this.f103991b = cVar;
        com.ss.android.ugc.aweme.arch.widgets.base.c<InboxAdapterWidget.b> cVar2 = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();
        this.f104000l = cVar2;
        this.f103992c = cVar2;
        com.ss.android.ugc.aweme.arch.widgets.base.c<List<ad>> cVar3 = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();
        this.f103993d = cVar3;
        this.f103994e = cVar3;
        this.f103995f = new com.ss.android.ugc.aweme.arch.widgets.base.a<>();
        this.f104001m = h.a.z.INSTANCE;
        this.n = h.a.z.INSTANCE;
        this.o = h.i.a((h.f.a.a) new e(this));
        this.f103997h = new LinkedHashSet();
        this.p = h();
        w wVar = null;
        r decideDisplay$default = q.decideDisplay$default(q.THIRD_PLATFORM, null, 1, null);
        if (decideDisplay$default != null && (!z) && decideDisplay$default == r.BOTTOM) {
            wVar = new w();
        }
        this.q = wVar;
        this.r = h.i.a((h.f.a.a) g.f104008a);
        this.s = h.i.a((h.f.a.a) b.f104002a);
        List<ad> j2 = j();
        if (!j2.isEmpty()) {
            j2.add(0, i());
        }
        cVar3.postValue(j2);
        com.ss.android.ugc.aweme.friends.service.a.f97047a.a(this);
    }

    public final List<ad> a(x.a aVar) {
        List<ad> j2 = j();
        j2.addAll(this.f104001m);
        j2.addAll(this.n);
        if (!(!j2.isEmpty())) {
            return new ArrayList();
        }
        j2.add(0, i());
        j2.add(new x(aVar));
        return j2;
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.u
    public final void a(RecommendList recommendList) {
        if (recommendList != null) {
            this.f103996g = recommendList.hasMore();
            p<List<z>, List<af>> c2 = c(recommendList);
            List<z> component1 = c2.component1();
            List<af> component2 = c2.component2();
            if (!component1.isEmpty() || !component2.isEmpty()) {
                this.f104001m = component1;
                this.n = component2;
                if (d()) {
                    g();
                } else {
                    f();
                }
                a(InboxAdapterWidget.b.SUCCESS);
            } else {
                a(InboxAdapterWidget.b.EMPTY);
                return;
            }
        } else {
            a(InboxAdapterWidget.b.EMPTY);
        }
        this.f103997h.clear();
    }

    public final void a(ad adVar) {
        String str;
        l.d(adVar, "");
        List<ad> value = this.f103994e.getValue();
        if (value != null) {
            List<ad> g2 = n.g((Collection) value);
            int indexOf = g2.indexOf(adVar);
            int size = g2.size();
            if (indexOf >= 0 && size > indexOf) {
                ad remove = g2.remove(indexOf);
                if (remove instanceof d) {
                    this.p = null;
                    r rVar = r.BOTTOM;
                    l.d(rVar, "");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("enter_from", "notification_page");
                    linkedHashMap.put("platform", "contact");
                    linkedHashMap.put("enter_method", "long_press");
                    if (rVar == r.TOP) {
                        str = "top";
                    } else {
                        str = "bottom";
                    }
                    linkedHashMap.put("position", str);
                    r.a("authorize_card_close", linkedHashMap);
                } else if (remove instanceof w) {
                    this.q = null;
                } else if (remove instanceof af) {
                    User user = ((af) remove).f104041a;
                    com.ss.android.ugc.aweme.recommend.users.b bVar = com.ss.android.ugc.aweme.recommend.users.b.f120122a;
                    String uid = user.getUid();
                    l.b(uid, "");
                    bVar.a(uid, user.getSecUid());
                }
                if (g2.size() == 1) {
                    g2.clear();
                }
                this.f103993d.setValue(g2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.g
    public final void a(com.ss.android.ugc.aweme.recommend.f fVar) {
        l.d(fVar, "");
        if (fVar != com.ss.android.ugc.aweme.recommend.f.CONTACT) {
            return;
        }
        if (com.ss.android.ugc.aweme.friends.service.a.f97047a.d().c()) {
            if (this.p != null) {
                ArrayList arrayList = null;
                this.p = null;
                List<ad> value = this.f103994e.getValue();
                if (value != null) {
                    arrayList = new ArrayList();
                    for (T t : value) {
                        if (!(t instanceof d)) {
                            arrayList.add(t);
                        }
                    }
                }
                this.f103993d.postValue(arrayList);
            }
        } else if (this.p == null) {
            d h2 = h();
            this.p = h2;
            if (h2 != null) {
                if (d()) {
                    g();
                } else {
                    f();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.u
    public final void a(Exception exc) {
        com.ss.android.ugc.aweme.common.f.a("RecommendUserVM", "request recommend user failed!", exc);
        a(InboxAdapterWidget.b.FAIL);
        if (this.f103996g) {
            this.f103993d.setValue(a(x.a.ERROR));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecommendUserVM(boolean z, int i2, h.f.b.g gVar) {
        this((i2 & 1) != 0 ? false : z);
    }
}
