package com.twitter.sdk.android.core.internal.a;

import com.bytedance.covode.number.Covode;
import okhttp3.Interceptor;
import okhttp3.Response;

public final class b implements Interceptor {
    static {
        Covode.recordClassIndex(103618);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Response proceed = chain.proceed(chain.request());
        if (proceed.code() == 403) {
            return proceed.newBuilder().code(401).message("Unauthorized").build();
        }
        return proceed;
    }
}
