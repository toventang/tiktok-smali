package com.snapchat.kit.sdk.core.security;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import dagger.a.c;
import javax.a.a;

public final class Fingerprint_Factory implements c<Fingerprint> {
    private final a<Context> contextProvider;

    static {
        Covode.recordClassIndex(35806);
    }

    @Override // javax.a.a
    public final Fingerprint get() {
        return new Fingerprint(this.contextProvider.get());
    }

    public Fingerprint_Factory(a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static c<Fingerprint> create(a<Context> aVar) {
        return new Fingerprint_Factory(aVar);
    }
}
