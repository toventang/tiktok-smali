package com.twitter.sdk.android.core.internal.oauth;

import com.bytedance.covode.number.Covode;
import okhttp3.Interceptor;
import okhttp3.Response;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    private final d f156020a;

    static {
        Covode.recordClassIndex(103660);
    }

    e(d dVar) {
        this.f156020a = dVar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().header("User-Agent", this.f156020a.f156018d).build());
    }
}
