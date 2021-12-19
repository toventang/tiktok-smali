package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.config.ConfigClient;
import dagger.a.c;
import javax.a.a;

public final class f implements c<ConfigClient> {

    /* renamed from: a  reason: collision with root package name */
    private final a<com.snapchat.kit.sdk.core.networking.a> f57189a;

    static {
        Covode.recordClassIndex(35632);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        com.snapchat.kit.sdk.core.networking.a aVar = this.f57189a.get();
        return dagger.a.f.a(aVar.a(aVar.f57241c, "https://api.snapkit.com", ConfigClient.class, l.a.a.a.a(aVar.f57239a)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public f(a<com.snapchat.kit.sdk.core.networking.a> aVar) {
        this.f57189a = aVar;
    }
}
