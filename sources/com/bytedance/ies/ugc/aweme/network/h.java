package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.q;

final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final q f35034a;

    static {
        Covode.recordClassIndex(21019);
    }

    @Override // com.bytedance.ies.ugc.aweme.network.f
    public final <T> T a(Class<T> cls) {
        return (T) this.f35034a.a(cls);
    }

    h(a aVar) {
        this.f35034a = RetrofitFactory.a(aVar);
    }
}
