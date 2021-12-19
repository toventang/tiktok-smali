package com.snapchat.kit.sdk.core.networking;

import com.a;
import com.bytedance.covode.number.Covode;
import java.util.UUID;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* access modifiers changed from: package-private */
public abstract class k implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    private final String f57267a;

    static {
        Covode.recordClassIndex(35797);
    }

    private synchronized String a() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    k(String str) {
        this.f57267a = str;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        return chain.proceed(a(chain).build());
    }

    /* access modifiers changed from: protected */
    public Request.Builder a(Interceptor.Chain chain) {
        return chain.request().newBuilder().headers(new Headers.Builder().addUnsafeNonAscii("User-Agent", f.f57255a).add("X-Snap-SDK-OAuth-Client-Id", this.f57267a).add("X-Cloud-Trace-Context", a.a("%s/0;o=1", new Object[]{a()})).add("X-SnapKit-Core-Version", "1.12.0").build());
    }
}
