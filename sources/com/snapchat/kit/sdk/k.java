package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import dagger.a.b;
import java.util.concurrent.ScheduledExecutorService;
import javax.a.a;

public final class k implements i {

    /* renamed from: a  reason: collision with root package name */
    private a<ScheduledExecutorService> f57340a;

    static {
        Covode.recordClassIndex(35848);
    }

    private k() {
        this.f57340a = b.a(com.snapchat.kit.sdk.core.metrics.k.f57199a);
    }

    @Override // com.snapchat.kit.sdk.i
    public final ScheduledExecutorService a() {
        return this.f57340a.get();
    }

    /* synthetic */ k(byte b2) {
        this();
    }
}
