package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.bs.b;
import java.net.URI;
import okhttp3.HttpUrl;

public class UrlTransformInterceptorTTNet implements a {
    static {
        Covode.recordClassIndex(72240);
    }

    private static boolean a(String str) {
        if ("vas_ad_track".equals(str)) {
            return true;
        }
        return false;
    }

    private static u a(a.AbstractC1036a aVar) {
        Request a2 = aVar.a();
        return aVar.a(a2.newBuilder().a(a(a2.getUrl(), a2.getServiceType())).a());
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

    private static String b(String str, String str2) {
        if (str2 == null || str2.length() <= 0 || str == null || str.length() <= 0) {
            return str2;
        }
        try {
            String host = URI.create(str2).getHost();
            if (host != null) {
                return str2.replace(host, str);
            }
            return str2;
        } catch (Exception unused) {
            return str2;
        }
    }

    private static String a(String str, String str2) {
        if (!SettingsManager.a().a("debug_replace_http_to_https", true) || TextUtils.isEmpty(str) || str.contains("api.oston.io") || str.contains("api.keepon.media")) {
            return str;
        }
        if (SharePrefCache.inst().getUseHttps().c().booleanValue() && !a(str2)) {
            if (!str.contains("https://") && !str.contains("http://")) {
                str = "https://".concat(String.valueOf(str));
            } else if (str.contains("http://")) {
                str = str.replace("http://", "https://");
            }
        }
        HttpUrl.Builder newBuilder = HttpUrl.parse(str).newBuilder();
        HttpUrl build = newBuilder.build();
        if (str.contains("/passport/auth/login/") || str.contains("/passport/auth/login_only/")) {
            if (TextUtils.isEmpty(build.queryParameter("access_token"))) {
                return str;
            }
            String replaceAll = build.queryParameter("access_token").replaceAll(" ", "+");
            HttpUrl.Builder removeAllQueryParameters = build.newBuilder().removeAllQueryParameters("access_token");
            removeAllQueryParameters.addQueryParameter("access_token", replaceAll);
            return removeAllQueryParameters.build().url().toString();
        } else if (str.contains("/service/settings/v2/")) {
            return b(d.f34604k.f34586a, str);
        } else {
            if (str.contains("/service/settings/v3/")) {
                return b(d.f34604k.f34586a, str);
            }
            if (str.contains("push/get_service_addrs")) {
                str = build.newBuilder().host(d.f34604k.f34586a).build().url().toString();
            }
            return c.a(str, newBuilder);
        }
    }
}
