package com.bytedance.helios.api.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.api.b.h;
import com.bytedance.helios.api.c.b;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    static final List<c> f30685a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static c f30686b;

    /* renamed from: c  reason: collision with root package name */
    public static final List<g> f30687c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public static c f30688d;

    /* renamed from: e  reason: collision with root package name */
    static final Object f30689e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final Handler f30690f;

    /* renamed from: g  reason: collision with root package name */
    public static l f30691g;

    /* renamed from: h  reason: collision with root package name */
    public static final o f30692h = new o();

    private o() {
    }

    static {
        Covode.recordClassIndex(17821);
        HandlerThread handlerThread = new HandlerThread("helios.consumer", 0);
        handlerThread.start();
        handlerThread.setUncaughtExceptionHandler(com.bytedance.helios.api.c.a.f30705a);
        Looper looper = handlerThread.getLooper();
        l.a((Object) looper, "");
        f30690f = new a(looper);
    }

    public static final class a extends Handler {
        static {
            Covode.recordClassIndex(17822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Looper looper) {
            super(looper);
            l.c(looper, "");
        }

        public final void handleMessage(Message message) {
            l lVar;
            List<k> jsbEvents;
            MethodCollector.i(12083);
            l.c(message, "");
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 1000) {
                Object obj = message.obj;
                if (obj != null) {
                    n nVar = (n) obj;
                    Iterator<T> it = o.f30687c.iterator();
                    while (it.hasNext()) {
                        it.next().a(nVar);
                    }
                    if (nVar.C == null && (lVar = o.f30691g) != null && (jsbEvents = lVar.getJsbEvents()) != null && (!jsbEvents.isEmpty())) {
                        nVar.D = jsbEvents;
                        nVar.C = "jsb";
                    }
                    synchronized (o.f30689e) {
                        try {
                            Iterator<T> it2 = o.f30685a.iterator();
                            while (it2.hasNext()) {
                                it2.next().a(nVar);
                            }
                        } finally {
                            MethodCollector.o(12083);
                        }
                    }
                    return;
                }
                w wVar = new w("null cannot be cast to non-null type");
                MethodCollector.o(12083);
                throw wVar;
            } else if (i2 == 1001) {
                c cVar = o.f30686b;
                if (cVar != null) {
                    Object obj2 = message.obj;
                    if (obj2 != null) {
                        cVar.a((m) obj2);
                        MethodCollector.o(12083);
                        return;
                    }
                    w wVar2 = new w("null cannot be cast to non-null type");
                    MethodCollector.o(12083);
                    throw wVar2;
                }
                MethodCollector.o(12083);
            } else if (i2 == 1002) {
                Object obj3 = message.obj;
                if (obj3 != null) {
                    q qVar = (q) obj3;
                    c cVar2 = o.f30686b;
                    if (cVar2 != null) {
                        cVar2.a(qVar);
                        MethodCollector.o(12083);
                        return;
                    }
                    MethodCollector.o(12083);
                    return;
                }
                w wVar3 = new w("null cannot be cast to non-null type");
                MethodCollector.o(12083);
                throw wVar3;
            } else if (i2 == 1003) {
                Object obj4 = message.obj;
                if (obj4 != null) {
                    r rVar = (r) obj4;
                    c cVar3 = o.f30686b;
                    if (cVar3 != null) {
                        cVar3.a(rVar);
                        MethodCollector.o(12083);
                        return;
                    }
                    MethodCollector.o(12083);
                    return;
                }
                w wVar4 = new w("null cannot be cast to non-null type");
                MethodCollector.o(12083);
                throw wVar4;
            } else if (i2 == 1006) {
                Object obj5 = message.obj;
                if (obj5 != null) {
                    com.bytedance.helios.api.b.a.a aVar = (com.bytedance.helios.api.b.a.a) obj5;
                    c cVar4 = o.f30686b;
                    if (cVar4 != null) {
                        cVar4.a(aVar);
                        MethodCollector.o(12083);
                        return;
                    }
                    MethodCollector.o(12083);
                    return;
                }
                w wVar5 = new w("null cannot be cast to non-null type");
                MethodCollector.o(12083);
                throw wVar5;
            } else if (i2 == 1004) {
                Object obj6 = message.obj;
                if (obj6 != null) {
                    b bVar = (b) obj6;
                    c cVar5 = o.f30688d;
                    if (cVar5 != null) {
                        cVar5.a(bVar);
                        MethodCollector.o(12083);
                        return;
                    }
                    MethodCollector.o(12083);
                    return;
                }
                w wVar6 = new w("null cannot be cast to non-null type");
                MethodCollector.o(12083);
                throw wVar6;
            } else {
                if (i2 == 1005) {
                    Object obj7 = message.obj;
                    if (obj7 != null) {
                        n nVar2 = (n) obj7;
                        Iterator<T> it3 = o.f30687c.iterator();
                        while (it3.hasNext()) {
                            it3.next().a(nVar2);
                        }
                        if (h.a.a() != null) {
                            l.c(nVar2, "");
                            MethodCollector.o(12083);
                            return;
                        }
                    } else {
                        w wVar7 = new w("null cannot be cast to non-null type");
                        MethodCollector.o(12083);
                        throw wVar7;
                    }
                }
                MethodCollector.o(12083);
            }
        }
    }

    public static void a(c cVar) {
        MethodCollector.i(11765);
        if (cVar != null) {
            synchronized (f30689e) {
                try {
                    f30685a.add(cVar);
                } finally {
                    MethodCollector.o(11765);
                }
            }
            return;
        }
        MethodCollector.o(11765);
    }

    public static final void a(m mVar) {
        l.c(mVar, "");
        f30690f.obtainMessage(1001, mVar).sendToTarget();
    }

    public static final void a(r rVar) {
        l.c(rVar, "");
        f30690f.obtainMessage(1003, rVar).sendToTarget();
    }

    public static final void a(b bVar) {
        l.c(bVar, "");
        f30690f.obtainMessage(1004, bVar).sendToTarget();
    }

    public static final void a(n nVar, boolean z) {
        l.c(nVar, "");
        if (z) {
            f30690f.obtainMessage(1005, nVar).sendToTarget();
        } else {
            f30690f.obtainMessage(1000, nVar).sendToTarget();
        }
    }
}
