package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.SnapKitInitType;
import dagger.a.c;

public final class f implements c<SnapKitInitType> {

    /* renamed from: a  reason: collision with root package name */
    private final n f57321a;

    static {
        Covode.recordClassIndex(35842);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return dagger.a.f.a(this.f57321a.f57381e, "Cannot return null from a non-@Nullable @Provides method");
    }

    f(n nVar) {
        this.f57321a = nVar;
    }
}
