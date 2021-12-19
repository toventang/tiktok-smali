package com.ss.android.ugc.aweme.commercialize.util.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.commercialize.util.c;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75472a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final IRetrofitFactory f75473b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f75474c = c.f75475a;

    private a() {
    }

    static {
        Covode.recordClassIndex(46562);
        IRetrofitFactory a2 = RetrofitFactory.a();
        l.b(a2, "");
        f75473b = a2;
    }

    public static <T> T a(Class<T> cls) {
        l.d(cls, "");
        return (T) f75473b.b(f75474c).d().a(cls);
    }

    public static <T> T a(Class<T> cls, String str) {
        l.d(cls, "");
        l.d(str, "");
        return (T) f75473b.b(str).d().a(cls);
    }
}
