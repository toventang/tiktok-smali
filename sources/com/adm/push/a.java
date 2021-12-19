package com.adm.push;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f4955b;

    /* renamed from: a  reason: collision with root package name */
    final ADM f4956a;

    static {
        Covode.recordClassIndex(2055);
    }

    private a(Context context) {
        this.f4956a = new ADM(context);
    }

    public static a a(Context context) {
        MethodCollector.i(1745);
        if (f4955b == null) {
            synchronized (a.class) {
                try {
                    if (f4955b == null) {
                        f4955b = new a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1745);
                    throw th;
                }
            }
        }
        a aVar = f4955b;
        MethodCollector.o(1745);
        return aVar;
    }
}
