package org.webrtc;

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

    public static void deleteInjectedLoggable() {
        loggable = null;
    }

    public static void enableTracing(String str, EnumSet<TraceLevel> enumSet) {
    }

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i2);

    private static native void nativeLog(int i2, String str, String str2);

    static {
        Covode.recordClassIndex(106615);
    }

    private static Logger createFallbackLogger() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    public static void enableLogThreads() {
        MethodCollector.i(9576);
        nativeEnableLogThreads();
        MethodCollector.o(9576);
    }

    public static void enableLogTimeStamps() {
        MethodCollector.i(9577);
        nativeEnableLogTimeStamps();
        MethodCollector.o(9577);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.webrtc.Logging$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$Logging$Severity;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 106616(0x1a078, float:1.49401E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                org.webrtc.Logging$Severity[] r0 = org.webrtc.Logging.Severity.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                org.webrtc.Logging.AnonymousClass1.$SwitchMap$org$webrtc$Logging$Severity = r2
                org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_ERROR     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = org.webrtc.Logging.AnonymousClass1.$SwitchMap$org$webrtc$Logging$Severity     // Catch:{ NoSuchFieldError -> 0x0023 }
                org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_WARNING     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = org.webrtc.Logging.AnonymousClass1.$SwitchMap$org$webrtc$Logging$Severity     // Catch:{ NoSuchFieldError -> 0x002e }
                org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_INFO     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Logging.AnonymousClass1.<clinit>():void");
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
            Covode.recordClassIndex(106617);
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
            Covode.recordClassIndex(106618);
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
            MethodCollector.i(9579);
            if (loggable == null) {
                nativeEnableLogToDebugOutput(severity.ordinal());
                loggingEnabled = true;
                MethodCollector.o(9579);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
                MethodCollector.o(9579);
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

    public static void injectLoggable(Loggable loggable2, Severity severity) {
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
        MethodCollector.i(9736);
        if (str == null || str2 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Logging tag or message may not be null.");
            MethodCollector.o(9736);
            throw illegalArgumentException;
        } else if (loggable != null) {
            if (severity.ordinal() < loggableSeverity.ordinal()) {
                MethodCollector.o(9736);
                return;
            }
            loggable.onLogMessage(str2, severity, str);
            MethodCollector.o(9736);
        } else if (loggingEnabled) {
            nativeLog(severity.ordinal(), str, str2);
            MethodCollector.o(9736);
        } else {
            int i2 = AnonymousClass1.$SwitchMap$org$webrtc$Logging$Severity[severity.ordinal()];
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
            MethodCollector.o(9736);
        }
    }
}
