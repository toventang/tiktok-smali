package com.ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.b.c.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.NetWorkSpeedInterceptor;
import com.ss.android.ugc.aweme.sec.h;
import com.ss.android.ugc.aweme.utils.gv;
import java.net.CookieHandler;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    static final l f112434a = new l();

    /* renamed from: b  reason: collision with root package name */
    OkHttpClient f112435b;

    /* renamed from: c  reason: collision with root package name */
    private OkHttpClient f112436c = new OkHttpClient();

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public static a f112442a;

        static {
            Covode.recordClassIndex(72257);
        }

        public abstract void a();
    }

    static {
        Covode.recordClassIndex(72256);
    }

    private l() {
    }

    public final OkHttpClient a() {
        OkHttpClient okHttpClient = this.f112435b;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        a.f112442a.a();
        OkHttpClient.Builder newBuilder = this.f112436c.newBuilder();
        newBuilder.connectTimeout(60000, TimeUnit.MILLISECONDS);
        newBuilder.readTimeout(60000, TimeUnit.MILLISECONDS);
        newBuilder.retryOnConnectionFailure(true);
        if (k.f112430a != null) {
            newBuilder.dispatcher(new Dispatcher(k.f112430a));
        }
        if (f.a(d.a())) {
            newBuilder.cookieJar(new b(CookieHandler.getDefault()));
        }
        Interceptor a2 = h.a();
        if (a2 != null) {
            newBuilder.addInterceptor(a2);
        }
        newBuilder.addNetworkInterceptor(new NetWorkSpeedInterceptor());
        newBuilder.addNetworkInterceptor(new com.bytedance.frameworks.baselib.network.http.d.a.l());
        newBuilder.addNetworkInterceptor(new com.ss.android.ugc.aweme.net.interceptor.b());
        newBuilder.addInterceptor(new DevicesNullInterceptor());
        newBuilder.addInterceptor(new gv());
        newBuilder.addInterceptor(m.f112448a);
        newBuilder.protocols(Collections.singletonList(Protocol.HTTP_1_1));
        OkHttpClient build = newBuilder.build();
        this.f112435b = build;
        return build;
    }
}
