package com.bytedance.helios.a.a;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class b implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f30630a;

    static {
        Covode.recordClassIndex(17790);
    }

    public b(Handler handler) {
        this.f30630a = handler;
    }

    public final void execute(Runnable runnable) {
        if (!this.f30630a.post(runnable)) {
            throw new RejectedExecutionException(this.f30630a + " is shutting down");
        }
    }
}
