package com.ss.android.ugc.aweme.net.h.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.api.e;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class d implements Interceptor {
    static {
        Covode.recordClassIndex(72192);
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public Response a(Interceptor.Chain chain) {
        return chain.proceed(chain.request());
    }

    public static boolean a(Request request) {
        if (request == null || request.url() == null || !e.a(request.url().toString())) {
            return false;
        }
        return true;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        if (!a() || !a(request)) {
            return chain.proceed(chain.request());
        }
        return a(chain);
    }
}
