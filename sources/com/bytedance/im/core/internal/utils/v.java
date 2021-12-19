package com.bytedance.im.core.internal.utils;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.internal.e.b;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    private static Handler f38874a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(23172);
    }

    public static boolean b() {
        if (Looper.getMainLooper() == Looper.myLooper() && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static void a() {
        if (b()) {
            StringBuilder sb = new StringBuilder(100);
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i2 = 1; i2 < stackTrace.length; i2++) {
                sb.append(stackTrace[i2].getClassName());
                sb.append(".");
                sb.append(stackTrace[i2].getMethodName());
                sb.append("  lines = ");
                sb.append(stackTrace[i2].getLineNumber());
                sb.append("\n");
            }
            f.b("imsdk", "can not be call in main thread! trace = \n" + sb.toString(), (Throwable) null);
            throw new Error("can not be call in main thread! trace = " + sb.toString());
        }
    }

    public static void a(Runnable runnable) {
        f38874a.post(runnable);
    }

    public static void b(final Runnable runnable) {
        d.a(new c<Object>() {
            /* class com.bytedance.im.core.internal.utils.v.AnonymousClass1 */

            static {
                Covode.recordClassIndex(23173);
            }

            @Override // com.bytedance.im.core.internal.e.c
            public final Object a() {
                runnable.run();
                return null;
            }
        }, (b) null);
    }
}
