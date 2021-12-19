package com.squareup.a.a.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CountDownLatch;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    final CountDownLatch f57562a = new CountDownLatch(1);

    /* renamed from: b  reason: collision with root package name */
    long f57563b = -1;

    /* renamed from: c  reason: collision with root package name */
    long f57564c = -1;

    static {
        Covode.recordClassIndex(35915);
    }

    l() {
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f57564c == -1) {
            long j2 = this.f57563b;
            if (j2 != -1) {
                this.f57564c = j2 - 1;
                this.f57562a.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }
}
