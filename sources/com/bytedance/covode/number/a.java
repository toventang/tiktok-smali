package com.bytedance.covode.number;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

/* access modifiers changed from: package-private */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedBlockingQueue<Integer> f27402a = new LinkedBlockingQueue<>(120000);

    /* renamed from: b  reason: collision with root package name */
    public final LinkedBlockingQueue<Short> f27403b = new LinkedBlockingQueue<>(120000);

    /* renamed from: c  reason: collision with root package name */
    final boolean f27404c;

    static {
        Covode.recordClassIndex(16116);
    }

    public a() {
        boolean z;
        if (new Random().nextInt(10000) <= 10) {
            z = true;
        } else {
            z = false;
        }
        this.f27404c = z;
    }
}
