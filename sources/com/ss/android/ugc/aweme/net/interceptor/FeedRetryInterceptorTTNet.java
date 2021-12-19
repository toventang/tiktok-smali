package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.bytedance.ttnet.d.d;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.bs.b;
import java.security.GeneralSecurityException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;

public class FeedRetryInterceptorTTNet implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f112388a = Pattern.compile(".*/aweme/v\\d/feed.*");

    static {
        Covode.recordClassIndex(72236);
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

    private static u a(a.AbstractC1036a aVar) {
        String str;
        try {
            return aVar.a(aVar.a());
        } catch (Exception e2) {
            if (!(e2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                Request a2 = aVar.a();
                d dVar = new d();
                Request.a newBuilder = a2.newBuilder();
                newBuilder.f42468k = dVar;
                String url = a2.getUrl();
                if (!f112388a.matcher(url).matches()) {
                    throw e2;
                } else if (!TextUtils.isEmpty(url)) {
                    boolean z = true;
                    boolean z2 = !url.startsWith("https");
                    if ((e2 instanceof SSLException) || (e2 instanceof GeneralSecurityException)) {
                        z = false;
                    }
                    String filterUrl = NetworkUtils.filterUrl(url);
                    if (z2) {
                        if (z) {
                            str = "both";
                        }
                        str = "ssl";
                    } else {
                        if (z) {
                            str = "protocol";
                        }
                        str = "ssl";
                    }
                    newBuilder.a(a(filterUrl, "retry_reason", str));
                    newBuilder.a(a(NetworkUtils.filterUrl(url), "retry_type", "first_retry"));
                    return aVar.a(newBuilder.a());
                } else {
                    throw new IllegalArgumentException("url is empty!");
                }
            } else {
                throw e2;
            }
        }
    }

    private static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        g gVar = new g(str);
        gVar.a(str2, str3);
        return gVar.toString();
    }
}
