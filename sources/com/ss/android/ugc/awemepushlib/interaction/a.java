package com.ss.android.ugc.awemepushlib.interaction;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f145424a;

    static {
        Covode.recordClassIndex(95084);
    }

    public static void a() {
        MethodCollector.i(9024);
        if (!f145424a) {
            synchronized (j.class) {
                try {
                    if (!f145424a) {
                        b();
                        f145424a = true;
                    }
                } finally {
                    MethodCollector.o(9024);
                }
            }
            return;
        }
        MethodCollector.o(9024);
    }

    private static void b() {
        try {
            Reflect call = Reflect.on(Class.forName("android.app.ActivityThread")).call("currentActivityThread");
            if (call != null) {
                Class<?> cls = Class.forName("android.app.ActivityThread$H");
                Reflect on = Reflect.on(Class.forName("android.app.ActivityThread$H"));
                int intValue = ((Integer) on.field("SCHEDULE_CRASH", new Class[0]).get()).intValue();
                int intValue2 = ((Integer) on.field("RECEIVER", new Class[0]).get()).intValue();
                int intValue3 = ((Integer) on.field("CREATE_SERVICE", new Class[0]).get()).intValue();
                int intValue4 = ((Integer) on.field("BIND_SERVICE", new Class[0]).get()).intValue();
                int intValue5 = ((Integer) on.field("SERVICE_ARGS", new Class[0]).get()).intValue();
                Handler handler = (Handler) call.field("mH", cls).get();
                if (handler != null) {
                    Reflect on2 = Reflect.on(handler);
                    on2.set("mCallback", new b(intValue, intValue2, intValue3, intValue4, intValue5, (Handler.Callback) on2.field("mCallback", Handler.Callback.class).get()));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(boolean z) {
        if (z) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() {
                /* class com.ss.android.ugc.awemepushlib.interaction.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(95085);
                }

                public final void run() {
                    a.a();
                }
            });
            x.f145471a.execute(new Runnable() {
                /* class com.ss.android.ugc.awemepushlib.interaction.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(95086);
                }

                public final void run() {
                    a.a();
                }
            });
            return;
        }
        b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        if (r1.contains("com.adm") == false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ boolean a(int r5, int r6, int r7, int r8, int r9, android.os.Handler.Callback r10, android.os.Message r11) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.interaction.a.a(int, int, int, int, int, android.os.Handler$Callback, android.os.Message):boolean");
    }
}
