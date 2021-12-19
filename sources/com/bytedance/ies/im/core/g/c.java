package com.bytedance.ies.im.core.g;

import android.os.Message;
import android.os.SystemClock;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.im.core.g.a;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.k;
import com.bytedance.im.core.internal.b.a.x;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Map;
import java.util.Set;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f34165a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final h f34166b = i.a((h.f.a.a) C0757c.f34171a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f34167c = i.a((h.f.a.a) a.f34169a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f34168d = i.a((h.f.a.a) b.f34170a);

    public static b a() {
        return (b) f34166b.getValue();
    }

    public static a b() {
        return (a) f34167c.getValue();
    }

    private static LruCache<String, com.bytedance.ies.im.core.api.f.b> d() {
        return (LruCache) f34168d.getValue();
    }

    private c() {
    }

    static final class b extends m implements h.f.a.a<LruCache<String, com.bytedance.ies.im.core.api.f.b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34170a = new b();

        static {
            Covode.recordClassIndex(20351);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LruCache<String, com.bytedance.ies.im.core.api.f.b> invoke() {
            return new LruCache(30);
        }
    }

    /* renamed from: com.bytedance.ies.im.core.g.c$c  reason: collision with other inner class name */
    static final class C0757c extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0757c f34171a = new C0757c();

        static {
            Covode.recordClassIndex(20352);
        }

        C0757c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    static final class a extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34169a = new a();

        static {
            Covode.recordClassIndex(20350);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(c.a());
        }
    }

    public static void c() {
        com.bytedance.ies.im.core.api.a.b().c("MsgSender", "onSDKLogout");
        b().c();
        a().b();
    }

    static {
        Covode.recordClassIndex(20349);
    }

    private static com.bytedance.ies.im.core.api.f.b b(ai aiVar) {
        l.d(aiVar, "");
        return d().get(aiVar.getUuid());
    }

    public final com.bytedance.ies.im.core.api.f.b a(ai aiVar) {
        l.d(aiVar, "");
        com.bytedance.ies.im.core.api.f.b b2 = b(aiVar);
        if (b2 != null) {
            return b2;
        }
        com.bytedance.ies.im.core.api.f.b bVar = new com.bytedance.ies.im.core.api.f.b();
        a(aiVar, bVar);
        return bVar;
    }

    public static void a(d dVar) {
        boolean z;
        Boolean bool;
        MethodCollector.i(874);
        l.d(dVar, "");
        com.bytedance.ies.im.core.api.a.b().b("MsgSender", "sendMessage: ".concat(String.valueOf(dVar)));
        boolean z2 = false;
        if (!com.bytedance.ies.im.core.api.e.a.b(dVar.f34174a) || !com.bytedance.ies.im.core.api.e.a.a(dVar.f34175b)) {
            MethodCollector.o(874);
            return;
        }
        if (dVar.f34179f == null) {
            dVar.f34179f = new com.bytedance.ies.im.core.api.f.b();
        }
        dVar.f34183j = SystemClock.uptimeMillis();
        com.bytedance.ies.im.core.a.a aVar = com.bytedance.ies.im.core.a.a.f33921b;
        String str = dVar.f34174a;
        if (str == null) {
            l.b();
        }
        com.bytedance.im.core.d.h a2 = aVar.a(str);
        if (a2 == null || a2.isTemp()) {
            String str2 = dVar.f34174a;
            if (str2 == null) {
                l.b();
            }
            if (b.a.c(str2) <= 0) {
                z = true;
            } else {
                z = false;
            }
            b a3 = a();
            l.d(dVar, "");
            com.bytedance.ies.im.core.api.d.b b2 = com.bytedance.ies.im.core.api.a.b();
            StringBuilder append = new StringBuilder("enqueue[").append(dVar.f34174a).append("]: ").append(dVar).append(", ");
            if (a2 != null) {
                bool = Boolean.valueOf(a2.isTemp());
            } else {
                bool = null;
            }
            b2.b("MsgSender_MQ", append.append(bool).toString());
            Map<String, Set<d>> a4 = a3.a();
            String str3 = dVar.f34174a;
            if (str3 == null) {
                l.b();
            }
            a3.a(a4, str3, dVar);
            if (a2 != null && a2.isTemp()) {
                dVar.a(a2);
            }
            com.bytedance.ies.im.core.api.a.b().a("MsgSender_MQ", "bookTimeOut[" + dVar.f34174a + "]: " + dVar);
            Message message = new Message();
            message.what = dVar.f34184k;
            message.obj = dVar.f34174a;
            a3.sendMessageDelayed(message, 10000);
            a b3 = b();
            String str4 = dVar.f34174a;
            if (str4 == null) {
                l.b();
            }
            l.d(str4, "");
            com.bytedance.ies.im.core.api.a.b().b("MsgSender_CQ", "enqueue before[" + str4 + "]: " + b3.b().size());
            synchronized (b3.b()) {
                try {
                    if (!b3.b().containsKey(str4)) {
                        b3.f34152a++;
                        int i2 = b3.f34152a;
                        b3.b().put(str4, Integer.valueOf(i2));
                        com.bytedance.ies.im.core.api.a.b().a("MsgSender_CQ", "bookTimeOut[" + str4 + "]: " + i2);
                        Message message2 = new Message();
                        message2.what = i2;
                        message2.obj = str4;
                        b3.a().sendMessageDelayed(message2, 10000);
                        z2 = true;
                    }
                } finally {
                    MethodCollector.o(874);
                }
            }
            com.bytedance.ies.im.core.api.a.b().b("MsgSender_CQ", "enqueue after[" + str4 + "]: " + b3.b().size() + ", " + z2);
            if (z2) {
                if (z) {
                    try {
                        long parseLong = Long.parseLong(str4);
                        x.a();
                        x.a(1, str4, parseLong, e.a.f37582b, new a.e(b3, str4));
                        MethodCollector.o(874);
                        return;
                    } catch (NumberFormatException unused) {
                        com.bytedance.ies.im.core.api.a.b().c("MsgSender_CQ", "invalid conversationId: ".concat(String.valueOf(str4)));
                        MethodCollector.o(874);
                        return;
                    }
                } else {
                    com.bytedance.ies.im.core.api.a.b().a("MsgSender_CQ", "create[" + str4 + ']');
                    com.bytedance.ies.im.core.a.a.f33921b.b(String.valueOf(k.a(str4)), new a.b(b3, str4));
                }
            }
            return;
        }
        dVar.a(a2, false);
        MethodCollector.o(874);
    }

    public static void a(ai aiVar, com.bytedance.ies.im.core.api.f.b bVar) {
        l.d(aiVar, "");
        l.d(bVar, "");
        d().put(aiVar.getUuid(), bVar);
    }
}
