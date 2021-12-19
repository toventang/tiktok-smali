package com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f104582a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final IRetrofitFactory f104583b;

    private a() {
    }

    static {
        Covode.recordClassIndex(66999);
        IRetrofitFactory a2 = RetrofitFactory.a();
        l.b(a2, "");
        f104583b = a2;
    }

    public static <T> T a(Class<T> cls, String str) {
        l.d(cls, "");
        l.d(str, "");
        return (T) f104583b.a(str).a(cls);
    }
}
