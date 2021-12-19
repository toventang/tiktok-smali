package com.bytedance.ies.xbridge.base.runtime.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.d.a.o;
import com.bytedance.frameworks.baselib.network.http.g.f;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.a;
import com.bytedance.retrofit2.client.d;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.f.c;
import h.f.b.l;

public final class e implements a.AbstractC1037a {
    static {
        Covode.recordClassIndex(21388);
    }

    @Override // com.bytedance.retrofit2.client.a.AbstractC1037a
    public final com.bytedance.retrofit2.client.a get() {
        return new a();
    }

    public static final class a implements com.bytedance.retrofit2.client.a {
        static {
            Covode.recordClassIndex(21389);
        }

        @Override // com.bytedance.retrofit2.client.a
        public final d a(Request request) {
            com.bytedance.ttnet.d tTNetDepend = TTNetInit.getTTNetDepend();
            l.a((Object) tTNetDepend, "");
            Context a2 = tTNetDepend.a();
            o a3 = o.a(a2);
            if (f.b(a2)) {
                o.a(c.a());
            }
            return a3.a(request);
        }
    }
}
