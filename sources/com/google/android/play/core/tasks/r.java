package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CountDownLatch;

public final class r implements a, b {

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f53390a = new CountDownLatch(1);

    static {
        Covode.recordClassIndex(32980);
    }

    private r() {
    }

    public /* synthetic */ r(byte b2) {
    }

    @Override // com.google.android.play.core.tasks.a
    public final void a(Exception exc) {
        this.f53390a.countDown();
    }

    @Override // com.google.android.play.core.tasks.b
    public final void a(Object obj) {
        this.f53390a.countDown();
    }
}
