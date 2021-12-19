package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import dagger.a.c;
import dagger.a.f;

public final class p implements c<String> {

    /* renamed from: a  reason: collision with root package name */
    private final n f57386a;

    static {
        Covode.recordClassIndex(35864);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return f.a(this.f57386a.f57378b, "Cannot return null from a non-@Nullable @Provides method");
    }

    p(n nVar) {
        this.f57386a = nVar;
    }
}
