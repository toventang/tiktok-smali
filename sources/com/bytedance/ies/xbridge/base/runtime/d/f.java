package com.bytedance.ies.xbridge.base.runtime.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.b.e;
import com.bytedance.ies.xbridge.base.runtime.b.g;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit;
import com.bytedance.retrofit2.client.a;
import com.bytedance.retrofit2.d.a.h;
import com.bytedance.retrofit2.q;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import h.f.b.l;
import java.util.Map;

public final class f implements IHostNetworkDepend {
    static {
        Covode.recordClassIndex(21402);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
    public final Map<String, Object> getAPIParams() {
        return null;
    }

    final class a implements XIRetrofit {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f35847a;

        /* renamed from: b  reason: collision with root package name */
        private final q f35848b;

        static {
            Covode.recordClassIndex(21403);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit
        public final <T> T create(Class<T> cls) {
            l.c(cls, "");
            return (T) this.f35848b.a(cls);
        }

        public a(f fVar, q qVar) {
            l.c(qVar, "");
            this.f35847a = fVar;
            this.f35848b = qVar;
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
    public final XIRetrofit createRetrofit(String str, boolean z) {
        a.AbstractC1037a hVar;
        l.c(str, "");
        l.c(str, "");
        q.a a2 = new q.a().a(str).a(com.bytedance.frameworks.baselib.network.http.retrofit.a.a.a.a()).a(h.a()).a(new com.bytedance.frameworks.baselib.network.http.retrofit.a()).a(new SsInterceptor());
        if (z) {
            hVar = new e();
        } else {
            hVar = new com.bytedance.ies.xbridge.base.runtime.b.h();
        }
        q a3 = g.a(a2.a(hVar));
        l.a((Object) a3, "");
        return new a(this, a3);
    }
}
