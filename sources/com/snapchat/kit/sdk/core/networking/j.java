package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import dagger.a.c;
import javax.a.a;

public final class j implements c<i> {

    /* renamed from: a  reason: collision with root package name */
    private final a<String> f57265a;

    /* renamed from: b  reason: collision with root package name */
    private final a<Fingerprint> f57266b;

    static {
        Covode.recordClassIndex(35796);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new i(this.f57265a.get(), this.f57266b.get());
    }

    public j(a<String> aVar, a<Fingerprint> aVar2) {
        this.f57265a = aVar;
        this.f57266b = aVar2;
    }
}
