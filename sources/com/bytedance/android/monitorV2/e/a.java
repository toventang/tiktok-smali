package com.bytedance.android.monitorV2.e;

import com.bytedance.android.monitorV2.l.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f23913a;

    static {
        Covode.recordClassIndex(14124);
    }

    public final void run() {
        try {
            this.f23913a.run();
        } catch (Exception unused) {
            c.a();
        }
    }

    public a(Runnable runnable) {
        l.c(runnable, "");
        this.f23913a = runnable;
    }
}
