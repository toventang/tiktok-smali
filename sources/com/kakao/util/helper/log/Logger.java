package com.kakao.util.helper.log;

import android.util.Log;
import com.a;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.kakao.util.helper.log.LoggerConfig;
import java.util.HashSet;
import java.util.Locale;

public class Logger {
    private static final LoggerConfig loggerConfig = initLogConfig();
    private static boolean withStack = false;

    public static int com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static int com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_v(String str, String str2) {
        return 0;
    }

    public static int com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    private Logger() {
    }

    static {
        Covode.recordClassIndex(34489);
    }

    private static LoggerConfig initLogConfig() {
        LoggerConfig.Builder printLoggerLevel = new LoggerConfig.Builder().setDefaultTag(Tag.DEFAULT).setStackPrefix("com.kakao.sdk").setPrintLoggerLevel(5);
        HashSet hashSet = new HashSet();
        hashSet.add(Logger.class.getName());
        printLoggerLevel.setIgnoreSet(hashSet);
        return printLoggerLevel.build();
    }

    public static int d(String str) {
        return dt(loggerConfig.getDefaultTag(), str);
    }

    public static int dev(String str) {
        return devt(loggerConfig.getDefaultTag(), str);
    }

    public static int e(String str) {
        return et(loggerConfig.getDefaultTag(), str);
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        return Log.getStackTraceString(th);
    }

    public static int w(String str) {
        return wt(loggerConfig.getDefaultTag(), str);
    }

    public static int i(Throwable th) {
        return it(loggerConfig.getDefaultTag(), th);
    }

    public static int v(Throwable th) {
        return vt(loggerConfig.getDefaultTag(), th);
    }

    public static int d(Throwable th) {
        return dt(loggerConfig.getDefaultTag(), th);
    }

    public static int dev(Throwable th) {
        return devt(loggerConfig.getDefaultTag(), th);
    }

    public static int e(Throwable th) {
        return et(loggerConfig.getDefaultTag(), th);
    }

    public static String getCallerTraceInfo(Class cls) {
        if (!loggerConfig.isPrintLoggable(3)) {
            return "unknown caller";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Thread.currentThread().getName();
        String name2 = cls.getName();
        boolean z = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (stackTraceElement.getClassName().startsWith(name2)) {
                z = true;
            } else if (z) {
                return a.a(Locale.US, "{%s}-[%s.%s():%d]", new Object[]{name, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())});
            }
        }
        return "";
    }

    public static int w(Throwable th) {
        return wt(loggerConfig.getDefaultTag(), th);
    }

    public static int devt(Tag tag, String str) {
        return printLog(tag, 0, str);
    }

    public static int dt(Tag tag, String str) {
        return printLog(tag, 3, str);
    }

    public static int et(Tag tag, String str) {
        return printLog(tag, 6, str);
    }

    public static int it(Tag tag, String str) {
        return printLog(tag, 4, str);
    }

    public static int vt(Tag tag, String str) {
        return printLog(tag, 2, str);
    }

    public static int wt(Tag tag, String str) {
        return printLog(tag, 5, str);
    }

    public static int devt(Tag tag, Throwable th) {
        return devt(tag, getStackTraceString(th));
    }

    public static int dt(Tag tag, Throwable th) {
        return dt(tag, getStackTraceString(th));
    }

    public static int et(Tag tag, Throwable th) {
        return et(tag, getStackTraceString(th));
    }

    public static int i(String str, Throwable th) {
        return it(loggerConfig.getDefaultTag(), str, th);
    }

    public static int it(Tag tag, Throwable th) {
        return it(tag, getStackTraceString(th));
    }

    public static int v(String str, Throwable th) {
        return vt(loggerConfig.getDefaultTag(), str, th);
    }

    public static int vt(Tag tag, Throwable th) {
        return vt(tag, getStackTraceString(th));
    }

    public static int wt(Tag tag, Throwable th) {
        return wt(tag, getStackTraceString(th));
    }

    public static int d(String str, Throwable th) {
        return dt(loggerConfig.getDefaultTag(), str, th);
    }

    public static int dev(String str, Throwable th) {
        return devt(loggerConfig.getDefaultTag(), str, th);
    }

    public static int e(String str, Throwable th) {
        return et(loggerConfig.getDefaultTag(), str, th);
    }

    public static int i(String str, Object... objArr) {
        return it(loggerConfig.getDefaultTag(), str, objArr);
    }

    public static int v(String str, Object... objArr) {
        return vt(loggerConfig.getDefaultTag(), str, objArr);
    }

    public static int w(String str, Throwable th) {
        return wt(loggerConfig.getDefaultTag(), str, th);
    }

    public static int d(String str, Object... objArr) {
        return dt(loggerConfig.getDefaultTag(), str, objArr);
    }

    public static int dev(String str, Object... objArr) {
        return devt(loggerConfig.getDefaultTag(), str, objArr);
    }

    public static int e(String str, Object... objArr) {
        return et(loggerConfig.getDefaultTag(), str, objArr);
    }

    public static int w(String str, Object... objArr) {
        return wt(loggerConfig.getDefaultTag(), str, objArr);
    }

    public static int devt(Tag tag, String str, Throwable th) {
        return devt(tag, "%s\n%s", str, getStackTraceString(th));
    }

    public static int dt(Tag tag, String str, Throwable th) {
        return dt(tag, "%s\n%s", str, getStackTraceString(th));
    }

    public static int et(Tag tag, String str, Throwable th) {
        return et(tag, "%s\n%s", str, getStackTraceString(th));
    }

    public static int it(Tag tag, String str, Throwable th) {
        return it(tag, "%s\n%s", str, getStackTraceString(th));
    }

    public static int vt(Tag tag, String str, Throwable th) {
        return vt(tag, "%s\n%s", str, getStackTraceString(th));
    }

    public static int wt(Tag tag, String str, Throwable th) {
        return wt(tag, "%s\n%s", str, getStackTraceString(th));
    }

    private static int devt(Tag tag, String str, Object... objArr) {
        if (!loggerConfig.isPrintLoggable(0)) {
            return 0;
        }
        if (objArr != null && objArr.length > 0) {
            str = a.a(str, objArr);
        }
        return printLog(tag, 0, str);
    }

    private static int dt(Tag tag, String str, Object... objArr) {
        if (!loggerConfig.isPrintLoggable(3)) {
            return 0;
        }
        if (objArr != null && objArr.length > 0) {
            str = a.a(str, objArr);
        }
        return printLog(tag, 3, str);
    }

    private static int et(Tag tag, String str, Object... objArr) {
        if (!loggerConfig.isPrintLoggable(6)) {
            return 0;
        }
        if (objArr != null && objArr.length > 0) {
            str = a.a(str, objArr);
        }
        return printLog(tag, 6, str);
    }

    private static int it(Tag tag, String str, Object... objArr) {
        if (!loggerConfig.isPrintLoggable(4)) {
            return 0;
        }
        if (objArr != null && objArr.length > 0) {
            str = a.a(str, objArr);
        }
        return printLog(tag, 4, str);
    }

    private static int vt(Tag tag, String str, Object... objArr) {
        if (!loggerConfig.isPrintLoggable(2)) {
            return 0;
        }
        if (objArr != null && objArr.length > 0) {
            str = a.a(str, objArr);
        }
        return printLog(tag, 2, str);
    }

    private static int wt(Tag tag, String str, Object... objArr) {
        if (loggerConfig.isPrintLoggable(5)) {
            return printLog(tag, 5, a.a(str, objArr));
        }
        return 0;
    }

    private static int printLog(Tag tag, int i2, String str) {
        int i3 = 0;
        if (str == null) {
            return 0;
        }
        LoggerConfig loggerConfig2 = loggerConfig;
        String message = loggerConfig2.getMessage(withStack, str);
        if (!loggerConfig2.isPrintLoggable(i2)) {
            return 0;
        }
        if (message == null && (message = loggerConfig2.getMessage(withStack, str)) == null) {
            return 0;
        }
        String tag2 = tag.tag();
        int length = message.length();
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int i6 = length - i3;
            if (i6 > 2000) {
                i6 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            }
            int i7 = i6 + i3;
            i4 += printLogPartially(i2, tag2, message.substring(i3, i7), i5);
            i3 = i7;
            i5++;
        }
        return i4;
    }

    private static int printLogPartially(int i2, String str, String str2, int i3) {
        String str3;
        int length = str2.length();
        if (i3 > 0) {
            str3 = a.a(Locale.getDefault(), "Cont(%d) ", new Object[]{Integer.valueOf(i3)});
        } else {
            str3 = "";
        }
        if (length > 2000) {
            str2 = str2.substring(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }
        if (i2 == 0) {
            return com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_d(str, str3 + str2);
        }
        if (i2 == 2) {
            return com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_v(str, str3 + str2);
        }
        if (i2 == 3) {
            return com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_d(str, str3 + str2);
        }
        if (i2 == 4) {
            return com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_i(str, str3 + str2);
        }
        if (i2 == 5) {
            return com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_w(str, str3 + str2);
        }
        if (i2 != 6) {
            return 0;
        }
        return com_kakao_util_helper_log_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_e(str, str3 + str2);
    }
}
