package com.bytedance.bpea.core.c;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.bpea.basics.f;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final List<e> f26638a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    static final a f26639b;

    /* renamed from: c  reason: collision with root package name */
    static Handler f26640c;

    /* renamed from: d  reason: collision with root package name */
    public static final b f26641d = new b();

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentLinkedQueue<a> f26642e = new ConcurrentLinkedQueue<>();

    private b() {
    }

    public static final class a extends HandlerThread {
        static {
            Covode.recordClassIndex(15683);
        }

        public a() {
            super("BPEA_EVENT_CENTER");
        }

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            l.c("EventHandlerThread onLooperPrepared.", "");
            b.f26640c = new Handler(b.f26639b.getLooper(), C0565a.f26643a);
            b.a();
        }

        /* renamed from: com.bytedance.bpea.core.c.b$a$a  reason: collision with other inner class name */
        static final class C0565a implements Handler.Callback {

            /* renamed from: a  reason: collision with root package name */
            public static final C0565a f26643a = new C0565a();

            static {
                Covode.recordClassIndex(15684);
            }

            C0565a() {
            }

            public final boolean handleMessage(Message message) {
                l.c(message, "");
                try {
                    if (message.what == 1 && (message.obj instanceof a)) {
                        Object obj = message.obj;
                        if (obj != null) {
                            a aVar = (a) obj;
                            Iterator<T> it = b.f26638a.iterator();
                            while (it.hasNext()) {
                                try {
                                    it.next().onEvent(aVar);
                                } catch (Throwable unused) {
                                }
                            }
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    }
                } catch (Throwable unused2) {
                }
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(15682);
        a aVar = new a();
        f26639b = aVar;
        aVar.start();
    }

    public static void a() {
        try {
            StringBuilder sb = new StringBuilder("send cache event,cache size = ");
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = f26642e;
            l.c(sb.append(concurrentLinkedQueue.size()).toString(), "");
            if (f26640c != null) {
                for (T t : concurrentLinkedQueue) {
                    l.a((Object) t, "");
                    a((a) t);
                }
            }
            f26642e.clear();
        } catch (Throwable unused) {
        }
    }

    public static void a(String str) {
        l.c(str, "");
        a(new a(null, null, f.ERROR, -1, str));
    }

    public static void a(a aVar) {
        l.c(aVar, "");
        int i2 = c.f26644a[aVar.f26632b.ordinal()];
        String str = null;
        if (i2 == 1) {
            StringBuilder sb = new StringBuilder();
            f fVar = aVar.f26634d;
            if (fVar != null) {
                str = fVar.f26600a;
            }
            com.bytedance.bpea.basics.b.c("EventCenter", sb.append(str).append(" >> ").append(aVar.f26635e).append(':').append(aVar.f26636f).append("  ").append(aVar.f26637g).toString());
        } else if (i2 != 2) {
            StringBuilder sb2 = new StringBuilder();
            f fVar2 = aVar.f26634d;
            if (fVar2 != null) {
                str = fVar2.f26600a;
            }
            com.bytedance.bpea.basics.b.b("EventCenter", sb2.append(str).append(" >> ").append(aVar.f26635e).append(':').append(aVar.f26636f).toString());
        } else {
            StringBuilder sb3 = new StringBuilder();
            f fVar3 = aVar.f26634d;
            if (fVar3 != null) {
                str = fVar3.f26600a;
            }
            com.bytedance.bpea.basics.b.d("EventCenter", sb3.append(str).append(" >> ").append(aVar.f26635e).append(':').append(aVar.f26636f).append("  ").append(aVar.f26637g).toString());
        }
        Handler handler = f26640c;
        if (handler == null) {
            StringBuilder sb4 = new StringBuilder("event handler is not ready now ,save event in cacheQueue. current cache queue size is ");
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = f26642e;
            l.c(sb4.append(concurrentLinkedQueue.size()).toString(), "");
            if (concurrentLinkedQueue.size() >= 1024) {
                l.c("current cached event size is over limit,drop the new event.", "");
            } else {
                concurrentLinkedQueue.add(aVar);
            }
        } else {
            handler.sendMessage(handler.obtainMessage(1, aVar));
        }
    }
}
