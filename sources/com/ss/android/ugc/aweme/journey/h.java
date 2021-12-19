package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final JourneyApi f104859a;

    /* renamed from: b  reason: collision with root package name */
    public static final h f104860b = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(67247);
        Object a2 = RetrofitFactory.a().a(Api.f66569d).a(JourneyApi.class);
        l.b(a2, "");
        f104859a = (JourneyApi) a2;
    }
}
