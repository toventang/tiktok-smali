package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.common.applog.q;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.bs.b;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

public class TokenSdkCommonParamsInterceptorTTNet implements a {

    /* renamed from: a  reason: collision with root package name */
    String f112389a;

    static {
        Covode.recordClassIndex(72239);
    }

    public TokenSdkCommonParamsInterceptorTTNet(String str) {
        this.f112389a = str;
    }

    @Override // com.bytedance.retrofit2.c.a
    public u intercept(a.AbstractC1036a aVar) {
        if (!(aVar.c() instanceof b)) {
            return a(aVar);
        }
        b bVar = (b) aVar.c();
        if (bVar.W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.W;
            bVar.a(bVar.Y, uptimeMillis);
            bVar.b(bVar.Y, uptimeMillis);
        }
        bVar.a(getClass().getSimpleName());
        bVar.W = SystemClock.uptimeMillis();
        u a2 = a(aVar);
        if (bVar.X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.X;
            String simpleName = getClass().getSimpleName();
            bVar.a(simpleName, uptimeMillis2);
            bVar.c(simpleName, uptimeMillis2);
        }
        bVar.X = SystemClock.uptimeMillis();
        return a2;
    }

    private u a(a.AbstractC1036a aVar) {
        int serverTime = NetworkUtils.getServerTime();
        Request a2 = aVar.a();
        String url = a2.getUrl();
        if (url != null && (url.contains("/passport/token/beat/") || url.contains("/passport/token/change/") || url.contains("/passport/user/logout/"))) {
            HttpUrl.Builder addQueryParameter = HttpUrl.parse(a2.getUrl()).newBuilder().addQueryParameter("ts", String.valueOf(serverTime)).addQueryParameter("app_type", this.f112389a);
            HashMap hashMap = new HashMap();
            q.b(hashMap, true);
            for (Map.Entry entry : hashMap.entrySet()) {
                addQueryParameter.addQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            a2 = a2.newBuilder().a(addQueryParameter.build().toString()).a();
        }
        return aVar.a(a2);
    }
}
