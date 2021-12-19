package com.airbnb.epoxy;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f5054a = a(Looper.getMainLooper(), false);

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f5055b = a(Looper.getMainLooper(), true);

    /* renamed from: c  reason: collision with root package name */
    private static Handler f5056c;

    static {
        Covode.recordClassIndex(2134);
    }

    public static Handler a() {
        if (f5056c == null) {
            f5056c = a(a("epoxy"), true);
        }
        return f5056c;
    }

    private static Looper a(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread.getLooper();
    }

    private static Handler a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        int i2 = Build.VERSION.SDK_INT;
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
        } catch (Throwable unused) {
            return new Handler(looper);
        }
    }
}
