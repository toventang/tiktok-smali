package com.ttnet.org.chromium.base;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Printer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class TraceEvent implements AutoCloseable {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f155202a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f155203b;

    /* renamed from: c  reason: collision with root package name */
    private final String f155204c;

    static {
        Covode.recordClassIndex(103280);
    }

    private static native void nativeBegin(String str, String str2);

    public static native void nativeBeginToplevel(String str);

    private static native void nativeEnd(String str, String str2);

    public static native void nativeEndToplevel(String str);

    private static native void nativeFinishAsync(String str, long j2);

    private static native void nativeInstant(String str, String str2);

    private static native void nativeRegisterEnabledObserver();

    private static native void nativeStartATrace();

    private static native void nativeStartAsync(String str, long j2);

    private static native void nativeStopATrace();

    static class a implements Printer {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ boolean f155205a = true;

        /* renamed from: b  reason: collision with root package name */
        private static final int f155206b = 18;

        /* renamed from: c  reason: collision with root package name */
        private String f155207c;

        private a() {
        }

        static {
            Covode.recordClassIndex(103281);
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public void b(String str) {
            MethodCollector.i(12723);
            boolean a2 = EarlyTraceEvent.a();
            if ((TraceEvent.f155202a || a2) && this.f155207c != null) {
                if (TraceEvent.f155202a) {
                    TraceEvent.nativeEndToplevel(this.f155207c);
                } else {
                    EarlyTraceEvent.b(this.f155207c);
                }
            }
            this.f155207c = null;
            MethodCollector.o(12723);
        }

        public void println(String str) {
            if (str.startsWith(">")) {
                a(str);
            } else if (f155205a || str.startsWith("<")) {
                b(str);
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(String str) {
            int indexOf;
            String str2;
            int indexOf2;
            MethodCollector.i(12722);
            boolean a2 = EarlyTraceEvent.a();
            if (TraceEvent.f155202a || a2) {
                StringBuilder sb = new StringBuilder("Looper.dispatch: ");
                int i2 = f155206b;
                int indexOf3 = str.indexOf(40, i2);
                if (indexOf3 == -1) {
                    indexOf = -1;
                } else {
                    indexOf = str.indexOf(41, indexOf3);
                }
                String str3 = "";
                if (indexOf != -1) {
                    str2 = str.substring(indexOf3 + 1, indexOf);
                } else {
                    str2 = str3;
                }
                StringBuilder append = sb.append(str2).append("(");
                int indexOf4 = str.indexOf(125, i2);
                if (indexOf4 == -1 || (indexOf2 = str.indexOf(58, indexOf4)) == -1) {
                    indexOf2 = str.length();
                }
                if (indexOf4 != -1) {
                    str3 = str.substring(indexOf4 + 2, indexOf2);
                }
                this.f155207c = append.append(str3).append(")").toString();
                if (TraceEvent.f155202a) {
                    TraceEvent.nativeBeginToplevel(this.f155207c);
                    MethodCollector.o(12722);
                    return;
                }
                EarlyTraceEvent.a(this.f155207c);
            }
            MethodCollector.o(12722);
        }
    }

    static final class b extends a implements MessageQueue.IdleHandler {

        /* renamed from: b  reason: collision with root package name */
        private long f155208b;

        /* renamed from: c  reason: collision with root package name */
        private long f155209c;

        /* renamed from: d  reason: collision with root package name */
        private int f155210d;

        /* renamed from: e  reason: collision with root package name */
        private int f155211e;

        /* renamed from: f  reason: collision with root package name */
        private int f155212f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f155213g;

        static {
            Covode.recordClassIndex(103282);
        }

        private b() {
            super((byte) 0);
        }

        private final void a() {
            if (TraceEvent.f155202a && !this.f155213g) {
                this.f155208b = SystemClock.elapsedRealtime();
                Looper.myQueue().addIdleHandler(this);
                this.f155213g = true;
            } else if (this.f155213g && !TraceEvent.f155202a) {
                Looper.myQueue().removeIdleHandler(this);
                this.f155213g = false;
            }
        }

        public final boolean queueIdle() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f155208b == 0) {
                this.f155208b = elapsedRealtime;
            }
            long j2 = elapsedRealtime - this.f155208b;
            this.f155211e++;
            TraceEvent.b("Looper.queueIdle", this.f155212f + " tasks since last idle.");
            if (j2 > 48) {
                TraceEvent.a("TraceEvent.LooperMonitor:IdleStats", this.f155210d + " tasks and " + this.f155211e + " idles processed so far, " + this.f155212f + " tasks bursted and " + j2 + "ms elapsed since last idle");
            }
            this.f155208b = elapsedRealtime;
            this.f155212f = 0;
            return true;
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Override // com.ttnet.org.chromium.base.TraceEvent.a
        public final void a(String str) {
            if (this.f155212f == 0) {
                TraceEvent.a("Looper.queueIdle");
            }
            this.f155209c = SystemClock.elapsedRealtime();
            a();
            super.a(str);
        }

        /* access modifiers changed from: package-private */
        @Override // com.ttnet.org.chromium.base.TraceEvent.a
        public final void b(String str) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f155209c;
            if (elapsedRealtime > 16) {
                TraceEvent.a("TraceEvent.LooperMonitor:IdleStats", "observed a task that took " + elapsedRealtime + "ms: " + str);
            }
            super.b(str);
            a();
            this.f155210d++;
            this.f155212f++;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        a(this.f155204c);
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f155214a;

        static {
            a aVar;
            Covode.recordClassIndex(103283);
            if (CommandLine.b().a()) {
                aVar = new b((byte) 0);
            } else {
                aVar = new a((byte) 0);
            }
            f155214a = aVar;
        }
    }

    public TraceEvent(String str) {
        this.f155204c = str;
        b(str, null);
    }

    public static void a(String str) {
        MethodCollector.i(12601);
        EarlyTraceEvent.b(str);
        if (f155202a) {
            nativeEnd(str, null);
        }
        MethodCollector.o(12601);
    }

    public static void setEnabled(boolean z) {
        a aVar;
        MethodCollector.i(12345);
        if (z) {
            synchronized (EarlyTraceEvent.f155132a) {
                try {
                    if (EarlyTraceEvent.b()) {
                        EarlyTraceEvent.f155133b = 2;
                        EarlyTraceEvent.c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12345);
                    throw th;
                }
            }
        }
        if (f155202a != z) {
            f155202a = z;
            if (f155203b) {
                MethodCollector.o(12345);
                return;
            }
            Looper looper = ThreadUtils.a().getLooper();
            if (z) {
                aVar = c.f155214a;
            } else {
                aVar = null;
            }
            looper.setMessageLogging(aVar);
        }
        MethodCollector.o(12345);
    }

    public static void a(String str, String str2) {
        MethodCollector.i(12347);
        if (f155202a) {
            nativeInstant(str, str2);
        }
        MethodCollector.o(12347);
    }

    public static void b(String str, String str2) {
        MethodCollector.i(12490);
        EarlyTraceEvent.a(str);
        if (f155202a) {
            nativeBegin(str, str2);
        }
        MethodCollector.o(12490);
    }
}
