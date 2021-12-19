package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.config.f;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.SkateEvent;
import com.snapchat.kit.sdk.core.metrics.model.SnapKitInitType;
import com.snapchat.kit.sdk.core.metrics.skate.d;
import dagger.a.c;
import javax.a.a;

public final class ab implements c<com.snapchat.kit.sdk.core.metrics.skate.c> {

    /* renamed from: a  reason: collision with root package name */
    private final n f57068a;

    /* renamed from: b  reason: collision with root package name */
    private final a<f> f57069b;

    /* renamed from: c  reason: collision with root package name */
    private final a<d> f57070c;

    /* renamed from: d  reason: collision with root package name */
    private final a<MetricQueue<SkateEvent>> f57071d;

    /* renamed from: e  reason: collision with root package name */
    private final a<m> f57072e;

    /* renamed from: f  reason: collision with root package name */
    private final a<SnapKitInitType> f57073f;

    static {
        Covode.recordClassIndex(35557);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        n nVar = this.f57068a;
        return dagger.a.f.a(new com.snapchat.kit.sdk.core.metrics.skate.c(this.f57069b.get(), this.f57070c.get(), this.f57071d.get(), this.f57072e.get(), this.f57073f.get(), nVar.f57382f, nVar.f57383g), "Cannot return null from a non-@Nullable @Provides method");
    }

    ab(n nVar, a<f> aVar, a<d> aVar2, a<MetricQueue<SkateEvent>> aVar3, a<m> aVar4, a<SnapKitInitType> aVar5) {
        this.f57068a = nVar;
        this.f57069b = aVar;
        this.f57070c = aVar2;
        this.f57071d = aVar3;
        this.f57072e = aVar4;
        this.f57073f = aVar5;
    }
}
