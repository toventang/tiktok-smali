package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import dagger.a.c;
import dagger.a.f;
import java.util.concurrent.ScheduledExecutorService;
import javax.a.a;

public final class j implements c<MetricQueue<OpMetric>> {

    /* renamed from: a  reason: collision with root package name */
    private final a<com.snapchat.kit.sdk.core.metrics.a.a> f57196a;

    /* renamed from: b  reason: collision with root package name */
    private final a<ScheduledExecutorService> f57197b;

    /* renamed from: c  reason: collision with root package name */
    private final a<c> f57198c;

    static {
        Covode.recordClassIndex(35636);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        b bVar = new b(this.f57196a.get(), this.f57197b.get(), this.f57198c.get(), 10);
        bVar.a();
        return f.a(bVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public j(a<com.snapchat.kit.sdk.core.metrics.a.a> aVar, a<ScheduledExecutorService> aVar2, a<c> aVar3) {
        this.f57196a = aVar;
        this.f57197b = aVar2;
        this.f57198c = aVar3;
    }
}
