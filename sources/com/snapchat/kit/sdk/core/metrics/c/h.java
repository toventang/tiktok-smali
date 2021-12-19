package com.snapchat.kit.sdk.core.metrics.c;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import dagger.a.c;
import javax.a.a;

public final class h implements c<a> {

    /* renamed from: a  reason: collision with root package name */
    private final a<String> f57179a;

    /* renamed from: b  reason: collision with root package name */
    private final a<KitPluginType> f57180b;

    /* renamed from: c  reason: collision with root package name */
    private final a<Boolean> f57181c;

    static {
        Covode.recordClassIndex(35628);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new a(this.f57179a.get(), this.f57180b.get(), this.f57181c.get().booleanValue());
    }

    public h(a<String> aVar, a<KitPluginType> aVar2, a<Boolean> aVar3) {
        this.f57179a = aVar;
        this.f57180b = aVar2;
        this.f57181c = aVar3;
    }
}
