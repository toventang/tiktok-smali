package com.bytedance.disk.e.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.v.a.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f28577a;

    static {
        Covode.recordClassIndex(16788);
    }

    public static void a(Context context) {
        MethodCollector.i(8777);
        if (!f28577a) {
            synchronized (a.class) {
                try {
                    b.a(context);
                    f28577a = true;
                } finally {
                    MethodCollector.o(8777);
                }
            }
            return;
        }
        MethodCollector.o(8777);
    }
}
