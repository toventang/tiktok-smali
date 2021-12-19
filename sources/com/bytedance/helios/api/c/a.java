package com.bytedance.helios.api.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.o;
import h.f.b.l;
import java.lang.Thread;

public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30705a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(17826);
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        l.c(thread, "");
        l.c(th, "");
        o.a(new b(thread, th, "DefaultUncaughtExceptionHandler", null, 8));
    }
}
