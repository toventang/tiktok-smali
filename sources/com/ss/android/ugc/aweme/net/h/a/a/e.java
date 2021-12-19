package com.ss.android.ugc.aweme.net.h.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.logger.a;
import okhttp3.Interceptor;
import okhttp3.Response;

public final class e implements Interceptor {
    static {
        Covode.recordClassIndex(72193);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        if (d.a(chain.request())) {
            System.currentTimeMillis();
            a.b.f109011a.b("feed_ok_security_interceptor_duration", false);
            a.b.f109011a.a("feed_ok_security_interceptor_to_connection", false);
        }
        return chain.proceed(chain.request());
    }
}
