package com.bytedance.android.monitor.f;

import com.bytedance.android.monitor.l.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23503a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final int f23504b = 4;

    /* renamed from: c  reason: collision with root package name */
    private static final int f23505c = 8;

    /* renamed from: d  reason: collision with root package name */
    private static final long f23506d = f23506d;

    /* renamed from: e  reason: collision with root package name */
    private static ExecutorService f23507e;

    private a() {
    }

    /* renamed from: com.bytedance.android.monitor.f.a$a  reason: collision with other inner class name */
    static final class RunnableC0508a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f23508a;

        static {
            Covode.recordClassIndex(13959);
        }

        RunnableC0508a(h.f.a.a aVar) {
            this.f23508a = aVar;
        }

        public final void run() {
            try {
                this.f23508a.invoke();
            } catch (Exception unused) {
                b.a();
            }
        }
    }

    static {
        Covode.recordClassIndex(13958);
    }

    public static ExecutorService a() {
        if (f23507e == null) {
            f23507e = new ThreadPoolExecutor(f23504b, f23505c, f23506d, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardPolicy());
        }
        ExecutorService executorService = f23507e;
        if (executorService == null) {
            l.a();
        }
        return executorService;
    }

    public static void a(h.f.a.a<z> aVar) {
        l.c(aVar, "");
        a().execute(new RunnableC0508a(aVar));
    }

    public static void a(Runnable runnable) {
        l.c(runnable, "");
        a().execute(new com.bytedance.android.monitor.e.a(runnable));
    }
}
