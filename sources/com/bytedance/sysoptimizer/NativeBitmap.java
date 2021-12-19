package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class NativeBitmap {
    public static boolean mEnabled;
    private static boolean mStarted;

    static {
        Covode.recordClassIndex(26998);
    }

    public static int com_bytedance_sysoptimizer_NativeBitmap_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_sysoptimizer_NativeBitmap_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_sysoptimizer_NativeBitmap_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean start(int i2);

    private NativeBitmap() {
    }

    public static double getJavaHeapUtilizaiton() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        double d2 = (double) Runtime.getRuntime().totalMemory();
        Double.isNaN(d2);
        double d3 = (double) maxMemory;
        Double.isNaN(d3);
        return (d2 * 1.0d) / d3;
    }

    public static synchronized boolean enable(Context context) {
        synchronized (NativeBitmap.class) {
            MethodCollector.i(12753);
            if (Build.VERSION.SDK_INT >= 22) {
                if (Build.VERSION.SDK_INT <= 25) {
                    boolean realStart = realStart(context);
                    MethodCollector.o(12753);
                    return realStart;
                }
            }
            MethodCollector.o(12753);
            return false;
        }
    }

    public static synchronized boolean realStart(Context context) {
        synchronized (NativeBitmap.class) {
            MethodCollector.i(12871);
            if (mEnabled) {
                MethodCollector.o(12871);
                return true;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    mEnabled = start(Build.VERSION.SDK_INT);
                    com_bytedance_sysoptimizer_NativeBitmap_com_ss_android_ugc_aweme_lancet_LogLancet_d("NativeBitmap", "NativeBitmap.enable: " + mEnabled);
                    boolean z = mEnabled;
                    MethodCollector.o(12871);
                    return z;
                } catch (UnsatisfiedLinkError e2) {
                    com_bytedance_sysoptimizer_NativeBitmap_com_ss_android_ugc_aweme_lancet_LogLancet_e("NativeBitmap", "UnsatisfiedLinkError", e2);
                }
            }
            MethodCollector.o(12871);
            return false;
        }
    }

    public static synchronized boolean enable(final Context context, final long j2, final double d2, long j3) {
        synchronized (NativeBitmap.class) {
            MethodCollector.i(12755);
            if (Build.VERSION.SDK_INT < 22 || Build.VERSION.SDK_INT > 25) {
                MethodCollector.o(12755);
                return false;
            } else if (Runtime.getRuntime().maxMemory() > j3) {
                com_bytedance_sysoptimizer_NativeBitmap_com_ss_android_ugc_aweme_lancet_LogLancet_e("NativeBitmap", "disabled: The java heap is big enough. ");
                MethodCollector.o(12755);
                return false;
            } else if (mStarted || mEnabled) {
                MethodCollector.o(12755);
                return true;
            } else {
                mStarted = true;
                new Thread(null, new Runnable() {
                    /* class com.bytedance.sysoptimizer.NativeBitmap.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(26999);
                    }

                    public final void run() {
                        MethodCollector.i(12075);
                        while (true) {
                            try {
                                Thread.sleep(j2);
                                if (NativeBitmap.mEnabled) {
                                    MethodCollector.o(12075);
                                    return;
                                } else if (NativeBitmap.getJavaHeapUtilizaiton() >= d2) {
                                    NativeBitmap.realStart(context);
                                    MethodCollector.o(12075);
                                    return;
                                }
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                }, "NativeBitmap", 262144).start();
                MethodCollector.o(12755);
                return true;
            }
        }
    }
}
