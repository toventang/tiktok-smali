package com.bytedance.jedi.arch.ext.list.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public final class f implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f39446a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(24243);
    }

    public final void execute(Runnable runnable) {
        this.f39446a.post(runnable);
    }
}
