package com.ss.android.ugc.aweme.net.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static Callable<Boolean> f112326a = i.f112328a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f112327b;

    static {
        Covode.recordClassIndex(72177);
    }

    public static synchronized boolean a() {
        boolean z;
        Callable<Boolean> callable;
        synchronized (h.class) {
            MethodCollector.i(7226);
            z = false;
            if (f112327b == null && (callable = f112326a) != null) {
                try {
                    f112327b = callable.call();
                } catch (Exception unused) {
                    f112327b = false;
                }
            }
            Boolean bool = f112327b;
            if (bool != null) {
                z = bool.booleanValue();
            }
            MethodCollector.o(7226);
        }
        return z;
    }
}
