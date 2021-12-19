package com.ss.android.ugc.aweme.cw;

import android.os.Process;
import android.os.SystemClock;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.cw.f;
import com.ss.android.ugc.aweme.cw.m;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class d implements m.a {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicInteger f79102a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f79103b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f79104c;

    /* renamed from: d  reason: collision with root package name */
    public static ExecutorService f79105d;

    /* renamed from: e  reason: collision with root package name */
    public static ExecutorService f79106e;

    /* renamed from: f  reason: collision with root package name */
    public static long f79107f;

    /* renamed from: g  reason: collision with root package name */
    public static long f79108g;

    /* renamed from: h  reason: collision with root package name */
    public static final long f79109h = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: i  reason: collision with root package name */
    private static final int f79110i;

    /* renamed from: j  reason: collision with root package name */
    private static final int f79111j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f79112k;

    /* renamed from: l  reason: collision with root package name */
    private static RejectedExecutionHandler f79113l = new RejectedExecutionHandler() {
        /* class com.ss.android.ugc.aweme.cw.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(49112);
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            a.a("sIORejectHandler: runnable=%s, executor=%s", new Object[]{runnable, threadPoolExecutor});
            d.f79105d.execute(runnable);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - d.f79107f >= d.f79109h) {
                d.f79107f = elapsedRealtime;
                f.a.f79142a.a(runnable, threadPoolExecutor);
                return;
            }
            d.f79107f = elapsedRealtime;
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private static RejectedExecutionHandler f79114m = new RejectedExecutionHandler() {
        /* class com.ss.android.ugc.aweme.cw.d.AnonymousClass2 */

        static {
            Covode.recordClassIndex(49113);
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            a.a("sDefaultRejectHandler: runnable=%s, executor=%s", new Object[]{runnable, threadPoolExecutor});
            d.f79106e.execute(runnable);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - d.f79108g >= d.f79109h || g.f79144a.f79151a) {
                d.f79108g = elapsedRealtime;
                f.a.f79142a.a(runnable, threadPoolExecutor);
                return;
            }
            d.f79108g = elapsedRealtime;
        }
    };

    private static ExecutorService a() {
        return new a(o.IO, 0, 128, 30, TimeUnit.SECONDS, new SynchronousQueue(), a("tp-io", false, 0), f79113l);
    }

    /* renamed from: com.ss.android.ugc.aweme.cw.d$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f79120a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 49116(0xbfdc, float:6.8826E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.cw.o[] r0 = com.ss.android.ugc.aweme.cw.o.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.cw.d.AnonymousClass4.f79120a = r2
                com.ss.android.ugc.aweme.cw.o r0 = com.ss.android.ugc.aweme.cw.o.IO     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.cw.d.AnonymousClass4.f79120a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.cw.o r0 = com.ss.android.ugc.aweme.cw.o.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.cw.d.AnonymousClass4.f79120a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.cw.o r0 = com.ss.android.ugc.aweme.cw.o.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.ugc.aweme.cw.d.AnonymousClass4.f79120a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.ugc.aweme.cw.o r0 = com.ss.android.ugc.aweme.cw.o.SCHEDULED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.android.ugc.aweme.cw.d.AnonymousClass4.f79120a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.android.ugc.aweme.cw.o r0 = com.ss.android.ugc.aweme.cw.o.SERIAL     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.ss.android.ugc.aweme.cw.d.AnonymousClass4.f79120a     // Catch:{ NoSuchFieldError -> 0x004f }
                com.ss.android.ugc.aweme.cw.o r0 = com.ss.android.ugc.aweme.cw.o.FIXED     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cw.d.AnonymousClass4.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(49111);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f79110i = availableProcessors;
        int i2 = availableProcessors + 1;
        f79111j = i2;
        int max = Math.max(2, Math.min(availableProcessors - 1, 6)) * 2;
        f79112k = max;
        f79103b = Math.max(2, Math.min(availableProcessors - 1, 4));
        f79104c = Math.max(2, availableProcessors - 1);
        f79105d = a(max, o.IO, "tp-reject");
        f79106e = a(i2, o.DEFAULT, "tp-default-reject");
    }

    @Override // com.ss.android.ugc.aweme.cw.m.a
    public final ExecutorService a(l lVar) {
        String str;
        ThreadFactory a2;
        long j2;
        BlockingQueue linkedBlockingQueue;
        String str2;
        ThreadFactory a3;
        RejectedExecutionHandler abortPolicy;
        BlockingQueue linkedBlockingQueue2;
        String str3;
        ThreadFactory a4;
        RejectedExecutionHandler abortPolicy2;
        MethodCollector.i(5398);
        a.a("create: taskType=%s", new Object[]{lVar.f79165a});
        long j3 = 30;
        switch (AnonymousClass4.f79120a[lVar.f79165a.ordinal()]) {
            case 1:
                ExecutorService a5 = a();
                MethodCollector.o(5398);
                return a5;
            case 2:
                o oVar = o.DEFAULT;
                int i2 = f79103b;
                a aVar = new a(oVar, i2, (i2 * 2) + 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(128), a("tp-default", false, 0), f79114m);
                aVar.allowCoreThreadTimeOut(true);
                MethodCollector.o(5398);
                return aVar;
            case 3:
                a aVar2 = new a(o.BACKGROUND, 0, 3, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(128), a("tp-background", true, 10), f79114m);
                MethodCollector.o(5398);
                return aVar2;
            case 4:
                int i3 = lVar.f79167c;
                if (lVar.f79171g != null) {
                    a2 = lVar.f79171g;
                } else {
                    if (lVar.f79166b != null) {
                        str = lVar.f79166b;
                    } else {
                        str = "tp-scheduled";
                    }
                    a2 = a(str, false, 0);
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i3, a2);
                if (lVar.f79170f >= 0) {
                    j2 = lVar.f79170f;
                } else {
                    j2 = 15;
                }
                scheduledThreadPoolExecutor.setKeepAliveTime(j2, TimeUnit.SECONDS);
                scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                MethodCollector.o(5398);
                return scheduledThreadPoolExecutor;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                o oVar2 = o.SERIAL;
                if (lVar.f79170f >= 0) {
                    j3 = lVar.f79170f;
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (lVar.f79168d != null) {
                    linkedBlockingQueue = lVar.f79168d;
                } else {
                    linkedBlockingQueue = new LinkedBlockingQueue();
                }
                if (lVar.f79171g != null) {
                    a3 = lVar.f79171g;
                } else {
                    if (lVar.f79166b != null) {
                        str2 = lVar.f79166b;
                    } else {
                        str2 = "tp-serial";
                    }
                    a3 = a(str2, false, 0);
                }
                if (lVar.f79169e != null) {
                    abortPolicy = lVar.f79169e;
                } else {
                    abortPolicy = new ThreadPoolExecutor.AbortPolicy();
                }
                a aVar3 = new a(oVar2, 1, 1, j3, timeUnit, linkedBlockingQueue, a3, abortPolicy);
                aVar3.allowCoreThreadTimeOut(true);
                MethodCollector.o(5398);
                return aVar3;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                o oVar3 = o.FIXED;
                int i4 = lVar.f79167c;
                int i5 = lVar.f79167c;
                if (lVar.f79170f >= 0) {
                    j3 = lVar.f79170f;
                }
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                if (lVar.f79168d != null) {
                    linkedBlockingQueue2 = lVar.f79168d;
                } else {
                    linkedBlockingQueue2 = new LinkedBlockingQueue();
                }
                if (lVar.f79171g != null) {
                    a4 = lVar.f79171g;
                } else {
                    if (lVar.f79166b != null) {
                        str3 = lVar.f79166b;
                    } else {
                        str3 = "tp-fixed";
                    }
                    a4 = a(str3, false, 0);
                }
                if (lVar.f79169e != null) {
                    abortPolicy2 = lVar.f79169e;
                } else {
                    abortPolicy2 = new ThreadPoolExecutor.AbortPolicy();
                }
                a aVar4 = new a(oVar3, i4, i5, j3, timeUnit2, linkedBlockingQueue2, a4, abortPolicy2);
                aVar4.allowCoreThreadTimeOut(true);
                MethodCollector.o(5398);
                return aVar4;
            default:
                ExecutorService a6 = a();
                MethodCollector.o(5398);
                return a6;
        }
    }

    private static ThreadFactory a(final String str, final boolean z, final int i2) {
        return new ThreadFactory() {
            /* class com.ss.android.ugc.aweme.cw.d.AnonymousClass3 */

            static {
                Covode.recordClassIndex(49114);
            }

            public final Thread newThread(final Runnable runnable) {
                Thread thread = new Thread(new Runnable() {
                    /* class com.ss.android.ugc.aweme.cw.d.AnonymousClass3.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(49115);
                    }

                    public final void run() {
                        try {
                            Process.setThreadPriority(i2);
                        } catch (Throwable unused) {
                        }
                        runnable.run();
                    }
                });
                thread.setName(str + "-" + d.f79102a.incrementAndGet());
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    private static ExecutorService a(int i2, o oVar, String str) {
        a aVar = new a(oVar, i2, i2, TimeUnit.SECONDS, new LinkedBlockingQueue(), a(str, false, 0));
        aVar.allowCoreThreadTimeOut(true);
        return aVar;
    }
}
