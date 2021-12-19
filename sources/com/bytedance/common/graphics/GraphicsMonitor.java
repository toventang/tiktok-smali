package com.bytedance.common.graphics;

import com.bytedance.b.j.c;
import com.bytedance.b.j.d.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.monitor.collector.k;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class GraphicsMonitor {
    private static ScheduledFuture<?> gpuFuture;
    public static double gpuLoadDataOnce = -1.0d;
    private static ScheduledExecutorService gpuScheduleService;
    private static boolean isInit;
    private static boolean isInitGraphicsLoad;
    public static volatile boolean isPause;
    private static a lifecycleService;
    private static long sCollectInterval;
    public static long sCollectWindow;
    private static int startTime;

    public static native void closeStatistical();

    public static native double getStatisticOnceData();

    public static native void openStatistical();

    private static native boolean startHook();

    static {
        Covode.recordClassIndex(15779);
    }

    public static synchronized double getByteGpu() {
        double d2;
        synchronized (GraphicsMonitor.class) {
            MethodCollector.i(10142);
            d2 = gpuLoadDataOnce;
            MethodCollector.o(10142);
        }
        return d2;
    }

    public static synchronized boolean isStart() {
        synchronized (GraphicsMonitor.class) {
            MethodCollector.i(10307);
            if (startTime > 0) {
                MethodCollector.o(10307);
                return true;
            }
            MethodCollector.o(10307);
            return false;
        }
    }

    private static void initGraphicsLoad() {
        MethodCollector.i(10311);
        isInitGraphicsLoad = true;
        try {
            k.a(com.bytedance.b.k.a.f26313g);
            startHook();
            gpuScheduleService = com_bytedance_common_graphics_GraphicsMonitor_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newScheduledThreadPool(0);
            MethodCollector.o(10311);
        } catch (Throwable unused) {
            isInitGraphicsLoad = false;
            MethodCollector.o(10311);
        }
    }

    public static synchronized void stop() {
        synchronized (GraphicsMonitor.class) {
            MethodCollector.i(10310);
            if (!isInit) {
                MethodCollector.o(10310);
                return;
            }
            int i2 = startTime - 1;
            startTime = i2;
            if (i2 > 0) {
                MethodCollector.o(10310);
                return;
            }
            gpuFuture.cancel(true);
            gpuLoadDataOnce = -1.0d;
            MethodCollector.o(10310);
        }
    }

    public static synchronized void init() {
        synchronized (GraphicsMonitor.class) {
            MethodCollector.i(10308);
            if (isInit) {
                MethodCollector.o(10308);
                return;
            }
            isInit = true;
            sCollectInterval = 15000;
            sCollectWindow = 100;
            a aVar = (a) c.a(a.class);
            lifecycleService = aVar;
            aVar.a(new com.bytedance.b.j.d.c() {
                /* class com.bytedance.common.graphics.GraphicsMonitor.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(15780);
                }

                @Override // com.bytedance.b.j.d.c
                public final void a() {
                    GraphicsMonitor.isPause = false;
                }

                @Override // com.bytedance.b.j.d.c
                public final void b() {
                    GraphicsMonitor.isPause = true;
                }
            });
            if (lifecycleService.a()) {
                isPause = false;
            }
            MethodCollector.o(10308);
        }
    }

    public static synchronized void start() {
        synchronized (GraphicsMonitor.class) {
            MethodCollector.i(10309);
            if (!isInit) {
                MethodCollector.o(10309);
                return;
            }
            if (!isInitGraphicsLoad) {
                initGraphicsLoad();
            }
            ScheduledExecutorService scheduledExecutorService = gpuScheduleService;
            if (scheduledExecutorService == null) {
                MethodCollector.o(10309);
                return;
            }
            int i2 = startTime + 1;
            startTime = i2;
            if (i2 > 1) {
                MethodCollector.o(10309);
                return;
            }
            AnonymousClass2 r5 = new Runnable() {
                /* class com.bytedance.common.graphics.GraphicsMonitor.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(15781);
                }

                public final void run() {
                    MethodCollector.i(10442);
                    try {
                        if (!GraphicsMonitor.isPause) {
                            GraphicsMonitor.openStatistical();
                            Thread.sleep(GraphicsMonitor.sCollectWindow);
                            GraphicsMonitor.closeStatistical();
                            GraphicsMonitor.gpuLoadDataOnce = GraphicsMonitor.getStatisticOnceData();
                            MethodCollector.o(10442);
                            return;
                        }
                        GraphicsMonitor.gpuLoadDataOnce = -1.0d;
                        MethodCollector.o(10442);
                    } catch (Throwable unused) {
                        MethodCollector.o(10442);
                    }
                }
            };
            long j2 = sCollectInterval;
            gpuFuture = scheduledExecutorService.scheduleWithFixedDelay(r5, j2, j2, TimeUnit.MILLISECONDS);
            MethodCollector.o(10309);
        }
    }

    public static ScheduledExecutorService com_bytedance_common_graphics_GraphicsMonitor_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newScheduledThreadPool(int i2) {
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = i2;
        return (ScheduledExecutorService) g.a(a2.a());
    }
}
