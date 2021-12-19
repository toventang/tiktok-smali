package com.ss.android.ugc.aweme.im.sdk.group.b.a;

import android.content.res.Resources;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.proto.ApplyStatusCode;
import com.bytedance.im.core.proto.BatchGetConversationAuditUnreadRequestBody;
import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.bytedance.im.core.proto.RequestBody;
import com.ss.android.ugc.aweme.im.sdk.notification.a.e;
import com.ss.android.ugc.aweme.im.sdk.notification.a.i;
import com.ss.android.ugc.aweme.im.sdk.notification.a.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.d.f;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a implements com.bytedance.ies.im.core.api.b.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<Long, Integer> f102650a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final t<List<Long>> f102651b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentHashMap<Long, CopyOnWriteArrayList<t<Integer>>> f102652c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public static final a f102653d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final com.bytedance.im.a.a.b f102654e;

    @Override // com.bytedance.im.core.d.r
    public final void a(h hVar) {
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(h hVar, int i2) {
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(String str, int i2) {
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(String str, int i2, List list) {
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(String str, List list) {
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(List list) {
    }

    @Override // com.bytedance.im.core.d.r
    public final void b(h hVar) {
    }

    @Override // com.bytedance.im.core.d.r
    public final void b(List list) {
    }

    @Override // com.bytedance.im.core.d.r
    public final void c(List list) {
    }

    @Override // com.bytedance.im.core.d.r
    public final int d() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.a.a$a  reason: collision with other inner class name */
    public static final class C2582a implements com.bytedance.im.a.a.b {
        static {
            Covode.recordClassIndex(65729);
        }

        C2582a() {
        }

        @Override // com.bytedance.im.a.a.b
        public final void b(ConversationApplyInfo conversationApplyInfo) {
            l.d(conversationApplyInfo, "");
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupRequestManager", "onNewApplyAck notifyInfo=".concat(String.valueOf(conversationApplyInfo)));
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.a.a$a$a  reason: collision with other inner class name */
        static final class C2583a extends m implements h.f.a.b<com.bytedance.im.a.a.b.a, z> {
            final /* synthetic */ ConversationApplyInfo $it;

            static {
                Covode.recordClassIndex(65730);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2583a(ConversationApplyInfo conversationApplyInfo) {
                super(1);
                this.$it = conversationApplyInfo;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.im.a.a.b.a aVar) {
                long j2;
                boolean z;
                Map<Long, Long> map;
                Long l2;
                com.bytedance.im.a.a.b.a aVar2 = aVar;
                if (aVar2 == null || (map = aVar2.f37543a) == null || (l2 = map.get(this.$it.conv_short_id)) == null) {
                    j2 = 0;
                } else {
                    j2 = l2.longValue();
                }
                Integer num = a.f102650a.get(this.$it.conv_short_id);
                boolean z2 = false;
                if (num == null) {
                    num = 0;
                }
                if (l.a(num.intValue(), 0) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                ConcurrentHashMap<Long, Integer> concurrentHashMap = a.f102650a;
                Long l3 = this.$it.conv_short_id;
                l.b(l3, "");
                concurrentHashMap.put(l3, Integer.valueOf((int) j2));
                if (j2 > 0) {
                    z2 = true;
                }
                if (z != z2) {
                    a.d(n.a(this.$it.conv_short_id));
                }
                return z.f158842a;
            }
        }

        @Override // com.bytedance.im.a.a.b
        public final void a(ConversationApplyInfo conversationApplyInfo) {
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupRequestManager", "onNewConversationApply notifyInfo=".concat(String.valueOf(conversationApplyInfo)));
            if (conversationApplyInfo != null && conversationApplyInfo.apply_status == ApplyStatusCode.APPLYING) {
                String str = null;
                if (1 != 0) {
                    ArrayList arrayList = new ArrayList();
                    Map<String, String> map = conversationApplyInfo.ext;
                    if (map != null) {
                        str = map.get("a:disable_inner_push");
                    }
                    if (!l.a((Object) "1", (Object) str)) {
                        Long l2 = conversationApplyInfo.conv_short_id;
                        l.b(l2, "");
                        arrayList.add(l2);
                    }
                    a.a(n.a(conversationApplyInfo.conv_short_id), arrayList, new C2583a(conversationApplyInfo));
                }
            }
        }
    }

    private a() {
    }

    public final void a() {
        f102650a.clear();
        a.C0745a.a().a(this);
    }

    static {
        Covode.recordClassIndex(65728);
        C2582a aVar = new C2582a();
        f102654e = aVar;
        com.bytedance.im.a.a.a.a().f37535a.add(aVar);
    }

    public static final class c implements com.bytedance.im.core.a.a.b<com.bytedance.im.a.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f102656a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f102657b;

        static {
            Covode.recordClassIndex(65732);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.a.a$c$a  reason: collision with other inner class name */
        static final class CallableC2584a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f102658a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.im.a.a.b.a f102659b;

            static {
                Covode.recordClassIndex(65733);
            }

            CallableC2584a(c cVar, com.bytedance.im.a.a.b.a aVar) {
                this.f102658a = cVar;
                this.f102659b = aVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                com.bytedance.im.a.a.b.a aVar;
                Map<Long, Long> map;
                Long l2;
                ArrayList arrayList = new ArrayList();
                User d2 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.d();
                if (!(d2 == null || d2.getUid() == null || (aVar = this.f102659b) == null || (map = aVar.f37543a) == null)) {
                    for (Long l3 : map.keySet()) {
                        if (this.f102658a.f102657b.contains(l3) && (l2 = map.get(l3)) != null && l2.longValue() > 0) {
                            l.b(l3, "");
                            arrayList.add(l3);
                        }
                    }
                }
                return n.k(arrayList);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.a.a$c$c  reason: collision with other inner class name */
        static final class C2585c<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final C2585c f102661a = new C2585c();

            static {
                Covode.recordClassIndex(65735);
            }

            C2585c() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                com.ss.android.ugc.aweme.im.service.m.a.e("GroupRequestManager", "requestInner error: ".concat(String.valueOf(obj)));
            }
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            com.ss.android.ugc.aweme.im.service.m.a.e("GroupRequestManager", "request get unread count fail:" + String.valueOf(uVar));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(com.bytedance.im.a.a.b.a aVar) {
            com.bytedance.im.a.a.b.a aVar2 = aVar;
            this.f102656a.invoke(aVar2);
            ab.a((Callable) new CallableC2584a(this, aVar2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(b.f102660a, C2585c.f102661a);
        }

        static final class b<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final b f102660a = new b();

            static {
                Covode.recordClassIndex(65734);
            }

            b() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                List<T> list = (List) obj;
                l.b(list, "");
                for (T t : list) {
                    long longValue = t.longValue();
                    e eVar = e.f102841b;
                    String valueOf = String.valueOf(longValue);
                    Resources resources = com.bytedance.ies.ugc.appcontext.d.a().getResources();
                    Integer num = a.f102650a.get(Long.valueOf(longValue));
                    if (num == null) {
                        num = 0;
                    }
                    l.b(num, "");
                    int intValue = num.intValue();
                    Object[] objArr = new Object[1];
                    int i2 = a.f102650a.get(Long.valueOf(longValue));
                    if (i2 == null) {
                        i2 = 0;
                    }
                    objArr[0] = i2;
                    String quantityString = resources.getQuantityString(R.plurals.cw, intValue, objArr);
                    l.b(quantityString, "");
                    com.ss.android.ugc.aweme.im.sdk.notification.b bVar = new com.ss.android.ugc.aweme.im.sdk.notification.b(valueOf, quantityString, com.ss.android.ugc.aweme.im.sdk.notification.c.NewRequest);
                    l.d(bVar, "");
                    if (!eVar.c().a()) {
                        l.d(bVar, "");
                        com.ss.android.ugc.aweme.im.sdk.notification.a.c.a(new i(j.Tip, null, null, null, bVar, 14));
                        com.ss.android.ugc.aweme.im.sdk.notification.a.c.a();
                        eVar.a(1000L);
                    }
                }
            }
        }

        c(h.f.a.b bVar, List list) {
            this.f102656a = bVar;
            this.f102657b = list;
        }
    }

    public static final class b implements com.bytedance.im.core.a.a.b<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f102655a;

        static {
            Covode.recordClassIndex(65731);
        }

        public b(long j2) {
            this.f102655a = j2;
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            com.ss.android.ugc.aweme.im.service.m.a.e("GroupRequestManager", "markRead fail:" + String.valueOf(uVar));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(String str) {
            Integer num = a.f102650a.get(Long.valueOf(this.f102655a));
            if (num != null && l.a(num.intValue(), 0) > 0) {
                a.f102650a.remove(Long.valueOf(this.f102655a));
                a.d(n.a(Long.valueOf(this.f102655a)));
            }
        }
    }

    public static int a(long j2) {
        Integer num = f102650a.get(Long.valueOf(j2));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.bytedance.im.core.d.r
    public final void c(h hVar) {
        if (hVar != null) {
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupRequestManager", "onLeaveConversation:" + hVar.getConversationShortId());
            f102650a.remove(Long.valueOf(hVar.getConversationShortId()));
        }
    }

    @Override // com.bytedance.im.core.d.r
    public final void d(h hVar) {
        if (hVar != null) {
            com.ss.android.ugc.aweme.im.service.m.a.b("GroupRequestManager", "onDissolveConversation:" + hVar.getConversationShortId());
            f102650a.remove(Long.valueOf(hVar.getConversationShortId()));
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.im.a.a.b.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f102662a = new d();

        static {
            Covode.recordClassIndex(65736);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.im.a.a.b.a aVar) {
            Map<Long, Long> map;
            List list;
            long j2;
            com.bytedance.im.a.a.b.a aVar2 = aVar;
            if (!(aVar2 == null || (map = aVar2.f37543a) == null)) {
                for (Long l2 : map.keySet()) {
                    ConcurrentHashMap<Long, Integer> concurrentHashMap = a.f102650a;
                    l.b(l2, "");
                    Long l3 = map.get(l2);
                    if (l3 != null) {
                        j2 = l3.longValue();
                    } else {
                        j2 = 0;
                    }
                    concurrentHashMap.put(l2, Integer.valueOf((int) j2));
                }
                Set<Long> keySet = map.keySet();
                if (keySet != null) {
                    list = n.k(keySet);
                } else {
                    list = null;
                }
                a.d(list);
            }
            return z.f158842a;
        }
    }

    public static void d(List<Long> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            CopyOnWriteArrayList<t<Integer>> copyOnWriteArrayList = f102652c.get(Long.valueOf(longValue));
            if (copyOnWriteArrayList != null) {
                Iterator<t<Integer>> it2 = copyOnWriteArrayList.iterator();
                l.b(it2, "");
                while (it2.hasNext()) {
                    t<Integer> next = it2.next();
                    int i2 = f102650a.get(Long.valueOf(longValue));
                    if (i2 == null) {
                        i2 = 0;
                    }
                    next.postValue(i2);
                }
            }
        }
        f102651b.postValue(list);
    }

    @Override // com.bytedance.im.core.d.p
    public final void a(Map<String, h> map) {
        Collection<h> values;
        int i2;
        String str;
        if (map != null && (values = map.values()) != null) {
            List k2 = n.k(values);
            l.d(k2, "");
            CharSequence b2 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b();
            l.b(b2, "");
            ArrayList arrayList = new ArrayList();
            Iterator it = k2.iterator();
            while (true) {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                h hVar = (h) next;
                if (hVar.isGroupChat()) {
                    com.bytedance.im.core.d.i coreInfo = hVar.getCoreInfo();
                    if (coreInfo == null || (str = String.valueOf(coreInfo.getOwner())) == null) {
                        str = "";
                    }
                    if (l.a((Object) str, (Object) b2)) {
                        arrayList.add(next);
                    }
                }
            }
            ArrayList<h> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
            for (h hVar2 : arrayList2) {
                arrayList3.add(Long.valueOf(hVar2.getConversationShortId()));
            }
            ArrayList arrayList4 = arrayList3;
            int size = arrayList4.size() / 100;
            if (size >= 0) {
                while (true) {
                    int i3 = i2 * 100;
                    a(arrayList4.subList(i3, h.j.h.c(arrayList4.size(), i3 + 100)), h.a.z.INSTANCE, d.f102662a);
                    if (i2 != size) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void a(List<Long> list, List<Long> list2, h.f.a.b<? super com.bytedance.im.a.a.b.a, z> bVar) {
        if (list != null && !list.isEmpty()) {
            com.bytedance.im.a.a.a.a();
            c cVar = new c(bVar, list2);
            com.bytedance.im.core.c.f.a("imsdk", "getUnReadAuditByConShortIds", (Throwable) null);
            new com.bytedance.im.a.a.a.b(cVar).a(0, new RequestBody.Builder().addExtension(2042, BatchGetConversationAuditUnreadRequestBody.ADAPTER, new BatchGetConversationAuditUnreadRequestBody.Builder().conv_short_id(list).build()).build(), null, new Object[0]);
        }
    }
}
