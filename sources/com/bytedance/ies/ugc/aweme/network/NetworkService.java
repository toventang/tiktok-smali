package com.bytedance.ies.ugc.aweme.network;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.g;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.net.cache.j;
import com.ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorTTNet;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.network.a;
import com.ss.android.ugc.aweme.network.c;
import h.f.b.l;
import java.util.concurrent.Executor;

public class NetworkService implements INetwork {
    static {
        Covode.recordClassIndex(20988);
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final void a() {
        g.b();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final a b() {
        return g.a();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final com.bytedance.retrofit2.c.a c() {
        return new ApiAlisgInterceptorTTNet();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final void a(long j2) {
        if (g.f35027b && g.f35028c) {
            try {
                TTNetInit.setALogFuncAddr(j2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final void a(c cVar, Executor executor) {
        l.d(executor, "");
        cVar.a();
        com.ss.android.ugc.aweme.net.cache.a.f112247a = new j();
        i.b(new g.a(cVar), executor);
    }
}
