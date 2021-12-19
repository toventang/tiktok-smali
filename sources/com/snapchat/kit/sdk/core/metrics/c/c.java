package com.snapchat.kit.sdk.core.metrics.c;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import javax.a.a;

public final class c implements dagger.a.c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final a<SharedPreferences> f57169a;

    /* renamed from: b  reason: collision with root package name */
    private final a<i> f57170b;

    /* renamed from: c  reason: collision with root package name */
    private final a<MetricsClient> f57171c;

    /* renamed from: d  reason: collision with root package name */
    private final a<com.snapchat.kit.sdk.core.metrics.b.a> f57172d;

    static {
        Covode.recordClassIndex(35623);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new b(this.f57169a.get(), this.f57170b.get(), this.f57171c.get(), this.f57172d.get());
    }

    public c(a<SharedPreferences> aVar, a<i> aVar2, a<MetricsClient> aVar3, a<com.snapchat.kit.sdk.core.metrics.b.a> aVar4) {
        this.f57169a = aVar;
        this.f57170b = aVar2;
        this.f57171c = aVar3;
        this.f57172d = aVar4;
    }
}
