package com.ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.a.m;

public final /* synthetic */ class w implements m {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeRawAd f74838a;

    static {
        Covode.recordClassIndex(46130);
    }

    public w(AwemeRawAd awemeRawAd) {
        this.f74838a = awemeRawAd;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        AwemeRawAd awemeRawAd = this.f74838a;
        f.b bVar = (f.b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.b(awemeRawAd) : bVar.a(awemeRawAd);
    }
}
