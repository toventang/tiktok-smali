package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.skate.SkateClient;
import dagger.a.c;
import dagger.a.f;
import javax.a.a;

public final class m implements c<SkateClient> {

    /* renamed from: a  reason: collision with root package name */
    private final a<com.snapchat.kit.sdk.core.networking.a> f57201a;

    static {
        Covode.recordClassIndex(35639);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        com.snapchat.kit.sdk.core.networking.a aVar = this.f57201a.get();
        return f.a(aVar.a(aVar.f57241c, "https://api.snapkit.com", SkateClient.class, new l.a.b.a()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public m(a<com.snapchat.kit.sdk.core.networking.a> aVar) {
        this.f57201a = aVar;
    }
}
