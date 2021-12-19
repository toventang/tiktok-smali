package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import dagger.a.c;
import dagger.a.f;

public final class u implements c<KitPluginType> {

    /* renamed from: a  reason: collision with root package name */
    private final n f57394a;

    static {
        Covode.recordClassIndex(35869);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return f.a(this.f57394a.f57382f, "Cannot return null from a non-@Nullable @Provides method");
    }

    u(n nVar) {
        this.f57394a = nVar;
    }
}
