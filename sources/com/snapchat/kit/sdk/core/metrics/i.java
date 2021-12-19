package com.snapchat.kit.sdk.core.metrics;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import dagger.a.c;
import dagger.a.f;
import java.util.concurrent.ScheduledExecutorService;
import javax.a.a;

public final class i implements c<c> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f57194a;

    /* renamed from: b  reason: collision with root package name */
    private final a<ScheduledExecutorService> f57195b;

    static {
        Covode.recordClassIndex(35635);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        c cVar = new c(this.f57195b.get());
        Context applicationContext = this.f57194a.get().getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        ((Application) applicationContext).registerActivityLifecycleCallbacks(cVar);
        return f.a(cVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public i(a<Context> aVar, a<ScheduledExecutorService> aVar2) {
        this.f57194a = aVar;
        this.f57195b = aVar2;
    }
}
