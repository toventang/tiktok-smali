package com.bytedance.crash.runtime.c;

import android.os.Handler;
import com.bytedance.covode.number.Covode;

public abstract class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final long f27900a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f27901b;

    /* renamed from: c  reason: collision with root package name */
    private final long f27902c = 0;

    static {
        Covode.recordClassIndex(16328);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        if (j2 > 0) {
            this.f27901b.postDelayed(this, j2);
        } else {
            this.f27901b.post(this);
        }
    }

    a(Handler handler, long j2) {
        this.f27901b = handler;
        this.f27900a = j2;
    }
}
