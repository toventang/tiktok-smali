package com.bytedance.b.k.d;

import com.bytedance.b.k.j;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Map<c, b> f26322a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private ScheduledThreadPoolExecutor f26323b;

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<a, ScheduledFuture> f26324c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private ConcurrentHashMap<a, Runnable> f26325d = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(15289);
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private a f26327b;

        static {
            Covode.recordClassIndex(15290);
        }

        public final void run() {
            j.a("APM-Task");
            try {
                this.f26327b.run();
            } catch (Throwable th) {
                com.bytedance.b.k.b.b.a("APM-AsyncTask", "thread " + Thread.currentThread().getName() + " exception", th);
            }
            j.a();
        }

        private a(a aVar) {
            this.f26327b = aVar;
        }

        /* synthetic */ a(b bVar, a aVar, byte b2) {
            this(aVar);
        }
    }

    private b(String str) {
        this.f26323b = new ScheduledThreadPoolExecutor(1, new d(str));
    }

    public static synchronized b a(c cVar) {
        b bVar;
        synchronized (b.class) {
            if (cVar != null) {
                bVar = f26322a.get(cVar);
                if (bVar == null) {
                    bVar = new b(cVar.name());
                    f26322a.put(cVar, bVar);
                }
            } else {
                throw new IllegalArgumentException("AsyncTaskManagerType must be not null!");
            }
        }
        return bVar;
    }

    public final void b(a aVar) {
        try {
            this.f26323b.remove(this.f26325d.remove(aVar));
            ScheduledFuture remove = this.f26324c.remove(aVar);
            if (remove != null) {
                remove.cancel(true);
            }
        } catch (Throwable th) {
            com.bytedance.b.k.b.b.a("APM-AsyncTask", "removeTask failed", th);
        }
    }

    public final void a(a aVar) {
        ScheduledFuture<?> schedule;
        if (aVar != null) {
            try {
                a aVar2 = new a(this, aVar, (byte) 0);
                if (aVar.f26320f) {
                    schedule = this.f26323b.scheduleWithFixedDelay(aVar2, aVar.f26319e, aVar.f26321g, TimeUnit.MILLISECONDS);
                } else {
                    schedule = this.f26323b.schedule(aVar2, aVar.f26319e, TimeUnit.MILLISECONDS);
                }
                this.f26325d.put(aVar, aVar2);
                this.f26324c.put(aVar, schedule);
            } catch (Throwable th) {
                com.bytedance.b.k.b.b.a("APM-AsyncTask", "sendTask failed.", th);
            }
        }
    }
}
