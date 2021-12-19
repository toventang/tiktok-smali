package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import dagger.a.c;
import dagger.a.f;
import javax.a.a;

public final class ac implements c<SnapKitAppLifecycleObserver> {

    /* renamed from: a  reason: collision with root package name */
    private final n f57074a;

    /* renamed from: b  reason: collision with root package name */
    private final a<com.snapchat.kit.sdk.core.metrics.skate.c> f57075b;

    static {
        Covode.recordClassIndex(35558);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return f.a(new SnapKitAppLifecycleObserver(this.f57075b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    ac(n nVar, a<com.snapchat.kit.sdk.core.metrics.skate.c> aVar) {
        this.f57074a = nVar;
        this.f57075b = aVar;
    }
}
