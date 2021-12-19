package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import h.c.f;
import h.j.h;
import h.m.p;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class v extends bp {

    /* renamed from: a  reason: collision with root package name */
    public static final v f159217a = new v();

    /* renamed from: d  reason: collision with root package name */
    private static final int f159218d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f159219e;
    private static volatile Executor pool;

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f159221a = new b();

        static {
            Covode.recordClassIndex(105714);
        }

        b() {
        }

        public final void run() {
        }
    }

    @Override // kotlinx.coroutines.ah
    public final String toString() {
        return "CommonPool";
    }

    private v() {
    }

    private final synchronized Executor e() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = c();
            pool = executor;
        }
        return executor;
    }

    @Override // kotlinx.coroutines.bp
    public final Executor a() {
        Executor executor = pool;
        if (executor == null) {
            return e();
        }
        return executor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    private static ExecutorService d() {
        return a(b(), new a(new AtomicInteger()));
    }

    static {
        int i2;
        Covode.recordClassIndex(105712);
        try {
            String property = System.getProperty("kotlinx.coroutines.default.parallelism");
            if (property == null) {
                i2 = -1;
                f159218d = i2;
            }
            Integer e2 = p.e(property);
            if (e2 == null || e2.intValue() <= 0) {
                throw new IllegalStateException("Expected positive number in kotlinx.coroutines.default.parallelism, but has ".concat(String.valueOf(property)).toString());
            }
            i2 = e2.intValue();
            f159218d = i2;
        } catch (Throwable unused) {
        }
    }

    private static int b() {
        Integer valueOf = Integer.valueOf(f159218d);
        if (valueOf.intValue() <= 0 || valueOf == null) {
            return h.b(Runtime.getRuntime().availableProcessors() - 1, 1);
        }
        return valueOf.intValue();
    }

    private static ExecutorService c() {
        Class<?> cls;
        ExecutorService executorService;
        Object obj;
        if (System.getSecurityManager() != null) {
            return d();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return d();
        }
        if (!f159219e && f159218d < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                if (method != null) {
                    obj = method.invoke(null, new Object[0]);
                } else {
                    obj = null;
                }
                if (!(obj instanceof ExecutorService)) {
                    obj = null;
                }
                executorService = (ExecutorService) obj;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                if (!a(cls, executorService)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(b()));
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService2 = (ExecutorService) newInstance;
        } catch (Throwable unused3) {
        }
        if (executorService2 != null) {
            return executorService2;
        }
        return d();
    }

    /* access modifiers changed from: package-private */
    public static final class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicInteger f159220a;

        static {
            Covode.recordClassIndex(105713);
        }

        a(AtomicInteger atomicInteger) {
            this.f159220a = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "CommonPool-worker-" + this.f159220a.incrementAndGet());
            thread.setDaemon(true);
            return thread;
        }
    }

    private static ExecutorService a(int i2, ThreadFactory threadFactory) {
        return g.a(l.a(o.FIXED).a(i2).a(threadFactory).a());
    }

    @Override // kotlinx.coroutines.ah
    public final void dispatch(f fVar, Runnable runnable) {
        Runnable runnable2;
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = e();
            }
            cx cxVar = cy.f159102a;
            if (cxVar == null || (runnable2 = cxVar.b()) == null) {
                runnable2 = runnable;
            }
            executor.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            at.f159025a.enqueue(runnable);
        }
    }

    private static boolean a(Class<?> cls, ExecutorService executorService) {
        executorService.submit(b.f159221a);
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (!(invoke instanceof Integer)) {
                invoke = null;
            }
            num = (Integer) invoke;
        } catch (Throwable unused) {
        }
        if (num == null || num.intValue() <= 0) {
            return false;
        }
        return true;
    }
}
