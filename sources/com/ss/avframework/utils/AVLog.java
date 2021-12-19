package com.ss.avframework.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.utils.EarlyAVLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AVLog {
    private static boolean mDisableLogFile = false;
    private static boolean mDisableLogIODevice = false;
    private static ILogFilter mLogConsoleFilter;
    private static ILogFilter mLogIODeviceFilter;
    private static ILogFilter mLogKibanaDeviceFilter;
    private static int mLogLevel = 5;
    private static Map<String, RedunancyChecker> sRedundancyCheckerMap = new ConcurrentHashMap();

    public interface ILogFilter {
        static {
            Covode.recordClassIndex(100582);
        }

        void print(int i2, String str, String str2, String str3, Throwable th);

        void print(int i2, String str, String str2, Throwable th);
    }

    public static int com_ss_avframework_utils_AVLog_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2, Throwable th) {
        return 0;
    }

    public static int com_ss_avframework_utils_AVLog_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    public static int com_ss_avframework_utils_AVLog_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2, Throwable th) {
        return 0;
    }

    public static int com_ss_avframework_utils_AVLog_com_ss_android_ugc_aweme_lancet_LogLancet_v(String str, String str2, Throwable th) {
        return 0;
    }

    public static int com_ss_avframework_utils_AVLog_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2, Throwable th) {
        return 0;
    }

    public static void debugTrace(Object... objArr) {
    }

    private static native void nativePrintln(int i2, String str, String str2);

    private static native void nativeSetPrintLevel(int i2);

    /* access modifiers changed from: package-private */
    public static class RedunancyChecker {
        long lastPrintTime;
        int redundantCount;

        static {
            Covode.recordClassIndex(100583);
        }

        RedunancyChecker() {
        }
    }

    public static ILogFilter getConsoleFilter() {
        return mLogConsoleFilter;
    }

    public static int getLevel() {
        return mLogLevel;
    }

    public static ILogFilter getLogIODevice() {
        return mLogIODeviceFilter;
    }

    public static ILogFilter getLogKibanaDevice() {
        return mLogKibanaDeviceFilter;
    }

    public static boolean isDisableLogFile() {
        boolean isDisableLogFile = Monitor.isDisableLogFile();
        mDisableLogFile = isDisableLogFile;
        return isDisableLogFile;
    }

    public static boolean isLogConsoleSet() {
        if (mLogConsoleFilter != null) {
            return true;
        }
        return false;
    }

    public static boolean isLogIODeviceSet() {
        if (mLogIODeviceFilter != null) {
            return true;
        }
        return false;
    }

    public static boolean isLogKibanaDeviceSet() {
        if (mLogKibanaDeviceFilter != null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(100580);
        MediaEngineFactory.loadLibrary();
        final EarlyAVLog.IEarlyLogPrint earlyLogPrint = EarlyAVLog.getEarlyLogPrint();
        if (earlyLogPrint != null) {
            mLogIODeviceFilter = new ILogFilter() {
                /* class com.ss.avframework.utils.AVLog.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(100581);
                }

                @Override // com.ss.avframework.utils.AVLog.ILogFilter
                public final void print(int i2, String str, String str2, Throwable th) {
                    earlyLogPrint.print(i2, str, str2, th);
                }

                @Override // com.ss.avframework.utils.AVLog.ILogFilter
                public final void print(int i2, String str, String str2, String str3, Throwable th) {
                    earlyLogPrint.print(i2, str, str2 + " " + str3, th);
                }
            };
        }
    }

    public static String getLogDeRedundancyString() {
        try {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            return stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber();
        } catch (Exception unused) {
            return null;
        }
    }

    public static ILogFilter setupConsole(ILogFilter iLogFilter) {
        ILogFilter iLogFilter2 = mLogConsoleFilter;
        mLogConsoleFilter = iLogFilter;
        return iLogFilter2;
    }

    public static ILogFilter setupLogIODevice(ILogFilter iLogFilter) {
        ILogFilter iLogFilter2 = mLogIODeviceFilter;
        mLogIODeviceFilter = iLogFilter;
        return iLogFilter2;
    }

    public static ILogFilter setupLogKibanaDevice(ILogFilter iLogFilter) {
        ILogFilter iLogFilter2 = mLogKibanaDeviceFilter;
        mLogKibanaDeviceFilter = iLogFilter;
        return iLogFilter2;
    }

    public static void setLevel(int i2) {
        MethodCollector.i(14128);
        mLogLevel = i2;
        nativeSetPrintLevel(i2);
        MethodCollector.o(14128);
    }

    public static void disableLogIODevice(boolean z) {
        ILogFilter iLogFilter = mLogKibanaDeviceFilter;
        if (iLogFilter != null) {
            iLogFilter.print(5, "AVLog", "disableLogIODevice : ".concat(String.valueOf(z)), null);
        }
        mDisableLogIODevice = z;
    }

    public static void disableLogFile(boolean z) {
        if (z && !mDisableLogFile) {
            Exception exc = new Exception("Disable log file with record call path.");
            Monitor.writeLog("AVLog", 3, "Cause: " + exc.getMessage() + "\n" + Log.getStackTraceString(exc));
        }
        Monitor.disableLogFile(z);
        mDisableLogFile = z;
    }

    public static void initLogFile(Context context, int i2) {
        Monitor.initLogFile(context, i2);
    }

    public static void iod(String str, String str2) {
        logToIODevice(3, str, str2, null);
    }

    public static void ioe(String str, String str2) {
        logToIODevice(6, str, str2, null);
    }

    public static void ioi(String str, String str2) {
        logToIODevice(4, str, str2, null);
    }

    public static void iov(String str, String str2) {
        logToIODevice(2, str, str2, null);
    }

    public static void iow(String str, String str2) {
        logToIODevice(5, str, str2, null);
    }

    public static void d(String str, String str2) {
        MethodCollector.i(14131);
        nativePrintln(3, str, str2);
        MethodCollector.o(14131);
    }

    public static void e(String str, String str2) {
        MethodCollector.i(14133);
        nativePrintln(6, str, str2);
        MethodCollector.o(14133);
    }

    public static void i(String str, String str2) {
        MethodCollector.i(14130);
        nativePrintln(4, str, str2);
        MethodCollector.o(14130);
    }

    public static void v(String str, String str2) {
        MethodCollector.i(14129);
        nativePrintln(2, str, str2);
        MethodCollector.o(14129);
    }

    public static void w(String str, String str2) {
        MethodCollector.i(14132);
        nativePrintln(5, str, str2);
        MethodCollector.o(14132);
    }

    private static int checkRedundancy(String str, int i2) {
        if (TextUtils.isEmpty(str) || i2 <= 0) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!sRedundancyCheckerMap.containsKey(str)) {
            sRedundancyCheckerMap.put(str, new RedunancyChecker());
        }
        RedunancyChecker redunancyChecker = sRedundancyCheckerMap.get(str);
        if (redunancyChecker == null) {
            return -1;
        }
        redunancyChecker.redundantCount++;
        if (currentTimeMillis - redunancyChecker.lastPrintTime < ((long) i2)) {
            return -1;
        }
        int i3 = redunancyChecker.redundantCount;
        redunancyChecker.redundantCount = 0;
        redunancyChecker.lastPrintTime = currentTimeMillis;
        return i3;
    }

    public static void ioe(String str, String str2, Throwable th) {
        logToIODevice(6, str, str2, th);
    }

    public static void logKibana(int i2, String str, String str2, Throwable th) {
        ILogFilter iLogFilter = mLogKibanaDeviceFilter;
        if (iLogFilter != null) {
            iLogFilter.print(i2, str, str2, th);
        }
        logToIODevice(i2, str, str2, th);
    }

    public static void logToConsole(int i2, String str, String str2, Throwable th) {
        if (i2 >= mLogLevel) {
            ILogFilter iLogFilter = mLogConsoleFilter;
            if (iLogFilter != null) {
                iLogFilter.print(i2, str, str2, th);
                return;
            }
            switch (i2) {
                case 2:
                    com_ss_avframework_utils_AVLog_com_ss_android_ugc_aweme_lancet_LogLancet_v(str, str2, th);
                    return;
                case 3:
                    com_ss_avframework_utils_AVLog_com_ss_android_ugc_aweme_lancet_LogLancet_d(str, str2, th);
                    return;
                case 4:
                    com_ss_avframework_utils_AVLog_com_ss_android_ugc_aweme_lancet_LogLancet_i(str, str2, th);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    com_ss_avframework_utils_AVLog_com_ss_android_ugc_aweme_lancet_LogLancet_w(str, str2, th);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    com_ss_avframework_utils_AVLog_com_ss_android_ugc_aweme_lancet_LogLancet_e(str, str2, th);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    Log.wtf(str, str2, th);
                    return;
                default:
                    return;
            }
        }
    }

    public static void logToIODevice(int i2, String str, String str2, Throwable th) {
        String str3;
        if (!mDisableLogFile) {
            StringBuilder append = new StringBuilder().append(str2);
            if (th != null) {
                str3 = Log.getStackTraceString(th);
            } else {
                str3 = "";
            }
            Monitor.writeLog(str, i2, append.append(str3).toString());
        }
        if (!mDisableLogIODevice) {
            ILogFilter iLogFilter = mLogIODeviceFilter;
            if (iLogFilter != null) {
                iLogFilter.print(5, str, "[" + i2 + "] " + str2, th);
            } else {
                logToConsole(i2, str, str2, th);
            }
        }
    }

    public static void logKibanaEvent(int i2, String str, String str2, String str3, Throwable th) {
        ILogFilter iLogFilter = mLogKibanaDeviceFilter;
        if (iLogFilter != null) {
            iLogFilter.print(i2, str, str2, str3, th);
        }
        logToIODeviceEvent(i2, str, str2, str3, th);
    }

    public static void logToConsoleEvent(int i2, String str, String str2, String str3, Throwable th) {
        logToConsole(i2, str, str2 + " " + str3, th);
    }

    public static void logToIODeviceEvent(int i2, String str, String str2, String str3, Throwable th) {
        String str4;
        if (!mDisableLogFile) {
            StringBuilder append = new StringBuilder().append(str3);
            if (th != null) {
                str4 = Log.getStackTraceString(th);
            } else {
                str4 = "";
            }
            Monitor.writeLog(str, i2, append.append(str4).toString());
        }
        if (!mDisableLogIODevice) {
            ILogFilter iLogFilter = mLogIODeviceFilter;
            if (iLogFilter != null) {
                iLogFilter.print(5, str, "[" + i2 + "] " + str2 + " " + str3, th);
            } else {
                logToConsole(i2, str, str3, th);
            }
        }
    }

    public static boolean logToIODevice2(int i2, String str, String str2, Throwable th, String str3, int i3) {
        int checkRedundancy = checkRedundancy(str3, i3);
        if (checkRedundancy < 0) {
            return false;
        }
        if (checkRedundancy > 0) {
            str2 = "[repeat " + checkRedundancy + " times] " + str2;
        }
        logToIODevice(i2, str, str2, th);
        return true;
    }
}
