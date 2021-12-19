package com.ss.android.ugc.aweme.notification.vm;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.vm.a.e;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.ag;
import h.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class NotificationCombineVM extends BaseNotificationVM {

    /* renamed from: i  reason: collision with root package name */
    public static final a f114062i = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public boolean f114063d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f114064e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f114065f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f114066g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f114067h;

    /* renamed from: j  reason: collision with root package name */
    private WeakReference<Context> f114068j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f114069k = h.i.a((h.f.a.a) s.f114091a);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f114070l = h.i.a((h.f.a.a) r.f114090a);

    /* renamed from: m  reason: collision with root package name */
    private final h.h f114071m = h.i.a((h.f.a.a) j.f114080a);
    private final h.h n = h.i.a((h.f.a.a) i.f114079a);
    private final h.h o = h.i.a((h.f.a.a) c.f114073a);
    private final h.h p = com.ss.android.ugc.aweme.notification.b.a.a(b.f114072a);
    private final h.h q = com.ss.android.ugc.aweme.notification.b.a.a(w.f114098a);
    private final h.h r = h.i.a((h.f.a.a) k.f114081a);
    private final h.h s = h.i.a((h.f.a.a) e.f114075a);
    private final h.h t = h.i.a((h.f.a.a) l.f114082a);
    private final h.h u = h.i.a((h.f.a.a) d.f114074a);
    private final h.h v = h.i.a((h.f.a.a) v.f114097a);

    static {
        Covode.recordClassIndex(73333);
    }

    private final List<com.ss.android.ugc.aweme.notification.bean.a> u() {
        return (List) this.s.getValue();
    }

    private final Set<Integer> v() {
        return (Set) this.v.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<a> j() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f114069k.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> k() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f114070l.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<a> l() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f114071m.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> m() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.n.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.a<Boolean> n() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.a) this.o.getValue();
    }

    public final MusNotice o() {
        return (MusNotice) this.p.getValue();
    }

    public final MusNotice p() {
        return (MusNotice) this.q.getValue();
    }

    public final List<MusNotice> q() {
        return (List) this.r.getValue();
    }

    public final com.ss.android.ugc.aweme.notification.vm.a.g r() {
        return (com.ss.android.ugc.aweme.notification.vm.a.g) this.t.getValue();
    }

    public final com.ss.android.ugc.aweme.notification.vm.a.c s() {
        return (com.ss.android.ugc.aweme.notification.vm.a.c) this.u.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73334);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static NotificationCombineVM a(Fragment fragment) {
            h.f.b.l.d(fragment, "");
            ac a2 = ae.a(fragment, (ad.b) null).a(NotificationCombineVM.class);
            h.f.b.l.b(a2, "");
            NotificationCombineVM notificationCombineVM = (NotificationCombineVM) a2;
            notificationCombineVM.a(fragment.getContext());
            return notificationCombineVM;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.a<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f114073a = new c();

        static {
            Covode.recordClassIndex(73336);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.a<Boolean> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.a();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.notification.vm.a.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f114074a = new d();

        static {
            Covode.recordClassIndex(73337);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.vm.a.c invoke() {
            return new com.ss.android.ugc.aweme.notification.vm.a.c();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<List<com.ss.android.ugc.aweme.notification.bean.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f114075a = new e();

        static {
            Covode.recordClassIndex(73338);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<com.ss.android.ugc.aweme.notification.bean.a> invoke() {
            return new ArrayList();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f114079a = new i();

        static {
            Covode.recordClassIndex(73342);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f114080a = new j();

        static {
            Covode.recordClassIndex(73343);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<a> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<List<MusNotice>> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f114081a = new k();

        static {
            Covode.recordClassIndex(73344);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<MusNotice> invoke() {
            return new ArrayList();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.notification.vm.a.g> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f114082a = new l();

        static {
            Covode.recordClassIndex(73345);
        }

        l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.vm.a.g invoke() {
            return new com.ss.android.ugc.aweme.notification.vm.a.g();
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f114090a = new r();

        static {
            Covode.recordClassIndex(73352);
        }

        r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f114091a = new s();

        static {
            Covode.recordClassIndex(73353);
        }

        s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<a> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<Set<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f114097a = new v();

        static {
            Covode.recordClassIndex(73356);
        }

        v() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<Integer> invoke() {
            return new LinkedHashSet();
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        r();
        s();
    }

    static final class b extends h.f.b.m implements h.f.a.a<MusNotice> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f114072a = new b();

        static {
            Covode.recordClassIndex(73335);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MusNotice invoke() {
            MusNotice musNotice = new MusNotice(false, 1, null);
            musNotice.type = 2008;
            return musNotice;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<MusNotice> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f114098a = new w();

        static {
            Covode.recordClassIndex(73357);
        }

        w() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MusNotice invoke() {
            MusNotice musNotice = new MusNotice(false, 1, null);
            musNotice.type = 2007;
            return musNotice;
        }
    }

    public static final class q implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotificationCombineVM f114088a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f114089b;

        static {
            Covode.recordClassIndex(73351);
        }

        public q(NotificationCombineVM notificationCombineVM, a aVar) {
            this.f114088a = notificationCombineVM;
            this.f114089b = aVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f114088a.f114066g = false;
            this.f114088a.j().setValue(this.f114089b);
        }
    }

    public final com.ss.android.ugc.aweme.inbox.r t() {
        Context context;
        if (a() != a.b.a()) {
            return com.ss.android.ugc.aweme.inbox.r.GONE;
        }
        com.ss.android.ugc.aweme.inbox.q qVar = com.ss.android.ugc.aweme.inbox.q.THIRD_PLATFORM;
        WeakReference<Context> weakReference = this.f114068j;
        if (weakReference != null) {
            context = weakReference.get();
        } else {
            context = null;
        }
        return qVar.decideDisplay(context);
    }

    static final class u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f114095a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f114096b;

        static {
            Covode.recordClassIndex(73355);
        }

        u(String str, String str2) {
            this.f114095a = str;
            this.f114096b = str2;
        }

        public final void run() {
            com.ss.android.ugc.aweme.common.r.a("contact_invite_show", ag.a(h.v.a("enter_from", "notification_page"), h.v.a("has_photo", this.f114095a), h.v.a("rank", this.f114096b), h.v.a("enter_method", "direct")));
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM
    public final com.ss.android.ugc.aweme.inbox.r h() {
        Context context;
        this.f114064e = com.ss.android.ugc.aweme.friends.service.a.f97047a.d().c();
        if (a() != a.b.a()) {
            return com.ss.android.ugc.aweme.inbox.r.GONE;
        }
        com.ss.android.ugc.aweme.inbox.q qVar = com.ss.android.ugc.aweme.inbox.q.CONTACTS;
        WeakReference<Context> weakReference = this.f114068j;
        if (weakReference != null) {
            context = weakReference.get();
        } else {
            context = null;
        }
        return qVar.decideDisplay(context);
    }

    static final class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f114092a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f114093b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f114094c;

        static {
            Covode.recordClassIndex(73354);
        }

        t(String str, String str2, String str3) {
            this.f114092a = str;
            this.f114093b = str2;
            this.f114094c = str3;
        }

        public final void run() {
            com.ss.android.ugc.aweme.common.r.a("invite_friend_click", ag.a(h.v.a("enter_from", "notification_page"), h.v.a("has_photo", this.f114092a), h.v.a("rank", this.f114093b), h.v.a("enter_method", "direct"), h.v.a("url", this.f114094c)));
        }
    }

    public static final class f<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final f f114076a = new f();

        static {
            Covode.recordClassIndex(73339);
        }

        f() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            e.b bVar = (e.b) obj;
            h.f.b.l.d(bVar, "");
            return bVar.f114140b;
        }
    }

    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotificationCombineVM f114077a;

        static {
            Covode.recordClassIndex(73340);
        }

        public g(NotificationCombineVM notificationCombineVM) {
            this.f114077a = notificationCombineVM;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f114077a.f114067h = false;
            this.f114077a.l().setValue(obj);
        }
    }

    public static final class n<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final n f114084a = new n();

        static {
            Covode.recordClassIndex(73348);
        }

        n() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            e.b bVar = (e.b) obj;
            h.f.b.l.d(bVar, "");
            return bVar.f114140b;
        }
    }

    public final z a(Context context) {
        if (context == null) {
            return null;
        }
        this.f114068j = new WeakReference<>(context);
        return z.f158842a;
    }

    public final int b(String str) {
        return r().a(str);
    }

    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotificationCombineVM f114078a;

        static {
            Covode.recordClassIndex(73341);
        }

        public h(NotificationCombineVM notificationCombineVM) {
            this.f114078a = notificationCombineVM;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f114078a.f114067h = false;
            com.ss.android.ugc.aweme.common.f.a("NotificationCombineVM", "loadMoreBottom error", (Throwable) obj);
            this.f114078a.m().setValue(true);
        }
    }

    public static final class m<T> implements f.a.w {

        /* renamed from: a  reason: collision with root package name */
        public static final m f114083a = new m();

        static {
            Covode.recordClassIndex(73346);
        }

        m() {
        }

        @Override // f.a.w
        public final void subscribe(f.a.v<e.b<a>> vVar) {
            h.f.b.l.d(vVar, "");
            com.ss.android.ugc.aweme.common.ac.a(vVar, new e.b(new com.ss.android.ugc.aweme.notification.vm.a.e<Object, a>() {
                /* class com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM.m.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(73347);
                }

                @Override // com.ss.android.ugc.aweme.notification.vm.a.e
                public final boolean d() {
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.ss.android.ugc.aweme.notification.vm.a.e
                public final /* synthetic */ a a() {
                    throw new IllegalAccessError("cannot call retrieveData");
                }

                @Override // com.ss.android.ugc.aweme.notification.vm.a.e
                public final f.a.t<e.b<a>> b() {
                    throw new IllegalAccessError("cannot call refresh");
                }

                @Override // com.ss.android.ugc.aweme.notification.vm.a.e
                public final f.a.t<e.b<a>> c() {
                    return e.a.a();
                }

                /* Return type fixed from 'com.ss.android.ugc.aweme.notification.vm.a.e$b' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Throwable] */
                @Override // com.ss.android.ugc.aweme.notification.vm.a.e
                public final /* synthetic */ e.b<a> a(a aVar, Throwable th) {
                    h.f.b.l.d(aVar, "");
                    return e.a.a(this, aVar, th);
                }
            }, new a(null, null, 3)));
        }
    }

    public static final class o<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114085a;

        static {
            Covode.recordClassIndex(73349);
        }

        public o(a aVar) {
            this.f114085a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a aVar = (a) obj;
            if (aVar.f114105a != null) {
                this.f114085a.f114105a = aVar.f114105a;
            }
            List<? extends Friend> list = aVar.f114106b;
            if (list != null && !list.isEmpty()) {
                this.f114085a.f114106b = aVar.f114106b;
            }
        }
    }

    public static final class p<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotificationCombineVM f114086a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f114087b;

        static {
            Covode.recordClassIndex(73350);
        }

        public p(NotificationCombineVM notificationCombineVM, a aVar) {
            this.f114086a = notificationCombineVM;
            this.f114087b = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.common.f.a("NotificationCombineVM", "refreshBottom error:" + this.f114087b, (Throwable) obj);
            this.f114086a.f114066g = false;
            this.f114086a.k().setValue(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM
    public final void a(com.ss.android.ugc.aweme.notification.bean.a aVar) {
        boolean z;
        h.f.b.l.d(aVar, "");
        if (!v().contains(Integer.valueOf(aVar.hashCode()))) {
            String valueOf = String.valueOf(u().indexOf(aVar));
            Friend friend = aVar.f113234b;
            if (friend == null || friend.getPhotoUri() == null) {
                z = false;
            } else {
                z = true;
            }
            com.ss.android.ugc.aweme.common.r.a().execute(new u(com.ss.android.ugc.aweme.friends.widget.a.a.a(z), valueOf));
            v().add(Integer.valueOf(aVar.hashCode()));
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM
    public final void a(com.ss.android.ugc.aweme.notification.bean.a aVar, String str) {
        boolean z;
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(str, "");
        String valueOf = String.valueOf(u().indexOf(aVar));
        Friend friend = aVar.f113234b;
        if (friend == null || friend.getPhotoUri() == null) {
            z = false;
        } else {
            z = true;
        }
        com.ss.android.ugc.aweme.common.r.a().execute(new t(com.ss.android.ugc.aweme.friends.widget.a.a.a(z), valueOf, str));
    }

    public final b a(List<? extends MusNotice> list, a aVar) {
        RecommendList recommendList;
        h.f.b.l.d(aVar, "");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        ArrayList arrayList2 = new ArrayList();
        if (h() == com.ss.android.ugc.aweme.inbox.r.BOTTOM) {
            arrayList2.add(o());
        }
        if (t() == com.ss.android.ugc.aweme.inbox.r.BOTTOM) {
            arrayList2.add(p());
        }
        u().clear();
        List<? extends Friend> list2 = aVar.f114106b;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                u().add(new com.ss.android.ugc.aweme.notification.bean.a(2010, it.next()));
            }
        }
        boolean z = true;
        if (!u().isEmpty()) {
            u().add(0, new com.ss.android.ugc.aweme.notification.bean.a(2009, null));
        }
        this.f114063d = !u().isEmpty();
        RecommendList recommendList2 = aVar.f114105a;
        if (recommendList2 != null) {
            List<User> inviterList = recommendList2.getInviterList();
            if (inviterList != null) {
                Iterator<T> it2 = inviterList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new com.ss.android.ugc.aweme.notification.bean.q(2011, it2.next(), null, 0, 12));
                }
            }
            List<User> userList = recommendList2.getUserList();
            if (userList != null && !userList.isEmpty()) {
                if (this.f114063d) {
                    arrayList2.add(new com.ss.android.ugc.aweme.notification.bean.q(2006, null, userList, recommendList2.getTotalCount(), 2));
                } else {
                    Iterator<T> it3 = userList.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(new com.ss.android.ugc.aweme.notification.bean.q(2001, it3.next(), null, 0, 12));
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList2.add(0, new com.ss.android.ugc.aweme.notification.bean.q(LiveNetAdaptiveHurryTimeSetting.DEFAULT, null, null, 0, 14));
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(u());
        if (arrayList.isEmpty() && (!arrayList3.isEmpty())) {
            MusNotice musNotice = new MusNotice(false, 1, null);
            musNotice.type = 2003;
            arrayList.add(musNotice);
        }
        arrayList.addAll(arrayList3);
        if (this.f114063d || (recommendList = aVar.f114105a) == null || !recommendList.hasMore()) {
            z = false;
        }
        return new b(arrayList, arrayList3, z);
    }
}
