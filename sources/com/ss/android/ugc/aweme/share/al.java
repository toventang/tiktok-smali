package com.ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.share.model.ShortenModel;
import f.a.n;
import h.f.b.l;

public final class al {

    /* renamed from: a  reason: collision with root package name */
    public static final al f123361a = new al();

    /* renamed from: b  reason: collision with root package name */
    private static final IShortenUrlApi f123362b = ((IShortenUrlApi) RetrofitFactory.a().b(b.f59141e).d().a(IShortenUrlApi.class));

    private al() {
    }

    static {
        Covode.recordClassIndex(81014);
    }

    public static n<ShortenModel> a(z zVar, String str, String str2) {
        l.d(zVar, "");
        l.d(str, "");
        l.d(str2, "");
        return f123362b.getShareLinkShortenUel(zVar.ordinal(), str, str2);
    }
}
