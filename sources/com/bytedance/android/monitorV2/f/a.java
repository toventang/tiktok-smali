package com.bytedance.android.monitorV2.f;

import com.bytedance.android.monitorV2.l.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23914a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final int f23915b = 4;

    /* renamed from: c  reason: collision with root package name */
    private static final int f23916c = 8;

    /* renamed from: d  reason: collision with root package name */
    private static final long f23917d = f23917d;

    /* renamed from: e  reason: collision with root package name */
    private static ExecutorService f23918e;

    private a() {
    }

    /* renamed from: com.bytedance.android.monitorV2.f.a$a  reason: collision with other inner class name */
    static final class RunnableC0513a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f23919a;

        static {
            Covode.recordClassIndex(14126);
        }

        RunnableC0513a(h.f.a.a aVar) {
            this.f23919a = aVar;
        }

        public final void run() {
            try {
                this.f23919a.invoke();
            } catch (Exception unused) {
                c.a();
            }
        }
    }

    static {
        Covode.recordClassIndex(14125);
    }

    public static ExecutorService a() {
        if (f23918e == null) {
            f23918e = new ThreadPoolExecutor(f23915b, f23916c, f23917d, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardPolicy());
        }
        ExecutorService executorService = f23918e;
        if (executorService == null) {
            l.a();
        }
        return executorService;
    }

    public static void a(h.f.a.a<z> aVar) {
        l.c(aVar, "");
        a().execute(new RunnableC0513a(aVar));
    }

    public static void a(Runnable runnable) {
        l.c(runnable, "");
        a().execute(new com.bytedance.android.monitorV2.e.a(runnable));
    }
}
