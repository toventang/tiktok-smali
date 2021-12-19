package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.co.a;

public class b extends a {

    /* renamed from: b  reason: collision with root package name */
    private static b f122086b;

    static {
        Covode.recordClassIndex(80044);
    }

    @Override // com.ss.android.ugc.aweme.co.a
    public final void a() {
        this.f71244a = "ab_test_config";
    }

    public static b b() {
        MethodCollector.i(6897);
        if (f122086b == null) {
            synchronized (b.class) {
                try {
                    if (f122086b == null) {
                        f122086b = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6897);
                    throw th;
                }
            }
        }
        b bVar = f122086b;
        MethodCollector.o(6897);
        return bVar;
    }
}
