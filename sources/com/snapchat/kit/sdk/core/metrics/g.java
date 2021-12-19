package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.SkateEvent;
import dagger.a.c;
import dagger.a.f;
import java.util.concurrent.ScheduledExecutorService;
import javax.a.a;

public final class g implements c<MetricQueue<SkateEvent>> {

    /* renamed from: a  reason: collision with root package name */
    private final a<com.snapchat.kit.sdk.core.metrics.skate.a> f57190a;

    /* renamed from: b  reason: collision with root package name */
    private final a<ScheduledExecutorService> f57191b;

    /* renamed from: c  reason: collision with root package name */
    private final a<c> f57192c;

    static {
        Covode.recordClassIndex(35633);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        b bVar = new b(this.f57190a.get(), this.f57191b.get(), this.f57192c.get(), 1);
        bVar.a();
        return f.a(bVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public g(a<com.snapchat.kit.sdk.core.metrics.skate.a> aVar, a<ScheduledExecutorService> aVar2, a<c> aVar3) {
        this.f57190a = aVar;
        this.f57191b = aVar2;
        this.f57192c = aVar3;
    }
}
