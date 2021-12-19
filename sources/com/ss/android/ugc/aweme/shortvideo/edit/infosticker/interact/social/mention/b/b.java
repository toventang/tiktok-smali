package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bq.a.e;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f127731e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f127732a;

    /* renamed from: b  reason: collision with root package name */
    public List<User> f127733b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<User> f127734c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public String f127735d = "";

    static {
        Covode.recordClassIndex(83725);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83726);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b$a$a  reason: collision with other inner class name */
        public static final class C3327a {

            /* renamed from: a  reason: collision with root package name */
            public final List<User> f127737a;

            /* renamed from: b  reason: collision with root package name */
            public final List<User> f127738b;

            /* renamed from: c  reason: collision with root package name */
            public final List<User> f127739c;

            /* renamed from: d  reason: collision with root package name */
            public final List<String> f127740d;

            /* renamed from: e  reason: collision with root package name */
            public final List<Integer> f127741e;

            /* renamed from: f  reason: collision with root package name */
            public final List<User> f127742f;

            /* renamed from: g  reason: collision with root package name */
            public final List<String> f127743g;

            /* renamed from: h  reason: collision with root package name */
            public final List<String> f127744h;

            static {
                Covode.recordClassIndex(83727);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3327a)) {
                    return false;
                }
                C3327a aVar = (C3327a) obj;
                return l.a(this.f127737a, aVar.f127737a) && l.a(this.f127738b, aVar.f127738b) && l.a(this.f127739c, aVar.f127739c) && l.a(this.f127740d, aVar.f127740d) && l.a(this.f127741e, aVar.f127741e) && l.a(this.f127742f, aVar.f127742f) && l.a(this.f127743g, aVar.f127743g) && l.a(this.f127744h, aVar.f127744h);
            }

            public final int hashCode() {
                List<User> list = this.f127737a;
                int i2 = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<User> list2 = this.f127738b;
                int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
                List<User> list3 = this.f127739c;
                int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
                List<String> list4 = this.f127740d;
                int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
                List<Integer> list5 = this.f127741e;
                int hashCode5 = (hashCode4 + (list5 != null ? list5.hashCode() : 0)) * 31;
                List<User> list6 = this.f127742f;
                int hashCode6 = (hashCode5 + (list6 != null ? list6.hashCode() : 0)) * 31;
                List<String> list7 = this.f127743g;
                int hashCode7 = (hashCode6 + (list7 != null ? list7.hashCode() : 0)) * 31;
                List<String> list8 = this.f127744h;
                if (list8 != null) {
                    i2 = list8.hashCode();
                }
                return hashCode7 + i2;
            }

            public final String toString() {
                return "AllFriends(recentFriends=" + this.f127737a + ", mutualFriends=" + this.f127738b + ", allFollowingFriends=" + this.f127739c + ", indexLabels=" + this.f127740d + ", indexLabelCount=" + this.f127741e + ", filterFriends=" + this.f127742f + ", mentionBlockedUids=" + this.f127743g + ", mobRecentUsers=" + this.f127744h + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
            /* JADX WARN: Multi-variable type inference failed */
            public C3327a(List<? extends User> list, List<? extends User> list2, List<? extends User> list3, List<String> list4, List<Integer> list5, List<? extends User> list6, List<String> list7, List<String> list8) {
                l.d(list, "");
                l.d(list2, "");
                l.d(list3, "");
                l.d(list4, "");
                l.d(list5, "");
                l.d(list6, "");
                l.d(list7, "");
                l.d(list8, "");
                this.f127737a = list;
                this.f127738b = list2;
                this.f127739c = list3;
                this.f127740d = list4;
                this.f127741e = list5;
                this.f127742f = list6;
                this.f127743g = list7;
                this.f127744h = list8;
            }
        }
    }

    public final i<a.C3327a> a() {
        i<a.C3327a> b2 = i.b(new CallableC3328b(this), i.f4824a);
        l.b(b2, "");
        return b2;
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f127747a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f127748b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f127749c;

        static {
            Covode.recordClassIndex(83729);
        }

        c(b bVar, List list, String str) {
            this.f127747a = bVar;
            this.f127748b = list;
            this.f127749c = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            b bVar = this.f127747a;
            List<User> list = this.f127748b;
            String str = this.f127749c;
            List<User> a2 = com.ss.android.ugc.aweme.port.in.l.f115658a.u().a(list, str);
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str.toLowerCase();
            l.b(lowerCase, "");
            for (T t : list) {
                String uniqueId = t.getUniqueId();
                if (uniqueId == null || uniqueId.length() == 0) {
                    String shortId = t.getShortId();
                    l.b(shortId, "");
                    if (b.a(shortId, lowerCase)) {
                        a2.add(t);
                    }
                } else {
                    String uniqueId2 = t.getUniqueId();
                    l.b(uniqueId2, "");
                    if (b.a(uniqueId2, lowerCase)) {
                        a2.add(t);
                    }
                }
            }
            if (bVar.f127732a) {
                l.b(a2, "");
                List<User> b2 = b.b(a2);
                a2.clear();
                a2.addAll(b2);
            }
            l.b(a2, "");
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (T t2 : a2) {
                T t3 = t2;
                l.b(t3, "");
                if (hashSet.add(t3.getUid())) {
                    arrayList.add(t2);
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b$b  reason: collision with other inner class name */
    public static final class CallableC3328b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f127745a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f127746b = 6;

        static {
            Covode.recordClassIndex(83728);
        }

        CallableC3328b(b bVar) {
            this.f127745a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public a.C3327a call() {
            Object obj;
            User user;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            List<e> a2 = com.ss.android.ugc.aweme.port.in.l.f115658a.u().a();
            if (a2 == null) {
                a2 = z.INSTANCE;
            }
            ArrayList arrayList5 = new ArrayList();
            for (T t : a2) {
                if (true ^ l.a((Object) t.f68763a.getUid(), (Object) g.a().A().c())) {
                    arrayList5.add(t);
                }
            }
            List<e> g2 = n.g((Collection) arrayList5);
            try {
                List<e> a3 = com.ss.android.ugc.aweme.port.in.l.f115658a.u().a(this.f127746b);
                l.b(a3, "");
                for (T t2 : a3) {
                    if (arrayList4.size() < 10) {
                        Iterator it = g2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (l.a((Object) ((e) obj).f68763a.getUid(), (Object) t2.f68763a.getUid())) {
                                break;
                            }
                        }
                        e eVar = (e) obj;
                        if (eVar == null || (user = eVar.f68763a) == null) {
                            user = t2.f68763a;
                        }
                        arrayList4.add(user);
                        String uid = t2.f68763a.getUid();
                        l.b(uid, "");
                        arrayList3.add(uid);
                        if (t2.f68764b) {
                            String uid2 = t2.f68763a.getUid();
                            l.b(uid2, "");
                            arrayList.add(uid2);
                        } else {
                            String uid3 = t2.f68763a.getUid();
                            l.b(uid3, "");
                            arrayList2.add(uid3);
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            for (e eVar2 : g2) {
                if (!eVar2.f68764b && !arrayList.contains(eVar2.f68763a.getUid())) {
                    String uid4 = eVar2.f68763a.getUid();
                    l.b(uid4, "");
                    arrayList2.add(uid4);
                }
            }
            if (arrayList4.size() < 10) {
                List<e> b2 = com.ss.android.ugc.aweme.port.in.l.f115658a.u().b();
                l.b(b2, "");
                ArrayList<e> arrayList6 = new ArrayList();
                for (T t3 : b2) {
                    T t4 = t3;
                    if (t4.f68763a.getFollowStatus() == 2 || t4.f68763a.getFollowStatus() == 1) {
                        arrayList6.add(t3);
                    }
                }
                for (e eVar3 : arrayList6) {
                    if (arrayList4.size() < 10) {
                        if (!arrayList4.contains(eVar3.f68763a) && (!l.a((Object) eVar3.f68763a.getUid(), (Object) g.a().A().c()))) {
                            arrayList4.add(eVar3.f68763a);
                            String uid5 = eVar3.f68763a.getUid();
                            l.b(uid5, "");
                            arrayList3.add(uid5);
                        }
                        if (!eVar3.f68764b && !arrayList.contains(eVar3.f68763a.getUid())) {
                            String uid6 = eVar3.f68763a.getUid();
                            l.b(uid6, "");
                            arrayList2.add(uid6);
                        }
                    }
                }
            }
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            for (e eVar4 : g2) {
                if (com.ss.android.ugc.aweme.port.in.l.f115658a.u().a(eVar4.f68763a.getFollowStatus()) && g2.size() >= 10) {
                    arrayList7.add(eVar4.f68763a);
                }
            }
            List arrayList10 = new ArrayList();
            arrayList10.addAll(arrayList4);
            arrayList10.addAll(arrayList7);
            arrayList10.addAll(b.a(g2));
            if (this.f127745a.f127732a) {
                arrayList10 = b.b(arrayList10);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            return new a.C3327a(arrayList4, arrayList7, b.a(g2), arrayList8, arrayList9, arrayList10, arrayList2, arrayList3);
        }
    }

    public static List<User> a(List<e> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f68763a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public static final class d<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f127750a;

        static {
            Covode.recordClassIndex(83730);
        }

        d(b bVar) {
            this.f127750a = bVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            List list;
            l.b(iVar, "");
            if (!iVar.c() && !iVar.b() && (list = (List) iVar.d()) != null) {
                this.f127750a.f127734c.clear();
                this.f127750a.f127734c.addAll(list);
            }
            return iVar;
        }
    }

    public static List<User> b(List<? extends User> list) {
        if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (User user : list) {
            if (!arrayList.contains(user) && !l.a((Object) user.getUid(), (Object) g.a().A().c())) {
                arrayList.add(user);
            }
        }
        return arrayList;
    }

    public final boolean a(String str) {
        l.d(str, "");
        Iterator<T> it = this.f127734c.iterator();
        while (it.hasNext()) {
            if (l.a((Object) it.next().getUid(), (Object) str)) {
                return true;
            }
        }
        return false;
    }

    static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Locale locale = Locale.getDefault();
        l.b(locale, "");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        l.b(lowerCase, "");
        if (p.e((CharSequence) lowerCase, (CharSequence) str2)) {
            return true;
        }
        return false;
    }

    public final i<List<User>> a(String str, List<? extends User> list) {
        l.d(str, "");
        l.d(list, "");
        this.f127735d = str;
        i<List<User>> b2 = i.b(new c(this, list, str), i.f4824a).b(new d(this), i.f4826c);
        l.b(b2, "");
        return b2;
    }
}
