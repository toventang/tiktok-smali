package com.ttnet.org.chromium.base.task;

import android.os.Process;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f155326a;

    static {
        Covode.recordClassIndex(103348);
    }

    g(Runnable runnable) {
        this.f155326a = runnable;
    }

    public final void run() {
        Runnable runnable = this.f155326a;
        Process.setThreadPriority(10);
        runnable.run();
    }
}
