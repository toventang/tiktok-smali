package com.snapchat.kit.sdk.creative.a;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import javax.a.a;

public final class c implements dagger.a.c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final a<MetricQueue<OpMetric>> f57284a;

    static {
        Covode.recordClassIndex(35821);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new b(this.f57284a.get());
    }

    public c(a<MetricQueue<OpMetric>> aVar) {
        this.f57284a = aVar;
    }
}
