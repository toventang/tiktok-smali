package com.ss.android.ugc.aweme.net.h.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.d.a.g;
import com.bytedance.frameworks.baselib.network.http.d.a.o;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.net.interceptor.a;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile OkHttpClient f112354a;

    static {
        Covode.recordClassIndex(72197);
    }

    static OkHttpClient a(Context context) {
        MethodCollector.i(6982);
        if (f112354a == null) {
            synchronized (b.class) {
                try {
                    if (f112354a == null) {
                        g.f29238a = d.f112357a;
                        o.a(d.n, "34.102.215.99");
                        o.a(context);
                        if (o.f29281i != null) {
                            OkHttpClient.Builder newBuilder = o.f29281i.a().newBuilder();
                            newBuilder.interceptors().clear();
                            newBuilder.networkInterceptors().clear();
                            newBuilder.addInterceptor(new a());
                            newBuilder.addInterceptor(new f());
                            f112354a = newBuilder.addNetworkInterceptor(new a()).connectTimeout(500, TimeUnit.MILLISECONDS).eventListener(new e()).build();
                        } else {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("SsOkHttp3Client is not init !!!");
                            MethodCollector.o(6982);
                            throw illegalArgumentException;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6982);
                    throw th;
                }
            }
        }
        OkHttpClient okHttpClient = f112354a;
        MethodCollector.o(6982);
        return okHttpClient;
    }
}
