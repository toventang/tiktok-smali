package com.ss.bytertc.engine.utils;

import android.content.Context;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public class LogUtil {
    private static String sDeviceID = null;
    private static String sLogDir = null;
    private static LogLevel sLogLevel = LogLevel.LOG_LEVEL_INFO;
    private static AtomicReference<LoggerSink> sLoggerSink = new AtomicReference<>();

    public interface LoggerSink {
        static {
            Covode.recordClassIndex(101050);
        }

        void onLoggerMessage(LogLevel logLevel, String str, Throwable th);
    }

    public static void setDebug(boolean z) {
    }

    public static String getDeviceID() {
        return sDeviceID;
    }

    public static LogLevel getLogLevel() {
        return sLogLevel;
    }

    private static LoggerSink getLoggerSink() {
        return sLoggerSink.get();
    }

    static {
        Covode.recordClassIndex(101048);
    }

    public enum LogLevel {
        LOG_LEVEL_TRACE,
        LOG_LEVEL_DEBUG,
        LOG_LEVEL_INFO,
        LOG_LEVEL_WARNING,
        LOG_LEVEL_ERROR;

        static {
            Covode.recordClassIndex(101049);
        }
    }

    private static String getTraceInfo() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ThreadName:").append(Thread.currentThread().getName()).append("] [").append(new Throwable().getStackTrace()[2].getFileName()).append(":").append(new Throwable().getStackTrace()[2].getLineNumber()).append("] [Func:").append(new Throwable().getStackTrace()[2].getMethodName()).append("]");
        return stringBuffer.toString();
    }

    public static void setDeviceID(String str) {
        sDeviceID = str;
    }

    public static void setLogLevel(LogLevel logLevel) {
        sLogLevel = logLevel;
    }

    public static void setLogDir(String str) {
        sLogDir = str + File.separator + "logs";
    }

    public static void setLoggerSink(LoggerSink loggerSink) {
        if (loggerSink != null) {
            sLoggerSink.set(loggerSink);
        } else {
            sLoggerSink.compareAndSet(getLoggerSink(), null);
        }
    }

    public static String getLogDir(Context context) {
        String str = sLogDir;
        if (str != null) {
            return str;
        }
        String str2 = com_ss_bytertc_engine_utils_LogUtil_com_ss_android_ugc_aweme_lancet_ContextLancet_getExternalFilesDir(context, null) + File.separator + "RTCEngine" + File.separator + "Log" + File.separator + "logs";
        sLogDir = str2;
        return str2;
    }

    public static File com_ss_bytertc_engine_utils_LogUtil_com_ss_android_ugc_aweme_lancet_ContextLancet_getExternalFilesDir(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (d.f107196d != null && d.f107197e) {
            return d.f107196d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        d.f107196d = externalFilesDir;
        return externalFilesDir;
    }

    public static void d(String str, String str2) {
        if (LogLevel.LOG_LEVEL_DEBUG.compareTo((Enum) sLogLevel) >= 0) {
            String a2 = a.a("[%s] %s [msg:%s]", new Object[]{"DEBUG", getTraceInfo(), str2});
            notifyLoggerSinks(LogLevel.LOG_LEVEL_DEBUG, a.a("[%s:%s]:%s", new Object[]{"ByteRTC", str, a2}), null);
        }
    }

    public static void e(String str, String str2) {
        if (LogLevel.LOG_LEVEL_ERROR.compareTo((Enum) sLogLevel) >= 0) {
            String a2 = a.a("[%s] %s [msg:%s]", new Object[]{"ERROR", getTraceInfo(), str2});
            notifyLoggerSinks(LogLevel.LOG_LEVEL_ERROR, a.a("[%s:%s]:%s", new Object[]{"ByteRTC", str, a2}), null);
        }
    }

    public static void i(String str, String str2) {
        if (LogLevel.LOG_LEVEL_INFO.compareTo((Enum) sLogLevel) >= 0) {
            String a2 = a.a("[%s] %s [msg:%s]", new Object[]{"INFO", getTraceInfo(), str2});
            notifyLoggerSinks(LogLevel.LOG_LEVEL_INFO, a.a("[%s:%s]:%s", new Object[]{"ByteRTC", str, a2}), null);
        }
    }

    public static void w(String str, String str2) {
        if (LogLevel.LOG_LEVEL_WARNING.compareTo((Enum) sLogLevel) >= 0) {
            String a2 = a.a("[%s] %s [msg:%s]", new Object[]{"WARNING", getTraceInfo(), str2});
            notifyLoggerSinks(LogLevel.LOG_LEVEL_WARNING, a.a("[%s:%s]:%s", new Object[]{"ByteRTC", str, a2}), null);
        }
    }

    private static void notifyLoggerSinks(LogLevel logLevel, String str, Throwable th) {
        LoggerSink loggerSink;
        if (sLoggerSink != null && (loggerSink = getLoggerSink()) != null) {
            loggerSink.onLoggerMessage(logLevel, str, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (LogLevel.LOG_LEVEL_ERROR.compareTo((Enum) sLogLevel) >= 0) {
            String a2 = a.a("[%s][msg:%s]", new Object[]{"ERROR", str2});
            notifyLoggerSinks(LogLevel.LOG_LEVEL_ERROR, a.a("[%s:%s]:%s", new Object[]{"ByteRTC", str, a2}), th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (LogLevel.LOG_LEVEL_WARNING.compareTo((Enum) sLogLevel) >= 0) {
            String a2 = a.a("[%s][msg:%s]", new Object[]{"WARNING", str2});
            notifyLoggerSinks(LogLevel.LOG_LEVEL_WARNING, a.a("[%s:%s]:%s", new Object[]{"ByteRTC", str, a2}), th);
        }
    }
}
