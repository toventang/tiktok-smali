package com.bytedance.ies.im.core.g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.u;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class b extends Handler {

    /* renamed from: b  reason: collision with root package name */
    private static final a f34162b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final h f34163a = i.a((h.f.a.a) C0756b.f34164a);

    static {
        Covode.recordClassIndex(20346);
    }

    /* access modifiers changed from: package-private */
    public final Map<String, Set<d>> a() {
        return (Map) this.f34163a.getValue();
    }

    static final class a {
        static {
            Covode.recordClassIndex(20347);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.im.core.g.b$b  reason: collision with other inner class name */
    static final class C0756b extends m implements h.f.a.a<Map<String, Set<d>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0756b f34164a = new C0756b();

        static {
            Covode.recordClassIndex(20348);
        }

        C0756b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, Set<d>> invoke() {
            return new LinkedHashMap();
        }
    }

    public b() {
        super(Looper.getMainLooper());
    }

    public final void b() {
        com.bytedance.ies.im.core.api.a.b().b("MsgSender_MQ", "clear");
        a().clear();
    }

    private final void a(d dVar) {
        com.bytedance.ies.im.core.api.a.b().a("MsgSender_MQ", "cancelTimeOut[" + dVar.f34174a + "]: " + dVar);
        removeMessages(dVar.f34184k);
    }

    public final void handleMessage(Message message) {
        l.d(message, "");
        com.bytedance.ies.im.core.api.a.b().b("MsgSender_MQ", "handleMessage[" + message.obj + ']');
        Object obj = message.obj;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        a((String) obj, true, u.a().a("MQ timeout").f38031a);
    }

    private final void a(Map<String, Set<d>> map, com.bytedance.im.core.d.h hVar) {
        Set<d> set;
        Integer num;
        MethodCollector.i(765);
        synchronized (this) {
            try {
                set = map.get(hVar.getConversationId());
            } finally {
                MethodCollector.o(765);
            }
        }
        com.bytedance.ies.im.core.api.d.b b2 = com.bytedance.ies.im.core.api.a.b();
        StringBuilder append = new StringBuilder("notifyPending[").append(hVar.getConversationId()).append("]: ");
        if (set != null) {
            num = Integer.valueOf(set.size());
        } else {
            num = null;
        }
        b2.b("MsgSender_MQ", append.append(num).toString());
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                it.next().a(hVar);
            }
            return;
        }
        MethodCollector.o(765);
    }

    private final void b(Map<String, Set<d>> map, com.bytedance.im.core.d.h hVar) {
        Set<d> remove;
        Integer num;
        MethodCollector.i(1169);
        synchronized (this) {
            try {
                remove = map.remove(hVar.getConversationId());
            } finally {
                MethodCollector.o(1169);
            }
        }
        com.bytedance.ies.im.core.api.d.b b2 = com.bytedance.ies.im.core.api.a.b();
        StringBuilder append = new StringBuilder("notifySend[").append(hVar.getConversationId()).append("]: ");
        if (remove != null) {
            num = Integer.valueOf(remove.size());
        } else {
            num = null;
        }
        b2.b("MsgSender_MQ", append.append(num).toString());
        if (remove != null) {
            for (T t : remove) {
                a(t);
                t.a(hVar, true);
            }
            return;
        }
        MethodCollector.o(1169);
    }

    private final void a(Map<String, Set<d>> map, String str, u uVar) {
        Set<d> remove;
        Integer num;
        u uVar2;
        MethodCollector.i(973);
        synchronized (this) {
            try {
                remove = map.remove(str);
            } finally {
                MethodCollector.o(973);
            }
        }
        com.bytedance.ies.im.core.api.d.b b2 = com.bytedance.ies.im.core.api.a.b();
        StringBuilder append = new StringBuilder("notifyError[").append(str).append("]: ");
        if (remove != null) {
            num = Integer.valueOf(remove.size());
        } else {
            num = null;
        }
        b2.b("MsgSender_MQ", append.append(num).append(", ").append(uVar).toString());
        if (remove != null) {
            for (T t : remove) {
                a(t);
                if (uVar == null) {
                    uVar2 = u.a().a("UnKnown error").f38031a;
                } else {
                    uVar2 = uVar;
                }
                l.b(uVar2, "");
                t.a(uVar2);
            }
            return;
        }
        MethodCollector.o(973);
    }

    public final void a(String str, boolean z, u uVar) {
        Boolean bool;
        l.d(str, "");
        com.bytedance.im.core.d.h a2 = j.a().a(str);
        com.bytedance.ies.im.core.api.d.b b2 = com.bytedance.ies.im.core.api.a.b();
        StringBuilder append = new StringBuilder("dequeue[").append(str).append("], ");
        if (a2 != null) {
            bool = Boolean.valueOf(a2.isTemp());
        } else {
            bool = null;
        }
        b2.b("MsgSender_MQ", append.append(bool).append(", ").append(z).toString());
        if (a2 == null || (a2.isTemp() && z)) {
            a(a(), str, uVar);
        } else if (a2.isTemp()) {
            a(a(), a2);
        } else {
            b(a(), a2);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(Map<String, Set<d>> map, String str, d dVar) {
        Integer num;
        MethodCollector.i(681);
        Set<d> set = map.get(str);
        com.bytedance.ies.im.core.api.d.b b2 = com.bytedance.ies.im.core.api.a.b();
        StringBuilder append = new StringBuilder("putPayload[").append(str).append("]: ");
        if (set != null) {
            num = Integer.valueOf(set.size());
        } else {
            num = null;
        }
        b2.a("MsgSender_MQ", append.append(num).toString());
        if (set == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(dVar);
            map.put(str, linkedHashSet);
            MethodCollector.o(681);
            return;
        }
        set.add(dVar);
        MethodCollector.o(681);
    }
}
