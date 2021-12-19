package com.ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.z;
import java.util.concurrent.CountDownLatch;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements a {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f140143a;

    static {
        Covode.recordClassIndex(91571);
    }

    k(CountDownLatch countDownLatch) {
        this.f140143a = countDownLatch;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        this.f140143a.countDown();
        return z.f158842a;
    }
}
