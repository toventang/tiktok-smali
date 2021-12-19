package com.ss.android.ugc.aweme.i18n;

import android.os.Looper;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.o;
import java.lang.Thread;

public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f99763a;

    /* renamed from: b  reason: collision with root package name */
    private long f99764b = Looper.getMainLooper().getThread().getId();

    static {
        Covode.recordClassIndex(63606);
    }

    public static void a() {
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
    }

    private a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f99763a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        System.err.println("uncaughtException=" + Log.getStackTraceString(th));
        if (!(th instanceof IllegalStateException) || thread == null || thread.getId() == this.f99764b || th.getMessage() == null || !"Results have already been set".equals(th.getMessage().trim())) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f99763a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
                return;
            }
            return;
        }
        o.a("gms_crash_results_have_already_been_set", null);
    }
}
