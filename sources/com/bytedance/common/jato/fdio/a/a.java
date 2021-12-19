package com.bytedance.common.jato.fdio.a;

import android.content.SharedPreferences;
import android.os.Trace;
import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.b.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26861a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f26862b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f26863c;

    static {
        Covode.recordClassIndex(15845);
    }

    public static synchronized void a() {
        synchronized (a.class) {
            MethodCollector.i(6899);
            if (f26863c) {
                MethodCollector.o(6899);
                return;
            }
            Jato.getWorkExecutorService().execute(new Runnable() {
                /* class com.bytedance.common.jato.fdio.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(15846);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:36:0x0146, code lost:
                    if (new java.io.File(r3).exists() != false) goto L_0x00bb;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:40:0x0186, code lost:
                    if (new java.io.File(r3).exists() != false) goto L_0x00bb;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:41:0x018a, code lost:
                    r3 = "";
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 401
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.fdio.a.a.AnonymousClass1.run():void");
                }
            });
            f26863c = true;
            MethodCollector.o(6899);
        }
    }

    public static synchronized void a(final boolean z) {
        synchronized (a.class) {
            MethodCollector.i(6902);
            if (!f26863c) {
                MethodCollector.o(6902);
                return;
            }
            Trace.beginSection("stop_fdio");
            Jato.getWorkExecutorService().execute(new Runnable() {
                /* class com.bytedance.common.jato.fdio.a.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(15848);
                }

                public final void run() {
                    if (z && a.f26862b) {
                        SharedPreferences a2 = c.a();
                        a2.edit().putInt("start_up_retry_time", a2.getInt("start_up_retry_time", 0) - 1).apply();
                    }
                    Jato.endFDIOOperator("jato_start_up_default_2", z);
                }
            });
            f26863c = false;
            Trace.endSection();
            MethodCollector.o(6902);
        }
    }
}
