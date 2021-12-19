package com.snapchat.kit.sdk.core.metrics.a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import dagger.a.c;
import javax.a.a;

public final class b implements c<a> {

    /* renamed from: a  reason: collision with root package name */
    private final a<SharedPreferences> f57132a;

    /* renamed from: b  reason: collision with root package name */
    private final a<MetricsClient> f57133b;

    /* renamed from: c  reason: collision with root package name */
    private final a<com.snapchat.kit.sdk.core.metrics.b.a> f57134c;

    static {
        Covode.recordClassIndex(35607);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new a(this.f57132a.get(), this.f57133b.get(), this.f57134c.get());
    }

    public b(a<SharedPreferences> aVar, a<MetricsClient> aVar2, a<com.snapchat.kit.sdk.core.metrics.b.a> aVar3) {
        this.f57132a = aVar;
        this.f57133b = aVar2;
        this.f57134c = aVar3;
    }
}
