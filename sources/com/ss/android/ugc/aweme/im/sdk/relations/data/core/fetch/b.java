package com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.net.f;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.RelationFetchResponse;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.utils.in;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public final class b implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final b f103122a;

    /* renamed from: b  reason: collision with root package name */
    private static final h f103123b = h.i.a((h.f.a.a) c.f103129a);

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f103124c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f103125d;

    /* renamed from: e  reason: collision with root package name */
    private static final h f103126e = h.i.a((h.f.a.a) a.f103128a);

    /* renamed from: f  reason: collision with root package name */
    private static final h f103127f = h.i.a((h.f.a.a) d.f103130a);

    private static com.ss.android.ugc.aweme.im.sdk.common.controller.c.j a() {
        return (com.ss.android.ugc.aweme.im.sdk.common.controller.c.j) f103123b.getValue();
    }

    private static ReentrantLock b() {
        return (ReentrantLock) f103126e.getValue();
    }

    private static List<com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a> c() {
        return (List) f103127f.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(183, new g(b.class, "onEvent", f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<ReentrantLock> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f103128a = new a();

        static {
            Covode.recordClassIndex(66124);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ReentrantLock invoke() {
            return new ReentrantLock();
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.im.sdk.common.controller.c.j> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f103129a = new c();

        static {
            Covode.recordClassIndex(66126);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.common.controller.c.j invoke() {
            return com.ss.android.ugc.aweme.im.sdk.common.controller.c.d.a();
        }
    }

    static final class d extends m implements h.f.a.a<List<com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f103130a = new d();

        static {
            Covode.recordClassIndex(66127);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a> invoke() {
            return new ArrayList();
        }
    }

    private static boolean d() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean e() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean d2 = d();
        com.ss.android.ugc.aweme.lancet.j.f107229h = d2;
        return d2;
    }

    static {
        Covode.recordClassIndex(66123);
        b bVar = new b();
        f103122a = bVar;
        EventBus.a(EventBus.a(), bVar);
    }

    public static void a(String str) {
        com.ss.android.ugc.aweme.im.service.m.a.c("RelationFetchManager", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.b$b  reason: collision with other inner class name */
    public static final class C2615b extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a $fetchScene;
        final /* synthetic */ boolean $forceClear;
        int label;

        static {
            Covode.recordClassIndex(66125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2615b(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a aVar, boolean z, h.c.d dVar) {
            super(2, dVar);
            this.$fetchScene = aVar;
            this.$forceClear = z;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new C2615b(this.$fetchScene, this.$forceClear, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((C2615b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            boolean z;
            if (this.label == 0) {
                r.a(obj);
                try {
                    boolean b2 = b.f103122a.b(this.$fetchScene, this.$forceClear);
                    StringBuilder append = new StringBuilder("fetchRelationAsync [").append(this.$fetchScene).append("]: result=");
                    if (b2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    b.a(append.append(z).toString());
                } catch (Exception e2) {
                    b.a("fetchRelationAsync [" + this.$fetchScene + "]: error=" + e2.getMessage());
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static boolean a(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a aVar) {
        boolean z;
        long b2 = b(aVar);
        long a2 = a().a(aVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b2 >= 1000 * a2) {
            z = true;
        } else {
            z = false;
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("RelationFetchManager", "checkFrequencyByFetchScene [" + aVar + "] " + z + ": [" + currentTimeMillis + ", " + b2 + ", " + a2 + "] ");
        return z;
    }

    private static long b(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a aVar) {
        int i2 = c.f103131a[aVar.ordinal()];
        if (i2 == 1) {
            n a2 = n.a();
            l.b(a2, "");
            return a2.e();
        } else if (i2 == 2) {
            n a3 = n.a();
            l.b(a3, "");
            return a3.f();
        } else if (i2 == 3) {
            n a4 = n.a();
            l.b(a4, "");
            return a4.g();
        } else if (i2 == 4) {
            n a5 = n.a();
            l.b(a5, "");
            return a5.h();
        } else if (i2 != 5) {
            return Long.MAX_VALUE;
        } else {
            n a6 = n.a();
            l.b(a6, "");
            return a6.i();
        }
    }

    @org.greenrobot.eventbus.r
    public final void onEvent(com.ss.android.ugc.aweme.common.net.f fVar) {
        MethodCollector.i(5887);
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a()) {
            com.bytedance.ies.ugc.appcontext.d.a();
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a aVar = null;
            if (e() && this != null) {
                synchronized (c()) {
                    try {
                        com.ss.android.ugc.aweme.im.service.m.a.c("RelationFetchManager", "bookNextFetchTask task=" + c());
                        if (!c().isEmpty()) {
                            if (c().contains(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a.COLDUP_FULL)) {
                                aVar = com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a.COLDUP_FULL;
                            } else if (c().contains(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a.COLDUP_DIFF)) {
                                aVar = com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a.COLDUP_DIFF;
                            } else {
                                aVar = c().get(0);
                            }
                        }
                        c().clear();
                    } catch (Throwable th) {
                        MethodCollector.o(5887);
                        throw th;
                    }
                }
                if (aVar != null) {
                    a(aVar, false);
                    MethodCollector.o(5887);
                    return;
                }
                MethodCollector.o(5887);
                return;
            }
        }
        MethodCollector.o(5887);
    }

    private final void a(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.b bVar) {
        n a2 = n.a();
        l.b(a2, "");
        List<com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.a> j2 = a2.j();
        l.b(j2, "");
        com.ss.android.ugc.aweme.im.service.m.a.c("RelationFetchManager", "checkFetchResult start, localPageList=" + j2.size());
        if (bVar.f103135a) {
            ListIterator<com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.a> listIterator = j2.listIterator();
            while (listIterator.hasNext()) {
                com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.a next = listIterator.next();
                listIterator.remove();
                if (next.f103133a > 0 && next.f103133a > next.f103134b && !a(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a.MISSING_PAGE, next.f103133a, next.f103134b).f103135a) {
                    break;
                }
            }
        } else if (bVar.f103137c > bVar.f103143i) {
            j2.add(new com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.a(bVar.f103137c, bVar.f103143i));
        }
        n.a().a(j2);
        l.b(com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a(), "");
        com.ss.android.ugc.aweme.im.service.m.a.c("RelationFetchManager", "checkFetchResult end, localPageList=" + j2.size() + ", dbSize=" + com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.j());
    }

    public static void a(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a aVar, boolean z) {
        if (!in.d()) {
            com.ss.android.ugc.aweme.im.service.m.a.c("RelationFetchManager", "fetchRelationAsync [" + aVar + "] start: forceClear=" + z);
            bz unused = kotlinx.coroutines.i.a(an.a(bf.f159040a), null, null, new C2615b(aVar, z, null), 3);
        }
    }

    private static List<IMUser> a(List<IMUser> list, List<com.ss.android.ugc.aweme.bq.a.a> list2) {
        boolean z;
        long j2;
        long j3;
        long j4;
        Long l2;
        HashMap hashMap = new HashMap();
        if (list2 != null) {
            for (T t : list2) {
                String str = t.f68756a;
                HashMap hashMap2 = new HashMap();
                for (T t2 : t.f68757b) {
                    hashMap2.put(Long.valueOf(t2.f68758a), Long.valueOf(t2.f68759b));
                }
                hashMap.put(str, hashMap2);
            }
        }
        if (list != null) {
            for (T t3 : list) {
                HashMap hashMap3 = (HashMap) hashMap.get(t3.getUid());
                if (hashMap3 != null) {
                    Long l3 = (Long) hashMap3.get(3L);
                    long j5 = 0;
                    if ((l3 != null && l3.longValue() == 0) || ((l2 = (Long) hashMap3.get(6L)) != null && l2.longValue() == 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    t3.setMentionEnabled(z);
                    Long l4 = (Long) hashMap3.get(3L);
                    if (l4 != null) {
                        j2 = l4.longValue();
                    } else {
                        j2 = 0;
                    }
                    t3.setCommentMentionBlockStatus(j2);
                    Long l5 = (Long) hashMap3.get(4L);
                    if (l5 != null) {
                        j3 = l5.longValue();
                    } else {
                        j3 = 0;
                    }
                    t3.setVideoTagBlockStatus(j3);
                    Long l6 = (Long) hashMap3.get(5L);
                    if (l6 != null) {
                        j4 = l6.longValue();
                    } else {
                        j4 = 0;
                    }
                    t3.setQaInviteBlockStatus(j4);
                    Long l7 = (Long) hashMap3.get(6L);
                    if (l7 != null) {
                        j5 = l7.longValue();
                    }
                    t3.setVideoMentionBlockStatus(j5);
                }
            }
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0146, code lost:
        if (r5 != false) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 782
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.b.b(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a, boolean):boolean");
    }

    private static RelationFetchResponse b(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a aVar, long j2, long j3) {
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a aVar2;
        int i2;
        Throwable th;
        RelationFetchResponse relationFetchResponse = null;
        if (in.d()) {
            com.ss.android.ugc.aweme.im.service.m.a.c("RelationFetchManager", "doRealNetworkRequest cancel because isChildrenMode=true");
            return null;
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("RelationFetchManager", "doRealNetworkRequest [" + aVar + "] [" + j2 + ", " + j3 + "] start");
        if (aVar == com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a.LOADER_DIFF) {
            aVar2 = com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a.COLDUP_DIFF;
        } else {
            aVar2 = aVar;
        }
        int i3 = 0;
        while (!f103125d) {
            try {
                i2 = 2;
                try {
                    return com.ss.android.ugc.aweme.im.sdk.common.data.api.a.f102469a.getSpotlightRelation(100, aVar2.getValue(), 1, j2, j3, 0, com.ss.android.ugc.aweme.im.sdk.relations.data.a.a.a()).get();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                i2 = 2;
                StringBuilder append = new StringBuilder("fetchScene=").append(aVar).append(", retryTimes= ").append(i3).append(", error=");
                String message = th.getMessage();
                if (message == null) {
                    message = "null stack message";
                }
                String sb = append.append(message).toString();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("error", Integer.valueOf(i2));
                linkedHashMap.put("error_stack", sb);
                com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b("spotlight_relation_load_error_new", linkedHashMap);
                com.ss.android.ugc.aweme.im.service.m.a.c("RelationFetchManager", "monitorNetworkRequestError: errorStack=".concat(String.valueOf(sb)));
                com.ss.android.ugc.aweme.im.service.m.a.a("RelationFetchManager", th);
                i3++;
                relationFetchResponse = null;
                if (i3 >= 2) {
                    return relationFetchResponse;
                }
            }
        }
        return relationFetchResponse;
    }

    private final com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.b a(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a aVar, long j2, long j3) {
        boolean z;
        RelationFetchResponse b2;
        boolean z2;
        String str;
        com.ss.android.ugc.aweme.im.service.m.a.c("RelationFetchManager", "doRealFetchAndDBUpdate [" + aVar + "] [" + j2 + ", " + j3 + "] start");
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.b bVar = new com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.b(aVar, j2, j3);
        boolean z3 = true;
        long j4 = j2;
        boolean z4 = true;
        while (true) {
            if (f103125d || !com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a() || (b2 = b(aVar, j4, j3)) == null) {
                break;
            }
            if (b2.getHasMore() == z3) {
                z2 = true;
            } else {
                z2 = false;
            }
            j4 = b2.getMinTime();
            BaseResponse.ServerTimeExtra serverTimeExtra = b2.extra;
            if (!(serverTimeExtra == null || (str = serverTimeExtra.logid) == null)) {
                bVar.a().add(str);
            }
            List<IMUser> followings = b2.getFollowings();
            if (followings == null || followings.isEmpty()) {
                break;
            }
            bVar.f103138d += b2.getFollowings().size();
            if (z4 && com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a.COLDUP_FULL == aVar) {
                com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
                com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.g();
                z4 = false;
            }
            if (!com.ss.android.ugc.aweme.im.sdk.relations.data.a.a.a()) {
                if (!a(aVar, b2.getFollowings(), false)) {
                    break;
                }
            } else if (!a(aVar, a(b2.getFollowings(), b2.getBlockResults()), z3)) {
                break;
            } else {
                com.ss.android.ugc.aweme.im.sdk.relations.data.a.a.a(0);
            }
            bVar.f103139e = bVar.f103138d;
            int i2 = bVar.f103140f;
            int i3 = z3 ? 1 : 0;
            int i4 = z3 ? 1 : 0;
            int i5 = z3 ? 1 : 0;
            bVar.f103140f = i2 + i3;
            bVar.f103136b = Math.max(bVar.f103136b, b2.getMaxTime());
            bVar.f103137c = b2.getMinTime();
            if (bVar.f103140f <= 200) {
                z3 = true;
                if (!z2) {
                    break;
                }
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("error", 1);
                linkedHashMap.put("error_stack", bVar.toString());
                com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b("spotlight_relation_load_error_new", linkedHashMap);
                com.ss.android.ugc.aweme.im.service.m.a.c("RelationFetchManager", "monitorTooManyLoadError: errorStack=".concat(String.valueOf(bVar)));
                break;
            }
        }
        if (!z2) {
            if (bVar.f103138d == bVar.f103139e) {
                z = true;
                bVar.f103135a = z;
                com.ss.android.ugc.aweme.im.service.m.a.c("RelationFetchManager", "doRealFetchAndDBUpdate [" + aVar + "] [" + j2 + ", " + j3 + "] end: result=" + bVar);
                return bVar;
            }
        }
        z = false;
        bVar.f103135a = z;
        com.ss.android.ugc.aweme.im.service.m.a.c("RelationFetchManager", "doRealFetchAndDBUpdate [" + aVar + "] [" + j2 + ", " + j3 + "] end: result=" + bVar);
        return bVar;
    }

    private static boolean a(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a aVar, List<IMUser> list, boolean z) {
        Integer num;
        StringBuilder append = new StringBuilder("doRealDBUpdate [").append(aVar).append("] start: result=");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("RelationFetchManager", append.append(num).append(' ').toString());
        if (list == null || list.isEmpty()) {
            return false;
        }
        int i2 = 0;
        while (!f103125d) {
            if (z) {
                try {
                    com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
                    com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a(list);
                } catch (Throwable th) {
                    StringBuilder append2 = new StringBuilder("fetchScene=").append(aVar).append(", retryTimes= ").append(i2).append(", error=");
                    String message = th.getMessage();
                    if (message == null) {
                        message = "null stack message";
                    }
                    String sb = append2.append(message).toString();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("error", 3);
                    linkedHashMap.put("error_stack", sb);
                    com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b("spotlight_relation_load_error_new", linkedHashMap);
                    com.ss.android.ugc.aweme.im.service.m.a.c("RelationFetchManager", "monitorDBUpdateError: errorStack=".concat(String.valueOf(sb)));
                    com.ss.android.ugc.aweme.im.service.m.a.a("RelationFetchManager", th);
                    i2++;
                    if (i2 >= 2) {
                        break;
                    }
                }
            } else {
                com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
                com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.b(list);
            }
            return true;
        }
        return false;
    }
}
