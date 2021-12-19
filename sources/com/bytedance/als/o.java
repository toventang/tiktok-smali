package com.bytedance.als;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f6470a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(3124);
    }

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            final IllegalStateException illegalStateException = new IllegalStateException("This method must call on main thread");
            f6470a.post(new Runnable() {
                /* class com.bytedance.als.o.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(3125);
                }

                public final void run() {
                    throw illegalStateException;
                }
            });
        }
    }
}
