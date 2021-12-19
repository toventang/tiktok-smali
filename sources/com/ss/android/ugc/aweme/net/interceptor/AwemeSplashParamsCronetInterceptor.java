package com.ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.i;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.experiment.cx;
import com.ss.android.ugc.aweme.logger.a;
import okhttp3.HttpUrl;

public class AwemeSplashParamsCronetInterceptor extends FeedBaseCronetInterceptor {
    static {
        Covode.recordClassIndex(72226);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.net.interceptor.FeedBaseCronetInterceptor
    public final u a(a.AbstractC1036a aVar) {
        if (!SplashSettingServiceImpl.g().a()) {
            if (cx.f89739d) {
                a.b.f109011a.a("feed_preload_awemesplashparams_interceptor", false);
                a.b.f109011a.b("feed_preload_awemesplashparams_interceptor", false);
            }
            return aVar.a(aVar.a());
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.ss.android.ugc.aweme.feed.r.a.a();
        Request a2 = aVar.a();
        String str = i.f34788d;
        Long l2 = i.f34789e;
        if (!TextUtils.isEmpty(str) || l2 != null) {
            HttpUrl.Builder newBuilder = HttpUrl.parse(a2.getUrl()).newBuilder();
            if (!TextUtils.isEmpty(str)) {
                newBuilder.setQueryParameter("top_view_cid", str);
            }
            if (l2 != null) {
                newBuilder.setQueryParameter("top_view_aid", String.valueOf(l2));
            }
            a2 = a2.newBuilder().a(newBuilder.build().toString()).a();
        }
        a.b.f109011a.a("aweme_splash_params_interceptor_duration", System.currentTimeMillis() - currentTimeMillis);
        System.currentTimeMillis();
        if (cx.f89739d) {
            a.b.f109011a.a("feed_preload_awemesplashparams_interceptor", false);
            a.b.f109011a.b("feed_preload_awemesplashparams_interceptor", false);
        }
        return aVar.a(a2);
    }
}
