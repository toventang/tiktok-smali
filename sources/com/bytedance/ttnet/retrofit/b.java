package com.bytedance.ttnet.retrofit;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.c;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.a;
import com.bytedance.retrofit2.client.d;

public final class b implements a {
    static {
        Covode.recordClassIndex(27293);
    }

    @Override // com.bytedance.retrofit2.client.a
    public final d a(Request request) {
        c a2;
        request.getUrl();
        if (com.bytedance.ttnet.c.a()) {
            a2 = com.bytedance.ttnet.c.f44546c.a();
        } else {
            a2 = com.bytedance.ttnet.c.f44545b.a();
        }
        if (a2 != null) {
            return a2.a(request);
        }
        return null;
    }
}
