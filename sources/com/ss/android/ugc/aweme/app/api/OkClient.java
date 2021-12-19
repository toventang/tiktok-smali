package com.ss.android.ugc.aweme.app.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.d.a.o;
import com.bytedance.frameworks.baselib.network.http.g.f;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.a;
import com.bytedance.retrofit2.client.d;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.f.c;

public class OkClient implements a.AbstractC1037a {
    static {
        Covode.recordClassIndex(40927);
    }

    static class a implements com.bytedance.retrofit2.client.a {
        static {
            Covode.recordClassIndex(40928);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        @Override // com.bytedance.retrofit2.client.a
        public final d a(Request request) {
            Context a2 = TTNetInit.getTTNetDepend().a();
            o a3 = o.a(a2);
            if (f.b(a2)) {
                o.f29282j = c.a();
            }
            return a3.a(request);
        }
    }

    @Override // com.bytedance.retrofit2.client.a.AbstractC1037a
    public com.bytedance.retrofit2.client.a get() {
        return new a((byte) 0);
    }
}
