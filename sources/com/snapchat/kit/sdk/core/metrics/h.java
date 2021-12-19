package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import dagger.a.c;
import dagger.a.f;
import javax.a.a;

public final class h implements c<MetricsClient> {

    /* renamed from: a  reason: collision with root package name */
    private final a<com.snapchat.kit.sdk.core.networking.a> f57193a;

    static {
        Covode.recordClassIndex(35634);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        com.snapchat.kit.sdk.core.networking.a aVar = this.f57193a.get();
        return f.a(aVar.a(aVar.f57240b, "https://api.snapkit.com", MetricsClient.class, new l.a.b.a()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public h(a<com.snapchat.kit.sdk.core.networking.a> aVar) {
        this.f57193a = aVar;
    }
}
