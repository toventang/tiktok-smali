package com.benchmark.port;

import com.benchmark.IBTCHConfiguration;
import com.benchmark.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.benchmark.BTCHConfigurationImpl;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static a f6323a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f6324b;

    static {
        Covode.recordClassIndex(3029);
    }

    public static boolean a() {
        a aVar;
        MethodCollector.i(1183);
        if (!f6324b) {
            synchronized (b.class) {
                try {
                    IBTCHConfiguration b2 = BTCHConfigurationImpl.b();
                    if (b2 != null) {
                        aVar = b2.a();
                    } else {
                        aVar = null;
                    }
                    if (!f6324b) {
                        if (aVar != null) {
                            f6323a = aVar;
                            f6324b = true;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1183);
                    throw th;
                }
            }
        }
        boolean z = f6324b;
        MethodCollector.o(1183);
        return z;
    }
}
