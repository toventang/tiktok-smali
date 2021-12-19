package com.snapchat.kit.sdk.core.metrics.c;

import com.bytedance.covode.number.Covode;
import dagger.a.c;
import javax.a.a;

public final class g implements c<f> {

    /* renamed from: a  reason: collision with root package name */
    private final a<a> f57178a;

    static {
        Covode.recordClassIndex(35627);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new f(this.f57178a.get());
    }

    public g(a<a> aVar) {
        this.f57178a = aVar;
    }
}
