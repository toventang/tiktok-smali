package com.ss.android.ugc.aweme.push.downgrade;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f118877a = true;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f118878b;

    static {
        Covode.recordClassIndex(77230);
    }

    public static void a() {
        MethodCollector.i(6728);
        if (!f118878b) {
            synchronized (b.class) {
                try {
                    if (!f118878b) {
                        f118878b = true;
                        f.g().d(c.f118879a);
                    }
                } finally {
                    MethodCollector.o(6728);
                }
            }
            return;
        }
        MethodCollector.o(6728);
    }
}
