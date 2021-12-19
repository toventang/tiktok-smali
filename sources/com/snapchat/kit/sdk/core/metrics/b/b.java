package com.snapchat.kit.sdk.core.metrics.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import dagger.a.c;
import javax.a.a;

public final class b implements c<a> {

    /* renamed from: a  reason: collision with root package name */
    private final a<f> f57155a;

    static {
        Covode.recordClassIndex(35618);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new a(this.f57155a.get());
    }

    public b(a<f> aVar) {
        this.f57155a = aVar;
    }
}
