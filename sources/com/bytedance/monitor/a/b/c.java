package com.bytedance.monitor.a.b;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.b.a;
import java.util.Locale;

public final class c {
    static {
        Covode.recordClassIndex(25364);
    }

    public static String a(e eVar) {
        if (eVar == null) {
            return "null";
        }
        return eVar.a() + ", " + eVar.b();
    }

    public static e a(String str, Runnable runnable) {
        return a(b.LIGHT_WEIGHT, str, runnable);
    }

    public static void a(f fVar, String str) {
        if (fVar != null && fVar.a()) {
            String name = Thread.currentThread().getName();
            a.a(Locale.CHINA, "[callerThread: %s] \n %s", new Object[]{name, str});
        }
    }

    private static e a(final b bVar, final String str, final Runnable runnable) {
        return new e() {
            /* class com.bytedance.monitor.a.b.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25365);
            }

            @Override // com.bytedance.monitor.a.b.e
            public final String a() {
                return str;
            }

            @Override // com.bytedance.monitor.a.b.e
            public final b b() {
                return bVar;
            }

            public final void run() {
                try {
                    Runnable runnable = runnable;
                    if (runnable != null) {
                        runnable.run();
                        a aVar = a.C1013a.f41371a;
                        if (aVar != null && aVar.b() != null && aVar.b().a()) {
                            c.a(aVar.b(), "task execute: " + bVar + "  /  " + str);
                        }
                    }
                } catch (Throwable th) {
                    a.C1013a.f41371a.a(th, "APM_INNER_ERROR_async_task");
                }
            }
        };
    }
}
