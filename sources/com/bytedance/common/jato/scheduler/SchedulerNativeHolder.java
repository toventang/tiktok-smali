package com.bytedance.common.jato.scheduler;

import android.content.Context;
import com.bytedance.common.jato.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class SchedulerNativeHolder {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26877a;

    static {
        Covode.recordClassIndex(15860);
    }

    public static native int nativeInit(int i2, int i3, Context context);

    SchedulerNativeHolder() {
    }

    public static synchronized boolean a() {
        boolean z;
        synchronized (SchedulerNativeHolder.class) {
            MethodCollector.i(14380);
            if (!f26877a && c.a()) {
                f26877a = true;
            }
            z = f26877a;
            MethodCollector.o(14380);
        }
        return z;
    }
}
