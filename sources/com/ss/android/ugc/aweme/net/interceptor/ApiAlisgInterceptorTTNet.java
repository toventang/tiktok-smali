package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.g;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.HttpUrl;

public final class ApiAlisgInterceptorTTNet implements com.bytedance.retrofit2.c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList<String> f112383a = n.d("/service/2/app_log/", "/api/ad/v1/setting/", "/api/ad/splash/", "/aweme/v1/ttregion/test/", "/aweme/v1/feed/", "/aweme/v2/feed/", "/aweme/v2/category/list/", "/aweme/v1/find/", "/aweme/v1/challenge/history/intervene/");

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList<String> f112384b = n.d("IN", "NP", "PK", "LK");

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList<String> f112385c = n.d("US", "GB", "DE", "IT", "FR", "TR", "ES", "JP", "KR", "BR", "IQ");

    /* renamed from: d  reason: collision with root package name */
    public static final a f112386d = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(72224);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(72223);
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

    private static u<?> a(a.AbstractC1036a aVar) {
        HttpUrl.Builder newBuilder;
        HttpUrl.Builder newBuilder2;
        HttpUrl.Builder newBuilder3;
        l.d(aVar, "");
        Request a2 = aVar.a();
        if (n.a((Iterable) f112384b, (Object) g.a().f112524l.a())) {
            l.b(a2, "");
            String path = a2.getPath();
            Iterator<T> it = f112383a.iterator();
            while (it.hasNext()) {
                l.b(path, "");
                if (p.b(path, (String) it.next(), false)) {
                    l.b(a2, "");
                    HttpUrl parse = HttpUrl.parse(a2.getUrl());
                    if (!(parse == null || (newBuilder3 = parse.newBuilder()) == null)) {
                        String host = parse.host();
                        if (!p.b(path, "/service/2/app_log/", false)) {
                            newBuilder3.host("api-h2.tiktokv.com");
                        } else if ("log-va.tiktokv.com".equals(host)) {
                            newBuilder3.host("log.tiktokv.com");
                        } else if ("rtlog-va.tiktokv.com".equals(host)) {
                            newBuilder3.host("rtlog.tiktokv.com");
                        }
                        a2 = a2.newBuilder().a(newBuilder3.build().toString()).a();
                    }
                }
            }
        } else if (n.a((Iterable) f112385c, (Object) g.a().f112524l.a())) {
            l.b(a2, "");
            HttpUrl parse2 = HttpUrl.parse(a2.getUrl());
            if (!(parse2 == null || (newBuilder2 = parse2.newBuilder()) == null || !l.a((Object) parse2.host(), (Object) "api-va.tiktokv.com"))) {
                newBuilder2.host("api19-va.tiktokv.com");
                a2 = a2.newBuilder().a(newBuilder2.build().toString()).a();
            }
        } else {
            l.b(a2, "");
            HttpUrl parse3 = HttpUrl.parse(a2.getUrl());
            if (!(parse3 == null || (newBuilder = parse3.newBuilder()) == null || !l.a((Object) parse3.host(), (Object) "api-va.tiktokv.com"))) {
                newBuilder.host("api16-va.tiktokv.com");
                a2 = a2.newBuilder().a(newBuilder.build().toString()).a();
            }
        }
        u<?> a3 = aVar.a(a2);
        l.b(a3, "");
        return a3;
    }
}
