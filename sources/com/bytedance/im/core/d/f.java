package com.bytedance.im.core.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.j;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.internal.utils.v;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    static int f37948a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static ConcurrentHashMap<String, HashMap<Long, ao>> f37949b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f37950c;

    /* renamed from: d  reason: collision with root package name */
    static List<String> f37951d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    static final Handler f37952e = new d(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    static p f37953f = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final f f37954g = new f();

    public static final class b extends a {
        static {
            Covode.recordClassIndex(22758);
        }

        b() {
        }

        @Override // com.bytedance.im.core.d.p, com.bytedance.im.core.d.a
        public final void a(Map<String, h> map) {
            super.a(map);
        }

        @Override // com.bytedance.im.core.d.b, com.bytedance.im.core.d.r
        public final void a(h hVar, int i2) {
            l.c(hVar, "");
            super.a(hVar, i2);
            if (!f.f37949b.containsKey(hVar.getConversationId())) {
                List<String> list = f.f37951d;
                String conversationId = hVar.getConversationId();
                l.a((Object) conversationId, "");
                list.add(conversationId);
            }
            if (f.f37952e.hasMessages(f.f37948a)) {
                f.f37952e.sendEmptyMessageDelayed(f.f37948a, 5000);
            }
        }
    }

    private f() {
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f37955a;

        static {
            Covode.recordClassIndex(22757);
        }

        a(z.e eVar) {
            this.f37955a = eVar;
        }

        public final void run() {
            q a2 = q.a();
            new ArrayList(this.f37955a.element);
            a2.c();
        }
    }

    static {
        Covode.recordClassIndex(22756);
    }

    public static void a() {
        com.bytedance.im.core.a.d a2 = com.bytedance.im.core.a.d.a();
        l.a((Object) a2, "");
        if (a2.b().aJ) {
            j a3 = j.a();
            l.a((Object) a3, "");
            List<h> b2 = a3.b();
            if (!(b2 == null || b2.isEmpty())) {
                f37950c = true;
                ArrayList arrayList = new ArrayList(n.a((Iterable) b2, 10));
                for (T t : b2) {
                    l.a((Object) t, "");
                    arrayList.add(t.getConversationId());
                }
                a(arrayList, "sdk_init");
            }
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f37956a = new c();

        static {
            Covode.recordClassIndex(22759);
        }

        c() {
        }

        public final void run() {
            ArrayList arrayList;
            j a2 = j.a();
            l.a((Object) a2, "");
            List<h> b2 = a2.b();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (h hVar : b2) {
                l.a((Object) hVar, "");
                if (hVar.getLastMessage() != null) {
                    arrayList2.add(hVar.getLastMessage());
                    arrayList3.add(hVar.getConversationId());
                }
            }
            ArrayList<List> arrayList4 = new ArrayList();
            Iterator it = arrayList3.iterator();
            loop1:
            while (true) {
                arrayList = null;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    if (arrayList.size() == 100) {
                        arrayList4.add(arrayList);
                    }
                }
                break loop1;
            }
            if (arrayList != null) {
                arrayList4.add(arrayList);
            }
            for (List list : arrayList4) {
                f.f37949b.putAll(com.bytedance.im.core.internal.a.f.a(list));
            }
            j.a(" ConvReadInfoHelperimczy loadAllConReadInfo readIndexMap = " + f.f37949b);
            v.a(new g(new h.f.a.a<h.z>(q.a()) {
                /* class com.bytedance.im.core.d.f.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22760);
                }

                @Override // h.f.b.c, h.k.b
                public final String getName() {
                    return "onQueryReadInfo";
                }

                @Override // h.f.b.c
                public final String getSignature() {
                    return "onQueryReadInfo()V";
                }

                @Override // h.f.b.c
                public final h.k.d getOwner() {
                    return ab.a(q.class);
                }

                @Override // h.f.a.a
                public final void invoke() {
                    ((q) this.receiver).b();
                }
            }));
            if (!f.f37950c) {
                f.a();
            }
            j.a().a(f.f37953f);
        }
    }

    public static final class d extends Handler {
        static {
            Covode.recordClassIndex(22761);
        }

        d(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            l.c(message, "");
            if (message.what == f.f37948a) {
                f.a(f.f37951d, "sdk_con_update");
                f.f37951d.clear();
            }
        }
    }

    public static void a(Collection<String> collection) {
        List<Long> list;
        com.bytedance.im.core.a.d a2 = com.bytedance.im.core.a.d.a();
        l.a((Object) a2, "");
        if (a2.b().aJ) {
            HashMap hashMap = new HashMap();
            for (String str : collection) {
                HashMap<Long, ao> hashMap2 = f37949b.get(str);
                if (hashMap2 == null) {
                    hashMap2 = new HashMap<>();
                }
                l.a((Object) hashMap2, "");
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<Long, ao> entry : hashMap2.entrySet()) {
                    h a3 = j.a().a(str);
                    if (a3 == null || (list = a3.getMemberIds()) == null) {
                        list = h.a.z.INSTANCE;
                    }
                    long j2 = entry.getValue().f37819b;
                    if ((!list.isEmpty()) && !list.contains(Long.valueOf(j2))) {
                        arrayList.add(Long.valueOf(j2));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hashMap2.remove(it.next());
                }
                hashMap.put(str, arrayList);
            }
            if (!hashMap.isEmpty()) {
                j.a(" ConvReadInfoHelpercheckRemoveNotMemberData deleteMap = ".concat(String.valueOf(hashMap)));
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    com.bytedance.im.core.internal.a.f.a((String) entry2.getKey(), (List) entry2.getValue());
                }
            }
        }
    }

    public static void a(HashMap<String, HashMap<Long, ao>> hashMap) {
        com.bytedance.im.core.a.d a2 = com.bytedance.im.core.a.d.a();
        l.a((Object) a2, "");
        if (a2.b().aJ && (!hashMap.isEmpty())) {
            j.a(" ConvReadInfoHelperimczy callUpdateReadIndex = ".concat(String.valueOf(hashMap)));
            z.e eVar = new z.e();
            T t = (T) hashMap.keySet();
            l.a((Object) t, "");
            eVar.element = t;
            for (String str : eVar.element) {
                com.bytedance.im.core.internal.a.f.b(str, hashMap.get(str));
            }
            v.a(new a(eVar));
        }
    }

    public static void a(List<String> list, String str) {
        l.c(list, "");
        l.c(str, "");
        com.bytedance.im.core.a.d a2 = com.bytedance.im.core.a.d.a();
        l.a((Object) a2, "");
        if (a2.b().aJ) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : list) {
                h a3 = j.a().a(str2);
                if (a3 != null) {
                    arrayList2.add(a3);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                l.a((Object) hVar, "");
                if (hVar.getLastMessage() != null) {
                    arrayList.add(hVar.getLastMessage());
                }
            }
            j.a(" ConvReadInfoHelperimczy updateNetReadInfo conList = ".concat(String.valueOf(list)), new Exception());
            com.bytedance.im.core.internal.b.a.d.a();
            com.bytedance.im.core.internal.b.a.d.a(arrayList, str, null);
        }
    }
}
