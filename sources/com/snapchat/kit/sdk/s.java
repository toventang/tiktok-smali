package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import dagger.a.c;
import javax.a.a;

public final class s implements c<l> {

    /* renamed from: a  reason: collision with root package name */
    private final n f57390a;

    /* renamed from: b  reason: collision with root package name */
    private final a<SharedPreferences> f57391b;

    /* renamed from: c  reason: collision with root package name */
    private final a<f> f57392c;

    static {
        Covode.recordClassIndex(35867);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return dagger.a.f.a(new l(this.f57391b.get(), this.f57392c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    s(n nVar, a<SharedPreferences> aVar, a<f> aVar2) {
        this.f57390a = nVar;
        this.f57391b = aVar;
        this.f57392c = aVar2;
    }
}
