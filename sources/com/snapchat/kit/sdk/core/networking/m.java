package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import dagger.a.c;
import javax.a.a;

public final class m implements c<l> {

    /* renamed from: a  reason: collision with root package name */
    private final a<FirebaseExtensionClient> f57273a;

    /* renamed from: b  reason: collision with root package name */
    private final a<f> f57274b;

    static {
        Covode.recordClassIndex(35800);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new l(this.f57273a.get(), this.f57274b.get());
    }

    public m(a<FirebaseExtensionClient> aVar, a<f> aVar2) {
        this.f57273a = aVar;
        this.f57274b = aVar2;
    }
}
