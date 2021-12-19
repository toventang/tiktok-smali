package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;

public class SysOptimizer {
    private static boolean mHookRefreshed = false;
    private static ArrayList<UnsatisfiedLinkError> mLoadError = new ArrayList<>();
    private static volatile boolean mOptimzerLibLoaded;

    public static int com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native void refreshHook();

    public static ArrayList<UnsatisfiedLinkError> getLoadLibraryError() {
        return mLoadError;
    }

    static {
        Covode.recordClassIndex(27011);
    }

    public static synchronized void hookOptimizerEnable() {
        synchronized (SysOptimizer.class) {
            MethodCollector.i(11127);
            if (!mOptimzerLibLoaded || mHookRefreshed) {
                MethodCollector.o(11127);
                return;
            }
            try {
                refreshHook();
                mHookRefreshed = true;
                MethodCollector.o(11127);
            } catch (UnsatisfiedLinkError unused) {
                com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("SYSOPTIMIZER", "refresh xhook failed.");
                MethodCollector.o(11127);
            }
        }
    }

    public static void com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public static boolean loadOptimizerLibrary(Context context) {
        MethodCollector.i(11125);
        if (mOptimzerLibLoaded) {
            MethodCollector.o(11125);
            return true;
        }
        synchronized (SysOptimizer.class) {
            try {
                if (mOptimzerLibLoaded) {
                    return true;
                }
                if (context == null) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("sysoptimizer");
                    } catch (UnsatisfiedLinkError e2) {
                        com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("SYSOPTIMIZER", "failed to load SYSOPTIMIZER");
                        com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("SYSOPTIMIZER", "", e2);
                        mLoadError.add(e2);
                        MethodCollector.o(11125);
                        return false;
                    } catch (OverlappingFileLockException e3) {
                        com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("SYSOPTIMIZER", "failed to load so caused by OverlappingFileLockException:", e3);
                        MethodCollector.o(11125);
                        return false;
                    }
                } else {
                    int i3 = Build.VERSION.SDK_INT;
                    Librarian.a("sysoptimizer", context);
                }
                com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d("SYSOPTIMIZER", "load SYSOPTIMIZER success");
                mOptimzerLibLoaded = true;
                MethodCollector.o(11125);
                return true;
            } finally {
                MethodCollector.o(11125);
            }
        }
    }
}
