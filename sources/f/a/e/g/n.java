package f.a.e.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f157899a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f157900b;

    /* renamed from: c  reason: collision with root package name */
    static final AtomicReference<ScheduledExecutorService> f157901c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    static final Map<ScheduledThreadPoolExecutor, Object> f157902d = new ConcurrentHashMap();

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f157903a;

        /* renamed from: b  reason: collision with root package name */
        int f157904b;

        static {
            Covode.recordClassIndex(104840);
        }

        a() {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {
        static {
            Covode.recordClassIndex(104841);
        }

        b() {
        }

        public final void run() {
            Iterator it = new ArrayList(n.f157902d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    n.f157902d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    private static void a() {
        if (f157899a) {
            while (true) {
                AtomicReference<ScheduledExecutorService> atomicReference = f157901c;
                ScheduledExecutorService scheduledExecutorService = atomicReference.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService b2 = b(new j("RxSchedulerPurge"));
                    if (atomicReference.compareAndSet(scheduledExecutorService, b2)) {
                        b bVar = new b();
                        int i2 = f157900b;
                        b2.scheduleAtFixedRate(bVar, (long) i2, (long) i2, TimeUnit.SECONDS);
                        return;
                    }
                    b2.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(104839);
        Properties properties = System.getProperties();
        a aVar = new a();
        if (properties.containsKey("rx2.purge-enabled")) {
            aVar.f157903a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
        } else {
            aVar.f157903a = true;
        }
        if (aVar.f157903a && properties.containsKey("rx2.purge-period-seconds")) {
            try {
                aVar.f157904b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
            }
            f157899a = aVar.f157903a;
            f157900b = aVar.f157904b;
            a();
        }
        aVar.f157904b = 1;
        f157899a = aVar.f157903a;
        f157900b = aVar.f157904b;
        a();
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService b2 = b(threadFactory);
        a(f157899a, b2);
        return b2;
    }

    private static ScheduledExecutorService b(ThreadFactory threadFactory) {
        return (ScheduledExecutorService) g.a(l.a(o.SCHEDULED).a(1).a(threadFactory).a());
    }

    private static void a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f157902d.put(scheduledExecutorService, scheduledExecutorService);
        }
    }
}
