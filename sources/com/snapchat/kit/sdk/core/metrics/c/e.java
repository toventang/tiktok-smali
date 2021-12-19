package com.snapchat.kit.sdk.core.metrics.c;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.b;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.a.c;
import javax.a.a;

public final class e implements c<d> {

    /* renamed from: a  reason: collision with root package name */
    private final a<i> f57175a;

    /* renamed from: b  reason: collision with root package name */
    private final a<b<ServerEvent>> f57176b;

    static {
        Covode.recordClassIndex(35625);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new d(this.f57175a.get(), this.f57176b.get());
    }

    public e(a<i> aVar, a<b<ServerEvent>> aVar2) {
        this.f57175a = aVar;
        this.f57176b = aVar2;
    }
}
