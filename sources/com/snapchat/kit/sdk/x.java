package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import dagger.a.c;
import dagger.a.f;
import java.util.Random;

public final class x implements c<Random> {

    /* renamed from: a  reason: collision with root package name */
    private final n f57406a;

    static {
        Covode.recordClassIndex(35872);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return f.a(new Random(), "Cannot return null from a non-@Nullable @Provides method");
    }

    x(n nVar) {
        this.f57406a = nVar;
    }
}
