package com.ss.android.ugc.aweme.net.h.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.net.h.b;
import okhttp3.Interceptor;
import okhttp3.Response;

public final class a implements Interceptor {
    static {
        Covode.recordClassIndex(72196);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        return b.a(chain, "BlockCallServerInterceptor block");
    }
}
