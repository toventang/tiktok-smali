package com.bytedance.common.jato.boost;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f26811a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f26812b;

    /* renamed from: c  reason: collision with root package name */
    public static Map<Integer, Integer> f26813c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f26814d;

    static {
        Covode.recordClassIndex(15818);
    }

    public static synchronized void a() {
        synchronized (g.class) {
            MethodCollector.i(7648);
            if (!f26812b || f26811a == -1) {
                MethodCollector.o(7648);
                return;
            }
            Jato.resetCoreBind(f26811a);
            Jato.resetPriority(f26811a);
            f26812b = false;
            MethodCollector.o(7648);
        }
    }

    public static void a(int i2, int i3) {
        try {
            int i4 = 0;
            if (f26813c.get(Integer.valueOf(i2)) == null) {
                if (i2 != -1) {
                    i4 = Process.getThreadPriority(i2);
                } else {
                    i4 = Process.getThreadPriority(0);
                }
                f26813c.put(Integer.valueOf(i2), Integer.valueOf(i4));
            }
            if (i4 == i3) {
                return;
            }
            if (i2 != -1) {
                Process.setThreadPriority(i2, i3);
            } else {
                Process.setThreadPriority(i3);
            }
        } catch (Throwable th) {
            Jato.getListener().a("error when set priority", th);
        }
    }

    public static synchronized void a(final Application application, final ExecutorService executorService, final int i2) {
        synchronized (g.class) {
            MethodCollector.i(7653);
            if (!f26812b && f26811a != -1) {
                f26812b = true;
                Jato.bindBigCore(f26811a);
                a(f26811a, i2);
                MethodCollector.o(7653);
            } else if (f26814d) {
                MethodCollector.o(7653);
            } else {
                f26814d = true;
                application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                    /* class com.bytedance.common.jato.boost.g.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(15819);
                    }

                    public final void onActivityDestroyed(Activity activity) {
                    }

                    public final void onActivityPaused(Activity activity) {
                    }

                    public final void onActivityResumed(Activity activity) {
                    }

                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    public final void onActivityStarted(Activity activity) {
                    }

                    public final void onActivityStopped(Activity activity) {
                    }

                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        executorService.execute(new Runnable() {
                            /* class com.bytedance.common.jato.boost.g.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(15820);
                            }

                            /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ca, code lost:
                                if (0 == 0) goto L_0x0064;
                             */
                            /* JADX WARNING: Removed duplicated region for block: B:16:0x006a A[Catch:{ all -> 0x00d5 }] */
                            /* JADX WARNING: Removed duplicated region for block: B:47:0x0097 A[SYNTHETIC] */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void run() {
                                /*
                                // Method dump skipped, instructions count: 221
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.boost.g.AnonymousClass1.AnonymousClass1.run():void");
                            }
                        });
                    }
                });
                MethodCollector.o(7653);
            }
        }
    }
}
