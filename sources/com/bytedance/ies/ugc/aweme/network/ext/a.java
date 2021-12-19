package com.bytedance.ies.ugc.aweme.network.ext;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.e;
import com.bytedance.ies.ugc.aweme.network.f;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(21013);
    }

    public static final IRetrofitFactory a() {
        IRetrofitFactory a2 = RetrofitFactory.a();
        l.b(a2, "");
        return a2;
    }

    public static final f a(String str) {
        l.d(str, "");
        f a2 = a().a(str);
        l.b(a2, "");
        return a2;
    }

    public static final e b(String str) {
        l.d(str, "");
        e b2 = a().b(str);
        l.b(b2, "");
        return b2;
    }

    public static final <T> T a(String str, Class<T> cls) {
        l.d(str, "");
        l.d(cls, "");
        return (T) a().a(str).a(cls);
    }
}
