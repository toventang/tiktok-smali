package com.bytedance.frameworks.baselib.network.b;

import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

final class e implements WeakHandler.IHandler {

    /* renamed from: b  reason: collision with root package name */
    static AtomicInteger f28859b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    static e f28860c = new e();

    /* renamed from: a  reason: collision with root package name */
    WeakHandler f28861a = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: d  reason: collision with root package name */
    private ThreadPoolExecutor f28862d;

    /* renamed from: e  reason: collision with root package name */
    private ThreadPoolExecutor f28863e;

    /* renamed from: f  reason: collision with root package name */
    private ThreadPoolExecutor f28864f;

    private e() {
    }

    static {
        Covode.recordClassIndex(16963);
    }

    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        MethodCollector.i(2361);
        if (this.f28862d == null) {
            ThreadPoolExecutor threadPoolExecutor2 = f.a().f28871a;
            this.f28862d = threadPoolExecutor2;
            if (threadPoolExecutor2 == null) {
                this.f28862d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, f.a().f28879i, TimeUnit.SECONDS, new SynchronousQueue(), new a("NetImmediate"));
            }
        }
        threadPoolExecutor = this.f28862d;
        MethodCollector.o(2361);
        return threadPoolExecutor;
    }

    public final synchronized ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor;
        MethodCollector.i(2372);
        if (this.f28863e == null) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(f.a().f28875e, f.a().f28873c, f.a().f28877g, TimeUnit.SECONDS, new PriorityBlockingQueue(), new a("NetNormal"));
            this.f28863e = threadPoolExecutor2;
            threadPoolExecutor2.allowCoreThreadTimeOut(f.a().f28880j);
        }
        threadPoolExecutor = this.f28863e;
        MethodCollector.o(2372);
        return threadPoolExecutor;
    }

    /* access modifiers changed from: package-private */
    public final synchronized ExecutorService c() {
        ThreadPoolExecutor threadPoolExecutor;
        MethodCollector.i(2378);
        if (this.f28864f == null) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(f.a().f28876f, f.a().f28874d, f.a().f28878h, TimeUnit.SECONDS, new PriorityBlockingQueue(), new a("NetDownload"));
            this.f28864f = threadPoolExecutor2;
            threadPoolExecutor2.allowCoreThreadTimeOut(f.a().f28880j);
        }
        threadPoolExecutor = this.f28864f;
        MethodCollector.o(2378);
        return threadPoolExecutor;
    }

    /* access modifiers changed from: package-private */
    public static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f28865a = new AtomicInteger(1);

        /* renamed from: b  reason: collision with root package name */
        private String f28866b = "ApiExecutor";

        static {
            Covode.recordClassIndex(16964);
        }

        a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f28866b = str;
            }
        }

        public final Thread newThread(Runnable runnable) {
            AnonymousClass1 r1 = new Thread(runnable, this.f28866b + "#" + this.f28865a.getAndIncrement()) {
                /* class com.bytedance.frameworks.baselib.network.b.e.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(16965);
                }

                public final void run() {
                    Process.setThreadPriority(10);
                    super.run();
                }
            };
            r1.setDaemon(false);
            return r1;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null && (message.obj instanceof Runnable)) {
            try {
                int i2 = message.what;
                if (i2 == 0) {
                    b().execute((Runnable) message.obj);
                } else if (i2 == 1) {
                    a().execute((Runnable) message.obj);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
