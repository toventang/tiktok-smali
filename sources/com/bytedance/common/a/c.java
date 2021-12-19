package com.bytedance.common.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.framwork.core.sdkmonitor.k;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f26726a;

    static {
        Covode.recordClassIndex(15758);
        AnonymousClass1 r2 = new ThreadFactory() {
            /* class com.bytedance.common.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15759);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("deximage_monitor");
                return thread;
            }
        };
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = r2;
        f26726a = g.a(a2.a());
    }

    public static synchronized k a() {
        k a2;
        synchronized (c.class) {
            MethodCollector.i(4952);
            a2 = SDKMonitorUtils.a("2021");
            MethodCollector.o(4952);
        }
        return a2;
    }
}
