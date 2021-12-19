package com.ss.android.vesdk;

import android.os.Trace;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class bi {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f151103a;

    static {
        Covode.recordClassIndex(99354);
    }

    public static void b() {
        if (f151103a) {
            Trace.endSection();
        }
    }

    public static synchronized void a() {
        synchronized (bi.class) {
            MethodCollector.i(3048);
            f151103a = false;
            MethodCollector.o(3048);
        }
    }

    public static void a(String str) {
        if (f151103a) {
            Trace.beginSection(str);
        }
    }
}
