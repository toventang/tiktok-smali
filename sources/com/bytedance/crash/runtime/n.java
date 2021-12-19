package com.bytedance.crash.runtime;

import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private static volatile s f27935a;

    static {
        Covode.recordClassIndex(16346);
    }

    public static s b() {
        if (f27935a == null) {
            a();
        }
        return f27935a;
    }

    public static HandlerThread a() {
        MethodCollector.i(10453);
        if (f27935a == null) {
            synchronized (n.class) {
                try {
                    if (f27935a == null) {
                        s sVar = new s("default_npth_thread");
                        f27935a = sVar;
                        sVar.f27961a.start();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10453);
                    throw th;
                }
            }
        }
        HandlerThread handlerThread = f27935a.f27961a;
        MethodCollector.o(10453);
        return handlerThread;
    }
}
