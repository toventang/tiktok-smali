package com.snapchat.kit.sdk.core.config;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import dagger.a.c;
import javax.a.a;

public final class g implements c<f> {

    /* renamed from: a  reason: collision with root package name */
    private final a<ConfigClient> f57110a;

    /* renamed from: b  reason: collision with root package name */
    private final a<SharedPreferences> f57111b;

    static {
        Covode.recordClassIndex(35583);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new f(this.f57110a.get(), this.f57111b.get());
    }

    public g(a<ConfigClient> aVar, a<SharedPreferences> aVar2) {
        this.f57110a = aVar;
        this.f57111b = aVar2;
    }
}
