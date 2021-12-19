package com.ss.android.ugc.aweme.upvote.detail;

import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.c.e;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f142053a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f142054b = i.a((h.f.a.a) C3785b.f142059a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f142055c = i.a((h.f.a.a) d.f142061a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f142056d = i.a((h.f.a.a) a.f142058a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f142057e = i.a((h.f.a.a) c.f142060a);

    public static HashMap<String, UpvoteReason> a() {
        return (HashMap) f142054b.getValue();
    }

    public static HashMap<String, Integer> b() {
        return (HashMap) f142055c.getValue();
    }

    public static HashSet<String> c() {
        return (HashSet) f142056d.getValue();
    }

    public static LruCache<String, e> d() {
        return (LruCache) f142057e.getValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<HashSet<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f142058a = new a();

        static {
            Covode.recordClassIndex(92837);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.b$b  reason: collision with other inner class name */
    static final class C3785b extends m implements h.f.a.a<HashMap<String, UpvoteReason>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3785b f142059a = new C3785b();

        static {
            Covode.recordClassIndex(92838);
        }

        C3785b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, UpvoteReason> invoke() {
            return new HashMap();
        }
    }

    static final class d extends m implements h.f.a.a<HashMap<String, Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f142061a = new d();

        static {
            Covode.recordClassIndex(92840);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, Integer> invoke() {
            return new HashMap();
        }
    }

    static final class c extends m implements h.f.a.a<LruCache<String, e>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f142060a = new c();

        static {
            Covode.recordClassIndex(92839);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LruCache<String, e> invoke() {
            return new LruCache(com.ss.android.ugc.aweme.upvote.d.a.a());
        }
    }

    static {
        Covode.recordClassIndex(92836);
    }

    public static UpvoteReason a(String str) {
        l.d(str, "");
        return a().get(str);
    }

    public static e b(String str) {
        l.d(str, "");
        e eVar = d().get(str);
        if (eVar == null) {
            return null;
        }
        List<com.ss.android.ugc.aweme.upvote.c.h> upvotes = eVar.getUpvotes();
        ArrayList arrayList = new ArrayList();
        for (T t : upvotes) {
            HashSet<String> c2 = c();
            User user = t.getUser();
            String uid = user != null ? user.getUid() : null;
            if (!n.a((Iterable) c2, (Object) uid)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        return e.copy$default(eVar, arrayList2, 0, false, eVar.getTotal() - ((long) (eVar.getUpvotes().size() - arrayList2.size())), null, 22, null);
    }

    public static void a(String str, int i2) {
        l.d(str, "");
        b().put(str, Integer.valueOf(i2));
    }

    public static void a(String str, e eVar, boolean z) {
        T t;
        List<com.ss.android.ugc.aweme.upvote.c.h> upvotes;
        e eVar2 = eVar;
        l.d(str, "");
        l.d(eVar2, "");
        e eVar3 = d().get(str);
        boolean z2 = true;
        if (eVar3 == null || z) {
            LruCache<String, e> d2 = d();
            l.d(eVar2, "");
            e eVar4 = d().get(eVar2.getItemId());
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            String curUserId = g2.getCurUserId();
            if (eVar4 != null && (upvotes = eVar4.getUpvotes()) != null) {
                Iterator<T> it = upvotes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    T t2 = t;
                    User user = t2.getUser();
                    if (l.a((Object) (user != null ? user.getUid() : null), (Object) curUserId) && t2.isFake()) {
                        break;
                    }
                }
            } else {
                t = null;
            }
            List<com.ss.android.ugc.aweme.upvote.c.h> upvotes2 = eVar2.getUpvotes();
            if (!(upvotes2 instanceof Collection) || !upvotes2.isEmpty()) {
                Iterator<T> it2 = upvotes2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    User user2 = it2.next().getUser();
                    if (l.a((Object) (user2 != null ? user2.getUid() : null), (Object) curUserId)) {
                        break;
                    }
                }
                if (t != null && !z2) {
                    List g3 = n.g((Collection) eVar2.getUpvotes());
                    g3.add(0, t);
                    eVar2 = e.copy$default(eVar2, g3, 0, false, eVar2.getTotal() + 1, null, 22, null);
                }
                d2.put(str, eVar2);
            }
            z2 = false;
            List g32 = n.g((Collection) eVar2.getUpvotes());
            g32.add(0, t);
            eVar2 = e.copy$default(eVar2, g32, 0, false, eVar2.getTotal() + 1, null, 22, null);
            d2.put(str, eVar2);
        } else if (eVar2.getCursor() == eVar3.getCursor() + 20) {
            List<com.ss.android.ugc.aweme.upvote.c.h> upvotes3 = eVar3.getUpvotes();
            ArrayList arrayList = new ArrayList(n.a((Iterable) upvotes3, 10));
            Iterator<T> it3 = upvotes3.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next().getCommentId());
            }
            Set m2 = n.m(arrayList);
            List g4 = n.g((Collection) eVar3.getUpvotes());
            List<com.ss.android.ugc.aweme.upvote.c.h> upvotes4 = eVar2.getUpvotes();
            ArrayList arrayList2 = new ArrayList();
            for (T t3 : upvotes4) {
                if (!m2.contains(t3.getCommentId())) {
                    arrayList2.add(t3);
                }
            }
            g4.addAll(arrayList2);
            d().put(str, e.copy$default(eVar2, g4, 0, false, 0, null, 30, null));
        }
    }
}
