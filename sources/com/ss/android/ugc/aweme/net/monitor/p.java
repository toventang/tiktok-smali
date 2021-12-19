package com.ss.android.ugc.aweme.net.monitor;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import h.f.b.l;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class p implements Interceptor {
    static {
        Covode.recordClassIndex(72292);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        l.d(chain, "");
        e<Request, Response> c2 = n.f112474e.c(new e<>(chain.request(), null, 62));
        if (c2.f112463f == d.INTERCEPT && c2.f112459b != null) {
            R r = c2.f112459b;
            if (r == null) {
                l.b();
            }
            return r;
        } else if (c2.f112463f != d.EXCEPTION || c2.f112462e == null) {
            Q q = c2.f112458a;
            if (q == null) {
                l.b();
            }
            c2.f112459b = (R) chain.proceed(q);
            e<Request, Response> d2 = n.f112474e.d(c2);
            if (d2.f112463f != d.EXCEPTION || d2.f112462e == null) {
                R r2 = d2.f112459b;
                if (r2 == null) {
                    l.b();
                }
                return r2;
            }
            RuntimeException runtimeException = d2.f112462e;
            if (runtimeException == null) {
                l.b();
            }
            throw runtimeException;
        } else {
            RuntimeException runtimeException2 = c2.f112462e;
            if (runtimeException2 == null) {
                l.b();
            }
            throw runtimeException2;
        }
    }
}
