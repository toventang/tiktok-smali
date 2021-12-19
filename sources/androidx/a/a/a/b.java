package androidx.a.a.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f789a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f790b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Handler f791c;

    static {
        Covode.recordClassIndex(202);
    }

    public b() {
        AnonymousClass1 r2 = new ThreadFactory() {
            /* class androidx.a.a.a.b.AnonymousClass1 */

            /* renamed from: b  reason: collision with root package name */
            private final AtomicInteger f793b = new AtomicInteger(0);

            static {
                Covode.recordClassIndex(203);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName(a.a("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f793b.getAndIncrement())}));
                return thread;
            }
        };
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 4;
        a2.f79178g = r2;
        this.f790b = g.a(a2.a());
    }

    @Override // androidx.a.a.a.c
    public final boolean b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @Override // androidx.a.a.a.c
    public final void a(Runnable runnable) {
        this.f790b.execute(runnable);
    }

    @Override // androidx.a.a.a.c
    public final void b(Runnable runnable) {
        if (this.f791c == null) {
            synchronized (this.f789a) {
                if (this.f791c == null) {
                    this.f791c = a(Looper.getMainLooper());
                }
            }
        }
        this.f791c.post(runnable);
    }

    private static Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        int i2 = Build.VERSION.SDK_INT;
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
