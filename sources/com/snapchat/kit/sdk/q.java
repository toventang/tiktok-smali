package com.snapchat.kit.sdk;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import dagger.a.c;
import dagger.a.f;

public final class q implements c<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final n f57387a;

    static {
        Covode.recordClassIndex(35865);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return f.a(this.f57387a.f57377a, "Cannot return null from a non-@Nullable @Provides method");
    }

    q(n nVar) {
        this.f57387a = nVar;
    }
}
