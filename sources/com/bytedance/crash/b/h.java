package com.bytedance.crash.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class h {

    /* renamed from: b  reason: collision with root package name */
    private static volatile h f27497b;

    /* renamed from: a  reason: collision with root package name */
    public final a f27498a;

    static {
        Covode.recordClassIndex(16158);
    }

    private h(Context context) {
        this.f27498a = new a(context);
    }

    public static h a(Context context) {
        MethodCollector.i(9461);
        if (f27497b == null) {
            synchronized (h.class) {
                try {
                    if (f27497b == null) {
                        f27497b = new h(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9461);
                    throw th;
                }
            }
        }
        h hVar = f27497b;
        MethodCollector.o(9461);
        return hVar;
    }
}
