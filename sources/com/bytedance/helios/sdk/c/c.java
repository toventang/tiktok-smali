package com.bytedance.helios.sdk.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.d;
import com.bytedance.crash.j.i;
import com.bytedance.helios.api.b.f;
import com.bytedance.helios.api.b.p;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c implements com.bytedance.helios.api.b.c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30822a = new a((byte) 0);

    static {
        Covode.recordClassIndex(17907);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(17908);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.helios.api.c.b f30823a;

        static {
            Covode.recordClassIndex(17909);
        }

        b(com.bytedance.helios.api.c.b bVar) {
            this.f30823a = bVar;
        }

        public final void run() {
            throw this.f30823a.f30707b;
        }
    }

    @Override // com.bytedance.helios.api.b.c
    public final void a(f fVar) {
        String name;
        l.c(fVar, "");
        com.bytedance.helios.api.c.b bVar = (com.bytedance.helios.api.c.b) fVar;
        p pVar = com.bytedance.helios.sdk.g.b.f30988b;
        if (pVar != null && pVar.f30695c) {
            Thread currentThread = Thread.currentThread();
            l.a((Object) currentThread, "");
            String name2 = currentThread.getName();
            Map map = bVar.f30709d;
            if (map == null) {
                map = new LinkedHashMap();
            }
            map.put("Label", bVar.f30708c);
            StackTraceElement stackTraceElement = new StackTraceElement(getClass().getName(), "", "", 0);
            String b2 = com.bytedance.helios.a.a.f.b(bVar.f30707b);
            String str = bVar.f30708c;
            Thread thread = bVar.f30706a;
            if (!(thread == null || (name = thread.getName()) == null)) {
                name2 = name;
            }
            d a2 = d.a(stackTraceElement, b2, str, name2, true, "EnsureNotReachHere", "helios_log_type");
            l.a((Object) a2, "");
            for (Map.Entry entry : map.entrySet()) {
                a2.c((String) entry.getKey(), (String) entry.getValue());
            }
            a2.a("Label", bVar.f30708c);
            a2.a("EventType", "HeliosException");
            i.a(a2);
            com.bytedance.helios.sdk.utils.f.a(bVar.f30708c, (String) null, "e", bVar.f30707b);
            com.bytedance.helios.sdk.utils.f.a(bVar.f30708c, map.toString(), "e", 8);
            a.b();
            if (HeliosEnvImpl.INSTANCE.isOffLineEnv()) {
                com.bytedance.helios.a.a.c.a().post(new b(bVar));
            }
        }
    }
}
