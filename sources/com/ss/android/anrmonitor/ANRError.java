package com.ss.android.anrmonitor;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class ANRError extends Error {
    private static final long serialVersionUID = 1;
    private final Map<Thread, StackTraceElement[]> stackTraces;

    static {
        Covode.recordClassIndex(36558);
    }

    public Map<Thread, StackTraceElement[]> getStackTraces() {
        return this.stackTraces;
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f59119a;

        /* renamed from: b  reason: collision with root package name */
        public final StackTraceElement[] f59120b;

        static {
            Covode.recordClassIndex(36559);
        }

        /* renamed from: com.ss.android.anrmonitor.ANRError$a$a  reason: collision with other inner class name */
        class C1290a extends Throwable {
            static {
                Covode.recordClassIndex(36560);
            }

            public Throwable fillInStackTrace() {
                setStackTrace(a.this.f59120b);
                return this;
            }

            private C1290a() {
                super(a.this.f59119a, null);
            }

            /* synthetic */ C1290a(a aVar, byte b2) {
                this();
            }
        }

        private a(String str, StackTraceElement[] stackTraceElementArr) {
            this.f59119a = str;
            this.f59120b = stackTraceElementArr;
        }

        /* synthetic */ a(String str, StackTraceElement[] stackTraceElementArr, byte b2) {
            this(str, stackTraceElementArr);
        }
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public static ANRError NewMainOnly() {
        Thread thread = Looper.getMainLooper().getThread();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        HashMap hashMap = new HashMap(1);
        hashMap.put(thread, stackTrace);
        return new ANRError(new a.C1290a(new a(thread.getName(), stackTrace, (byte) 0), (byte) 0), hashMap);
    }

    public ANRError(a.C1290a aVar, Map<Thread, StackTraceElement[]> map) {
        super("Application Not Responding", aVar);
        this.stackTraces = map;
    }
}
