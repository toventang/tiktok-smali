package com.bytedance.common.jato;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26833a;

    static {
        Covode.recordClassIndex(15826);
    }

    public static synchronized boolean a() {
        synchronized (c.class) {
            MethodCollector.i(7647);
            if (f26833a) {
                MethodCollector.o(7647);
                return true;
            }
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.b("jato", false, null);
                m.a(uptimeMillis, "jato");
                f26833a = true;
            } catch (Throwable unused) {
            }
            boolean z = f26833a;
            MethodCollector.o(7647);
            return z;
        }
    }
}
