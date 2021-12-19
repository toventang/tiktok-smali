package com.ss.android.ugc.aweme.net.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.api.e;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.net.h.a.a.d;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class a implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f112350a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f112351b;

    /* renamed from: c  reason: collision with root package name */
    public static Object f112352c = new Object();

    static {
        Covode.recordClassIndex(72188);
    }

    private static boolean a(Request request) {
        if (request == null || request.url() == null || !e.a(request.url().toString())) {
            return false;
        }
        return true;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        MethodCollector.i(7270);
        long currentTimeMillis = System.currentTimeMillis();
        Request request = chain.request();
        if (!f112350a && a(request)) {
            synchronized (f112352c) {
                try {
                    if (!f112350a) {
                        try {
                            f112352c.wait(1000);
                        } catch (InterruptedException unused) {
                        } catch (Throwable th) {
                            f112350a = true;
                            MethodCollector.o(7270);
                            throw th;
                        }
                        f112350a = true;
                    }
                } catch (Throwable th2) {
                    MethodCollector.o(7270);
                    throw th2;
                }
            }
        }
        System.currentTimeMillis();
        if (d.a(request)) {
            a.b.f109011a.a("ensure_connection_interceptor_duration", System.currentTimeMillis() - currentTimeMillis);
        }
        Request request2 = chain.request();
        if (f112351b || !a(request2)) {
            Response proceed = chain.proceed(chain.request());
            MethodCollector.o(7270);
            return proceed;
        }
        Response a2 = b.a(chain, "preload timeout");
        MethodCollector.o(7270);
        return a2;
    }
}
