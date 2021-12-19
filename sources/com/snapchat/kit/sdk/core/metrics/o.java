package com.snapchat.kit.sdk.core.metrics;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import dagger.a.c;
import javax.a.a;

public final class o implements c<n> {

    /* renamed from: a  reason: collision with root package name */
    private final a<SharedPreferences> f57208a;

    /* renamed from: b  reason: collision with root package name */
    private final a<MetricsClient> f57209b;

    /* renamed from: c  reason: collision with root package name */
    private final a<com.snapchat.kit.sdk.core.metrics.b.a> f57210c;

    /* renamed from: d  reason: collision with root package name */
    private final a<String> f57211d;

    static {
        Covode.recordClassIndex(35771);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new n(this.f57208a.get(), this.f57209b.get(), this.f57210c.get(), this.f57211d.get());
    }

    public o(a<SharedPreferences> aVar, a<MetricsClient> aVar2, a<com.snapchat.kit.sdk.core.metrics.b.a> aVar3, a<String> aVar4) {
        this.f57208a = aVar;
        this.f57209b = aVar2;
        this.f57210c = aVar3;
        this.f57211d = aVar4;
    }
}
