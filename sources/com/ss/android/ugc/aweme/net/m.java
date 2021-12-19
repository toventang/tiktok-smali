package com.ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.e;
import okhttp3.Interceptor;
import okhttp3.Response;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    static final Interceptor f112448a = new m();

    static {
        Covode.recordClassIndex(72260);
    }

    private m() {
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        e.b();
        return chain.proceed(chain.request());
    }
}
