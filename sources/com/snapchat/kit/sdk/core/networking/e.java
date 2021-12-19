package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import dagger.a.c;
import javax.a.a;
import okhttp3.Cache;

public final class e implements c<a> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Cache> f57250a;

    /* renamed from: b  reason: collision with root package name */
    private final a<f> f57251b;

    /* renamed from: c  reason: collision with root package name */
    private final a<c> f57252c;

    /* renamed from: d  reason: collision with root package name */
    private final a<g> f57253d;

    /* renamed from: e  reason: collision with root package name */
    private final a<i> f57254e;

    static {
        Covode.recordClassIndex(35790);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new a(this.f57250a.get(), this.f57251b.get(), this.f57252c.get(), this.f57253d.get(), this.f57254e.get());
    }

    public e(a<Cache> aVar, a<f> aVar2, a<c> aVar3, a<g> aVar4, a<i> aVar5) {
        this.f57250a = aVar;
        this.f57251b = aVar2;
        this.f57252c = aVar3;
        this.f57253d = aVar4;
        this.f57254e = aVar5;
    }
}
