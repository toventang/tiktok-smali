package com.snapchat.kit.sdk.core.metrics.skate;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.config.f;
import com.snapchat.kit.sdk.core.metrics.c.i;
import dagger.a.c;
import javax.a.a;

public final class b implements c<a> {

    /* renamed from: a  reason: collision with root package name */
    private final a<f> f57219a;

    /* renamed from: b  reason: collision with root package name */
    private final a<SharedPreferences> f57220b;

    /* renamed from: c  reason: collision with root package name */
    private final a<i> f57221c;

    /* renamed from: d  reason: collision with root package name */
    private final a<SkateClient> f57222d;

    /* renamed from: e  reason: collision with root package name */
    private final a<com.snapchat.kit.sdk.core.metrics.b.a> f57223e;

    static {
        Covode.recordClassIndex(35775);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new a(this.f57219a.get(), this.f57220b.get(), this.f57221c.get(), this.f57222d.get(), this.f57223e.get());
    }

    public b(a<f> aVar, a<SharedPreferences> aVar2, a<i> aVar3, a<SkateClient> aVar4, a<com.snapchat.kit.sdk.core.metrics.b.a> aVar5) {
        this.f57219a = aVar;
        this.f57220b = aVar2;
        this.f57221c = aVar3;
        this.f57222d = aVar4;
        this.f57223e = aVar5;
    }
}
