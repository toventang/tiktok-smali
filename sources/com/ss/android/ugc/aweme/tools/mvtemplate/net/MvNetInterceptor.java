package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import h.f.b.l;
import okhttp3.HttpUrl;

public final class MvNetInterceptor implements a {
    static {
        Covode.recordClassIndex(91986);
    }

    private static u<?> a(a.AbstractC1036a aVar) {
        l.d(aVar, "");
        Request a2 = aVar.a();
        l.b(a2, "");
        HttpUrl parse = HttpUrl.parse(a2.getUrl());
        if (parse != null) {
            HttpUrl.Builder newBuilder = parse.newBuilder();
            newBuilder.addQueryParameter("access_key", g.a().f().a());
            newBuilder.addQueryParameter("app_version", g.a().w().i());
            newBuilder.addQueryParameter("app_language", IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage());
            newBuilder.addQueryParameter("region", g.a().y().a());
            l.b(newBuilder, "");
            String httpUrl = newBuilder.build().toString();
            l.b(httpUrl, "");
            a2 = a2.newBuilder().a(httpUrl).a();
        }
        u<?> a3 = aVar.a(a2);
        l.b(a3, "");
        return a3;
    }

    @Override // com.bytedance.retrofit2.c.a
    public final u intercept(a.AbstractC1036a aVar) {
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
        u<?> a2 = a(aVar);
        if (bVar.X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.X;
            String simpleName = getClass().getSimpleName();
            bVar.a(simpleName, uptimeMillis2);
            bVar.c(simpleName, uptimeMillis2);
        }
        bVar.X = SystemClock.uptimeMillis();
        return a2;
    }
}
