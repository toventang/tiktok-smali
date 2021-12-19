package com.ss.android.ugc.aweme.net.h.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.logger.a;
import okhttp3.Interceptor;
import okhttp3.Response;

public final class f implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    private Interceptor f112353a;

    static {
        Covode.recordClassIndex(72194);
    }

    public f(Interceptor interceptor) {
        this.f112353a = interceptor;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        if (d.a(chain.request())) {
            System.currentTimeMillis();
            a.b.f109011a.b("feed_ok_start_to_security_interceptor", false);
            a.b.f109011a.a("feed_ok_security_interceptor_duration", false);
        }
        Interceptor interceptor = this.f112353a;
        if (interceptor != null) {
            return interceptor.intercept(chain);
        }
        return chain.proceed(chain.request());
    }
}
