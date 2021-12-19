package com.ss.android.ugc.aweme.feed.r;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f93853a;

    /* renamed from: b  reason: collision with root package name */
    public static Object f93854b = new Object();

    static {
        Covode.recordClassIndex(59708);
    }

    public static void a() {
        MethodCollector.i(7185);
        if (!f93853a) {
            synchronized (f93854b) {
                try {
                    if (!f93853a) {
                        try {
                            f93854b.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                } finally {
                    MethodCollector.o(7185);
                }
            }
            return;
        }
        MethodCollector.o(7185);
    }
}
