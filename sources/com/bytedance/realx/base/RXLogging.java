package com.bytedance.realx.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.PrintWriter;
import java.io.StringWriter;

public class RXLogging {
    private static Severity loggableSeverity;
    private static volatile boolean loggingEnabled = true;

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i2);

    private static native void nativeLog(int i2, String str, String str2);

    static {
        Covode.recordClassIndex(25933);
    }

    public static void enableLogThreads() {
        MethodCollector.i(9384);
        nativeEnableLogThreads();
        MethodCollector.o(9384);
    }

    public static void enableLogTimeStamps() {
        MethodCollector.i(9554);
        nativeEnableLogTimeStamps();
        MethodCollector.o(9554);
    }

    public enum Severity {
        LS_VERBOSE,
        LS_DEBUG,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE;

        static {
            Covode.recordClassIndex(25934);
        }
    }

    public enum TraceLevel {
        TRACE_NONE(0),
        TRACE_STATEINFO(1),
        TRACE_WARNING(2),
        TRACE_ERROR(4),
        TRACE_CRITICAL(8),
        TRACE_APICALL(16),
        TRACE_DEFAULT(255),
        TRACE_MODULECALL(32),
        TRACE_MEMORY(256),
        TRACE_TIMER(512),
        TRACE_STREAM(1024),
        TRACE_DEBUG(2048),
        TRACE_INFO(4096),
        TRACE_TERSEINFO(8192),
        TRACE_ALL(65535);
        
        public final int level;

        static {
            Covode.recordClassIndex(25935);
        }

        private TraceLevel(int i2) {
            this.level = i2;
        }
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        synchronized (RXLogging.class) {
            MethodCollector.i(9555);
            nativeEnableLogToDebugOutput(severity.ordinal());
            loggingEnabled = true;
            MethodCollector.o(9555);
        }
    }

    private static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void d(String str, String str2) {
        log(Severity.LS_DEBUG, str, str2);
    }

    public static void e(String str, String str2) {
        log(Severity.LS_ERROR, str, str2);
    }

    public static void i(String str, String str2) {
        log(Severity.LS_INFO, str, str2);
    }

    public static void v(String str, String str2) {
        log(Severity.LS_VERBOSE, str, str2);
    }

    public static void w(String str, String str2) {
        log(Severity.LS_WARNING, str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        log(Severity.LS_ERROR, str, str2);
        log(Severity.LS_ERROR, str, th.toString());
        log(Severity.LS_ERROR, str, getStackTraceString(th));
    }

    public static void w(String str, String str2, Throwable th) {
        log(Severity.LS_WARNING, str, str2);
        log(Severity.LS_WARNING, str, th.toString());
        log(Severity.LS_WARNING, str, getStackTraceString(th));
    }

    public static void log(Severity severity, String str, String str2) {
        MethodCollector.i(9710);
        if (str == null || str2 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Logging tag or message may not be null.");
            MethodCollector.o(9710);
            throw illegalArgumentException;
        } else if (loggingEnabled) {
            nativeLog(severity.ordinal(), str, str2);
            MethodCollector.o(9710);
        } else {
            MethodCollector.o(9710);
        }
    }
}
