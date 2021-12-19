package com.bytedance.android.monitor.e;

import com.bytedance.android.monitor.l.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f23502a;

    static {
        Covode.recordClassIndex(13957);
    }

    public final void run() {
        try {
            this.f23502a.run();
        } catch (Exception unused) {
            b.a();
        }
    }

    public a(Runnable runnable) {
        l.c(runnable, "");
        this.f23502a = runnable;
    }
}
