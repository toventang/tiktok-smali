package com.bytedance.lighten.a.d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public final class b implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private Handler f39817a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(24596);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f39818a = new b();

        static {
            Covode.recordClassIndex(24597);
        }
    }

    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f39817a.getLooper().getThread()) {
            runnable.run();
        } else {
            this.f39817a.post(runnable);
        }
    }
}
