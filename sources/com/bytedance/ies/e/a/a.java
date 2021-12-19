package com.bytedance.ies.e.a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f33804a = new ScheduledThreadPoolExecutor(4);

    /* renamed from: b  reason: collision with root package name */
    public static a f33805b;

    /* renamed from: c  reason: collision with root package name */
    public static Handler f33806c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f33807d;

    /* renamed from: e  reason: collision with root package name */
    public Executor f33808e;

    /* renamed from: com.bytedance.ies.e.a.a$a  reason: collision with other inner class name */
    public static class C0736a {

        /* renamed from: a  reason: collision with root package name */
        public Executor f33812a;

        static {
            Covode.recordClassIndex(20068);
        }
    }

    static {
        Covode.recordClassIndex(20066);
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            MethodCollector.i(1901);
            if (f33805b == null) {
                f33805b = new a();
            }
            aVar = f33805b;
            MethodCollector.o(1901);
        }
        return aVar;
    }

    private static void a(a aVar) {
        if (!aVar.f33807d) {
            throw new IllegalStateException("TaskManager not init");
        }
    }

    private static Runnable b(final Handler handler, final Callable callable, final int i2) {
        return new Runnable() {
            /* class com.bytedance.ies.e.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(20067);
            }

            public final void run() {
                Handler handler = handler;
                if (handler == null) {
                    try {
                        callable.call();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    Message obtainMessage = handler.obtainMessage(i2);
                    try {
                        obtainMessage.obj = callable.call();
                    } catch (Exception e3) {
                        obtainMessage.obj = e3;
                    }
                    handler.sendMessage(obtainMessage);
                }
            }
        };
    }

    public final void a(Handler handler, Callable callable, int i2) {
        a(this);
        this.f33808e.execute(b(handler, callable, i2));
    }
}
