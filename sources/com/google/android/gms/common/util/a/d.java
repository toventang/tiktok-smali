package com.google.android.gms.common.util.a;

import android.os.Process;
import com.bytedance.covode.number.Covode;

final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f50503a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50504b = 0;

    static {
        Covode.recordClassIndex(31463);
    }

    public final void run() {
        Process.setThreadPriority(this.f50504b);
        this.f50503a.run();
    }

    public d(Runnable runnable) {
        this.f50503a = runnable;
    }
}
