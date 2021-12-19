package com.ss.android.deviceregister;

import android.content.Context;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.deviceregister.d.c;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Pair<String, Boolean> f59464a;

    static {
        Covode.recordClassIndex(36712);
    }

    public static Pair<String, Boolean> a(Context context) {
        MethodCollector.i(5467);
        if (f59464a == null) {
            synchronized (d.class) {
                try {
                    if (f59464a == null) {
                        f59464a = c.b(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5467);
                    throw th;
                }
            }
        }
        Pair<String, Boolean> pair = f59464a;
        MethodCollector.o(5467);
        return pair;
    }
}
