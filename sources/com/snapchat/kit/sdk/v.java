package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.snapchat.kit.sdk.core.controller.b;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.networking.l;
import com.snapchat.kit.sdk.core.security.SecureSharedPreferences;
import dagger.a.c;
import javax.a.a;
import okhttp3.OkHttpClient;

public final class v implements c<m> {

    /* renamed from: a  reason: collision with root package name */
    private final n f57395a;

    /* renamed from: b  reason: collision with root package name */
    private final a<SecureSharedPreferences> f57396b;

    /* renamed from: c  reason: collision with root package name */
    private final a<l> f57397c;

    /* renamed from: d  reason: collision with root package name */
    private final a<b> f57398d;

    /* renamed from: e  reason: collision with root package name */
    private final a<OkHttpClient> f57399e;

    /* renamed from: f  reason: collision with root package name */
    private final a<l> f57400f;

    /* renamed from: g  reason: collision with root package name */
    private final a<f> f57401g;

    /* renamed from: h  reason: collision with root package name */
    private final a<MetricQueue<ServerEvent>> f57402h;

    /* renamed from: i  reason: collision with root package name */
    private final a<com.snapchat.kit.sdk.core.metrics.c.f> f57403i;

    /* renamed from: j  reason: collision with root package name */
    private final a<MetricQueue<OpMetric>> f57404j;

    static {
        Covode.recordClassIndex(35870);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        n nVar = this.f57395a;
        dagger.a b2 = dagger.a.b.b(this.f57404j);
        return dagger.a.f.a(new m(nVar.f57378b, nVar.f57379c, nVar.f57380d, nVar.f57377a, this.f57396b.get(), this.f57397c.get(), this.f57398d.get(), this.f57399e.get(), dagger.a.b.b(this.f57400f), this.f57401g.get(), dagger.a.b.b(this.f57402h), this.f57403i.get(), b2, nVar.f57382f, nVar.f57383g), "Cannot return null from a non-@Nullable @Provides method");
    }

    v(n nVar, a<SecureSharedPreferences> aVar, a<l> aVar2, a<b> aVar3, a<OkHttpClient> aVar4, a<l> aVar5, a<f> aVar6, a<MetricQueue<ServerEvent>> aVar7, a<com.snapchat.kit.sdk.core.metrics.c.f> aVar8, a<MetricQueue<OpMetric>> aVar9) {
        this.f57395a = nVar;
        this.f57396b = aVar;
        this.f57397c = aVar2;
        this.f57398d = aVar3;
        this.f57399e = aVar4;
        this.f57400f = aVar5;
        this.f57401g = aVar6;
        this.f57402h = aVar7;
        this.f57403i = aVar8;
        this.f57404j = aVar9;
    }
}
