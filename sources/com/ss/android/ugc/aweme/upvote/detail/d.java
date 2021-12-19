package com.ss.android.ugc.aweme.upvote.detail;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.api.UpvoteApi;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class d implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final d f142132a;

    /* renamed from: b  reason: collision with root package name */
    private static final h f142133b = h.i.a((h.f.a.a) f.f142144a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f142134c = h.i.a((h.f.a.a) g.f142145a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f142135d = h.i.a((h.f.a.a) a.f142136a);

    public static HashMap<String, List<c>> a() {
        return (HashMap) f142133b.getValue();
    }

    static HashMap<String, UpvoteListViewModel> b() {
        return (HashMap) f142134c.getValue();
    }

    private static f.a.b.a c() {
        return (f.a.b.a) f142135d.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(147, new org.greenrobot.eventbus.g(d.class, "onUserBlocked", com.ss.android.ugc.aweme.profile.b.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private d() {
    }

    public final void a(String str, String str2) {
        String str3;
        l.d(str, "");
        l.d(str, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        if (b.d().get(str) == null) {
            b.d().put(str, new com.ss.android.ugc.aweme.upvote.c.e(n.a(new com.ss.android.ugc.aweme.upvote.c.h(null, str2, str, System.currentTimeMillis(), 0, 0, curUser, false, 0, false, null, 0, false, com.ss.android.ugc.aweme.upvote.c.d.PRE_PUBLISH, 8113, null)), 0, false, 1, null, 22, null));
        } else {
            com.ss.android.ugc.aweme.upvote.c.e eVar = b.d().get(str);
            Iterator<T> it = eVar.getUpvotes().iterator();
            while (true) {
                str3 = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                User user = next.getUser();
                if (user != null) {
                    str3 = user.getUid();
                }
                l.b(curUser, "");
                if (l.a((Object) str3, (Object) curUser.getUid())) {
                    str3 = next;
                    break;
                }
            }
            com.ss.android.ugc.aweme.upvote.c.h hVar = (com.ss.android.ugc.aweme.upvote.c.h) str3;
            if (hVar == null) {
                com.ss.android.ugc.aweme.upvote.c.h hVar2 = new com.ss.android.ugc.aweme.upvote.c.h(null, str2, str, System.currentTimeMillis(), 0, 0, curUser, false, 0, false, null, 0, false, com.ss.android.ugc.aweme.upvote.c.d.PRE_PUBLISH, 8113, null);
                ArrayList arrayList = new ArrayList();
                arrayList.add(hVar2);
                arrayList.addAll(eVar.getUpvotes());
                b.d().put(str, com.ss.android.ugc.aweme.upvote.c.e.copy$default(eVar, arrayList, 0, false, 1 + eVar.getTotal(), null, 22, null));
            } else {
                hVar.setText(str2);
            }
        }
        a(str);
    }

    static final class a extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f142136a = new a();

        static {
            Covode.recordClassIndex(92902);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    static final class f extends m implements h.f.a.a<HashMap<String, List<c>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f142144a = new f();

        static {
            Covode.recordClassIndex(92907);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, List<c>> invoke() {
            return new HashMap();
        }
    }

    static final class g extends m implements h.f.a.a<HashMap<String, UpvoteListViewModel>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f142145a = new g();

        static {
            Covode.recordClassIndex(92908);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, UpvoteListViewModel> invoke() {
            return new HashMap();
        }
    }

    static {
        Covode.recordClassIndex(92901);
        d dVar = new d();
        f142132a = dVar;
        cg.a(dVar);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f142138a = new c();

        static {
            Covode.recordClassIndex(92904);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String.valueOf(obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f142137a = new b();

        static {
            Covode.recordClassIndex(92903);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            for (T t : ((com.ss.android.ugc.aweme.upvote.c.b) obj).f142029a) {
                d.f142132a.a(t.getItemId(), t, true);
            }
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f142142a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f142143b;

        static {
            Covode.recordClassIndex(92906);
        }

        e(a aVar, long j2) {
            this.f142142a = aVar;
            this.f142143b = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            String.valueOf(th);
            a aVar = this.f142142a;
            if (aVar != null) {
                l.b(th, "");
                aVar.a(th, this.f142143b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.d$d  reason: collision with other inner class name */
    static final class C3792d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f142139a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f142140b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f142141c;

        static {
            Covode.recordClassIndex(92905);
        }

        C3792d(long j2, String str, a aVar) {
            this.f142139a = j2;
            this.f142140b = str;
            this.f142141c = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            com.ss.android.ugc.aweme.upvote.c.e eVar;
            com.ss.android.ugc.aweme.upvote.c.f fVar = (com.ss.android.ugc.aweme.upvote.c.f) obj;
            if (this.f142139a == 0) {
                z = true;
            } else {
                z = false;
            }
            d.f142132a.a(this.f142140b, fVar.f142033a, z);
            if (!z || (eVar = b.b(this.f142140b)) == null) {
                eVar = fVar.f142033a;
            }
            a aVar = this.f142141c;
            if (aVar != null) {
                aVar.a(eVar, this.f142139a);
            }
        }
    }

    public static void a(String str) {
        com.ss.android.ugc.aweme.upvote.c.e b2 = b.b(str);
        List<c> list = a().get(str);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(str, b2);
            }
        }
    }

    @r
    public final void onUserBlocked(com.ss.android.ugc.aweme.profile.b.a aVar) {
        String str;
        l.d(aVar, "");
        User user = aVar.f116043a;
        if (user == null || (str = user.getUid()) == null) {
            str = "";
        }
        l.d(str, "");
        b.c().add(str);
        Set<Map.Entry<String, List<c>>> entrySet = a().entrySet();
        l.b(entrySet, "");
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Object key = it.next().getKey();
            l.b(key, "");
            a((String) key);
        }
    }

    public static UpvoteListViewModel a(String str, androidx.lifecycle.m mVar) {
        l.d(str, "");
        l.d(mVar, "");
        UpvoteListViewModel upvoteListViewModel = b().get(str);
        if (upvoteListViewModel == null) {
            return UpvoteListViewModel.a.a(mVar);
        }
        return upvoteListViewModel;
    }

    public static void a(String str, c cVar) {
        l.d(str, "");
        l.d(cVar, "");
        List<c> list = a().get(str);
        if (list != null) {
            list.remove(cVar);
            if (list.isEmpty()) {
                a().remove(str);
            }
        }
        if (a().isEmpty()) {
            c().a();
        }
    }

    public static void a(List<String> list, List<UpvoteReason> list2) {
        UpvoteApi upvoteApi = UpvoteApi.f142023a;
        String b2 = dg.a().b(list);
        l.b(b2, "");
        ArrayList arrayList = new ArrayList(n.a((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(dg.a().b(it.next()));
        }
        f.a.b.b a2 = upvoteApi.getUpvoteBatchList(b2, arrayList.toString()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(b.f142137a, c.f142138a);
        l.b(a2, "");
        f.a.j.a.a(a2, c());
    }

    public final void a(String str, com.ss.android.ugc.aweme.upvote.c.d dVar) {
        T t;
        String str2;
        l.d(str, "");
        l.d(str, "");
        if (b.d().get(str) != null) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            String curUserId = g2.getCurUserId();
            Iterator<T> it = b.d().get(str).getUpvotes().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                User user = t.getUser();
                if (user != null) {
                    str2 = user.getUid();
                } else {
                    str2 = null;
                }
                if (l.a((Object) str2, (Object) curUserId)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                t2.setCacheState(dVar);
                if (dVar == com.ss.android.ugc.aweme.upvote.c.d.PUBLISH_FAILED) {
                    t2.setText(null);
                }
            }
        }
        a(str);
    }

    public final void a(String str, com.ss.android.ugc.aweme.upvote.c.h hVar) {
        l.d(str, "");
        l.d(hVar, "");
        l.d(str, "");
        l.d(hVar, "");
        if (b.d().get(str) != null) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            String curUserId = g2.getCurUserId();
            com.ss.android.ugc.aweme.upvote.c.e eVar = b.d().get(str);
            Iterator<T> it = eVar.getUpvotes().iterator();
            while (true) {
                String str2 = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                User user = next.getUser();
                if (user != null) {
                    str2 = user.getUid();
                }
                if (l.a((Object) str2, (Object) curUserId)) {
                    if (next != null) {
                        int indexOf = eVar.getUpvotes().indexOf(next);
                        List g3 = n.g((Collection) eVar.getUpvotes());
                        g3.set(indexOf, hVar);
                        b.d().put(str, com.ss.android.ugc.aweme.upvote.c.e.copy$default(eVar, g3, 0, false, 0, null, 30, null));
                    }
                }
            }
        }
        a(str);
    }

    public final void a(String str, com.ss.android.ugc.aweme.upvote.c.e eVar, boolean z) {
        b.a(str, eVar, z);
        a(str);
    }

    public static void a(String str, UpvoteReason upvoteReason, long j2, String str2, a aVar) {
        l.d(str, "");
        l.d(str2, "");
        f.a.b.b a2 = UpvoteApi.f142023a.getUpvoteList(str, j2, 20, str2, dg.a().b(upvoteReason)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new C3792d(j2, str, aVar), new e(aVar, j2));
        l.b(a2, "");
        f.a.j.a.a(a2, c());
    }
}
