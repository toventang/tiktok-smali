package androidx.work.impl.utils.b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    final Handler f4774a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    volatile Thread f4775b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f4776c = new Executor() {
        /* class androidx.work.impl.utils.b.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1876);
        }

        public final void execute(Runnable runnable) {
            b.this.f4774a.post(runnable);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private final ThreadFactory f4777d;

    /* renamed from: e  reason: collision with root package name */
    private final ExecutorService f4778e;

    static {
        Covode.recordClassIndex(1875);
    }

    @Override // androidx.work.impl.utils.b.a
    public final Executor a() {
        return this.f4776c;
    }

    @Override // androidx.work.impl.utils.b.a
    public final Thread b() {
        return this.f4775b;
    }

    @Override // androidx.work.impl.utils.b.a
    public final Executor c() {
        return this.f4778e;
    }

    public b() {
        AnonymousClass2 r2 = new ThreadFactory() {
            /* class androidx.work.impl.utils.b.b.AnonymousClass2 */

            /* renamed from: b  reason: collision with root package name */
            private int f4781b;

            static {
                Covode.recordClassIndex(1877);
            }

            public final Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("WorkManager-WorkManagerTaskExecutor-thread-" + this.f4781b);
                this.f4781b++;
                b.this.f4775b = newThread;
                return newThread;
            }
        };
        this.f4777d = r2;
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = r2;
        this.f4778e = g.a(a2.a());
    }

    @Override // androidx.work.impl.utils.b.a
    public final void a(Runnable runnable) {
        this.f4778e.execute(runnable);
    }
}
