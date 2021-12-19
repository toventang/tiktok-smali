package com.ss.android.ugc.aweme.co;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class b extends a {

    /* renamed from: b  reason: collision with root package name */
    private static b f71245b;

    static {
        Covode.recordClassIndex(43851);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.co.a
    public final void a() {
        this.f71244a = "default_config";
    }

    public static b b() {
        MethodCollector.i(304);
        if (f71245b == null) {
            synchronized (b.class) {
                try {
                    if (f71245b == null) {
                        f71245b = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(304);
                    throw th;
                }
            }
        }
        b bVar = f71245b;
        MethodCollector.o(304);
        return bVar;
    }
}
