package com.ss.android.ugc.aweme.df;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f80066a;

    /* renamed from: b  reason: collision with root package name */
    public static final s f80067b = new s();

    private s() {
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f80068a;

        static {
            Covode.recordClassIndex(49841);
        }

        public a(h.f.a.a aVar) {
            this.f80068a = aVar;
        }

        public final void run() {
            this.f80068a.invoke();
        }
    }

    static {
        Covode.recordClassIndex(49840);
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        Objects.requireNonNull(executor, "null cannot be cast to non-null type java.util.concurrent.ExecutorService");
        f80066a = (ExecutorService) executor;
    }

    public static final void b(Runnable runnable) {
        l.d(runnable, "");
        f80066a.execute(runnable);
    }

    public static final void a(Runnable runnable) {
        l.d(runnable, "");
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
