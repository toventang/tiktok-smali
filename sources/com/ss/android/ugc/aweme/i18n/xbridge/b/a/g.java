package com.ss.android.ugc.aweme.i18n.xbridge.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.f;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit;
import com.ss.android.ugc.aweme.fe.a.c;
import h.f.b.l;
import java.util.Map;

public final class g implements IHostNetworkDepend {
    static {
        Covode.recordClassIndex(63713);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
    public final Map<String, Object> getAPIParams() {
        Map<String, String> a2 = c.a();
        l.b(a2, "");
        return a2;
    }

    final class a implements XIRetrofit {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f99968a;

        /* renamed from: b  reason: collision with root package name */
        private final f f99969b;

        static {
            Covode.recordClassIndex(63714);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit
        public final <T> T create(Class<T> cls) {
            l.d(cls, "");
            return (T) this.f99969b.a(cls);
        }

        public a(g gVar, f fVar) {
            l.d(fVar, "");
            this.f99968a = gVar;
            this.f99969b = fVar;
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
    public final XIRetrofit createRetrofit(String str, boolean z) {
        f a2;
        l.d(str, "");
        IRetrofitFactory a3 = RetrofitFactory.a();
        if (a3 == null || (a2 = a3.a(str)) == null) {
            return null;
        }
        return new a(this, a2);
    }
}
