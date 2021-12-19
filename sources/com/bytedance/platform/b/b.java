package com.bytedance.platform.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    final g f41912a;

    /* renamed from: b  reason: collision with root package name */
    private final String f41913b;

    /* renamed from: c  reason: collision with root package name */
    private int f41914c;

    static {
        Covode.recordClassIndex(25599);
    }

    public final synchronized Thread newThread(Runnable runnable) {
        AnonymousClass1 r2;
        MethodCollector.i(9480);
        r2 = new Thread(runnable, this.f41913b + "-thread-" + this.f41914c) {
            /* class com.bytedance.platform.b.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25600);
            }

            public final void run() {
                if (b.this.f41912a != null) {
                    try {
                        super.run();
                    } catch (Throwable th) {
                        b.this.f41912a.a(th);
                    }
                } else {
                    super.run();
                }
            }
        };
        this.f41914c++;
        MethodCollector.o(9480);
        return r2;
    }

    public b(String str, g gVar) {
        this.f41913b = str;
        this.f41912a = gVar;
    }
}
