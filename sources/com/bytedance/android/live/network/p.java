package com.bytedance.android.live.network;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.d.a.o;
import com.bytedance.retrofit2.client.a;
import com.bytedance.retrofit2.q;
import com.ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor;
import com.ss.android.ugc.aweme.net.j.h;
import com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor;
import com.ss.android.ugc.aweme.utils.eo;

/* access modifiers changed from: package-private */
public final class p {
    static {
        Covode.recordClassIndex(6655);
    }

    public static q a(q.a aVar) {
        if (h.a().f112414a) {
            try {
                a.AbstractC1037a aVar2 = (a.AbstractC1037a) Reflect.on(aVar).field("clientProvider", new Class[0]).get();
                a aVar3 = aVar2.get();
                if ("com.ss.android.ugc.aweme.app.api.OkClient".equals(aVar2.getClass().getName()) || (aVar3 instanceof o) || (aVar3 instanceof com.bytedance.frameworks.baselib.network.http.cronet.c.a)) {
                    return aVar.a();
                }
            } catch (Throwable th) {
                eo.a(th, "error occured.");
            }
        }
        q a2 = aVar.a();
        if (a2.f42572g != null) {
            a2.f42572g.add(new TTNetMonitorInterceptor());
            a2.f42572g.set(0, new BeforeHandleRequestInterceptor(a2.f42572g.get(0)));
        }
        return a2;
    }
}
