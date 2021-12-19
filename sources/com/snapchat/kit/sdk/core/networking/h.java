package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.snapchat.kit.sdk.core.controller.b;
import com.snapchat.kit.sdk.m;
import dagger.a.c;
import javax.a.a;

public final class h implements c<g> {

    /* renamed from: a  reason: collision with root package name */
    private final a<m> f57260a;

    /* renamed from: b  reason: collision with root package name */
    private final a<b> f57261b;

    /* renamed from: c  reason: collision with root package name */
    private final a<String> f57262c;

    /* renamed from: d  reason: collision with root package name */
    private final a<f> f57263d;

    static {
        Covode.recordClassIndex(35794);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new g(this.f57260a.get(), this.f57261b.get(), this.f57262c.get(), this.f57263d.get());
    }

    public h(a<m> aVar, a<b> aVar2, a<String> aVar3, a<f> aVar4) {
        this.f57260a = aVar;
        this.f57261b = aVar2;
        this.f57262c = aVar3;
        this.f57263d = aVar4;
    }
}
