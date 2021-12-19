package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.c;
import com.google.android.gms.c.h;
import java.util.concurrent.CountDownLatch;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements c {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f54467a;

    static {
        Covode.recordClassIndex(33808);
    }

    l(CountDownLatch countDownLatch) {
        this.f54467a = countDownLatch;
    }

    @Override // com.google.android.gms.c.c
    public final void a(h hVar) {
        this.f54467a.countDown();
    }
}
