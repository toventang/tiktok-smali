package com.google.android.gms.c;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f49903a = new a();

    /* renamed from: b  reason: collision with root package name */
    static final Executor f49904b = new ab();

    static {
        Covode.recordClassIndex(31156);
    }

    static final class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f49905a = new Handler(Looper.getMainLooper());

        static {
            Covode.recordClassIndex(31157);
        }

        public final void execute(Runnable runnable) {
            this.f49905a.post(runnable);
        }
    }
}
