package com.google.android.play.core.tasks;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

final class p implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f53384a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(32978);
    }

    public final void execute(Runnable runnable) {
        this.f53384a.post(runnable);
    }
}
