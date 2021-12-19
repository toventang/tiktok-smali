package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.c.a;
import com.ss.android.ugc.aweme.compliance.business.c.c;
import com.ss.android.ugc.aweme.compliance.business.c.d;
import com.ss.android.ugc.aweme.compliance.business.c.e;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.VerifyInterceptor;
import com.ss.android.ugc.aweme.net.InterceptorProvider;
import com.ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet;
import com.ss.android.ugc.aweme.net.j.h;
import com.ss.android.ugc.aweme.net.monitor.n;
import com.ss.android.ugc.aweme.net.monitor.p;
import com.ss.android.ugc.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.Interceptor;

public class InterceptorHolder implements InterceptorProvider {
    static {
        Covode.recordClassIndex(93245);
    }

    @Override // com.ss.android.ugc.aweme.net.InterceptorProvider
    public final List<a> a() {
        return Arrays.asList(new VerifyInterceptor());
    }

    @Override // com.ss.android.ugc.aweme.net.InterceptorProvider
    public final List<a> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FeedRetryInterceptorTTNet());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.net.InterceptorProvider
    public final List<Interceptor> c() {
        ArrayList arrayList = new ArrayList();
        if (!h.a().f112414a) {
            arrayList.add(new p());
        }
        return arrayList;
    }

    public static InterceptorProvider e() {
        MethodCollector.i(4338);
        Object a2 = b.a(InterceptorProvider.class, false);
        if (a2 != null) {
            InterceptorProvider interceptorProvider = (InterceptorProvider) a2;
            MethodCollector.o(4338);
            return interceptorProvider;
        }
        if (b.ey == null) {
            synchronized (InterceptorProvider.class) {
                try {
                    if (b.ey == null) {
                        b.ey = new InterceptorHolder();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4338);
                    throw th;
                }
            }
        }
        InterceptorHolder interceptorHolder = (InterceptorHolder) b.ey;
        MethodCollector.o(4338);
        return interceptorHolder;
    }

    @Override // com.ss.android.ugc.aweme.net.InterceptorProvider
    public final void d() {
        n.a.a(new com.ss.android.ugc.aweme.net.monitor.b());
        n.a.a(new com.ss.android.ugc.aweme.compliance.business.c.a());
        n.a.a(new c());
        n.a.a(new e());
        n.a.a(new d());
        com.ss.android.ugc.aweme.compliance.api.a.j().a(dr.f142836a);
    }
}
