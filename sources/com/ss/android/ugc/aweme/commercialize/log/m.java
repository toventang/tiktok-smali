package com.ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

public final /* synthetic */ class m implements h.f.a.m {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeRawAd f74826a;

    static {
        Covode.recordClassIndex(46120);
    }

    public m(AwemeRawAd awemeRawAd) {
        this.f74826a = awemeRawAd;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        AwemeRawAd awemeRawAd = this.f74826a;
        f.b bVar = (f.b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.b(awemeRawAd) : bVar.a(awemeRawAd);
    }
}
