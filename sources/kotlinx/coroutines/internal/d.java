package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Method f159121a;

    static {
        Method method;
        Covode.recordClassIndex(105646);
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f159121a = method;
    }

    public static final boolean a(Executor executor) {
        Method method;
        try {
            if (!(executor instanceof ScheduledExecutorService)) {
                executor = null;
            }
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) executor;
            if (scheduledExecutorService == null || (method = f159121a) == null) {
                return false;
            }
            method.invoke(scheduledExecutorService, true);
            return true;
        } catch (Throwable unused) {
        }
    }
}
