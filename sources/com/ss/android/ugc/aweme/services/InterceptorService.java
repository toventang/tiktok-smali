package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.account.network.c;
import h.f.b.l;
import java.util.Map;

public final class InterceptorService extends BaseInterceptorService {
    static {
        Covode.recordClassIndex(79488);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseInterceptorService
    public final boolean shouldIntercept(Request request) {
        l.d(request, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.BaseInterceptorService
    public final Map<String, String> interceptAndGetNewParams(int i2, Request request, u<Object> uVar) {
        String str;
        T t = null;
        if (request != null) {
            str = request.getUrl();
        } else {
            str = null;
        }
        if (uVar != null) {
            t = uVar.f42630b;
        }
        return interceptAndGetNewParams(i2, str, request, String.valueOf(t));
    }

    @Override // com.ss.android.ugc.aweme.services.BaseInterceptorService
    public final Map<String, String> interceptAndGetNewParams(int i2, String str, Request request, String str2) {
        Map<String, String> a2 = c.a(i2, str, str2, null);
        l.b(a2, "");
        return a2;
    }
}
