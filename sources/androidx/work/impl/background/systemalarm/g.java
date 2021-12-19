package androidx.work.impl.background.systemalarm;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
public final class g {

    /* renamed from: e  reason: collision with root package name */
    private static final String f4670e = androidx.work.g.a("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f4671a;

    /* renamed from: b  reason: collision with root package name */
    final Map<String, b> f4672b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<String, a> f4673c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final Object f4674d = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final ThreadFactory f4675f;

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(1839);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(1837);
    }

    /* access modifiers changed from: package-private */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final g f4678a;

        /* renamed from: b  reason: collision with root package name */
        private final String f4679b;

        static {
            Covode.recordClassIndex(1840);
        }

        public final void run() {
            synchronized (this.f4678a.f4674d) {
                if (this.f4678a.f4672b.remove(this.f4679b) != null) {
                    a remove = this.f4678a.f4673c.remove(this.f4679b);
                    if (remove != null) {
                        remove.a(this.f4679b);
                    }
                } else {
                    androidx.work.g.a();
                    com.a.a("Timer with %s is already marked as complete.", new Object[]{this.f4679b});
                }
            }
        }

        b(g gVar, String str) {
            this.f4678a = gVar;
            this.f4679b = str;
        }
    }

    g() {
        AnonymousClass1 r2 = new ThreadFactory() {
            /* class androidx.work.impl.background.systemalarm.g.AnonymousClass1 */

            /* renamed from: b  reason: collision with root package name */
            private int f4677b;

            static {
                Covode.recordClassIndex(1838);
            }

            public final Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("WorkManager-WorkTimer-thread-" + this.f4677b);
                this.f4677b++;
                return newThread;
            }
        };
        this.f4675f = r2;
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 1;
        a2.f79178g = r2;
        this.f4671a = (ScheduledExecutorService) com.ss.android.ugc.aweme.cw.g.a(a2.a());
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        synchronized (this.f4674d) {
            if (this.f4672b.remove(str) != null) {
                androidx.work.g.a();
                com.a.a("Stopping timer for %s", new Object[]{str});
                this.f4673c.remove(str);
            }
        }
    }
}
