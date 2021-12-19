package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.c.b;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.a.c;
import dagger.a.f;
import java.util.concurrent.ScheduledExecutorService;
import javax.a.a;

public final class e implements c<b<ServerEvent>> {

    /* renamed from: a  reason: collision with root package name */
    private final a<b> f57186a;

    /* renamed from: b  reason: collision with root package name */
    private final a<ScheduledExecutorService> f57187b;

    /* renamed from: c  reason: collision with root package name */
    private final a<c> f57188c;

    static {
        Covode.recordClassIndex(35631);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        b bVar = new b(this.f57186a.get(), this.f57187b.get(), this.f57188c.get(), 10);
        bVar.a();
        return f.a(bVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public e(a<b> aVar, a<ScheduledExecutorService> aVar2, a<c> aVar3) {
        this.f57186a = aVar;
        this.f57187b = aVar2;
        this.f57188c = aVar3;
    }
}
