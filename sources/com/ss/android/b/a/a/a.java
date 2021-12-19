package com.ss.android.b.a.a;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ExecutorService f59124a;

    /* renamed from: b  reason: collision with root package name */
    private static Handler f59125b;

    static {
        Covode.recordClassIndex(36562);
    }

    private static void a() {
        ExecutorService executorService = f59124a;
        if (executorService == null || executorService.isTerminated() || f59125b == null) {
            f59124a = (ExecutorService) AsyncTask.THREAD_POOL_EXECUTOR;
            f59125b = new Handler(Looper.getMainLooper());
        }
    }

    public static void a(Runnable runnable) {
        a();
        try {
            f59124a.execute(runnable);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void b(Runnable runnable) {
        a();
        Handler handler = f59125b;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public static void c(Runnable runnable) {
        a();
        f59125b.removeCallbacks(runnable);
    }

    public static void a(Runnable runnable, int i2) {
        a();
        Handler handler = f59125b;
        if (handler != null) {
            handler.postDelayed(runnable, (long) i2);
        }
    }
}
