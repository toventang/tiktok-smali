package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Iterator;

public class StackLeakChecker {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mCheckerEnabled;
    private static ArrayList<StackLeakItem> mLeakList = new ArrayList<>();
    private static int mLeakThreadThreshold = 10;
    private static ArrayList<StackLeakListener> mListeners = new ArrayList<>();
    private static long mStackCheckInterval = 60000000;

    public interface StackLeakListener {
        static {
            Covode.recordClassIndex(27008);
        }

        void onLeakReport(ArrayList<StackLeakItem> arrayList);
    }

    public static int com_bytedance_sysoptimizer_StackLeakChecker_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean setEnable(boolean z, int i2, int i3, long j2, String[] strArr);

    private StackLeakChecker() {
    }

    public static synchronized void disableChecker() {
        synchronized (StackLeakChecker.class) {
            MethodCollector.i(11924);
            if (mCheckerEnabled) {
                setEnable(false, 0, 0, 0, null);
            }
            MethodCollector.o(11924);
        }
    }

    private static void reportLeak() {
        Iterator<StackLeakListener> it = mListeners.iterator();
        while (it.hasNext()) {
            it.next().onLeakReport(mLeakList);
        }
        mLeakList.clear();
    }

    static {
        Covode.recordClassIndex(27007);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT > 29) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized void registerStackLeakListener(StackLeakListener stackLeakListener) {
        synchronized (StackLeakChecker.class) {
            MethodCollector.i(11760);
            if (stackLeakListener != null) {
                mListeners.add(stackLeakListener);
            }
            MethodCollector.o(11760);
        }
    }

    public static synchronized boolean enableChecker(Context context, String[] strArr) {
        synchronized (StackLeakChecker.class) {
            MethodCollector.i(11761);
            if (mCheckerEnabled) {
                MethodCollector.o(11761);
                return true;
            } else if (loadOptimizerOnNeed(context)) {
                try {
                    boolean enable = setEnable(true, Build.VERSION.SDK_INT, mLeakThreadThreshold, mStackCheckInterval, strArr);
                    mCheckerEnabled = enable;
                    MethodCollector.o(11761);
                    return enable;
                } catch (UnsatisfiedLinkError e2) {
                    com_bytedance_sysoptimizer_StackLeakChecker_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "UnsatisfiedLinkError", e2);
                    MethodCollector.o(11761);
                    return false;
                }
            } else {
                MethodCollector.o(11761);
                return false;
            }
        }
    }

    public static synchronized void setInterval(int i2, long j2) {
        long j3;
        int i3 = i2;
        synchronized (StackLeakChecker.class) {
            MethodCollector.i(12073);
            if (i3 <= 0) {
                i3 = 10;
            }
            mLeakThreadThreshold = i3;
            if (j2 > 10000000) {
                j3 = (j2 / 10000000) * 10000000;
            } else {
                j3 = 10000000;
            }
            mStackCheckInterval = j3;
            if (mCheckerEnabled) {
                setEnable(true, 0, i3, j3, null);
            }
            MethodCollector.o(12073);
        }
    }

    private static void addLeakItem(int i2, long j2, long j3, long j4, String str, String str2) {
        mLeakList.add(new StackLeakItem(i2, j2, j3, j4, str, str2));
    }
}
