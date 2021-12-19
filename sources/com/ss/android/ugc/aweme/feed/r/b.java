package com.ss.android.ugc.aweme.feed.r;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static Object f93855a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f93856b;

    static {
        Covode.recordClassIndex(59709);
    }

    public static void a() {
        MethodCollector.i(6840);
        if (!f93856b) {
            synchronized (f93855a) {
                try {
                    if (!f93856b) {
                        try {
                            f93855a.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                } finally {
                    MethodCollector.o(6840);
                }
            }
            return;
        }
        MethodCollector.o(6840);
    }
}
