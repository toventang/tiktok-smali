package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import dagger.a.c;
import dagger.a.f;
import okhttp3.OkHttpClient;

public final class w implements c<OkHttpClient> {

    /* renamed from: a  reason: collision with root package name */
    private final n f57405a;

    static {
        Covode.recordClassIndex(35871);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return f.a(new OkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
    }

    w(n nVar) {
        this.f57405a = nVar;
    }
}
