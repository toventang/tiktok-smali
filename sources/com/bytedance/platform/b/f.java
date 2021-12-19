package com.bytedance.platform.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final RejectedExecutionHandler f41922a = new RejectedExecutionHandler() {
        /* class com.bytedance.platform.b.f.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25606);
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            MethodCollector.i(13359);
            if (f.f41924c != null) {
                ((c) threadPoolExecutor).a();
            }
            f.f41923b.execute(runnable);
            MethodCollector.o(13359);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static volatile ThreadPoolExecutor f41923b;

    /* renamed from: c  reason: collision with root package name */
    public static b f41924c;

    /* renamed from: d  reason: collision with root package name */
    public static g f41925d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f41926e;

    /* renamed from: f  reason: collision with root package name */
    private static final int f41927f;

    /* renamed from: g  reason: collision with root package name */
    private static a f41928g;

    /* renamed from: h  reason: collision with root package name */
    private static g f41929h = new g() {
        /* class com.bytedance.platform.b.f.AnonymousClass2 */

        static {
            Covode.recordClassIndex(25607);
        }

        @Override // com.bytedance.platform.b.g
        public final void a(Throwable th) {
            if (f.f41925d != null) {
                f.f41925d.a(th);
            }
        }
    };

    /* renamed from: i  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f41930i;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f41931a;

        /* renamed from: b  reason: collision with root package name */
        public int f41932b;

        /* renamed from: c  reason: collision with root package name */
        public long f41933c;

        /* renamed from: d  reason: collision with root package name */
        public TimeUnit f41934d;

        static {
            Covode.recordClassIndex(25608);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(25609);
        }
    }

    private f() {
    }

    static {
        Covode.recordClassIndex(25605);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f41926e = availableProcessors;
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        f41927f = availableProcessors;
    }

    public static ThreadPoolExecutor a() {
        MethodCollector.i(9286);
        if (f41930i == null) {
            synchronized (f.class) {
                try {
                    if (f41930i == null) {
                        a aVar = f41928g;
                        if (aVar == null || aVar.f41901a == null) {
                            f41930i = new e(0, 128, 30, TimeUnit.SECONDS, new SynchronousQueue(), new b("platform-io", f41929h), f41922a, "platform-io");
                        } else {
                            f41930i = new e(f41928g.f41901a.f41931a, f41928g.f41901a.f41932b, f41928g.f41901a.f41933c, f41928g.f41901a.f41934d, new SynchronousQueue(), new b("platform-io", f41929h), f41922a, "platform-io");
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9286);
                    throw th;
                }
            }
        }
        ThreadPoolExecutor threadPoolExecutor = f41930i;
        MethodCollector.o(9286);
        return threadPoolExecutor;
    }
}
