package com.twitter.sdk.android.core.internal.a;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.i;
import com.twitter.sdk.android.core.internal.oauth.b;
import java.util.HashMap;
import java.util.Locale;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class d implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    final i<? extends TwitterAuthToken> f155951a;

    /* renamed from: b  reason: collision with root package name */
    final TwitterAuthConfig f155952b;

    static {
        Covode.recordClassIndex(103620);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        HttpUrl url = request.url();
        HttpUrl.Builder query = url.newBuilder().query(null);
        int querySize = url.querySize();
        for (int i2 = 0; i2 < querySize; i2++) {
            query.addEncodedQueryParameter(f.b(url.queryParameterName(i2)), f.b(url.queryParameterValue(i2)));
        }
        Request build = newBuilder.url(query.build()).build();
        Request.Builder newBuilder2 = build.newBuilder();
        TwitterAuthConfig twitterAuthConfig = this.f155952b;
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) this.f155951a.f155913a;
        String method = build.method();
        String httpUrl = build.url().toString();
        HashMap hashMap = new HashMap();
        if ("POST".equals(build.method().toUpperCase(Locale.US))) {
            RequestBody body = build.body();
            if (body instanceof FormBody) {
                FormBody formBody = (FormBody) body;
                for (int i3 = 0; i3 < formBody.size(); i3++) {
                    hashMap.put(formBody.encodedName(i3), formBody.value(i3));
                }
            }
        }
        return chain.proceed(newBuilder2.header("Authorization", b.a(twitterAuthConfig, twitterAuthToken, null, method, httpUrl, hashMap)).build());
    }

    public d(i<? extends TwitterAuthToken> iVar, TwitterAuthConfig twitterAuthConfig) {
        this.f155951a = iVar;
        this.f155952b = twitterAuthConfig;
    }
}
