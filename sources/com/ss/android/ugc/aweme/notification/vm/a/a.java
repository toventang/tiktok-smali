package com.ss.android.ugc.aweme.notification.vm.a;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.bean.q;
import com.ss.android.ugc.aweme.notification.vm.a.e;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.d.g;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class a implements e<Object, List<? extends MusNotice>> {

    /* renamed from: a  reason: collision with root package name */
    public static final C2922a f114107a = new C2922a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f114108b = i.a((h.f.a.a) b.f114110a);

    /* renamed from: c  reason: collision with root package name */
    private final h f114109c = i.a((h.f.a.a) d.f114112a);

    static {
        Covode.recordClassIndex(73365);
    }

    private final List<MusNotice> g() {
        return (List) this.f114108b.getValue();
    }

    public final g e() {
        return (g) this.f114109c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.a$a  reason: collision with other inner class name */
    public static final class C2922a {
        static {
            Covode.recordClassIndex(73366);
        }

        private C2922a() {
        }

        public /* synthetic */ C2922a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<g> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f114112a = new d();

        static {
            Covode.recordClassIndex(73369);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return new g();
        }
    }

    static final class b extends m implements h.f.a.a<List<MusNotice>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f114110a = new b();

        static {
            Covode.recordClassIndex(73367);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<MusNotice> invoke() {
            return Collections.synchronizedList(new ArrayList());
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final boolean d() {
        return e().d();
    }

    /* renamed from: f */
    public final List<MusNotice> a() {
        List<MusNotice> g2 = g();
        l.b(g2, "");
        return n.k(g2);
    }

    /* Return type fixed from 'f.a.t<com.ss.android.ugc.aweme.notification.vm.a.e$b<java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice>>>' to match base method */
    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final t<e.b<List<? extends MusNotice>>> b() {
        t<e.b<List<MusNotice>>> f2 = e().b().d(new e(this)).f(new f(this));
        l.b(f2, "");
        return f2;
    }

    /* Return type fixed from 'f.a.t<com.ss.android.ugc.aweme.notification.vm.a.e$b<java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice>>>' to match base method */
    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final t<e.b<List<? extends MusNotice>>> c() {
        t<e.b<List<MusNotice>>> d2 = e().c().d(new c(this));
        l.b(d2, "");
        return d2;
    }

    public final int a(String str) {
        return e().a(str);
    }

    static final class c<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114111a;

        static {
            Covode.recordClassIndex(73368);
        }

        c(a aVar) {
            this.f114111a = aVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            e.b bVar = (e.b) obj;
            l.d(bVar, "");
            this.f114111a.a(bVar.f114140b.f114105a);
            a aVar = this.f114111a;
            return aVar.a(aVar.a());
        }
    }

    static final class e<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114113a;

        static {
            Covode.recordClassIndex(73370);
        }

        e(a aVar) {
            this.f114113a = aVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            e.b bVar = (e.b) obj;
            l.d(bVar, "");
            this.f114113a.a(bVar.f114140b.f114105a);
            a aVar = this.f114113a;
            return aVar.a(aVar.a());
        }
    }

    static final class f<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114114a;

        static {
            Covode.recordClassIndex(73371);
        }

        f(a aVar) {
            this.f114114a = aVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            l.d(th, "");
            a aVar = this.f114114a;
            return aVar.a(aVar.a(), th);
        }
    }

    public final /* synthetic */ e.b a(Object obj) {
        l.d(obj, "");
        return e.a.a(this, obj);
    }

    public final void a(RecommendList recommendList) {
        if (recommendList != null) {
            g().clear();
            List<User> inviterList = recommendList.getInviterList();
            if (inviterList != null) {
                Iterator<T> it = inviterList.iterator();
                while (it.hasNext()) {
                    g().add(new q(2011, it.next(), null, 0, 12));
                }
            }
            List<User> userList = recommendList.getUserList();
            if (userList != null) {
                Iterator<T> it2 = userList.iterator();
                while (it2.hasNext()) {
                    g().add(new q(2001, it2.next(), null, 0, 12));
                }
            }
            List<MusNotice> g2 = g();
            l.b(g2, "");
            if (!g2.isEmpty()) {
                g().add(0, new q(LiveNetAdaptiveHurryTimeSetting.DEFAULT, null, null, 0, 14));
            }
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.notification.vm.a.e$b' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Throwable] */
    @Override // com.ss.android.ugc.aweme.notification.vm.a.e
    public final /* synthetic */ e.b<List<? extends MusNotice>> a(List<? extends MusNotice> list, Throwable th) {
        l.d(list, "");
        return e.a.a(this, list, th);
    }
}
