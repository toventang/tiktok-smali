package com.bytedance.bae.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
    private static final Logger fallbackLogger = createFallbackLogger();
    private static Loggable loggable;
    private static Severity loggableSeverity;
    private static volatile boolean loggingEnabled;

    static void deleteInjectedLoggable() {
        loggable = null;
    }

    public static void enableTracing(String str, EnumSet<TraceLevel> enumSet) {
    }

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i2);

    private static native void nativeLog(int i2, String str, String str2);

    static {
        Covode.recordClassIndex(15334);
    }

    private static Logger createFallbackLogger() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    public static void enableLogThreads() {
        MethodCollector.i(2550);
        nativeEnableLogThreads();
        MethodCollector.o(2550);
    }

    public static void enableLogTimeStamps() {
        MethodCollector.i(2552);
        nativeEnableLogTimeStamps();
        MethodCollector.o(2552);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.bae.base.Logging$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$bae$base$Logging$Severity;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 15335(0x3be7, float:2.1489E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.bae.base.Logging$Severity[] r0 = com.bytedance.bae.base.Logging.Severity.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.bae.base.Logging.AnonymousClass1.$SwitchMap$com$bytedance$bae$base$Logging$Severity = r2
                com.bytedance.bae.base.Logging$Severity r0 = com.bytedance.bae.base.Logging.Severity.LS_ERROR     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.bae.base.Logging.AnonymousClass1.$SwitchMap$com$bytedance$bae$base$Logging$Severity     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.bae.base.Logging$Severity r0 = com.bytedance.bae.base.Logging.Severity.LS_WARNING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.bae.base.Logging.AnonymousClass1.$SwitchMap$com$bytedance$bae$base$Logging$Severity     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.bae.base.Logging$Severity r0 = com.bytedance.bae.base.Logging.Severity.LS_INFO     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bae.base.Logging.AnonymousClass1.<clinit>():void");
        }
    }

    public enum Severity {
        LS_VERBOSE,
        LS_DEBUG,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE;

        static {
            Covode.recordClassIndex(15336);
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
            Covode.recordClassIndex(15337);
        }

        private TraceLevel(int i2) {
            this.level = i2;
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

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        synchronized (Logging.class) {
            MethodCollector.i(2564);
            if (loggable == null) {
                nativeEnableLogToDebugOutput(severity.ordinal());
                loggingEnabled = true;
                MethodCollector.o(2564);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
                MethodCollector.o(2564);
                throw illegalStateException;
            }
        }
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

    static void injectLoggable(Loggable loggable2, Severity severity) {
        if (loggable2 != null) {
            loggable = loggable2;
            loggableSeverity = severity;
        }
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
        Level level;
        MethodCollector.i(2573);
        if (str == null || str2 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Logging tag or message may not be null.");
            MethodCollector.o(2573);
            throw illegalArgumentException;
        } else if (loggable != null) {
            if (severity.ordinal() < loggableSeverity.ordinal()) {
                MethodCollector.o(2573);
                return;
            }
            loggable.onLogMessage(str2, severity, str);
            MethodCollector.o(2573);
        } else if (loggingEnabled) {
            nativeLog(severity.ordinal(), str, str2);
            MethodCollector.o(2573);
        } else {
            int i2 = AnonymousClass1.$SwitchMap$com$bytedance$bae$base$Logging$Severity[severity.ordinal()];
            if (i2 == 1) {
                level = Level.SEVERE;
            } else if (i2 == 2) {
                level = Level.WARNING;
            } else if (i2 != 3) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            fallbackLogger.log(level, str + ": " + str2);
            MethodCollector.o(2573);
        }
    }
}
