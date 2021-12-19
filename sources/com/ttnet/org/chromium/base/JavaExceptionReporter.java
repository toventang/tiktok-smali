package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.Thread;

public class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f155153a = true;

    /* renamed from: b  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f155154b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f155155c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f155156d;

    private static native void nativeReportJavaException(boolean z, Throwable th);

    private static native void nativeReportJavaStackTrace(String str);

    static {
        Covode.recordClassIndex(103264);
    }

    private static void installHandler(boolean z) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z));
    }

    private JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.f155154b = uncaughtExceptionHandler;
        this.f155155c = z;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        MethodCollector.i(11617);
        if (!this.f155156d) {
            this.f155156d = true;
            nativeReportJavaException(this.f155155c, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f155154b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
        MethodCollector.o(11617);
    }
}
