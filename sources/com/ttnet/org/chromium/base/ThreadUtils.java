package com.ttnet.org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadUtils {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f155197a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ boolean f155198b = true;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f155199c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f155200d;

    /* renamed from: e  reason: collision with root package name */
    private static Handler f155201e;

    static {
        Covode.recordClassIndex(103277);
    }

    public static boolean b() {
        if (a().getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public static Handler a() {
        Handler handler;
        MethodCollector.i(13043);
        synchronized (f155199c) {
            try {
                if (f155201e == null) {
                    if (!f155200d) {
                        f155201e = new Handler(Looper.getMainLooper());
                    } else {
                        RuntimeException runtimeException = new RuntimeException("Did not yet override the UI thread");
                        MethodCollector.o(13043);
                        throw runtimeException;
                    }
                }
                handler = f155201e;
            } finally {
                MethodCollector.o(13043);
            }
        }
        return handler;
    }

    public static void a(Runnable runnable) {
        a().post(runnable);
    }

    public static void setThreadPriorityAudio(int i2) {
        Process.setThreadPriority(i2, -16);
    }

    public static <T> T a(Callable<T> callable) {
        try {
            return (T) b(callable);
        } catch (ExecutionException e2) {
            throw new RuntimeException("Error occurred waiting for callable", e2);
        }
    }

    private static boolean isThreadPriorityAudio(int i2) {
        if (Process.getThreadPriority(i2) == -16) {
            return true;
        }
        return false;
    }

    private static <T> T b(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        if (b()) {
            futureTask.run();
        } else {
            a().post(futureTask);
        }
        try {
            return (T) futureTask.get();
        } catch (InterruptedException e2) {
            throw new RuntimeException("Interrupted waiting for callable", e2);
        }
    }
}
