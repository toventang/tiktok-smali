package com.ss.android.ugc.aweme.net.h.a.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.i;
import com.ss.android.ugc.aweme.logger.a;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class a extends d {
    static {
        Covode.recordClassIndex(72189);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.net.h.a.a.d
    public final Response a(Interceptor.Chain chain) {
        if (!SplashSettingServiceImpl.g().a()) {
            return chain.proceed(chain.request());
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.ss.android.ugc.aweme.feed.r.a.a();
        Request request = chain.request();
        String str = i.f34788d;
        Long l2 = i.f34789e;
        if (!TextUtils.isEmpty(str) || l2 != null) {
            HttpUrl.Builder newBuilder = request.url().newBuilder();
            if (!TextUtils.isEmpty(str)) {
                newBuilder.setQueryParameter("top_view_cid", str);
            }
            if (l2 != null) {
                newBuilder.setQueryParameter("top_view_aid", String.valueOf(l2));
            }
            request = request.newBuilder().url(newBuilder.build()).build();
        }
        a.b.f109011a.a("aweme_splash_params_interceptor_duration", System.currentTimeMillis() - currentTimeMillis);
        return chain.proceed(request);
    }
}
