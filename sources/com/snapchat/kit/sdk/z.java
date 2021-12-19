package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.snapchat.kit.sdk.core.security.SecureSharedPreferences;
import dagger.a.c;
import javax.a.a;

public final class z implements c<SecureSharedPreferences> {

    /* renamed from: a  reason: collision with root package name */
    private final n f57408a;

    /* renamed from: b  reason: collision with root package name */
    private final a<f> f57409b;

    /* renamed from: c  reason: collision with root package name */
    private final a<SharedPreferences> f57410c;

    static {
        Covode.recordClassIndex(35874);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return this.f57408a.a(this.f57409b.get(), this.f57410c.get());
    }

    z(n nVar, a<f> aVar, a<SharedPreferences> aVar2) {
        this.f57408a = nVar;
        this.f57409b = aVar;
        this.f57410c = aVar2;
    }
}
