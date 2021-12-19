package com.twitter.sdk.android.core.internal.a;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.d;
import com.twitter.sdk.android.core.e;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class a implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    final e f155947a;

    static {
        Covode.recordClassIndex(103617);
    }

    public a(e eVar) {
        this.f155947a = eVar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        GuestAuthToken guestAuthToken;
        Request request = chain.request();
        d a2 = this.f155947a.a();
        if (a2 == null || (guestAuthToken = (GuestAuthToken) a2.f155913a) == null) {
            return chain.proceed(request);
        }
        Request.Builder newBuilder = request.newBuilder();
        a(newBuilder, guestAuthToken);
        return chain.proceed(newBuilder.build());
    }

    static void a(Request.Builder builder, GuestAuthToken guestAuthToken) {
        builder.header("Authorization", guestAuthToken.f156003c + " " + guestAuthToken.f156004d);
        builder.header("x-guest-token", guestAuthToken.f155994b);
    }
}
