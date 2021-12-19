package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.snapchat.kit.sdk.core.controller.b;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import com.snapchat.kit.sdk.m;
import dagger.a.c;
import javax.a.a;

public final class d implements c<c> {

    /* renamed from: a  reason: collision with root package name */
    private final a<m> f57245a;

    /* renamed from: b  reason: collision with root package name */
    private final a<b> f57246b;

    /* renamed from: c  reason: collision with root package name */
    private final a<String> f57247c;

    /* renamed from: d  reason: collision with root package name */
    private final a<Fingerprint> f57248d;

    /* renamed from: e  reason: collision with root package name */
    private final a<f> f57249e;

    static {
        Covode.recordClassIndex(35789);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new c(this.f57245a.get(), this.f57246b.get(), this.f57247c.get(), this.f57248d.get(), this.f57249e.get());
    }

    public d(a<m> aVar, a<b> aVar2, a<String> aVar3, a<Fingerprint> aVar4, a<f> aVar5) {
        this.f57245a = aVar;
        this.f57246b = aVar2;
        this.f57247c = aVar3;
        this.f57248d = aVar4;
        this.f57249e = aVar5;
    }
}
