package com.ss.android.ugc.aweme.im.sdk.common.controller.e;

import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import f.a.ab;
import h.a.n;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlinx.coroutines.ah;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    static final kotlinx.coroutines.android.b f102242a = com.ss.android.ugc.aweme.af.a.f66269a;

    /* renamed from: b  reason: collision with root package name */
    public static final g f102243b = new g();

    /* renamed from: c  reason: collision with root package name */
    private static final h f102244c = i.a((h.f.a.a) d.f102252a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f102245d = i.a((h.f.a.a) C2558g.f102255a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f102246e = i.a((h.f.a.a) b.f102250a);

    /* renamed from: f  reason: collision with root package name */
    private static final ah f102247f;

    /* renamed from: g  reason: collision with root package name */
    private static am f102248g;

    /* renamed from: h  reason: collision with root package name */
    private static final h f102249h = i.a((h.f.a.a) c.f102251a);

    public static Set<String> a() {
        return (Set) f102246e.getValue();
    }

    public static Set<String> b() {
        return (Set) f102249h.getValue();
    }

    private static LruCache<String, IMUser> d() {
        return (LruCache) f102244c.getValue();
    }

    private static LruCache<String, IMUser> e() {
        return (LruCache) f102245d.getValue();
    }

    private g() {
    }

    static final class b extends m implements h.f.a.a<Set<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f102250a = new b();

        static {
            Covode.recordClassIndex(65422);
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

    static final class c extends m implements h.f.a.a<Set<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f102251a = new c();

        static {
            Covode.recordClassIndex(65423);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    static final class d extends m implements h.f.a.a<LruCache<String, IMUser>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f102252a = new d();

        static {
            Covode.recordClassIndex(65424);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LruCache<String, IMUser> invoke() {
            return new LruCache(1000);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.g$g  reason: collision with other inner class name */
    static final class C2558g extends m implements h.f.a.a<LruCache<String, IMUser>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2558g f102255a = new C2558g();

        static {
            Covode.recordClassIndex(65427);
        }

        C2558g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LruCache<String, IMUser> invoke() {
            return new LruCache(1000);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f102253a;

        static {
            Covode.recordClassIndex(65425);
        }

        e(List list) {
            this.f102253a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List list = this.f102253a;
            com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
            com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.b(list);
            return z.f158842a;
        }
    }

    public static final void c() {
        d().evictAll();
        e().evictAll();
        an.b(f102248g);
        f102248g = an.a(f102247f);
    }

    static {
        Covode.recordClassIndex(65418);
        ah ahVar = bf.f159041b;
        f102247f = ahVar;
        f102248g = an.a(ahVar);
    }

    public static final f.a.b.b a(IMUser iMUser) {
        if (iMUser != null) {
            return b(n.a(iMUser));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.service.i.a $callback;
        final /* synthetic */ String $secUid;
        final /* synthetic */ String $uid;
        int label;

        static {
            Covode.recordClassIndex(65419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, String str2, com.ss.android.ugc.aweme.im.service.i.a aVar, h.c.d dVar) {
            super(2, dVar);
            this.$uid = str;
            this.$secUid = str2;
            this.$callback = aVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$uid, this.$secUid, this.$callback, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.g$a$a  reason: collision with other inner class name */
        public static final class C2557a extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
            final /* synthetic */ Exception $e;
            int label;
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(65421);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2557a(a aVar, Exception exc, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = aVar;
                this.$e = exc;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new C2557a(this.this$0, this.$e, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                return ((C2557a) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r.a(obj);
                    com.ss.android.ugc.aweme.im.service.i.a aVar = this.this$0.$callback;
                    if (aVar == null) {
                        return null;
                    }
                    aVar.a(this.$e);
                    return z.f158842a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0065 A[SYNTHETIC, Splitter:B:25:0x0065] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 453
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f102254a;

        static {
            Covode.recordClassIndex(65426);
        }

        f(List list) {
            this.f102254a = list;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            for (T t : this.f102254a) {
                com.ss.android.ugc.d.a.c.a(new m(t.getUid(), t.getSecUid()));
            }
        }
    }

    private final IMUser a(String str) {
        IMUser iMUser = e().get(str);
        if (iMUser != null) {
            com.ss.android.ugc.aweme.im.service.m.a.b("IMUserRepository", "getLocalUserWithUid in cache");
            return iMUser;
        }
        com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
        IMUser a2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a(str);
        if (a2 != null) {
            com.ss.android.ugc.aweme.im.service.m.a.b("IMUserRepository", "getLocalUserWithUid in db");
            b(a2);
            return a2;
        }
        com.ss.android.ugc.aweme.im.service.m.a.b("IMUserRepository", "getLocalUserWithUid in none");
        return null;
    }

    private final IMUser b(String str) {
        IMUser iMUser = d().get(str);
        if (iMUser != null) {
            com.ss.android.ugc.aweme.im.service.m.a.b("IMUserRepository", "getLocalUserWithSecUid in cache");
            return iMUser;
        }
        com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
        IMUser b2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.b(str);
        if (b2 != null) {
            com.ss.android.ugc.aweme.im.service.m.a.b("IMUserRepository", "getLocalUserWithSecUid in db");
            b(b2);
            return b2;
        }
        com.ss.android.ugc.aweme.im.service.m.a.b("IMUserRepository", "getLocalUsgetLocalUserWithSecUiderWithUid in none");
        return null;
    }

    private static void c(List<? extends IMUser> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b((IMUser) it.next());
        }
    }

    private static f.a.b.b b(List<? extends IMUser> list) {
        if (list == null) {
            return null;
        }
        c(list);
        return ab.a((Callable) new e(list)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f(list));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v39, resolved type: android.util.LruCache<java.lang.String, com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v41, resolved type: android.util.LruCache<java.lang.String, com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX WARN: Multi-variable type inference failed */
    public static List<IMUser> a(List<p<String, String>> list) {
        Object obj;
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        ArrayList<p> arrayList2 = new ArrayList();
        for (T t : list) {
            Object first = t.getFirst();
            Object second = t.getSecond();
            if ((first == null || (obj = e().get(first)) == null) && (second == null || (obj = d().get(second)) == null)) {
                arrayList2.add(t);
            } else {
                arrayList.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        for (p pVar : arrayList2) {
            Object first2 = pVar.getFirst();
            if (first2 != null) {
                arrayList3.add(first2);
            }
        }
        com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
        List<IMUser> a2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a("uid", arrayList3, -1, -1);
        l.b(a2, "");
        arrayList.addAll(a2);
        if (a2.size() == arrayList2.size()) {
            return arrayList;
        }
        ArrayList arrayList4 = new ArrayList(n.a((Iterable) a2, 10));
        for (T t2 : a2) {
            l.b(t2, "");
            arrayList4.add(t2.getUid());
        }
        Set m2 = n.m(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!m2.contains(((p) obj2).getFirst())) {
                arrayList5.add(obj2);
            }
        }
        ArrayList<p> arrayList6 = arrayList5;
        ArrayList arrayList7 = new ArrayList();
        for (p pVar2 : arrayList6) {
            Object second2 = pVar2.getSecond();
            if (second2 != null) {
                arrayList7.add(second2);
            }
        }
        com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
        List<IMUser> a3 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a(arrayList7, -1, -1);
        l.b(a3, "");
        arrayList.addAll(a3);
        if (a3.size() == arrayList6.size()) {
            return arrayList;
        }
        ArrayList arrayList8 = new ArrayList(n.a((Iterable) a3, 10));
        for (T t3 : a3) {
            l.b(t3, "");
            arrayList8.add(t3.getSecUid());
        }
        Set m3 = n.m(arrayList8);
        ArrayList<p> arrayList9 = new ArrayList();
        for (Object obj3 : arrayList6) {
            if (!m3.contains(((p) obj3).getSecond())) {
                arrayList9.add(obj3);
            }
        }
        for (p pVar3 : arrayList9) {
            c((String) pVar3.getFirst(), (String) pVar3.getSecond(), null);
        }
        return arrayList;
    }

    private static void b(IMUser iMUser) {
        if (iMUser != null) {
            String secUid = iMUser.getSecUid();
            if (!(secUid == null || secUid.length() == 0)) {
                d().put(iMUser.getSecUid(), iMUser);
            }
            String uid = iMUser.getUid();
            if (uid != null && uid.length() != 0) {
                e().put(iMUser.getUid(), iMUser);
            }
        }
    }

    public static final IMUser a(String str, String str2) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (str2 == null || str2.length() == 0)) {
            return null;
        }
        IMUser b2 = b(str, str2);
        if (b2 != null) {
            return b2;
        }
        c(str, str2, null);
        return null;
    }

    public static final IMUser b(String str, String str2) {
        if (str != null && str.length() != 0) {
            return f102243b.a(str);
        }
        if (str2 != null && str2.length() != 0) {
            return f102243b.b(str2);
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("IMUserRepository", "Could not get user because both uid are null");
        return null;
    }

    public static final void b(String str, String str2, com.ss.android.ugc.aweme.im.service.i.a aVar) {
        if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
            c(str, str2, aVar);
        }
    }

    public static final void a(String str, String str2, com.ss.android.ugc.aweme.im.service.i.a aVar) {
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            aVar.a(new IllegalArgumentException("Query user with empty uid and sec uid"));
            return;
        }
        IMUser b2 = b(str, str2);
        if (b2 != null) {
            aVar.a(b2);
        } else {
            c(str, str2, aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        r1 = a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r7 != null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        if (h.a.n.a((java.lang.Iterable) a(), (java.lang.Object) r6) == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r6 == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        java.lang.Boolean.valueOf(a().add(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5415);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009e, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009f, code lost:
        com.ss.android.ugc.aweme.im.service.m.a.a("IMUserRepository", "Starting task to load user");
        r0 = kotlinx.coroutines.i.a(com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.f102248g, null, null, new com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(r5, r6, r7, null), 3);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5415);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(java.lang.String r5, java.lang.String r6, com.ss.android.ugc.aweme.im.service.i.a r7) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.c(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.im.service.i.a):void");
    }
}
